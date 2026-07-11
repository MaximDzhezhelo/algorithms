package com.algorithms.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BookStorageImplTest {

    private BookStorage storage;

    @BeforeEach
    public void setUp() {
        storage = new BookStorageImpl();
    }

    @Test
    public void testSetAndGetSingleValue() {
        storage.set("book1", "author", "John Doe");
        Optional<String> result = storage.get("book1", "author");
        assertTrue(result.isPresent());
        assertEquals("John Doe", result.get());
    }

    @Test
    public void testGetNonExistentBook() {
        Optional<String> result = storage.get("nonexistent", "author");
        assertFalse(result.isPresent());
    }

    @Test
    public void testGetNonExistentTag() {
        storage.set("book1", "author", "John Doe");
        Optional<String> result = storage.get("book1", "title");
        assertFalse(result.isPresent());
    }

    @Test
    public void testSetMultipleTagsForSameBook() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");
        storage.set("book1", "year", "2023");

        assertEquals("John Doe", storage.get("book1", "author").get());
        assertEquals("My Book", storage.get("book1", "title").get());
        assertEquals("2023", storage.get("book1", "year").get());
    }

    @Test
    public void testSetMultipleBooks() {
        storage.set("book1", "author", "John Doe");
        storage.set("book2", "author", "Jane Smith");
        storage.set("book3", "author", "Bob Johnson");

        assertEquals("John Doe", storage.get("book1", "author").get());
        assertEquals("Jane Smith", storage.get("book2", "author").get());
        assertEquals("Bob Johnson", storage.get("book3", "author").get());
    }

    @Test
    public void testOverwriteExistingValue() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "author", "Jane Smith");

        Optional<String> result = storage.get("book1", "author");
        assertTrue(result.isPresent());
        assertEquals("Jane Smith", result.get());
    }

    @Test
    public void testRemoveExistingTag() {
        storage.set("book1", "author", "John Doe");
        boolean removed = storage.remove("book1", "author");

        assertTrue(removed);
        assertFalse(storage.get("book1", "author").isPresent());
    }

    @Test
    public void testRemoveNonExistentTag() {
        boolean removed = storage.remove("book1", "author");
        assertFalse(removed);
    }

    @Test
    public void testRemoveOneTagLeavesOthers() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");
        storage.set("book1", "year", "2023");

        storage.remove("book1", "title");

        assertTrue(storage.get("book1", "author").isPresent());
        assertFalse(storage.get("book1", "title").isPresent());
        assertTrue(storage.get("book1", "year").isPresent());
    }

    @Test
    public void testRemoveFromOneBookDoesNotAffectOthers() {
        storage.set("book1", "author", "John Doe");
        storage.set("book2", "author", "Jane Smith");

        storage.remove("book1", "author");

        assertFalse(storage.get("book1", "author").isPresent());
        assertTrue(storage.get("book2", "author").isPresent());
    }

    @Test
    public void testEmptyStringValues() {
        storage.set("book1", "description", "");
        Optional<String> result = storage.get("book1", "description");
        assertTrue(result.isPresent());
        assertEquals("", result.get());
    }

    @Test
    public void testEmptyStringBookId() {
        storage.set("", "author", "John Doe");
        Optional<String> result = storage.get("", "author");
        assertTrue(result.isPresent());
        assertEquals("John Doe", result.get());
    }

    @Test
    public void testEmptyStringTag() {
        storage.set("book1", "", "Some Value");
        Optional<String> result = storage.get("book1", "");
        assertTrue(result.isPresent());
        assertEquals("Some Value", result.get());
    }

    @Test
    public void testSetAfterRemove() {
        storage.set("book1", "author", "John Doe");
        storage.remove("book1", "author");
        storage.set("book1", "author", "Jane Smith");

        Optional<String> result = storage.get("book1", "author");
        assertTrue(result.isPresent());
        assertEquals("Jane Smith", result.get());
    }

    @Test
    public void testMultipleOperationsSequence() {
        storage.set("book1", "author", "Author1");
        storage.set("book1", "title", "Title1");
        storage.set("book2", "author", "Author2");

        assertEquals("Author1", storage.get("book1", "author").get());

        storage.set("book1", "author", "UpdatedAuthor1");
        assertEquals("UpdatedAuthor1", storage.get("book1", "author").get());

        storage.remove("book1", "title");
        assertFalse(storage.get("book1", "title").isPresent());

        assertTrue(storage.get("book1", "author").isPresent());
        assertTrue(storage.get("book2", "author").isPresent());
    }

    @Test
    public void testSpecialCharactersInValues() {
        storage.set("book1", "title", "Book: The \"Special\" Edition!");
        Optional<String> result = storage.get("book1", "title");
        assertTrue(result.isPresent());
        assertEquals("Book: The \"Special\" Edition!", result.get());
    }

    @Test
    public void testLongValues() {
        String longValue = "a".repeat(1000);
        storage.set("book1", "description", longValue);
        Optional<String> result = storage.get("book1", "description");
        assertTrue(result.isPresent());
        assertEquals(longValue, result.get());
    }

    // Tests for getAllTagsSortedDesc

    @Test
    public void testGetAllTagsSortedDescBasic() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");
        storage.set("book1", "year", "2023");

        var result = storage.getAllTagsSortedDesc("book1");

        assertEquals(3, result.size());
        var entries = result.entrySet().iterator();

        // Check descending order: year, title, author
        var first = entries.next();
        assertEquals("year", first.getKey());
        assertEquals("2023", first.getValue());

        var second = entries.next();
        assertEquals("title", second.getKey());
        assertEquals("My Book", second.getValue());

        var third = entries.next();
        assertEquals("author", third.getKey());
        assertEquals("John Doe", third.getValue());
    }

    @Test
    public void testGetAllTagsSortedDescNonExistentBook() {
        var result = storage.getAllTagsSortedDesc("nonexistent");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetAllTagsSortedDescSingleTag() {
        storage.set("book1", "author", "John Doe");
        var result = storage.getAllTagsSortedDesc("book1");

        assertEquals(1, result.size());
        assertEquals("John Doe", result.get("author"));
    }

    @Test
    public void testGetAllTagsSortedDescEmptyAfterRemoveAll() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");
        storage.remove("book1", "author");
        storage.remove("book1", "title");

        var result = storage.getAllTagsSortedDesc("book1");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetAllTagsSortedDescOrder() {
        storage.set("book1", "zebra", "value1");
        storage.set("book1", "alpha", "value2");
        storage.set("book1", "middle", "value3");

        var result = storage.getAllTagsSortedDesc("book1");
        var keys = result.keySet().toArray(new String[0]);

        assertEquals("zebra", keys[0]);
        assertEquals("middle", keys[1]);
        assertEquals("alpha", keys[2]);
    }

    @Test
    public void testGetAllTagsSortedDescAfterUpdate() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "Old Title");
        storage.set("book1", "title", "New Title");

        var result = storage.getAllTagsSortedDesc("book1");

        assertEquals(2, result.size());
        assertEquals("New Title", result.get("title"));
    }

    @Test
    public void testGetAllTagsSortedDescMultipleBooks() {
        storage.set("book1", "author", "Author1");
        storage.set("book1", "title", "Title1");
        storage.set("book2", "year", "2023");
        storage.set("book2", "genre", "Fiction");

        var result1 = storage.getAllTagsSortedDesc("book1");
        var result2 = storage.getAllTagsSortedDesc("book2");

        assertEquals(2, result1.size());
        assertEquals(2, result2.size());

        var keys1 = result1.keySet().toArray(new String[0]);
        assertEquals("title", keys1[0]);
        assertEquals("author", keys1[1]);

        var keys2 = result2.keySet().toArray(new String[0]);
        assertEquals("year", keys2[0]);
        assertEquals("genre", keys2[1]);
    }

    @Test
    public void testGetAllTagsSortedDescNumericTags() {
        storage.set("book1", "1", "value1");
        storage.set("book1", "10", "value10");
        storage.set("book1", "2", "value2");

        var result = storage.getAllTagsSortedDesc("book1");
        var keys = result.keySet().toArray(new String[0]);

        // Lexicographic descending order: "2", "10", "1"
        assertEquals("2", keys[0]);
        assertEquals("10", keys[1]);
        assertEquals("1", keys[2]);
    }

    @Test
    public void testGetAllTagsSortedDescSpecialCharacters() {
        storage.set("book1", "tag-1", "value1");
        storage.set("book1", "tag_2", "value2");
        storage.set("book1", "tag.3", "value3");

        var result = storage.getAllTagsSortedDesc("book1");
        assertEquals(3, result.size());

        // Order depends on ASCII values
        var keys = result.keySet().toArray(new String[0]);
        assertTrue(keys.length == 3);
    }

    @Test
    public void testGetAllTagsSortedDescCaseSensitive() {
        storage.set("book1", "Author", "value1");
        storage.set("book1", "author", "value2");
        storage.set("book1", "AUTHOR", "value3");

        var result = storage.getAllTagsSortedDesc("book1");
        assertEquals(3, result.size());

        var keys = result.keySet().toArray(new String[0]);
        // Descending order: "author", "Author", "AUTHOR"
        assertEquals("author", keys[0]);
        assertEquals("Author", keys[1]);
        assertEquals("AUTHOR", keys[2]);
    }

    // Tests for getByTagPrefix

    @Test
    public void testGetByTagPrefixBasic() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "author_name", "Jane Smith");
        storage.set("book1", "title", "My Book");

        var result = storage.getByTagPrefix("book1", "author");

        assertEquals(2, result.size());
        assertEquals("John Doe", result.get("author"));
        assertEquals("Jane Smith", result.get("author_name"));
    }

    @Test
    public void testGetByTagPrefixNoMatches() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");

        var result = storage.getByTagPrefix("book1", "publisher");

        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetByTagPrefixNonExistentBook() {
        var result = storage.getByTagPrefix("nonexistent", "author");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetByTagPrefixEmptyPrefix() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");
        storage.set("book1", "year", "2023");

        var result = storage.getByTagPrefix("book1", "");

        assertEquals(3, result.size());
        assertEquals("John Doe", result.get("author"));
        assertEquals("My Book", result.get("title"));
        assertEquals("2023", result.get("year"));
    }

    @Test
    public void testGetByTagPrefixSortedAscending() {
        storage.set("book1", "tag_zebra", "value1");
        storage.set("book1", "tag_alpha", "value2");
        storage.set("book1", "tag_middle", "value3");

        var result = storage.getByTagPrefix("book1", "tag_");
        var keys = result.keySet().toArray(new String[0]);

        assertEquals(3, result.size());
        assertEquals("tag_alpha", keys[0]);
        assertEquals("tag_middle", keys[1]);
        assertEquals("tag_zebra", keys[2]);
    }

    @Test
    public void testGetByTagPrefixCaseSensitive() {
        storage.set("book1", "Author", "value1");
        storage.set("book1", "author", "value2");
        storage.set("book1", "AUTHOR", "value3");

        var result = storage.getByTagPrefix("book1", "author");

        assertEquals(1, result.size());
        assertEquals("value2", result.get("author"));
    }

    @Test
    public void testGetByTagPrefixSingleMatch() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");

        var result = storage.getByTagPrefix("book1", "auth");

        assertEquals(1, result.size());
        assertEquals("John Doe", result.get("author"));
    }

    @Test
    public void testGetByTagPrefixAfterUpdate() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "author_name", "Old Name");
        storage.set("book1", "author_name", "New Name");

        var result = storage.getByTagPrefix("book1", "author");

        assertEquals(2, result.size());
        assertEquals("New Name", result.get("author_name"));
    }

    @Test
    public void testGetByTagPrefixAfterRemove() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "author_name", "Jane Smith");
        storage.set("book1", "title", "My Book");

        storage.remove("book1", "author_name");

        var result = storage.getByTagPrefix("book1", "author");

        assertEquals(1, result.size());
        assertEquals("John Doe", result.get("author"));
    }

    @Test
    public void testGetByTagPrefixMultipleBooks() {
        storage.set("book1", "author", "Author1");
        storage.set("book1", "author_bio", "Bio1");
        storage.set("book2", "author", "Author2");
        storage.set("book2", "title", "Title2");

        var result1 = storage.getByTagPrefix("book1", "author");
        var result2 = storage.getByTagPrefix("book2", "author");

        assertEquals(2, result1.size());
        assertEquals(1, result2.size());
        assertEquals("Author1", result1.get("author"));
        assertEquals("Author2", result2.get("author"));
    }

    @Test
    public void testGetByTagPrefixSpecialCharacters() {
        storage.set("book1", "tag-1", "value1");
        storage.set("book1", "tag-2", "value2");
        storage.set("book1", "tag_1", "value3");

        var result = storage.getByTagPrefix("book1", "tag-");

        assertEquals(2, result.size());
        assertEquals("value1", result.get("tag-1"));
        assertEquals("value2", result.get("tag-2"));
    }

    @Test
    public void testGetByTagPrefixNumericPrefix() {
        storage.set("book1", "1_tag", "value1");
        storage.set("book1", "10_tag", "value2");
        storage.set("book1", "2_tag", "value3");

        var result = storage.getByTagPrefix("book1", "1");
        var keys = result.keySet().toArray(new String[0]);

        assertEquals(2, result.size());
        // Ascending order: "10_tag", "1_tag"
        assertEquals("10_tag", keys[0]);
        assertEquals("1_tag", keys[1]);
    }

    @Test
    public void testGetByTagPrefixExactMatch() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "author_name", "Jane Smith");

        var result = storage.getByTagPrefix("book1", "author");

        assertEquals(2, result.size());
        assertTrue(result.containsKey("author"));
        assertTrue(result.containsKey("author_name"));
    }

    @Test
    public void testGetByTagPrefixLongPrefix() {
        storage.set("book1", "very_long_tag_name", "value1");
        storage.set("book1", "very_long_tag", "value2");
        storage.set("book1", "very_long", "value3");

        var result = storage.getByTagPrefix("book1", "very_long_tag");

        assertEquals(2, result.size());
        assertEquals("value2", result.get("very_long_tag"));
        assertEquals("value1", result.get("very_long_tag_name"));
    }

    @Test
    public void testGetByTagPrefixNoPartialMatch() {
        storage.set("book1", "author", "John Doe");
        storage.set("book1", "title", "My Book");

        var result = storage.getByTagPrefix("book1", "author_");

        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetByTagPrefixAllTagsMatch() {
        storage.set("book1", "tag1", "value1");
        storage.set("book1", "tag2", "value2");
        storage.set("book1", "tag3", "value3");

        var result = storage.getByTagPrefix("book1", "tag");

        assertEquals(3, result.size());
    }
}

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
}

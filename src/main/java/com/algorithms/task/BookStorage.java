package com.algorithms.task;

import java.util.Map;
import java.util.Optional;

public interface BookStorage {

    default void set(String bookId, String tag, String value) {
    }

    default Optional<String> get(String bookId, String tag) {
        return Optional.empty();
    }

    default boolean remove(String bookId, String tag) {
        return false;
    }

    /**
     * Returns all tags and their values for a given book, sorted by tag name in descending order.
     * If the book does not exist, returns an empty map.
     *
     * @param bookId the ID of the book
     * @return a map of tags to values, sorted by tag name in descending order
     */
    default Map<String, String> getAllTagsSortedDesc(String bookId) {
        return Map.of();
    }

    /**
     * Returns all tags and their values for a given book where the tag starts with the specified prefix.
     * Results are sorted by tag name in ascending order.
     * If the book does not exist or no tags match the prefix, returns an empty map.
     *
     * @param bookId the ID of the book
     * @param tagPrefix the prefix to match against tag names
     * @return a map of matching tags to values, sorted by tag name in ascending order
     */
    default Map<String, String> getByTagPrefix(String bookId, String tagPrefix) {
        return Map.of();
    }

}

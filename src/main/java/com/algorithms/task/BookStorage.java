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

    /**
     * Sets a tag-value pair for a book with a time-to-live (TTL).
     * After the TTL expires, the entry will no longer be retrievable via get operations.
     *
     * @param bookId the ID of the book
     * @param tag the tag name
     * @param value the value to store
     * @param ttlMillis time-to-live in milliseconds
     */
    default void setWithTtl(String bookId, String tag, String value, long ttlMillis) {
    }

    /**
     * Returns the remaining TTL (time-to-live) for a given tag in milliseconds.
     * Returns -1 if the tag does not exist or has already expired.
     * Returns -2 if the tag exists but has no TTL (was set without TTL).
     *
     * @param bookId the ID of the book
     * @param tag the tag name
     * @return remaining TTL in milliseconds, -1 if expired/not found, -2 if no TTL
     */
    default long getRemainingTtl(String bookId, String tag) {
        return -1;
    }

}

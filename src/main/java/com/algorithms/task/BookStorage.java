package com.algorithms.task;

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

}

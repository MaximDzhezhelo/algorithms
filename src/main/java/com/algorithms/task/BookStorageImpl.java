package com.algorithms.task;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class BookStorageImpl implements BookStorage {

    private final ConcurrentMap<String, ConcurrentMap<String, String>> storage = new ConcurrentHashMap<>();

    public void set(String bookId, String tag, String value) {
        storage.computeIfAbsent(bookId, _ -> new ConcurrentHashMap<>())
                .put(tag, value);
    }

    public Optional<String> get(String bookId, String tag) {
        ConcurrentMap<String, String> tags = storage.get(bookId);
        if (tags == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(tags.get(tag));
    }

    public boolean remove(String bookId, String tag) {
        ConcurrentMap<String, String> tags = storage.get(bookId);
        if (tags == null) {
            return false;
        }

        return tags.remove(tag) != null;
    }

}

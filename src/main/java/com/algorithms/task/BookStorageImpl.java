package com.algorithms.task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class BookStorageImpl implements BookStorage {

    private final ConcurrentMap<String, ConcurrentMap<String, String>> storage = new ConcurrentHashMap<>();

    @Override
    public void set(String bookId, String tag, String value) {
        storage.computeIfAbsent(bookId, _ -> new ConcurrentHashMap<>())
                .put(tag, value);
    }

    @Override
    public Optional<String> get(String bookId, String tag) {
        ConcurrentMap<String, String> tags = storage.get(bookId);
        if (tags == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(tags.get(tag));
    }

    @Override
    public boolean remove(String bookId, String tag) {
        ConcurrentMap<String, String> tags = storage.get(bookId);
        if (tags == null) {
            return false;
        }

        return tags.remove(tag) != null;
    }

    @Override
    public Map<String, String> getAllTagsSortedDesc(String bookId) {
        return Optional.ofNullable(storage.get(bookId)).orElse(new ConcurrentHashMap<>())
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

    @Override
    public Map<String, String> getByTagPrefix(String bookId, String tagPrefix) {
        return Optional.ofNullable(storage.get(bookId)).orElse(new ConcurrentHashMap<>())
                .entrySet()
                .stream()
                .filter(e -> e.getKey().startsWith(tagPrefix))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }
}

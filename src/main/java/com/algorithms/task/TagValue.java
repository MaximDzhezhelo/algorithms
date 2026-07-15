package com.algorithms.task;

public record TagValue(String value, Long expiresAt) {

    boolean isExpired() {
        return expiresAt != null && System.currentTimeMillis() > expiresAt;
    }

    boolean hasTtl() {
        return expiresAt != null;
    }

}

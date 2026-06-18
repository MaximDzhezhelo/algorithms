# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java-based algorithms practice repository containing solutions from multiple sources:
- CodingBat exercises (string manipulation, warmup problems)
- Coursera Algorithms courses (union-find data structures, quick-find variants)
- HackerRank challenges (Java fundamentals, data structures)
- Classic algorithms (sorting, searching)

## Build & Test Commands

**Build the project:**
```bash
./gradlew build
```

**Run all tests:**
```bash
./gradlew test
```

**Run a specific test class:**
```bash
./gradlew test --tests "com.algorithms.sort.MergeSortTest"
```

**Clean build artifacts:**
```bash
./gradlew clean
```

## Code Organization

- `src/main/java/com/algorithms/`
  - `codingbat/` - CodingBat problems organized by category (string1, string2, warmup1)
  - `coursera/` - Coursera course assignments (algorithms_part1/quick_find for union-find variants)
  - `hackerRank/java/` - HackerRank Java challenges
  - `sort/` - Classic sorting algorithms (MergeSort, BubbleSort, InsertionSort, SelectionSort)
  - `search/` - Search algorithms (BinarySearch)
  - `fibonacci/` - Fibonacci implementations including parallel ForkJoin variants
  - `lesson_1/`, `lesson_2/` - Educational exercises

- `src/test/java/com/algorithms/` - JUnit 4 test files mirroring main structure

## Development Guidelines

**Java version:** Java 25 (configured via Gradle toolchain)

**Testing framework:** JUnit 4.13.1

**Code structure:** Each algorithm/solution is self-contained in its own class. Many classes include main() methods for standalone execution and detailed JavaDoc comments explaining algorithm complexity and approach.

**Comments:** This codebase uses extensive JavaDoc and inline comments to explain algorithm logic, complexity analysis, and problem descriptions. When adding new algorithms, include similar documentation.

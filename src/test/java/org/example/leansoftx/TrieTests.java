package org.example.leansoftx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTests {

    @Test
    void insertAddsWordSuccessfully() {
        Trie trie = new Trie();
        assertTrue(trie.insert("hello"));
    }

    @Test
    void insertReturnsFalseForDuplicateWord() {
        Trie trie = new Trie();
        trie.insert("hello");
        assertFalse(trie.insert("hello"));
    }

    @Test
    void insertHandlesEmptyString() {
        Trie trie = new Trie();
        assertTrue(trie.insert(""));
    }

    @Test
    void insertHandlesSingleCharacter() {
        Trie trie = new Trie();
        assertTrue(trie.insert("a"));
    }

    @Test
    void insertHandlesMultipleWords() {
        Trie trie = new Trie();
        assertTrue(trie.insert("hello"));
        assertTrue(trie.insert("world"));
        assertTrue(trie.insert("hell"));
        assertTrue(trie.insert("he"));
    }
}
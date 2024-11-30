package org.example.leansoftx;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TrieTests {

    @Test
    public void testSearch() {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("world");

        assertTrue(trie.search("hello"));
        assertTrue(trie.search("world"));
        assertFalse(trie.search("hell"));
        assertFalse(trie.search("worl"));
        assertFalse(trie.search("helloo"));
        assertFalse(trie.search("worlds"));
    }
}

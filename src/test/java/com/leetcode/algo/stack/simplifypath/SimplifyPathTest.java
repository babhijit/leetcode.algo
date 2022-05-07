package com.leetcode.algo.stack.simplifypath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    private final SimplifyPath simplifyPath = new SimplifyPath();

    @Test
    void testHomeDir() {
        assertEquals("/home", simplifyPath.simplifyPath("/home/"));
    }

    @Test
    void testDoubleSlashesDir() {
        String path = "/home//foo/bar";
        String canonicalPath = "/home/foo/bar";
        assertEquals(canonicalPath, simplifyPath.simplifyPath(path));
    }

    @Test
    void test2DoubleSlashesDir() {
        String path = "/home//foo/dir//file/";
        String canonicalPath = "/home/foo/dir/file";
        assertEquals(canonicalPath, simplifyPath.simplifyPath(path));
    }

    @Test
    void testDoubleDotsSlashesDir() {
        String path = "/home//foo/../dir//file/";
        String canonicalPath = "/home/dir/file";
        assertEquals(canonicalPath, simplifyPath.simplifyPath(path));
    }

    @Test
    void testConsecutiveDotsSlashesDir() {
        String path = "/a/./b/../../c/";
        String canonicalPath = "/c";
        assertEquals(canonicalPath, simplifyPath.simplifyPath(path));
    }
}
package com.leetcode.algo.stack.simplifypath;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class SimplifyPath {
    private static final String CURRENT_DIR = ".";
    private static final String PARENT_DIR = "..";

    public String simplifyPath(String path) {
        Deque<String> directories = new LinkedList<>();
        final int N = path.length();
        int prevSep = 0;
        int currentSep;
        do {
            currentSep = path.indexOf('/', prevSep);
            if (currentSep == -1) {
                currentSep = N;
            }
            if (currentSep > prevSep) {
                String directory = path.substring(prevSep, currentSep);
                processDirectory(directories, directory);
            }
            prevSep = currentSep + 1;
        } while (currentSep != -1 && (prevSep < N));

        return canonicalPath(directories);
    }

    private String canonicalPath(final Deque<String> directories) {
        StringBuffer path = new StringBuffer();
        while (!directories.isEmpty()) {
            path.append('/');
            path.append(directories.removeLast());
        }

        return path.toString();
    }

    private void processDirectory(final Deque<String> directories, final String directory) {
        if (directory.isEmpty() || Objects.equals(directory, CURRENT_DIR)) {
            return;
        }

        if (Objects.equals(directory, PARENT_DIR)) {
            if (!directories.isEmpty()) {
                directories.removeFirst();
            }
        } else {
            directories.push(directory);
        }
    }
}

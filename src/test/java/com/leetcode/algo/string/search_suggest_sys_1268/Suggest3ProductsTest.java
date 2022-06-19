package com.leetcode.algo.string.search_suggest_sys_1268;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Suggest3ProductsTest extends AbstractExecuteTests<TestCase> {
    public Suggest3ProductsTest() {
        super("Suggest3ProductsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new Suggest3Products();
        var actual = solution.suggestedProducts(testCase.input.products, testCase.input.searchWord);
        List<List<String>> expected = getExpectedList(testCase.output.expected);
        assertEquals(expected, actual);
    }

    private List<List<String>> getExpectedList(String[][] strings2D) {
        List<String[]> stringsArrayList = Arrays.stream(strings2D).collect(Collectors.toList());
        List<List<String>> result = new ArrayList<>(strings2D.length);
        for (String[] strings: stringsArrayList) {
            result.add(Arrays.stream(strings).toList());
        }

        return result;
    }
}
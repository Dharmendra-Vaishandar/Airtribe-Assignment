package com.airtribe.studentmanagement.util;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelperTest {

    @Test
    void testAutoGradeWithAllKeywordsMatched() {
        String submission = "Java is an object oriented programming language";
        var keywords = Arrays.asList("java", "object", "programming");

        double grade = Helper.autoGrade(submission, keywords);

        // All keywords matched -> high score expected (close to 90–100)
        boolean isHigh = grade >= 85 && grade <= 100;
        assertEquals(true, isHigh);
    }

    @Test
    void testAutoGradeWithPartialMatches() {
        String submission = "Java is popular";
        var keywords = Arrays.asList("java", "object", "programming");
        double grade = Helper.autoGrade(submission, keywords);
        boolean approxCorrect = grade > 20 && grade < 40;
        assertEquals(true, approxCorrect);
    }

    @Test
    void testAutoGradeNullSubmission() {
        double grade = Helper.autoGrade(null, Arrays.asList("java"));
        assertEquals(0.0, grade);
    }

    @Test
    void testAutoGradeEmptySubmission() {
        double grade = Helper.autoGrade("", Arrays.asList("java"));
        assertEquals(0.0, grade);
    }

    @Test
    void testAutoGradeWithNoKeywords() {
        String submission = "Some content here";
        double grade = Helper.autoGrade(submission, Collections.emptyList());

        // Base becomes 0/1 = 0, only length bonus added
        boolean inExpectedRange = grade >= 0 && grade <= 2;
        assertEquals(true, inExpectedRange);
    }
}


package com.airtribe.studentmanagement.util;

import java.util.List;

public class Helper {
    public static double autoGrade(String submission, List<String> keywords) {
        if (submission == null || submission.isEmpty()) return 0.0;
        String lower = submission.toLowerCase();
        int matches = 0;
        for (String kw : keywords) {
            if (lower.contains(kw.toLowerCase())) matches++;
        }
        double base = (double) matches / Math.max(1, keywords.size());
        // scale to 100 and add small bonus for length
        double lengthBonus = Math.min(0.2, Math.log1p(submission.length()) / 100.0);
        return Math.min(100.0, (base * 90.0) + (lengthBonus * 10.0));
    }
}

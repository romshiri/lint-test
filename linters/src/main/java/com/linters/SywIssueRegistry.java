package com.linters;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;
import com.linters.issues.LoggerUsageDetector;

import java.util.Arrays;
import java.util.List;

public class SywIssueRegistry extends IssueRegistry {
    @Override
    public List<Issue> getIssues() {
        return Arrays.asList(LoggerUsageDetector.ISSUE);
    }
}

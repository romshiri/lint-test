package com.linters;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;
import com.linters.issues.LoggerUsageDetector;
import com.linters.issues.MyAnnotationDetector;

import java.util.Arrays;
import java.util.List;

public class SywIssueRegistry extends IssueRegistry {

    public SywIssueRegistry() {
    }

    @Override
    public List<Issue> getIssues() {
        return Arrays.asList(LoggerUsageDetector.ISSUE, MyAnnotationDetector.CAREFUL_NOW_ISSUE);
    }
}

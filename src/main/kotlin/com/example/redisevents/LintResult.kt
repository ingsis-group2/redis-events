package com.example.redisevents

data class LintResult(
    val userId: String,
    val snippetId: String,
    val result: LintResultStatus,
)

enum class LintResultStatus {
    SUCCESS,
    FAILURE,
    PENDING,
}


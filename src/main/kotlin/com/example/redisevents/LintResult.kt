package com.example.redisevents

data class LintResult(
    val snippetId: Long,
    val reportList: List<String> = emptyList(),
    val errorList: List<String> = emptyList(),
)
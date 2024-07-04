package com.example.redisevents

data class LintResult(
    val snippetId: Long,
    val reportList: List<String>,
    val errorList: List<String>,
)
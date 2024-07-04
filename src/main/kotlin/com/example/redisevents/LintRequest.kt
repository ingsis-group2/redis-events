package com.example.redisevents

data class LintRequest(
    val snippetId: Long,
    val snippetContent: String,
    val lintRules: Map<String, Any> = emptyMap(),
)


package com.xmuu.echochat

/** A platform-neutral chat message shared by Android and iOS. */
data class ChatMessage(
    val id: String,
    val senderId: String,
    val text: String,
    val timestampEpochMillis: Long,
)

/** Minimal shared entry point for the EchoChat KMP module. */
object EchoChat {
    fun greeting(): String = "Hello from EchoChat KMP"

    fun createMessage(senderId: String, text: String, nowEpochMillis: Long): ChatMessage =
        ChatMessage(
            id = "msg-$nowEpochMillis",
            senderId = senderId,
            text = text,
            timestampEpochMillis = nowEpochMillis,
        )
}

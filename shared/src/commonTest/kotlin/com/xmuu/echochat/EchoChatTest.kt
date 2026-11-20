package com.xmuu.echochat

import kotlin.test.Test
import kotlin.test.assertEquals

class EchoChatTest {
    @Test
    fun createsMessageWithStableFields() {
        val message = EchoChat.createMessage("xMuu", "Hello", 1234L)

        assertEquals("msg-1234", message.id)
        assertEquals("xMuu", message.senderId)
        assertEquals("Hello", message.text)
        assertEquals(1234L, message.timestampEpochMillis)
    }
}

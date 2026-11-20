#!/usr/bin/env bash
# Source this file from the EchoChat repository root.
export ECHOCHAT_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
export ECHOCHAT_TOOLING="$(cd "${ECHOCHAT_ROOT}/../.tooling" && pwd)"
export JAVA_HOME="${ECHOCHAT_TOOLING}/jdk-21"
export ANDROID_SDK_ROOT="${ECHOCHAT_TOOLING}/android-sdk"
export ANDROID_HOME="${ANDROID_SDK_ROOT}"
export ANDROID_USER_HOME="${ECHOCHAT_TOOLING}/android-user"
export GRADLE_USER_HOME="${ECHOCHAT_TOOLING}/gradle-home"
export PATH="${JAVA_HOME}/bin:${ANDROID_SDK_ROOT}/platform-tools:${ANDROID_SDK_ROOT}/cmdline-tools/latest/bin:${PATH}"

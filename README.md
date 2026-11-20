# EchoChat KMP

A minimal Kotlin Multiplatform foundation for EchoChat.

## Targets

- Android library (`androidTarget`)
- JVM (`jvm`)
- iOS device (`iosArm64`)
- iOS simulator (`iosX64`, `iosSimulatorArm64`)

## Structure

```text
shared/
  src/commonMain/   # shared business models and logic
  src/commonTest/   # shared tests
```

## Tooling

- Kotlin Multiplatform: 2.1.21
- Android Gradle Plugin: 8.7.3
- Recommended JDK: 17 or 21

Open the repository in Android Studio or run it with a compatible Gradle 8.9+ installation. The remote environment currently does not include a Gradle executable or Android SDK, so full compilation is pending a development environment with those tools installed.

For the remote machine, use the helper scripts:

```bash
source scripts/activate-toolchain.sh
./scripts/build-android.sh
```

For the remote machine, use the helper scripts:

```bash
source scripts/activate-toolchain.sh
./scripts/build-android.sh
```

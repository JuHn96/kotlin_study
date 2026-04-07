# Troubleshooting (에러 해부학 사전)

> 작업 중 발생한 에러 발생 상황, 원인, 해결책을 3단 구조로 심층적으로 정리합니다.

## [IDE / 설정] Spring Boot runApplication unresolved reference 에러
1. **[Issue]**: `KotlinStudyApplication.kt` 내의 `runApplication` 및 `BaseEntity` 관련 코드 등에서 IDE 내부적으로 빨간 줄(Unresolved Reference) 발생. `gradle build`는 성공함.
2. **[Cause]**: 프로젝트 빌드 환경은 Java 21로 설정되어 있으나, VS Code/IntelliJ 내장 Kotlin 컴파일러의 Target JVM이 `default`(일반적으로 1.8)로 맞춰져 있어 21 타겟의 Spring Boot `inline` 코드를 해석하지 못해 충돌 발생.
3. **[Resolution]**: IDE 설정의 `Kotlin Compiler > Target JVM` 버전을 명시적으로 **21**로 변경하여 해결함.

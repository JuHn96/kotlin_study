# 🚀 Kotlin Study Project

> Kotlin 기반의 Spring Boot 게시판 서버 구축 스터디 프로젝트입니다.

## 🛠️ 활용 기술 스택 (Tech Stack)

| 구분 (Category) | 기술명 (Technology) | 버전 (Version) | 사용처 및 역할 (Description) |
| :--- | :--- | :--- | :--- |
| **Language** | Kotlin | 2.2.21 | 애플리케이션 전체 비즈니스 로직 작성 및 객체 설계 |
| **Framework** | Spring Boot | 4.0.5 | 웹 API 서버 뼈대, 내장 웹서버 제공 및 의존성 자동 주입 |
| **Runtime** | Java (JDK) | 21 | Spring Boot 4.x 컴파일 및 코틀린 바이트코드 실행 환경 |
| **Database** | MariaDB | - | 게시글(Notice) 등 실제 데이터를 물리적으로 영구 보관 |
| **ORM** | Spring Data JPA | - | 코틀린 데이터 클래스와 MariaDB 테이블을 객체지향적으로 매핑 |
| **Build Tool** | Gradle | - | 라이브러리(`build.gradle.kts`) 다운로드 및 프로젝트 빌드 |
| **OS / Infra** | Debian Linux | - | 시스템 터미널(CLI) 기반의 메인 개발 및 로컬 테스트 환경 |
| **VCS** | Git & GitHub | - | 소스 코드 버전별 이력 관리 및 원격 저장소 백업 |

## 📂 파일 구조 (Project Structure)
핵심 비즈니스 로직과 설계 문서 위주로 간추린 디렉토리 구조입니다.

```text
kotlin_study/
├── ai_context/               # AI 에이전트 작업 통제 및 글로벌 룰 정의 폴더
├── docs/                     # 프로젝트 산출물 및 문서 보관소
│   ├── playbook.md           # 작업 로그 및 성공 일기장
│   ├── troubleshooting.md    # 에러 및 버그 해결 기록
│   ├── tech_spec.md          # 기술 및 인프라 명세서
│   ├── architecture.md       # 시스템 아키텍처 다이어그램
│   └── db_spec_mariadb.md    # DB 테이블 명세서 (Notice 등)
├── src/
│   ├── main/kotlin/com/kotlinstudy/
│   │   ├── KotlinStudyApplication.kt       # Spring Boot 메인 App 시작점
│   │   ├── common/entity/BaseEntity.kt     # 생성일/수정일 자동 기록 추상 클래스
│   │   └── notice/entity/Notice.kt         # 공지사항 도메인(DB 연동) 클래스
│   └── main/resources/
│       └── application.properties          # DB 접속 정보 및 서버 환경 설정
├── build.gradle.kts          # 프로젝트 빌드 및 라이브러리 관리 (Kotlin DSL)
├── .gitignore                # 깃허브 업로드 제외 파일 보안 설정 (`.env` 등)
└── HELP.md                   # Spring Boot 공식 레퍼런스 가이드 (번역본)
```

## 📋 현재까지 주요 진행 상황 (Progress Log)

현재 프로젝트의 뼈대가 되는 인프라를 세팅하고, 공통 컴포넌트와 데이터베이스 연동 설정을 모두 완료한 상태입니다.

1. **인프라 및 뼈대 구축**: 외부 GUI 툴에 의존하지 않고 터미널(`curl`) 환경만으로 JDK 21, MariaDB 세팅 및 Spring Boot + Kotlin 뼈대(Entity, Web, MariaDB 설정 포함) 코드를 성공적으로 구성했습니다.
2. **안정적인 DB 연동 도구 구현**: 모든 게시판이나 데이터 테이블에서 공통으로 쓰이는 '생성일/수정일'을 하나하나 코딩하지 않기 위해, JPA Auditing을 활용한 `BaseEntity` 공통 모듈 설계를 마쳤습니다.
3. **게시판 도메인 검증**: 엑셀 명세서에 기반한 `Notice`(공지사항) 도메인 설계를 완료했으며, `application.properties`와 DDL-Auto 설정을 통해 실제 MariaDB에 물리적인 `notice` 테이블이 에러 없이 무사히 생성됨을 검증 완료했습니다.
4. **환경 오류 극복**: 초기 뼈대 생성 시의 꼬인 파일 시스템 구조를 재배치하고, IDE와 빌드 툴 간의 JVM 버전 불일치로 발생했던 인덱싱 시각 오류(고스트 에러)를 완벽히 파훼하여 안정적인 코딩 환경을 탈환했습니다.
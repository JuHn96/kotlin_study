# Playbook (메인 작업 로그 & 성공 일기장)

> 프로젝트 진행 중 완료된 작업, 명세 변경 이력, 트러블슈팅 요약을 목적별 섹션으로 시간순 기록합니다.

## Phase 1: 기반 인프라 구축 및 게시판 기초 설계
* **[작업 로그]:**
  * Debian Linux 기반으로 JDK 21, MariaDB, Git 초기 환경 구성.
  * Spring Initializr CLI(curl) 통신을 활용하여 터미널 환경에서 Spring Boot 프로젝트(Kotlin DSL 환경) 뼈대 자동 생성 완료 (`web`, `data-jpa`, `mariadb` 의존성 주입).
  * `BaseEntity` 추상 클래스 설계 및 프로젝트 전역 JPA Auditing 활성화 (`@EnableJpaAuditing`, `@MappedSuperclass`).
  * 엑셀 기획서 명세에 맞춘 `Notice` 도메인 객체 구현 완료.
  * `application.properties` 설정 및 Hibernate DDL-Auto (`update`) 구동을 통해 로컬 DB상에 `notice` 테이블 자동 생성 검증 완료.
* **[명세 변경 이력]:** 
  * 현재 로컬 환경 개발의 편의성을 위해 Spring Data JPA의 `ddl-auto` 설정을 `update`로 적용함. (프로덕션 릴리즈 시에는 변경 필수 - *Review Point 3*).
* **[트러블슈팅 요약]:** 
  * `curl` 기반 압축 해제 도중 로컬 파일 경로 유실 및 템플릿 패키지 꼬임 현상 해결 완료.
  * IDE 컴파일러 JVM 타겟 불일치 및 인덱싱 지연으로 인한 고스트 에러(Ghost Error) 발생 문제 해결 (상세 원인은 `troubleshooting.md`로 분리).

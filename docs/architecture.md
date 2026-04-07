# System Architecture

> 전체 시스템 구조와 인프라 다이어그램을 기술합니다.

## 1. 개요
* Kotlin과 Spring Boot 프레임워크를 활용하여 개발된 백엔드 서버 애플리케이션입니다.
* 비즈니스 로직(공지사항 게시판 등)을 처리하고 MariaDB를 통해 데이터를 영속화(Persist)합니다.
* 개발 및 검증은 철저하게 Debian Linux 기반의 터미널(CLI) 환경에서 이루어집니다.

## 2. 아키텍처 다이어그램
* (Mermaid 또는 외부 이미지 주소 첨부 필요)

## 3. 구성 요소 설명
* **Client:** (추후 프론트엔드/앱 클라이언트 확정 시 서술)
* **API Server (Spring Boot):** 데이터베이스 연동, 비즈니스 로직 처리 (`com.kotlinstudy.*`)
* **Database (MariaDB):** 물리적인 데이터 보관소 (`kotlin_study` 스키마)

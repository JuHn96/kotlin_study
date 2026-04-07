# Database Specification (MariaDB)

> 모든 DB 테이블의 명세를 정리합니다. (테이블 및 컬럼명은 Snake Case 엄수)

## 1. Table: `notice` (공지사항)
| Column Name | Data Type | Constraints | Description |
|-------------|-----------|-------------|-------------|
| `id` | BIGINT | PK, AUTO_INCREMENT | 공지사항 고유 식별자 |
| `title` | VARCHAR(255) | NOT NULL | 공지사항 제목 |
| `content` | TEXT | NOT NULL | 공지사항 내용 |
| `author` | VARCHAR(255) | NOT NULL | 작성자 이름/ID |
| `created_at` | DATETIME | NOT NULL | 최초 데이터 생성 시간 |
| `updated_at` | DATETIME | NOT NULL | 마지막 데이터 수정 시간 |

*(주의: 논리적 삭제 `is_deleted` 컬럼 및 다른 추가 테이블들에 대한 설계 정보가 더 필요합니다.)*

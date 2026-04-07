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

> ⚠️ **[보완 필요 사항 - Soft Delete 규칙]**
> `ai_context/global_rules/2_global_coding_standards.md`의 [데이터 보존] 규칙에 따르면 "데이터는 물리적으로 삭제하지 않고 무조건 `is_deleted` (Boolean) 컬럼을 사용하여 논리적 삭제 처리를 수행한다"고 되어 있습니다. 
> 현재 `Notice` (또는 `BaseEntity`) 객체에는 해당 컬럼이 누락되어 있으므로, 후속 작업에서 이 논리적 삭제 컬럼을 필수로 추가해야 규격에 맞습니다.

*(추후 User, Comment 등 추가 테이블이 기획되면 본 문서 하단에 양식을 복사하여 덧붙입니다.)*

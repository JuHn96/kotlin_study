package com.kotlinstudy.common.entity // 파일 위치 증명

// JPA(자카르타 퍼시스턴스) 표준 도구들, DB 테이블과 코틀린 코드를 연결해 주는 가장 기본적인 표준 설계 도구들
import jakarta.persistence.Column //필드를 DB 컬럼과 매칭할때 사용(@Column)
import jakarta.persistence.EntityListeners //엔티티에 이벤트(저장, 수정 등)가 발생할때 틀정 감시자를 붙일 때 사용
import jakarta.persistence.MappedSuperclass //내 속성을 자식 엔티티에게 물려주는 부모 클래스임을 선언할 때 사용
// Spring Data 도구들(스프링 프레임워크 제공), 스프링이 JPA를 더 쓰기 편하게 만들어준 '확장팩' 같은 도구들
import org.springframework.data.annotation.CreatedDate //생성된 시간을 자동으로 채우라는 어노테이션
import org.springframework.data.annotation.LastModifiedDate //수정된 시간을 자동으로 채우라는 어노테이션
import org.springframework.data.jpa.domain.support.AuditingEntityListener //실제로 시간 감시와 자동 입력을 수행하는 클래스
// Java 표준 라이브러리
import java.time.LocalDateTime //연, 월, 일, 시, 분, 초를 다루는 자바의 최신/표준 시간 규격

@MappedSuperclass //독자적인 DB 테이블X, 속성(생성일, 수정일)만 상속받는 자식(Notice 등)에게 물려준다는 뜻
@EntityListeners //이 데이터에 변화(저장, 수정)가 생기는지 백그라운드에서 감시
abstract class BaseEntity {
    @CreatedDate // 처음 Insert 시간
    @Column(name = "created_at", nullable = false, updatable = false) // DB 컬럼과 연결
    var createdAt: LocalDateTime = LocalDateTime.now() // 기본값으로 현재 시간
        protected set // 값을 함부로 덮어쓰지 못하도록 쓰기 권한 잠궈버리는 안전장치
    
    @LastModifiedDate // 데이터 Update 할 때 시간
    @Column(name = "update_at", nullable = false)
    var updatedAt: LocalDateTime = LocalDateTime.now()
        protected set
}
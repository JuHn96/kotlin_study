package com.kotlinstudy // 이 파일이 속한 패키지(폴더) 위치를 선언합니다.

import org.springframework.boot.autoconfigure.SpringBootApplication // 스프링 부트의 자동 설정을 활성화하는 어노테이션을 불러옵니다.
import org.springframework.boot.runApplication // 스프링 부트 애플리케이션을 실행하는 함수를 불러옵니다.
import org.springframework.data.jpa.repository.config.EnableJpaAuditing // JPA Auditing(생성일, 수정일 자동 기록) 기능을 활성화하는 어노테이션을 불러옵니다.

@EnableJpaAuditing // 엔티티의 생성일, 수정일 등을 자동으로 기록(감시)하기 위해 JPA Auditing 기능을 켭니다.
@SpringBootApplication // 이 클래스가 스프링 부트 프로젝트의 시작점임을 나타내며, 필요한 기본 설정들을 자동으로 해줍니다.
class KotlinStudyApplication // 스프링 부트 애플리케이션의 메인 설정 클래스입니다.

fun main(args: Array<String>) { // 프로그램이 처음 시작될 때 가장 먼저 실행되는 메인 함수입니다.
	runApplication<KotlinStudyApplication>(*args) // KotlinStudyApplication 클래스를 설정으로 사용하여 스프링 부트 앱을 실행합니다.
}

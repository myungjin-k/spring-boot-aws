## 스프링부트와 AWS로 혼자 구현하는 웹 서비스
### 2020-04-17
* 프로젝트 생성
* gradle 프로젝트를 spring boot 프로젝트로 변경 - build.gradle
* .gitignore 등록

### 2020-04-18
* @SpringBootApplicaion 클래스 생성
* 테스트 코드 작성해보기 - return "hello";
* Lombok 어노테이션 적용

### 2020-04-19
* JPA 적용 및 설정
* 간단한 API 생성 - 등록
* JPA 테스트 코드 작성해보기 

### 2020-04-20
* 간단한 API 생성 - 수정
* h2.console 사용해 보기
* JPA Auditing으로 등록/수정시각 자동 삽입하기
* mustache REST API 생성 - 등록, 조회


### 2020-04-21
* mustache REST API 생성 - 수정, 삭제


### 2020-04-22
* oauth2 security 적용하여 로그인 구현
  * 로그인, 회원가입, 권한관리(USER/GUEST) 


### 2020-04-23
* Google 로그인 연동

### 2020-04-24
* SessionUser 어노테이션 기반으로 수정
* 세션 저장소로 MySql 사용
* Naver 로그인 연동
* 기존 테스트에 security 적용


### 2020-04-29
* 테스트 오류 수정
* real profile 추가(AWS EC2-RDS 연동)


### 2020-05-04
* Travis CI 설정 추가
  

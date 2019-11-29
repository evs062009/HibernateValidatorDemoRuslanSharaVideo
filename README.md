# HibernateValidatorDemoRuslanSharaVideo
Validation of input to jsp-form

including:
* not null and not empty (certain size) validation;
* number (min & max) validation;
* pattern (regexp) validation.

using:
* Spring Boot;
* Hibernate Validator (included in spring-boot-starter-validation);
* JSP:
    - jstl (form creating);
    - tomcat-embed-jasper (compile JSP);
* @InitBinder method for trimming all string input.


package com.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)  //contains business-rules for validation logic
@Target({ElementType.METHOD, ElementType.FIELD})                //can apply for methods and fields
@Retention(RetentionPolicy.RUNTIME)                             //retain this @ in Java class file, process it in runtime
public @interface CourseCode {

    //define default course code
    public String value() default "LUV";

    //define default error message
    public String message() default "must start with LUV";

    //define default groups
    public Class<?>[] groups() default {};

    //define default payload
    public Class<? extends Payload>[] payload() default {};
}

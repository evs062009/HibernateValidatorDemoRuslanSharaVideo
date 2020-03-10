package com.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
   private String coursePrefix;

   @Override
   public void initialize(CourseCode theCourseCode) {
      coursePrefix = theCourseCode.value();
   }

   @Override
   public boolean isValid(String /*entered by user HTML form data*/theCode,
                          ConstraintValidatorContext /*can place additional error message here*/context) {
      return theCode == null || theCode.startsWith(coursePrefix);     //validation condition
   }
}

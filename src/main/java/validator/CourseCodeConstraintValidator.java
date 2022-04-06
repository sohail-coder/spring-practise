package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;
    @Override
    public void initialize(CourseCode courseCode) {
    coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String theCode,ConstraintValidatorContext constraintValidatorContext) {
        boolean result =false;
        if(theCode!=null){
            result = theCode.startsWith(coursePrefix);
        }




        return result;
    }
}

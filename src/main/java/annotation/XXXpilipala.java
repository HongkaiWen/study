package annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by player on 2015/5/31.
 */
//TODO
@Target({java.lang.annotation.ElementType.TYPE})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Component
public @interface XXXpilipala {
    String value="";

//    public XXXpilipala(String value){
//        this.value = value;
//    }
}

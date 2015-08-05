package aop;

import org.springframework.stereotype.Component;

/**
 * Created by player on 2015/5/31.
 */
@Component
public class Thinker {
    private String thoughts;

    public void thinkOfSomThing(String thoughts){
        this.thoughts = thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}

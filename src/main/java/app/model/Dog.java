package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String s;

    public Dog(String s) {
        this.s = s;
    }

    @Override
    void say() {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}

package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String s;

    public Cat(String s) {
        this.s = s;
    }

    @Override
    void say() {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}

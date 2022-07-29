package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

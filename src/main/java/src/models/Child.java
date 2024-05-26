package src.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import src.Parent;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Child extends Parent {
    String c;

    public Child(String a, String b, String c) {
        super(a,b);
        this.c=c;
    }
}

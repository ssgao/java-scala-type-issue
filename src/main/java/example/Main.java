package example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Field<String, StringType> field1 = new Field<>();
        Field<Boolean, BooleanType> field2 = new Field<>();

        Map<Field, Object> map = new HashMap<>();
        map.put(field1, "abc");
        map.put(field2, true);

        DataBuilder dataBuilder = new DataBuilder();
        map.forEach(dataBuilder::addEntry);

        System.out.println("good");
    }
}

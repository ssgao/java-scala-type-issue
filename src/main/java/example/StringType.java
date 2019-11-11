package example;

public class StringType implements Type<String> {

    private final String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public String getTypeName() {
        return "string";
    }

    @Override
    public String getValue() {
        return value;
    }
}

package example;

public class BooleanType implements Type<Boolean> {

    private final boolean value;

    public BooleanType(boolean value) {
        this.value = value;
    }

    @Override
    public String getTypeName() {
        return "bool";
    }

    @Override
    public Boolean getValue() {
        return value;
    }
}

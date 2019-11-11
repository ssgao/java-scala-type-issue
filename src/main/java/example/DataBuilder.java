package example;

class DataBuilder {

    <T, U extends Type<T>> DataBuilder addEntry(Field<T, U> field, T value) {
        return this;
    }

    // Data build(); // for demo purpose
}

public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Wrong age! Age must be greater than zero");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name != null && !name.isEmpty() && surname != null &&
                !surname.isEmpty() && age != 0 && city != null && !city.isEmpty()) {
            return new Person(name, surname, age, city);
        } else {
            throw new IllegalStateException("Not enough data for creating new Person");
        }
    }
}

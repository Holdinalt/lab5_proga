package source;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.LocalDate birthday; //Поле не может быть null
    private Long height; //Поле может быть null, Значение поля должно быть больше 0
    private Long weight; //Поле может быть null, Значение поля должно быть больше 0

    public Person(String name, java.time.LocalDate birthday, Long height, Long weight){
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name;
    }
}

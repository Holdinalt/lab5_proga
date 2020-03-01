package source;

import java.time.ZonedDateTime;

public class StudyGroup {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long studentsCount; //Значение поля должно быть больше 0
    private Integer transferredStudents; //Значение поля должно быть больше 0, Поле может быть null
    private long averageMark; //Значение поля должно быть больше 0
    private FormOfEducation formOfEducation; //Поле может быть null
    private Person groupAdmin; //Поле может быть null

    public StudyGroup(String name, Coordinates coordinates, ZonedDateTime creationDate,  long studentsCount,
                      Integer transferredStudents, long averageMark, FormOfEducation formOfEducation, Person groupAdmin){
        this.id = idMaker(name);
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.studentsCount = studentsCount;
        this.transferredStudents = transferredStudents;
        this.averageMark = averageMark;
        this.formOfEducation = formOfEducation;
        this.groupAdmin = groupAdmin;
    }

    private long idMaker(String name){
        String id = null;
        for (char letter : name.toCharArray()){
            id += "" + ((int) letter);
        }
        return Long.parseLong(id + coordinates.toDigitalString());
    }

    @Override
    public String toString() {
        String info = "";
        info += "Группа с ID №" + id;
        info += ", созданная " + creationDate;
        info += "\nНаименование: " + name;
        info += "\nМестонахождение: " + coordinates;
        info += "\nКоличество студентов: " + studentsCount;
        info += "\nКоличество перевезенных студентов: " + transferredStudents;
        info += "\nСредняя оценка: " + averageMark;
        info += "\nФорма обучения: " + formOfEducation;
        info += "\nСтароста группы: " + groupAdmin;
        return info;
    }
}

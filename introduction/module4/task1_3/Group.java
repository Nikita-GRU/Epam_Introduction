package epam.introduction.module4.task1_3;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или  10.
public class Group {

    private Student[] groupOfStudents;

    public Group(Student[] groupOfStudents) {
        this.groupOfStudents = groupOfStudents;
    }

    public Student[] getGroupOfStudents() {
        return groupOfStudents;
    }

    public void setGroupOfStudents(Student[] groupOfStudents) {
        this.groupOfStudents = groupOfStudents;
    }


}

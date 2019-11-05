package epam.introduction.module4.task1_3;
//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или  10.

import java.util.Arrays;

public class StudentView {
    public StudentView() {
    }

    public void printExcellentStudentsInfo(Group group) {
        for (Student student : new GroupLogic().getExcellentStudents(group)
        ) {
            printStudentInfo(student);
        }
    }

    public void printGroupInfo(Group group) {
        for (Student student : group.getGroupOfStudents()) {
            printStudentInfo(student);
        }
    }

    public void printStudentInfo(Student stud) {
        System.out.println("Student:" + stud.getSurname() + ", groupId=" + stud.getGroupNumber()
                + ", performance: {" + Arrays.toString(stud.getProgress()) + "}");
    }

}


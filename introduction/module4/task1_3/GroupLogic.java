package epam.introduction.module4.task1_3;
//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или  10.

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {
    private boolean isExcellent;

    public GroupLogic() {
    }

    // Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
    public List<Student> getExcellentStudents(Group group) {
        List<Student> excellenceList = new ArrayList<>();
        for (Student student : group.getGroupOfStudents()
        ) {
            isExcellent = true;
            for (int mark : student.getProgress()
            ) {
                if (mark < 9) {
                    isExcellent = false;
                }
            }
            if (isExcellent) {
                excellenceList.add(student);
            }
        }
        return excellenceList;
    }
}



package epam.introduction.module4.task1_3;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
////номеров групп студентов, имеющих оценки, равные только 9 или  10.
public class StudentMain {
    public static void main(String[] args) {
        Group group1 = new Group(new Student[]{
                new Student("Stepanov A.I.", 1, new int[]{1, 2, 3, 4, 5, 4}),
                new Student("Balotelli M.V.", 1, new int[]{9, 9, 10, 9, 9, 8}),
                new Student("Torres F.A.", 1, new int[]{9, 9, 3, 4, 6, 7, 8}),
                new Student("Cudicini S.I.", 2, new int[]{1, 2, 3, 4, 9, 9, 4}),
                new Student("Fernandes M.A.", 2, new int[]{1, 4, 5, 7, 9, 9}),
                new Student("Gerrard S.I.", 2, new int[]{1, 9, 9, 4, 10, 6}),
                new Student("Pirlo A.A.", 3, new int[]{10, 6, 7, 9, 9, 9}),
                new Student("Ferguson A.I.", 3, new int[]{9, 9, 9, 9, 10, 10}),
                new Student("Henderson J.S.", 3, new int[]{5, 6, 7, 5, 6, 9, 10, 10}),
                new Student("Salah M.M.", 3, new int[]{10, 10, 10, 10, 10, 10})});

        StudentView studentView = new StudentView();

        studentView.printExcellentStudentsInfo(group1);
    }
}

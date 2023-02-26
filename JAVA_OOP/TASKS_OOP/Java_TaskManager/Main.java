package TASKS_OOP.Java_TaskManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n \t ToDo schedule");

        ToDo task1 = new ToDo("Lesson", LocalDate.of(2023, 02, 22), LocalDate.of(2023, 02, 24),
                LocalDate.of(2023, 02, 26),
                "Ivan");
        ToDo task2 = new ToDo("Seminar", LocalDate.of(2023, 02, 24), LocalDate.of(2023, 02, 24),
                LocalDate.of(2023, 02, 24),
                "Petr");

        Schedule<ToDo> workSchedule = new Schedule<>(new ArrayList<ToDo>());
        workSchedule.addTask(task1);
        workSchedule.addTask(task2);

        task2.setPriority(true);
        System.out.println(workSchedule.toString());

        System.out.println("------------------------------------");

        Schedule<PersonalTasks> mySchedule = new Schedule<>(new ArrayList<PersonalTasks>());
        PersonalTasks todo1 = new PersonalTasks("Homework", LocalDate.of(2023, 02, 25), "Petr", "+7911 987 6543");
        mySchedule.addTask(todo1);
        System.out.println(mySchedule.toString());
        System.out.println("");
    }

}

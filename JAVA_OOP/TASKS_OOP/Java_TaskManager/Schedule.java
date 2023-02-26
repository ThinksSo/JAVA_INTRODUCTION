package TASKS_OOP.Java_TaskManager;

import java.util.ArrayList;
import java.util.List;

public class Schedule<T> {
    public List<T> tasks = new ArrayList<>();

    public Schedule(List<T> tasks) {
        this.tasks = tasks;
    }

    public void addTask(T anyTask) {
        tasks.add(anyTask);
    }

    public void removeTask(ToDo anyTask) {
        tasks.remove(anyTask);
    }

    @Override
    public String toString() {
        return tasks.toString();
    }

    public List<T> getTasks() {
        return tasks;
    }

    public void setTasks(List<T> tasks) {
        this.tasks = tasks;
    }

}

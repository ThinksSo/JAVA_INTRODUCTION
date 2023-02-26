package TASKS_OOP.Java_TaskManager;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ToDo extends Task {
    private LocalDate expirationDate;
    private long duration;
    private LocalDate deadline;
    public Boolean priority;

    private String responsible;

    public ToDo(String subject, LocalDate startLocalDate, LocalDate expirationDate, LocalDate deadline,
            String responsible) {
        super(startLocalDate, subject);
        this.createLocalDate = LocalDate.now();
        this.expirationDate = expirationDate;
        this.duration = duration();
        this.deadline = deadline;
        this.priority = false;
        this.subject = subject;
        this.responsible = responsible;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    // public static String getStatusIsRunning() {
    // if (isRunning) return "Already running";
    // else return "Not implemented yet";
    // }

    @Override
    public String toString() {
        return "Work task" + "\n" + "Subject: " + subject + "\n" + "Responsible: " + responsible + "\n"
                + "Start Date & Time: "
                + startLocalDate.toString() + "\n" + "Expiration Date: " + expirationDate.toString() + "\n"
                + "duration: " + duration + " days" + "\n" + "deadline: " + deadline.toString() + "\n" + "priority: "
                + getPriorityStatus() + "\n";
    }

    private long duration() {
        return duration = ChronoUnit.DAYS.between(startLocalDate, expirationDate) + 1;
    }

    private String getPriorityStatus() {
        if (getPriority())
            return "High";
        else
            return "Low";
    }

}

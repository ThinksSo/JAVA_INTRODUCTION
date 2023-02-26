package TASKS_OOP.Java_TaskManager;

import java.time.LocalDate;

public class PersonalTasks extends Task {
    private String contact;
    public String phoneNumber;

    public PersonalTasks(String subject, LocalDate startLocalDate, String contact, String phoneNumber) {
        super(startLocalDate, subject);
        this.createLocalDate = LocalDate.now();
        this.contact = contact;
        this.phoneNumber = phoneNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Personal Tasks:" + "\n" + "Subject: " + subject + "\n" + "Start Date & Time: "
                + startLocalDate.toString() + "\n" + "contact: " + contact + "\n" + "phone: "
                + phoneNumber + "\n";
    }

}

/* Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
Например: Должен быть класс Задачи (общий/родительский и подтипы)
У задачи должно быть длительность, дедлайн, приоритет, тема, ответсвенный... - параметры на Ваше усмотрение
**У задачи должна быть возможность включить или выключить нотификацию на разные события, например, приближение дедлайна.
Должен быть класс Календарь, в который можно добавлять Задачи. 
*** При пересечении задач по времени - выводить сообщение пользователю.
**** Должна быть возможность выгрузки Календаря в файл (тип на Ваше усмотрение)
**** Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора и др
*/

package TASKS_OOP.Java_TaskManager;

import java.time.LocalDate;

public abstract class Task {
    protected LocalDate createLocalDate;
    public LocalDate startLocalDate;
    public String subject;

    public Task(LocalDate startLocalDate, String subject) {
        this.createLocalDate = LocalDate.now();
        this.startLocalDate = startLocalDate;
        this.subject = subject;
    }

    public LocalDate getCreateLocalDate() {
        return createLocalDate;
    }

    public LocalDate getStartLocalDate() {
        return startLocalDate;
    }

    public void setStartLocalDate(LocalDate startLocalDate) {
        this.startLocalDate = startLocalDate;
    }

    @Override
    public String toString() {
        return "Subject " + "\n" + subject + "CreatelDate & Time: " + createLocalDate + "\n" + "Start lDate & Time:"
                + startLocalDate;
    }

}

package Homework.HomeWork_5.HW;

import java.util.Date;

// Model
public abstract class User {
    Date dataBirth;
    int ID;
    String fio;

    public User(Date dataBirth, int ID, String fio) {
        this.dataBirth = dataBirth;
        this.ID = ID;
        this.fio = fio;
    }

    public User() {

    }
}

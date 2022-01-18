package com.company.model;

public class Cast {

    private String fullName;
    private String role;

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Полное имя"+"|" + fullName + "\n" +
                "Роль"+"|" + role + "\n"
                +"##########################"+"\n";
    }
}

package io.quind.prueba.prestamolibro.domain.models;

public class User {
    private Long id;
    private Long identificationNumber;
    private String name;
    private String lastName;
    private String mail;
    private String birthday;

    public User(Long id, Long identificationNumber, String name, String lastName, String mail, String birthday) {
        this.id = id;
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getBirthday() {
        return birthday;
    }
}

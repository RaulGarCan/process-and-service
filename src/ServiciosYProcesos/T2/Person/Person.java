package ServiciosYProcesos.T2.Person;

import java.util.Objects;

public class Person {
    /*
    Create a class Person. Each Person is identified by its name, surname and email address. Add the following functionalities
    to the Person class, while taking into account the following restrictions:
            The name must be at least 3 characters long.
            The surname is stored without spaces and all in uppercase.
            The email address contains an @ and ends in .es or .com.
            Create a default constructor and a copy constructor.
            Create a constructor with parameters that initializes every attribute as a String.
            Add getters and setters for each attribute.
            Implement the methods toString(), equals() and clone().
     */
    private String name;
    private String surname;
    private String email;

    public Person(String name, String surname, String email) {
        setName(name);
        setSurname(surname);
        setEmail(email);
    }

    public Person() {}
    public Person(Person source){
        this.name=source.name;
        this.surname=source.surname;
        this.email=source.email;
    }

    public void setEmail(String email) {
        int cont = 0;
        for(char c : email.toCharArray()){
            if(c=='@'){
                cont++;
            }
        }
        String[] tmp = email.split(".");
        if(cont==1 && tmp.length>0){
            if(tmp[tmp.length-1].equals("es") || tmp[tmp.length-1].equals("com")){
                this.email=email;
            }
        }
    }

    public void setName(String name) {
        if(name.length()>=3){
            this.name=name;
        }
    }

    public void setSurname(String surname) {
        this.surname = surname.replaceAll(" ","").toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(this);
    }
}

public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phone;
    private String gender;

    public Human(String surname, 
                String name,
                String patronymic,
                String birthday,
                String phone,
                String gender) {

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", this.surname, this.name, this.patronymic, this.birthday, this.phone, this.gender);
    }
}

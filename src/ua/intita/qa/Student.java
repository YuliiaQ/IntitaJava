package ua.intita.qa;

public class Student {
    private int id;
    private String surname;
    private String firstName;
    private String secondName;
    private int birthday;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private int group;

    Student(int id, String surname, String firstName, String secondName, int birthday, String address,
            String phone, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public static void choiceFaculty (Student stud, String facult) {
        if (stud.faculty.equals(facult)) {
            System.out.println(stud.getFirstName()+" "+stud.getSecondName()+" "+stud.getSurname());
        }
    }
    public static void choiceFacultyAndCourse(Student stud, String facult, int cour){
        if((stud.faculty.equals(facult)) & (stud.course==cour)){
            System.out.println(stud.getFirstName()+" "+stud.getSecondName()+" "+stud.getSurname());
        }
    }

    public static void bornAfter(Student stud, int year){
        if(stud.birthday >= year){
            System.out.println(stud.getFirstName()+" "+stud.getSecondName()+" "+stud.getSurname());
        }
    }
    public static void choiceFacultyCourseGroup(Student stud, String facult, int cour, int gr){
        if(stud.faculty.equals(facult) & (stud.course==cour) & (stud.group==gr)){
            System.out.println(stud.getFirstName()+" "+stud.getSecondName()+" "+stud.getSurname());
        }
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
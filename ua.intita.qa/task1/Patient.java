package task1;

public class Patient {
    private int id;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private String surname;
    private String name;
    private String address;
    private String number;

    public int getMedicalCard() {
        return medicalCard;
    }

    private int medicalCard;

    public String getDiagnose() {
        return diagnose;
    }

    private String diagnose;
    public Patient(int id, String surname, String name, String address, String number,int medicalCard, String diagnose){
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.address=address;
        this.number=number;
        this.medicalCard=medicalCard;
        this.diagnose=diagnose;
    }
}

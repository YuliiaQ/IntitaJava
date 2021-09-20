package task1;

public class Test {
    private Patient[] patients;

    public Test(Patient[] patients){
        this.patients = patients;
    }

    public void testByDiagnose(String diagnose){
        for (Patient patient : patients){
            if(patient.getDiagnose().equals(diagnose)){
                System.out.println(patient.getName()+' '+patient.getSurname()+' '+patient.getDiagnose());
            }
        }
    }
    public void testByMedicalCard (int minNumber, int maxNumber) {
        for (Patient patient : patients){
            if (patient.getMedicalCard()>=minNumber & patient.getMedicalCard()<=maxNumber){
                System.out.println(patient.getName()+' '+patient.getSurname()+' '+patient.getMedicalCard());
            }
        }
    }
}

package task1;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = {new Patient(1, "Mayakovsky", "Volodymyr", "Mayakovskogo, 12",
                "0971234569", 123456, "ORVI"),
                new Patient(2, "Gogol", "Mykola", "Gogolya, 25",
                        "0971234569", 456789, "otit"),
                new Patient(3, "Pushkin", "Oleksandr", "Pushkina, 1",
                        "0971234569", 321654, "ORVI"),
                new Patient(4, "Sholom-Aleikhem", "Solomon", "Sholom-Aleikhema, 2",
                        "0971234569", 963125, "laringit"),
                new Patient(5, "Shevchenko", "Taras", "Shevchenko, 23",
                        "0971234569", 612784, "ORVI"),
                new Patient(6, "Kotsiubinsky", "Mykola", "Kotsiubinskogo, 8",
                        "0971234569", 712654, "otit"),
                new Patient(7, "Ukrainka", "Lesia", "Lesi Ukrainki, 46",
                        "0971234569", 365412, "laringit")};

        Test test = new Test(patients);
        System.out.println("Parients with the same diagnose: ");
        test.testByDiagnose("otit");
        test.testByMedicalCard(300000, 600000);
    }
}

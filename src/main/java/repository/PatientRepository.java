package repository;

import model.Patient;

import java.time.LocalDate;

public class PatientRepository {
    private static PatientRepository instance;

    private PatientRepository() {
    }

    public static synchronized PatientRepository getInstance() {
        if (instance == null) {
            instance = new PatientRepository();
        }
        return instance;
    }

    public Patient[] getAllPatients() {
        return new Patient[]{
                new Patient("Daniel", "Agar", "(641) 123-0009", "dagar@m.as",
                        "1 N Street", LocalDate.of(1987, 1, 19)),

                new Patient("Ana", "Smith", null, "amsith@te.edu",
                        null, LocalDate.of(1948, 12, 5)),

                new Patient("Marcus", "Garvey", "(123) 292-0018", "bruce@gmail.com",
                        "4 East Ave", LocalDate.of(2001, 9, 18)),

                new Patient("Jeff", "Goldbloom", "(999) 165-1192", "jgold@es.co.za",
                        null, LocalDate.of(1995, 2, 28)),

                new Patient("Mary", "Washington", null, null,
                        "30 W Burlington", LocalDate.of(1932, 5, 31)),
        };
    }
}

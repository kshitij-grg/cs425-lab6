import repository.PatientRepository;
import util.JSONConverterUtil;

public class PAMSApp {
    private final PatientRepository patientRepository;

    public PAMSApp() {
        this.patientRepository = PatientRepository.getInstance();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Patient Appointment Management System");

        var app = new PAMSApp();
        var customers = app.patientRepository.getAllPatients();

        var jsonData = JSONConverterUtil.convertCustomerToJSON(customers);
        System.out.println(jsonData);
    }
}

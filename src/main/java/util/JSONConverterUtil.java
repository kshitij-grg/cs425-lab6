package util;

import model.Patient;
import org.json.JSONArray;

import java.util.Arrays;
import java.util.Comparator;

public class JSONConverterUtil {
    public static String convertCustomerToJSON(Patient[] patients) {
        JSONArray jsonArray = new JSONArray();
        Arrays.stream(patients)
                .sorted(Comparator.comparing(Patient::getAge).reversed())
                .forEach(
                patient -> jsonArray.put(patient.toJSON())
        );
        return jsonArray.toString();
    }
}

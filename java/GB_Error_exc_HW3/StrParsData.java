package GB_Error_exc_HW3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class StrParsData {
    public HashMap<String, Object> parsInputData() {
        InputData inputData = new InputData();
        String[] data = inputData.enterData();
        HashMap<String, Object> dataDic = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                if (i.equals("f") || i.equals("m")) {
                    dataDic.put("6_sex", i);
                } else {
                    try {
                        throw new SexExc();
                    } catch (SexExc e) {
                        e.sexException(i);
                    }
                }
            } else if (i.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = i.split("\\.");
                try {
                    DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                    df.setLenient(false);
                    df.parse(i);
                } catch (ParseException e) {
                    System.out.println("Что-то не то с датой");
                }

                try {
                    DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                    df.setLenient(false);
                    df.parse(i);
                    dataDic.put("4_date", i);
                } catch (ParseException e) {
                    try {
                        throw new DateExc();
                    } catch (DateExc ee) {
                        ee.dataException(i);
                    }
                }
            } else if (i.matches("[0-9]+")) {
                dataDic.put("5_tel", i);
            } else if (i.matches("[A-Za-zА-Яа-я]+")) {
                sb.append(i + " ");
            } else {
                try {
                    throw new DataExc();
                } catch (DataExc e) {
                    e.dataException(i);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataDic.put("2_firstName", fullName[1]);    // Преимущество такого алгоритма в том, что дату, тел. и пол,
            dataDic.put("1_lastName", fullName[0]);     // можно вставлять и между Ф И О
            dataDic.put("3_patronymic", fullName[2]);
        }
        return dataDic;
    }

    private void assertEquals(String s, String format) {
    }
}

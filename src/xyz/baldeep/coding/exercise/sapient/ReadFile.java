/**
 * ****************************************************************************
 *
 * Copyright (c) 2020, EntryIndia LLC and/or its affiliates. All rights
 * reserved.
 * ___________________________________________________________________________________
 *
 *
 * NOTICE: All information contained herein is, and remains the property of
 * EntryIndia LLC and its suppliers,if any. The intellectual and technical concepts
 * contained herein are proprietary to EntryIndia LLC. and its suppliers and
 * may be covered by us and Foreign Patents, patents in process, and are
 * protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from EntryIndia LLC.
 */
package xyz.baldeep.coding.exercise.sapient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author baldeep
 */
public class ReadFile {

    public boolean averageIncome() throws IOException {
        Map<String, Float> countryMap = new HashMap<>();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("/Users/baldeep/NetBeansProjects/programs/src/xyz/baldeep/coding/exercise/sapient/sampleInput.csv"));
            fileReader.readLine();//skip first row as it contains header
            String data = "";
            while ((data = fileReader.readLine()) != null) {
                String[] row = data.split(Constant.DELIMETER_COMMA);
                String city = row[0];
                String country = row[1];
                String gender = row[2];
                String currency = row[3];
                float averageIncome = avgIncome(currency, Integer.parseInt(row[4]));
                String key = city + "," + gender;
                if (country.equals(" ")) {
                    if (countryMap.containsKey(key)) {
                        float avg = countryMap.get(key);
                        avg += averageIncome;
                        countryMap.put(key, avg);
                    } else {
                        countryMap.put(key, averageIncome);
                    }
                } else {
                    key = country + "," + gender;
                    if (countryMap.containsKey(key)) {
                        float avg = countryMap.get(key);
                        avg = avg + averageIncome;
                        countryMap.put(key, avg);
                    } else {
                        countryMap.put(key, averageIncome);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/baldeep/NetBeansProjects/programs/src/xyz/baldeep/coding/exercise/sapient/output2.csv"));
        try {
            writer.write("City/Country Gender Average Income(in USD)");
            writer.newLine();
            List<String> sortByKey = new ArrayList<>(countryMap.keySet());
            Collections.sort(sortByKey);

            for (String key : sortByKey) {
                writeToFile(writer, key, countryMap.get(key), Constant.FILE_CSV);
            }

            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } finally {
            writer.close();
        }
    }

    private void writeToFile(BufferedWriter writer,
            String key, float value, String fileType) throws IOException {
        String countryGen[] = key.split(",");

        if (fileType.equals(Constant.FILE_CSV)) {
            writer.write(key + "," + value);
        } else {
            writer.write(countryGen[0] + " " + countryGen[1] + " " + value);
        }
        writer.newLine();
    }

    private float avgIncome(String currency, int averageIncome) {
        switch (currency) {
            case Constant.CURRENCY_CODE_IND:
                return averageIncome / 66;
            case Constant.CURRENCY_CODE_GBP:
                return (float) (averageIncome / 0.67);
            case Constant.CURRENCY_CODE_SGP:
                return (float) (averageIncome / 1.5);
            case Constant.CURRENCY_CODE_HKD:
                return averageIncome / 8;
            default:
                return averageIncome;
        }

    }

    public static void main(String[] args) {
        ReadFile ob = new ReadFile();
        try {
            ob.averageIncome();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

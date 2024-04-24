package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;

public class Payroll {
    public static void main(String[] args) {
        try {
            // create a FileReader obj connected to File
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");

            // create a BufferReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

            bufReader.readLine();
            String input;

            // Read until there's no more data
            while ((input = bufReader.readLine()) !=null) {
                // System.out.println(input);

                String[] sortEmp = input.split("\\|");
                // System.out.println(Arrays.toString(sortEmp));

                int employeeId = Integer.parseInt(sortEmp[0]);
                String name = sortEmp[1];
                double hoursWorked = Double.parseDouble(sortEmp[2]);
                double payRate = Double.parseDouble(sortEmp[3]);

                Employee E = new Employee(employeeId, name, hoursWorked, payRate);
                E.getGrossPay();
            }
            // Close buffer
            bufReader.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

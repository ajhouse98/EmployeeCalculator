package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class PayUserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter name of employee file: ");
        String eFile = userInput.nextLine();

        System.out.println("Enter name of payroll file to create: ");
        String pFile = userInput.nextLine();


        try {
            // open the file
            FileWriter writer = new FileWriter(pFile);

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

                EmployUserInput E = new EmployUserInput(employeeId, name, hoursWorked, payRate);
                double grossPay = E.getGrossPay();

                // write to file
                writer.write(String.format("%d|%s|%.2f\n", employeeId,name,grossPay));
            }
            // Close buffer and writer
            bufReader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

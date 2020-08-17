package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {


    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: "+ UiMenu.patientLogged );
            System.out.println("1. book an appointment");
            System.out.println("2. my appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UiMenu.showMenu();
                    break;
            }
        }while (response != 0 );
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println(":: Book An Appointment");
            System.out.println(":: Selec date");
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvaialbeAppointmests.size() ; i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvaialbeAppointmests.get(i).getAvailableAppointments();
                 Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size() ; j++) {
                    k++;
                    System.out.println(k+ ". "+ availableAppointments.get(j).getDate());
                    doctorAppointments.put(j, UIDoctorMenu.doctorsAvaialbeAppointmests.get(i));
                    doctors.put(k, doctorAppointments);
                }
                Scanner sc = new Scanner(System.in);
                response = sc.nextInt();




            }
        }while (response != 0);
    }




}

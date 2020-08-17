package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UiMenu {

    public  static final String[] MONTHS = {"January","February","march","april","May","june",
                                        "July","August","September","October","November","December"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("welcome to my apppintmest");
        System.out.println("selecione la opcion deseada");

        int response = 0;

        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response  = sc.nextInt();

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);

                    break;
                case 2:
                    response = 0;
                    authUser(2) ;
                    break;
                case 0:
                    System.out.println("Thank tou for your visit");
                    break;
                default:
                    System.out.println("please selec a correct answer");

            }
        }while (response != 0);

    }

    private static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("alejandro martiznez", "alejando@gmail.com"));
        doctors.add(new Doctor("paola martiznez", "paola@gmail.com"));
        doctors.add(new Doctor("luiza martiznez", "luiza@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("anahi salgado", "anahi@gmail.com"));
        patients.add(new Patient("pablo salgado", "pablo@gmail.com"));
        patients.add(new Patient("fernanda salgado", "fernanda@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String  email = sc.nextLine();
            if( userType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect =true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();

                    }
                }
            }
            if (userType == 2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                    }
                }
            }
        }while (!emailCorrect);

    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }



}

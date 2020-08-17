package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvaialbeAppointmests = new ArrayList<>();

    public  static void  showDoctorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Welcome"+ UiMenu.doctorLogged.getName());
            System.out.println("1. add avauilabel appiontms");
            System.out.println("2. my Scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UiMenu.showMenu();
                    break;


            }

        }while (response != 0);

    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::Add AVAIALBE Apointemtn");
            System.out.println(":: Select a month");
            for (int i = 0; i < 3 ; i++) {
                int j = i+1;
                System.out.println(j + ". " + UiMenu.MONTHS[1]);
            }

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if (response > 0 && response <4 ) {
                int monthSelect = response;
                System.out.println(monthSelect+" . "+UiMenu.MONTHS[monthSelect-1]);
                System.out.println( "insert the date avalaible: [dd/mm/yyyy}");
                String date = sc.nextLine();
                System.out.println("your date is " + date + "\n1. correct \n 2. Change Date");
                int  responseDate = Integer.valueOf(sc.nextLine());
                if (response == 2){
                    continue;
                }
                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("insert the time availbe for date " + date + " [ 16:00}");
                    time = sc.nextLine();
                    System.out.println("your time is: "+ time +"\\n1. correct \\n 2. Change Date\"");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while (responseTime == 2);

                UiMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointmets(UiMenu.doctorLogged);
            }else if(response == 0){
                showDoctorMenu();
            }

        }while (response!= 0);
    }

    private static void checkDoctorAvailableAppointmets(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvaialbeAppointmests.contains(doctor)){
            doctorsAvaialbeAppointmests.add(doctor);
        }
    }
}

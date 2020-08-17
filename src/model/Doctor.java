package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {


    private String speciality;


   public Doctor(String name, String email){
       super(name, email);
   }




    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
       availableAppointments.add(new AvailableAppointment(date, time));

    }

    @Override
    public String toString() {
        return super.toString() + "\nmodel.Doctor{" +
                "speciality='" + this.speciality + '\'' +
                ", availableAppointments=" + this.availableAppointments +
                '}';
    }

    @Override
    public void showDataUser(){
        System.out.println("Hospital: Cruz roja ");
        System.out.println("departamento: canserologia  ");

    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return this.availableAppointments;
    }
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        public  AvailableAppointment(String  date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE){
            return format.format(DATE);
        }

        public void setDate(Date  date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\nAvailableAppointment{" +
                    "date=" + date +
                    ", time='" + time + '\'' +
                    "}\n";
        }
    }
}

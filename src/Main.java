public class Main {
    public static void main(String[] args) {
        Boolean[][] schedule = new Boolean[8][60];
        AppointmentBook.AppointmentBook a = new AppointmentBook.AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        public void printPeriod(int period){
            for(int 1 = 0; i < schedule[period - 1].length; i++)
            System.out.println(i + " " + schedule[period - 1][i]);
        }

    }
}

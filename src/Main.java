public class Main {
    public class AppointmentBook {
        private boolean[][] schedule;
        public AppointmentBook(boolean[][] schedule) {
            this.schedule = schedule;
        }
        private boolean isMinuteFree(int period, int minute) {
            return schedule[period - 1][minute];
        }
        public int findFreeBlock(int period, int duration){
            return 0;
        }
        public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
            return false;
        }
        Boolean[][] schedule = new Boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        public void printPeriod(int period){
            for(int 1 = 0; i < schedule[period - 1].length; i++)
                System.out.println(i + " " + schedule[period - 1][i]);
        }
    }
}

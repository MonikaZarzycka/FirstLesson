package mainOOP;

public class Convert {

        private static long minutes;

        public Convert(long minutes) {
            Convert.minutes = minutes;
        }

        public long getMinutes() {
            return minutes;
        }

        public void setMinutes(long minutes) {
            Convert.minutes = minutes;
        }

        public static long minutesToSeconds() {
            if (minutes > 0) {
                return minutes * 60;
            }
            else
                return 0;
        }


}

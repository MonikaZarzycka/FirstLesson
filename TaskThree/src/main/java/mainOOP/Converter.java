package mainOOP;

    class Converter {

        private static long minutes;

        public Converter(long minutes) {
            Converter.minutes = minutes;
        }

        public long getMinutes() {
            return minutes;
        }

        public void setMinutes(long minutes) {
            Converter.minutes = minutes;
        }

        public static long minutesToSeconds() {
            if (minutes > 0) {
                return minutes * 60;
            }
            else
                return 0;
        }

}

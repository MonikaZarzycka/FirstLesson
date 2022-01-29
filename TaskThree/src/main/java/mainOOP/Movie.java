package mainOOP;

    public class Movie {

        private final String title;
        private final String directorName;
        private final String directorSurname;
        private final int minutesLong;
        private final int year;

        public String getTitle() {
            return this.title;
        }

        public String getDirectorName() {
            return this.directorName;
        }

        public String getDirectorSurname() {
            return this.directorSurname;
        }

        public int getMinutesLong() {
            return this.minutesLong;
        }

        public int getYear() {
            return this.year;
        }


        public Movie(String title, String directorName, String directorSurname, int minutesLong, int year) {
            this.title = title;
            this.directorName = directorName;
            this.directorSurname = directorSurname;
            this.minutesLong = minutesLong;
            this.year = year;
        }
    }
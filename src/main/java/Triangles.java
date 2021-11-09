public class Triangles {
    public String getTriangle(int numberOfRows) {
        StringBuilder tri = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j <= i; j++ ){
                tri.append("*");
            }
            tri.append(System.lineSeparator());
        }
        return tri.toString();
    }


        public String getRow ( int numberOfStars){
            StringBuilder row = new StringBuilder();
            for (int i = 0; i < numberOfStars; i++) {
                row.append("*");
            }
            return "" + row;
        }

        public String getSmallTriangle () {
        StringBuilder tri = new StringBuilder();
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < i; j++) {
                tri.append("*");
            }
            tri.append(System.lineSeparator());
        }
            return tri.toString();
        }

        public String getLargeTriangle () {
        StringBuilder tri = new StringBuilder();
        for (int i = 1; i<=9; i++){
            for(int j = 1; j<=i; j++) {
                tri.append("*");
            }
            tri.append(System.lineSeparator());
        }
            return tri.toString();
        }

}

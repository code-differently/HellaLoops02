public class Triangles {

    public String getTriangle(int numberOfRows) {

        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= numberOfRows; i++) {

            for (int j = 1; j <= i; j++) {
                row.append("*");
            }

            row.append(System.lineSeparator());
        }

        return row.toString();

    }

    public String getRow(int numberOfStars) {

        StringBuilder row = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++){

            row.append("*");
        }

        return row.toString();
    }

    public String getSmallTriangle() {

        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                row.append("*");
            }
            //row.append("\n");
            row.append(System.lineSeparator());
        }

        return row.toString();

    }

    public String getLargeTriangle() {

        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {
                row.append("*");
            }
            //row.append("\n");
            row.append(System.lineSeparator());
        }

        return row.toString();
    }
}

public class Triangles {
    public String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                triangle.append("*");
            }
            triangle.append(System.lineSeparator());
        }
        return triangle.toString();
    }

    public String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            row.append("*");

        }
        return row.toString();
    }

    public String getSmallTriangle() {
        StringBuilder smallTriangle = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                smallTriangle.append("*");
            }
            smallTriangle.append(System.lineSeparator());
        }
        return smallTriangle.toString();
    }



    public String getLargeTriangle() {
        StringBuilder largeTriangle = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                largeTriangle.append("*");
            }
            largeTriangle.append(System.lineSeparator());
        }
        return largeTriangle.toString();
    }
}



public class Triangles {
    public String getTriangle(int numberOfRows) {
        String starTriangle= "";
        for (int a = 0; a < numberOfRows; a++) {
            starTriangle += "*";
            System.out.println(starTriangle);
        }
            return starTriangle;
        }


    public String getRow(int numberOfStars) {
        String starRow = "";
        for(int i = 0; i < 20; i++) {
            starRow += "*";
            }
        return starRow;
    }

    public String getSmallTriangle() {



        return null;
    }

    public String getLargeTriangle() {
        return null;
    }
}

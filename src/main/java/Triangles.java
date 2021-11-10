public class Triangles {
    public String getTriangle(int numberOfRows) {
        StringBuilder tryAngles = new StringBuilder();
        for(int i = 1; i < numberOfRows; i++) {
            //System.out.println("");
            for(int j = 0; j <= i; j++){
                tryAngles.append("*");
                //System.out.print("*");
            }tryAngles.append(System.lineSeparator());
        }
        return tryAngles.toString() ;

    }


    public String getRow(int numberOfStars) {
        String starRow = "";
        for(int i = 0; i < 20; i++) {
            starRow += "*";
            }
        return starRow;
    }

    public String getSmallTriangle() {
        StringBuilder smallT = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            for (int l = 0; l < i; l++) {
                smallT.append("*");
            }smallT.append(System.lineSeparator());
        }return smallT.toString();
    }


    public String getLargeTriangle() {
        StringBuilder largeT = new StringBuilder();
        for ( int a = 1; a < 10; a++) {
            for (int b = 0; b < a; b++) {
                largeT.append("*");
            }largeT.append(System.lineSeparator());
        }return largeT.toString();
    }
}

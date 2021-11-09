public class Triangles {
    public String getTriangle(int numberOfRows) {
        String star = "";
        for (int i=1; i<numberOfRows; i++){
            for(int j = 0; j<i; j++){
                star += "*";
            }
            star += "\n";
        }
        return star;
    }

    public String getRow(int numberOfStars) {
        String row = "";
        for(int i = 0; i < numberOfStars; i++){
           row += "*";
        }
        return row;
    }

    public String getSmallTriangle() {
        String smallTriangle = "";
        for (int i=1; i<=4; i++){
            for(int j = 0; j<i; j++){
                smallTriangle += "*";
            }
            smallTriangle += "\n";
        }
        return smallTriangle;
    }

    public String getLargeTriangle() {
        String largeTriangle = "";
        for(int i = 1; i<=9; i++){
            for(int j= 0; j < i; j++){
                largeTriangle += "*";
            }
             largeTriangle+="\n";
        }
        return largeTriangle;
    }
}

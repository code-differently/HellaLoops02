public class Triangles {
    public String getTriangle(int numberOfRows) {

        String stars = "";
        for (int i = 0; i< numberOfRows; i++) {
            stars += "\n";
            for (int j = 0; j < i; j++) {
                stars += "*";
            }
        }
        return stars;
    }

    public String getRow(int numberOfStars) {
        String northStar = "";
        for(int i = 0; i<numberOfStars; i++){
            northStar = northStar.concat("*\n");
        }
        return northStar;
    }

    public String getSmallTriangle() {
        String smallTri = "";
        for(int i = 1; i< 5; i++){
            for (int j = 0; j < i; j++){
                smallTri = smallTri.concat("*\n");
            }
        }
        return smallTri;
    }

    public String getLargeTriangle() {
        return null;
    }
}

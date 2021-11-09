public class Triangles {
    public String getTriangle(int numberOfRows) {
      StringBuilder triangle = new StringBuilder();

      for(int i = 1; i< numberOfRows; i++){
       for(int t = 0; t< i; t++ ){
           triangle.append("*");
       }
       triangle.append(System.lineSeparator());
      }
      return triangle.toString();
    }


    public String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();

        for (int i = 0; i < numberOfStars; i ++){
                row.append("*");
        }
        return row.toString();
    }

    public String getSmallTriangle() {
       StringBuilder small = new StringBuilder();
       for (int i = 1; i<5; i++){
           for (int j = 0; j <i; j++){
               small.append("*");
           }
           small.append(System.lineSeparator());
       }
        return small.toString();
    }

    public String getLargeTriangle() {
       StringBuilder large = new StringBuilder();
        for (int i = 1; i< 10; i++) {
            for ( int t = 0; t < i; t++){
                large.append("*");
            }
            large.append(System.lineSeparator());
        }
        return large.toString();
    }
}

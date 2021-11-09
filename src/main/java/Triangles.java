public class Triangles {
    public String getTriangle(int numberOfRows) {
        String result ="";

        for(int i=0; i<numberOfRows-1; i++)
        {

            for(int j=0; j<=i; j++)
            {


                result +="*";
            }
           result +="\n";

        }
        return result;
    }

    public String getRow(int numberOfStars) {
        String row = "";

        for(int i = 0; i<numberOfStars;i++){
            row +="*";
        }
        return row;
    }

    public String getSmallTriangle() {
        String result ="";
        int numberOfRows=5;
        for(int i=0; i<numberOfRows-1; i++)
        {

            for(int j=0; j<=i; j++)
            {


                result +="*";
            }
            result +="\n";

        }
        return result;

    }

    public String getLargeTriangle() {
        String result ="";
        int numberOfRows=10;
        for(int i=0; i<numberOfRows-1; i++)
        {

            for(int j=0; j<=i; j++)
            {


                result +="*";
            }
            result +="\n";

        }
        return result;
    }
}

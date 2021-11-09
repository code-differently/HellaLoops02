public class Triangles {


    public String getRow(int numberOfStars){
        String response = "";
        for(int i = 1; i<=numberOfStars; i++){

       response +="*";}

        return response;
    }



    public String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 0; i < numberOfRows; i++) {
            result += "*";
            for (int j = 0; j < i; j++) {
                result += "\n";
            }
        }
        return result;
    }



    public String getLargeTriangle() {

        String response = "";
        for (int ii = 0; ii < 10; ii++) {
            for (int j = 0; j < ii; j++) {
                response+=("*");
            }
            response+=("\n");

        }

        return response;
    }





    public String getSmallTriangle() {
        String response = "";
        for (int ii = 0; ii < 5; ii++) {
            for (int j = 0; j < ii; j++) {
                response+=("*");
            }
            response+=("\n");

        }

        return response;
    }

    public static void main(String[] args) {


    }

}

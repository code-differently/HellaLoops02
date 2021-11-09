public class Triangles {
    public String getTriangle(int numberOfRows) {
        String answer = "";
        for (int a = 1; a < numberOfRows; a++) {
            answer += "\n";

            for (int b = 0; b < a + 1; b++) {

                answer += "*";
            }
        }
        return answer;
    }

    public String getRow(int numberOfStars) {
        String answer = "";
        for (int a = 0; a < numberOfStars; a++) {
            answer += "*";
        }
        return answer;
    }

    public String getSmallTriangle() {
        String answer = "";
        for (int a = 0; a < 4; a++) {
            answer += "\n";

            for (int b = 0; b < a + 1; b++) {

            answer += "*";
        }
    }
        return answer;
    }


    public String getLargeTriangle() {

        String answer = "";
        for (int a = 0; a < 9; a++) {
            answer += "\n";

            for (int b = 0; b < a + 1; b++) {

        answer += "*";
            }
        }
        return answer;
    }
}

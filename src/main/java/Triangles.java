public class Triangles {
    public String getTriangle(int numberOfRows) {
        String answer = "";
        for(int i =0; i<numberOfRows-1; i++){
            for(int j = 0; j<i+1; j++){
                answer+="*";
            }
            answer+="\n";
        }
        return answer;
    }

    public String getRow(int numberOfStars) {
        String answer = "";
        for(int i = 0; i < numberOfStars; i++){
            answer+="*";
        }
        return answer;
    }

    public String getSmallTriangle() {
        String answer = "";
        for(int i =0; i<4; i++){

            for(int j = 0; j<i+1; j++){
                answer+="*";
            }
            answer+="\n";
        }
        return answer;
    }

    public String getLargeTriangle() {
        String answer = "";
        for(int i =0; i<9; i++){

            for(int j = 0; j<i+1; j++){
                answer+="*";
            }
            answer+="\n";
        }
        return answer;
    }
}

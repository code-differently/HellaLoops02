public class Triangles {
    public String getTriangle(int numberOfRows) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    public String getRow(int numberOfStars) {
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 1; i <= numberOfStars; i++) {
            stringBuilder1.append("*");
        }
        return stringBuilder1.toString();
    }

    public String getSmallTriangle() {
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                stringBuilder2.append("*");
            }
            stringBuilder2.append(System.lineSeparator());
        }
        return stringBuilder2.toString();
    }

    public String getLargeTriangle() {
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                stringBuilder2.append("*");
            }
            stringBuilder2.append(System.lineSeparator());
        }
                return stringBuilder2.toString();
        }
}
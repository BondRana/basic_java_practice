public class Assignment_1 {
    public static void main(String[] args) {
        String str="<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        System.out.println("TXN"+str);
    }
}

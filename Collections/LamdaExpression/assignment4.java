package Collections.LamdaExpression;

public class assignment4 {
    public static void main(String[] args) {
        Wordcount wc = (str) -> {
            if (str == null || str.trim().isEmpty())
                return 0;
            return str.trim().split("\\s+").length;
        };

        String input = "Java is a powerful programming language";

        int wordCount = wc.count(input);
        System.out.println("Input: " + input);
        System.out.println("Word Count: " + wordCount);
    }

}

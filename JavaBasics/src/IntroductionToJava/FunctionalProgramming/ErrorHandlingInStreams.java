
package IntroductionToJava.FunctionalProgramming;

import java.util.List;

public class ErrorHandlingInStreams {
    public static void main(String[] args) {
        List<String> lang = List.of("Java","C#","Python","JavaScript");

        lang.stream()
                .forEach(b -> {
                    try {
                        if (b.equals("Python")) {
                            throw new Exception("Python programming error");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}

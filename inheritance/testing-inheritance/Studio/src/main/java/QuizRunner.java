import questions.*;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();
    public static void main(String[] args){

        String q1 = "What kind of fish is Dory from Finding Nemo?";
        Choice[] q1Choice = new Choice[] {
                new Choice("Goldfish"),
                new Choice("Bass"),
                new Choice("Blue Tang", true),
                new Choice("Clown Fish")
        };
        MultipleChoice question1 = new MultipleChoice(q1, q1Choice);

        String q2 = "The Sahara Desert is the largest desert in the world.";
        Choice[] q2Choice = new Choice[] {
                new Choice("True"),
                new Choice("False", false)

        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choice);

        String q3 = "What are the colors of a rainbow?";
        Choice[] q3Choice = new Choice[] {
                new Choice("Orange", true),
                new Choice("Blue", true),
                new Choice("Green", true),
                new Choice("White"),
                new Choice("Red", true),
                new Choice("Violet", true),
                new Choice("Brown"),
                new Choice("Yellow", true),
                new Choice("Indigo", true),
                new Choice("Cyan")

        };
        Checkbox question3 = new Checkbox(q3, q3Choice);

        quiz.addQuestions(new Questions[] {question1, question2, question3});

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " +
                quiz.getNumCorrect() + "of " + quiz.getQuestion().size() +
                "questions correctly");
    }

}

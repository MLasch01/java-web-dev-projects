package questions;

public class MultipleChoice extends Questions{

    public MultipleChoice(String questions, Choice[] choiceArray){
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "Choose one:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }
}

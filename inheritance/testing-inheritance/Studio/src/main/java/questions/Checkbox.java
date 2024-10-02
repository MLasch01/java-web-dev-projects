package questions;

public class Checkbox extends Questions{

    public Checkbox(String questions, Choice[] choiceArray){
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "Choose one or more:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

    public int getNumCorrect(){
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()){
            if (choice.isCorrect()){
                numCorrect++;
            }
        }
        return numCorrect;
    }
}

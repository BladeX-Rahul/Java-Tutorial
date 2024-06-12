import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
    private static final int NUM_QUESTIONS = 3; // Number of questions in the quiz
    private static final int SCORE_PER_QUESTION = 10; // Score awarded for each correct answer

    private static final List<Question> questions = new ArrayList<>();
    private static int score = 0;

    static {
        // Add questions and their correct answers
        questions.add(new Question("What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris"));
        questions.add(new Question("What is the largest planet in our solar system?", "Mars", "Venus", "Jupiter", "Saturn", "Jupiter"));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain", "William Shakespeare"));

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Game!");
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            askQuestion(question, scanner);
        }

        System.out.println("Quiz complete! Your final score is: " + score);
        scanner.close();
    }

    private static void askQuestion(Question question, Scanner scanner) {
        System.out.println(question.getQuestion());
        System.out.println("Options:");
        for (int i = 0; i < question.getOptions().length; i++) {
            System.out.println((i + 1) + ". " + question.getOptions()[i]);
        }
        System.out.print("Your answer (1-" + question.getOptions().length + "): ");

        int userAnswerIndex = scanner.nextInt() - 1;
        String userAnswer = question.getOptions()[userAnswerIndex];

        if (userAnswer.equals(question.getCorrectAnswer())) {
            System.out.println("Correct!");
            score += SCORE_PER_QUESTION;
        } else {
            System.out.println("Incorrect! The correct answer is: " + question.getCorrectAnswer());
        }
        System.out.println();
    }

    static class Question {
        private String question;
        private String[] options;
        private String correctAnswer;

        public Question(String question, String... options) {
            this.question = question;
            this.options = options;
            this.correctAnswer = options[options.length - 1]; // Last option is always the correct answer
        }

        public String getQuestion() {
            return question;
        }

        public String[] getOptions() {
            return options;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }
}

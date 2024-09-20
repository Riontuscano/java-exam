import java.util.Random;
import java.time.LocalDate;

public class daliy_quote {
    private static final String[] quotes = {
        "The only way to do great work is to love what you do.",
        "Believe you can and you're halfway there.",
        "Success is not final, failure is not fatal: It is the courage to continue that counts.",
        "The harder you work for something, the greater you'll feel when you achieve it.",
        "Don't watch the clock; do what it does. Keep going.",
        "The future belongs to those who believe in the beauty of their dreams.",
        "The only limit to our realization of tomorrow is our doubts of today.",
        "Your limitation—it's only your imagination.",
        "Dream big and dare to fail.",
        "Start where you are. Use what you have. Do what you can.",
        "It always seems impossible until it's done.",
        "Great things never come from comfort zones.",
        "Success doesn't come from what you do occasionally, it comes from what you do consistently.",
        "You are never too old to set another goal or to dream a new dream.",
        "Challenges are what make life interesting and overcoming them is what makes life meaningful.",
        "Success is the sum of small efforts, repeated day in and day out.",
        "What you get by achieving your goals is not as important as what you become by achieving your goals.",
        "Don't let yesterday take up too much of today.",
        "Push yourself, because no one else is going to do it for you.",
        "Doubt kills more dreams than failure ever will."
    };

    public static String display_quote(){
        Random rand = new Random();
        int index = rand.nextInt(quotes.length);
        return quotes[index];
    }

    public static void main(String[] args){
        System.out.println("TimeStamped :" + LocalDate.now());
        System.out.println("Daily Quote:" + display_quote());
    }
}

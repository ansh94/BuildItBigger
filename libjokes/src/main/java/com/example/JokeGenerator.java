package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JokeGenerator {

    private ArrayList<String> jokesList;

    public JokeGenerator() {

        jokesList = new ArrayList<String>();
        generateJokes();
    }


    private void generateJokes() {

        jokesList.add("I dreamt I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.");
        jokesList.add("Two Elephants meet a totally naked guy. After a while one elephant says to the other: I really do not get how he can feed himself with that thing!");
        jokesList.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        jokesList.add("Oh darling, since you've started dieting, you've become such a passionate kisser…  " +
                "What do you mean, passionate? I'm looking for food remains!");
        jokesList.add("My wife's cooking is so bad we usually pray after our food.");
        jokesList.add("I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?");
        jokesList.add("When my wife starts to sing I always go out and do some garden work so our neighbors can see there's no domestic violence going on.");
        jokesList.add("What's the worst thing about being lonely? Playing Frisbee.");
        jokesList.add("I wanted to grow my own food but I couldn't get bacon seeds anywhere.");
        jokesList.add("I was in a restaurant once and I suddenly realized I desperately needed to pass gas." +
                " The music was really, really loud, so I timed my reliefs to the beat of the music. " +
                "After just a few songs I started to feel better. I finished my coffee, and noticed that everybody was staring at me... " +
                "That was when I remembered I was listening to my iPod.");
        jokesList.add("Why do women live on average two years longer? Because the time they spend parking doesn't count.");
        jokesList.add("A naked women robbed a bank. Nobody could remember her face.");
        jokesList.add("How do you tell that a crab is drunk? It walks forwards.");
        jokesList.add("I'm selling my talking parrot. Why? Because yesterday, the bastard tried to sell me.");
        jokesList.add("A woman in a bikini reveals about 90% of her body.... and yet most men are so polite they only look at the covered parts.");
        jokesList.add("What goes up and down but never moves?  The stairs!");
        jokesList.add("Three guys are stranded in a desert. By a stroke of luck, they find a magic genie lamp." +
                " The genie grants each of them one wish. The first guy wishes to be back home. Wish granted. " +
                "The second guy wishes the same. Wish granted. The third guy says... It feels very lonely here now, I wish my friends were with me… Wish granted.");
        jokesList.add("I've decided to run a marathon for charity. I didn't want to do it at first, but apparently it's for blind and disabled kids so I think I've got a good chance of winning.");
        jokesList.add("Why haven't you ever seen any elephants hiding up trees? Because they're really, really good at it.");
        jokesList.add("We have a strange custom in our office. The food has names there. Yesterday for example I got me a sandwich out of the fridge and its name was Michael.");
        jokesList.add("What is dangerous? Sneezing while having diarrhea!");
        jokesList.add("I really don't know which kid I'm supposedly being unfair to, according to my wife, Thomas, Anton, or the fat, ugly one?");
        jokesList.add("A wife is like a hand grenade. Take off the ring and say good bye to your house.");
        jokesList.add("I heard women love a man in uniform. Can't wait to start working at McDonalds.");
        jokesList.add("Why don't cannibals eat divorced women? Because they're bitter.");

    }


    public String getRandomJoke() {
        String joke;
        Random md = new Random();

        int randomIndex = md.nextInt(jokesList.size());
        joke = jokesList.get(randomIndex);

        return joke;

    }

}

package com.tinnova.avaliacao.question1;

public class Question1 {

    private final static Integer TOTAL_VOTERS = 1000;
    private final static Integer VALID_VOTES = 800;
    private final static Integer BLANK_VOTES = 150;
    private final static Integer NULL_VOTES = 50;

    public Double percentValidVotes() {
        return VALID_VOTES * 100.0 / TOTAL_VOTERS;
    }

    public Double percentBlankVotes() {
        return BLANK_VOTES * 100.0 / TOTAL_VOTERS;
    }

    public Double percentNullVotes() {
        return NULL_VOTES * 100.0 / TOTAL_VOTERS;
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        System.out.printf("Blank votes: %.2f %%\n", question1.percentBlankVotes());
        System.out.printf("Null votes: %.2f %%\n", question1.percentNullVotes());
        System.out.printf("Valid votes: %.2f %%\n", question1.percentValidVotes());
    }

}

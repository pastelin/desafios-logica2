package com.codewars.seven.katas;

public class Covfefe {

    public static String covfefe(String tweet) {
        return (tweet.contains("coverage")) ? tweet.replaceAll("coverage", "covfefe") : tweet.concat(" covfefe");
    }

}

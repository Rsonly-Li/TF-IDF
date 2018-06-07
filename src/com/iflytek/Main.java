package com.iflytek;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Map<String, HashMap<String, Integer>> normal = ReadFiles.NormalTFOfAll("D:/TF-IDF-test");
        for (String filename : normal.keySet()) {
            System.out.println("fileName " + filename);
            System.out.println("TF " + normal.get(filename).toString());
        }

        System.out.println("-----------------------------------------");

        Map<String, HashMap<String, Float>> notNarmal = ReadFiles.tfOfAll("D:/TF-IDF-test");
        for (String filename : notNarmal.keySet()) {
            System.out.println("fileName " + filename);
            System.out.println("TF " + notNarmal.get(filename).toString());
        }

        System.out.println("-----------------------------------------");

        Map<String, Float> idf = ReadFiles.idf("d;/dir");
        for (String word : idf.keySet()) {
            System.out.println("keyword :" + word + " idf: " + idf.get(word));
        }

        System.out.println("-----------------------------------------");

        Map<String, HashMap<String, Float>> tfidf = ReadFiles.tfidf("D:/TF-IDF-test");
        for (String filename : tfidf.keySet()) {
            System.out.println("fileName " + filename);
            System.out.println(tfidf.get(filename));
        }
    }
}

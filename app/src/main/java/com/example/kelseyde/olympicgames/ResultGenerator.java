package com.example.kelseyde.olympicgames;

public class ResultGenerator implements NumberGenerating {

    public int generate(int skill) {
        int max = ( skill + 3 );
        int min = ( skill - 3 );
        int range = ( max - min );
        int result = ((int)(Math.random() * range) + min);
        return result;
    }

}

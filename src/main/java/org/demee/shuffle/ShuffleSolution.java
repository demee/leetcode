package org.demee.shuffle;

public class ShuffleSolution {
    public static void main(String[] args) {
        
    }

    public String restoreString(String in, int[] indices) {
        char[] out = new char[in.length()];
        for (int i = 0; i < in.length(); i++) {
            out[indices[i]] = in.charAt(i);
        }
        return new String(out);
    }
}

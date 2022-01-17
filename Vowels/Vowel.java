package Vowels;

public class Vowel {
    // This is a simple method which is used to replace all vowels in a string with
    // a character you want.
    // Here you need to provode two inputs. that is first is String and the next one
    // is a character.
    public String replaceAllVowels(String s, char ch) {
        String news = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                news = news + ch;
            } else {
                news = news + s.charAt(i);
            }
        }
        return news;
    }

    /*
     * This method is similar to the replaceAllVowels method. The only difference is
     * that it can allow you to replace the first vowel it finds in your String
     * according to the index with the character you asked. This method takes two
     * arguments that is first a string followed by a character.
     */
    public String replaceVowelfirstIndex(String s, char ch) {
        String news = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                news = news + ch;
                news = news + s.substring(i + 1, s.length());
                break;
            } else {
                news = news + s.charAt(i);
            }
        }
        return news;
    }

    // doContainVowel is a type of method which is used to fins that any string
    // contains a vowel or not. If a string contains a vowel, it will result in true
    // or if vowel is not present in the string, then you will get result as fasle.
    public boolean doContainVowel(String s) {
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                b = true;
                break;

            }
        }

        return b;
    }

    /*
     * noOfVowels method can be used to find out the number of different vowels
     * present in a string you have. It only has one paramenter which takes String
     * as an input. The data would be prpvoded you in the form of an integer.
     */
    public int noOfVowels(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                n++;
            }
        }
        return n;
    }

    /*
     * removeVowels is a method which you can use for removing any vowel present in
     * your string. It will give you the output as a new string which does not
     * contain any vowel. It only takes one parameter which is a string.
     */
    public String removeVowels(String s) {
        String news = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                news = news + "";
            } else {
                news = news + s.charAt(i);
            }
        }
        return news;
    }

    /*removeVowels is a method used for printing only the vowels present in your string. You only need to provode the method with a string in the brackets and it will display all the vowels in it. It does not return any vlaue so you can callwithout using any variable to store the return data. */
    public void printvowels(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                System.out.println(s.charAt(i));
            }
        }
    }

    
}

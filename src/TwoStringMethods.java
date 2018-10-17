public class TwoStringMethods {
    /**
     * if the String contains an instance of "abc" without a period before it
     * @param word
     * @return if the String contains an instance of "abc" without a period before it
     */
    public boolean abcTest(String word) {

        word = word.toLowerCase().trim();
        if (word.substring(0, 3).equals("abc")) {
            return true;
        }

        for (int i = 1; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equals("abc") && !(word.substring(i - 1, i).equals("."))) {
                return true;
            }
        }
        return false;
    }

    /**
     *  a string that alternates between the characters of the two arguments
     * @param first
     * @param second
     * @return a string that alternates between the characters of the two arguments
     * example
     * alternateString("hello", "goodbye")
     * returns hgeololdobye
     */

    public  String alternateString(String first, String second) {

        int lengthOfLongest = Math.max(first.length(), second.length());
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < lengthOfLongest; i++) {
            if (i < first.length()) {
                builder.append(first.substring(i, i + 1));
            }
            if (i < second.length()) {
                builder.append(second.substring(i, i + 1));
            }
        }
        return builder.toString();
    }
}

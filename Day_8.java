//  Reverse a String Word by Word

class Day_8 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Day_8 solver = new Day_8();
        String input = "the sky is blue";
        System.out.println(solver.reverseWords(input)); 

        String input2 = "  hello   world!  ";
        System.out.println(solver.reverseWords(input2));
    }
}

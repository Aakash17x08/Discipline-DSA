// Reverse String
class Leetcode344 {

    public void reverseString(char[] s) {
        int start = 0;
        int last = s.length - 1;

        while (start < last) {
            char temp = s[start];
            s[start] = s[last];
            s[last] = temp;
            start++;
            last--;
        }
    }

    // psvm
    public static void main(String[] args) {

        Leetcode344 sol = new Leetcode344();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        sol.reverseString(s);

        System.out.print("Reversed string: ");
        for (char c : s) {
            System.out.print(c);
        }
    }
}

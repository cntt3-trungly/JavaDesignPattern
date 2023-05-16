package Medium.No1456MaximumNumberOfVowels;

public class OptimizeSolution {
    int isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1;
        }
        return 0;
    }
    //Miểu tả thuật toán : tìm nguyên âm lớn nhất của k số đầu tiên
    // bắt đầu từ k thì dùng scroll trượt tới 1 đơn vị ( sẽ trừ đi đơn vị đầu tiên bị truọt nếu là nguyên âm và + cho đơn vị trượt tiếp theo nếu là nguyên âm )
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += isVowel(s.charAt(i));
        }

        int maxCount = count;
        for (int i = k; i < n; i++) {
            count = count - isVowel(s.charAt(i - k)) + isVowel(s.charAt(i));
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}

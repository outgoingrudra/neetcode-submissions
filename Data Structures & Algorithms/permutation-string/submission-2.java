class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int freq[] = new int[26];
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int left = 0;
        int k = s1.length();

        for (int right = 0; right < s2.length(); right++) {
            freq[s2.charAt(right) - 'a']--;

            if (right - left + 1 == k) {
                if (checkZeros(freq))
                    return true;
                freq[s2.charAt(left) - 'a']++;
                left++;

            }
        }

        return false;

    }

    private boolean checkZeros(int arr[]) {
        for (int x : arr) {
            if (x != 0)
                return false;
        }
        return true;
    }
}
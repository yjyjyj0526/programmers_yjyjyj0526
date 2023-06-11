class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        int count = 0;
        for (int i = k; i <= n; i += k) {
            answer[count] = i;
            count++;
        }

        return answer;
    }
}
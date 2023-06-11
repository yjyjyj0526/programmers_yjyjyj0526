class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int count = 0;

        for (int i = num_list.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (num_list[j] > num_list[j + 1]) {
                    int x = num_list[j];
                    num_list[j] = num_list[j + 1];
                    num_list[j + 1] = x;
                }
            }
        }

        for (int i = 5; i < num_list.length; i++) {
            answer[count] = num_list[i];
            count++;
        }

        return answer;
    }
}

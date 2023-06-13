class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder myst = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                myst.append('B');
            } else {
                myst.append('A');
            }
        }

        if (myst.toString().contains(pat)) {
            answer = 1;
        }

        return answer;
    }
}








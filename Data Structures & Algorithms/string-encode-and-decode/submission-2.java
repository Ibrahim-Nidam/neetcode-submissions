class Solution {

    public String encode(List<String> strs) {
        String msg = "";
        for(String str: strs){
            msg += str.length() + "#" + str;
        }
        return msg;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        if (str.isEmpty()) return strs;

        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j + 1, j + 1 + len);

            strs.add(word);

            i = j + 1 + len;
        }

        return strs;
    }
}

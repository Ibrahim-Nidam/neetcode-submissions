class Solution {

    public String encode(List<String> strs) {
        String msg = "";
        for(String str: strs){
            msg += str + ';';
        }
        return msg;
    }

    public List<String> decode(String str) {
        String[] strs = str.split(";", -1);
        return Arrays.asList(strs).subList(0, strs.length -1);
    }
}

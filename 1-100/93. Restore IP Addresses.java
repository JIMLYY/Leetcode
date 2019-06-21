class Solution {
    public List<String> restoreIpAddresses(String s) {
        LinkedList <String> result = new LinkedList<String>();
        if(s == null || s.length() > 12) return result;
        restoreHelper(result, s, "", 0);
        return result;
    }
    public void restoreHelper(List<String> result, String s, String current, int field){
        // exit condition
        if(field == 4 && s.length() == 0) result.add(current.substring(1)); // remove the prefixed "."
        else if (field == 4 || s.length() == 0) return;
        else{
            restoreHelper(result, s.substring(1), current + "." + s.substring(0,1), field +1);
            if(s.charAt(0) != '0' && s.length() > 1){
                restoreHelper(result, s.substring(2), current + "." + s.substring(0,2), field +1);
                if(s.length() > 2 && Integer.valueOf(s.substring(0,3)) <= 255){
                    restoreHelper(result, s.substring(3), current + "." + s.substring(0,3), field +1);
                }
            }
        }

    }
}

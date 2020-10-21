public class M0109IsFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() == s2.length() && (s1 + s1).indexOf(s2) > -1) {
            return true;
        } else {
            return false;
        }
    }
}

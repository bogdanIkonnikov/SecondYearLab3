package second;

public class BeginStringFilter implements filter{
    private final String pattern;

    public BeginStringFilter(String string) {
        pattern = string;
    }

    public boolean apply(String str){
        if (str.startsWith(pattern)) {
            return true;
        }
        return false;
    }

}

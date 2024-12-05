package second;
import second.interfaces.filter;

public class EndStringFilter implements filter{
    private final String pattern;

    public EndStringFilter(String string) {
        pattern = string;
    }

    @Override
    public boolean apply(String str){
        return str.endsWith(pattern);
    }
}

package second;
import second.interfaces.Filter;

public class EndStringFilter implements Filter {
    private final String pattern;

    public EndStringFilter(String string) {
        pattern = string;
    }

    @Override
    public boolean apply(String str){
        return str.endsWith(pattern);
    }
}

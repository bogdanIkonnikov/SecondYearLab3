package second;

import second.interfaces.Filter;

public class BeginStringFilter implements Filter {
    private final String pattern;

    public BeginStringFilter(String string) {
        pattern = string;
    }

    @Override
    public boolean apply(String str){
        return str.startsWith(pattern);
    }

}

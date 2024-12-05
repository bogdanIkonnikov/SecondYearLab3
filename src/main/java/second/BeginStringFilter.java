package second;

import second.interfaces.filter;

public class BeginStringFilter implements filter {
    private final String pattern;

    public BeginStringFilter(String string) {
        pattern = string;
    }

    @Override
    public boolean apply(String str){
        return str.startsWith(pattern);
    }

}

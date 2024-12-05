package second;
import second.interfaces.filter;

public class OnlyOneLetterFilter implements filter{
    private final Character pattern;

    public OnlyOneLetterFilter(Character pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String string) {
        return string.indexOf(pattern) == string.lastIndexOf(pattern);
    }
}

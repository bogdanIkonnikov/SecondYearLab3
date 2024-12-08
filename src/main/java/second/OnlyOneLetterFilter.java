package second;
import second.interfaces.Filter;

public class OnlyOneLetterFilter implements Filter {
    private final Character pattern;

    public OnlyOneLetterFilter(Character pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String string) {
        return (string.indexOf(pattern) == string.lastIndexOf(pattern)) && (string.indexOf(pattern) != -1);
    }
}

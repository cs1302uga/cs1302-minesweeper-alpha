package cs1302.game;

/**
 * Utility class for the Minesweeper Alpha project.
 */
public class MinesweeperUtility {

    /**
     * Returns a padded format string suitable for {@code printf} or {@code String.format}.
     * Specifically, this method containing {@code "%NS"} where {@code N} is the number of
     * characters to pad specified by {@code numChars} and {@code S} is the format
     * specification specified by {@code spec} (use {@code "d"} for integers and {@code "s"}
     * for strings). Additionally, the strings specified by {@code pre} and {@code post}
     * are prepended and appended to the returned string, respectively. <strong>This method
     * has only been tested with {@code spec} values of {@code "d"} and {@code "s"}</strong>
     *
     * <h3>Examples</h3>
     * Listed below are some examples. Let's assume that {@code format} and {@code str}
     * are both {@code String} variables. These examples assume a {@code static import}
     * of the method (otherwise, you'll need to include the class name before each
     * call to {@code makeFormat}).
     *
     * <div style="padding-top: 1em;">
     * <pre>{@code
     * format = makeFormat("", 0, "s", ""};    // "%s"
     * str = String.format(format, "hello");   // "hello"
     *
     * format = makeFormat("!", 0, "d", "!";   // "!%d!"
     * str = String.format(format, 12);        // "!12!"
     *
     * format = makeFormat("!", 3, "d", "!";   // "!%3d!"
     * str = String.format(format, 42);        // "! 42!"
     * str = String.format(format, 312);       // "!312!"
     * str = String.format(format, 7);         // "!  7!"
     *
     * format = makeFormat("| ", 2, "d", " |"; // "| %2d |"
     * str = String.format(format, 42);        // "| 42 |"
     * str = String.format(format, 7);         // "|  7 |"
     *
     * format = makeFormat("| ", 2, "s", " |"; // "| %2s |"
     * str = String.format(format, "??");      // "| ?? |"
     * str = String.format(format, "?");       // "|  ? |"}</pre>
     * </div>
     *
     * @param pre       string to be prepended
     * @param numChars  number of characters to pad
     * @param spec      format specification ({@code "d"} for integers; {@code "s"} for strings)
     * @param post      string to be appended
     * @return padded format string
     */
    private static String makeFormat(String pre, int numChars, String spec, String post) {
        if (numChars > 0) {
            return pre + "%" + numChars + spec + post;
        } else {
            return pre + "%" + spec + post;
        } // if
    } // makeFormat

} // MinesweeperUtility

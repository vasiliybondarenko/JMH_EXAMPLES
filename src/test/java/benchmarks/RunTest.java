package benchmarks;

/**
 * Created with IntelliJ IDEA.
 * User: shredinger
 * Date: 12/28/13
 * Time: 8:39 PM
 * Project: JMH_TEST
 */
import java.io.IOException;
import org.openjdk.jmh.Main;

public class RunTest {
    private static final String TEST = ".*sort.*"; //uses regexp

    public static void main(String[] args) throws IOException {
        Main.main(getArguments(TEST, 5, 500, 1));
    }

    private static String[] getArguments(String className, int nRuns, int runForMilliseconds, int nThreads) {
        return new String[]{className,
                "-i", "" + nRuns,
                "-r", runForMilliseconds + "ms",
                "-t", "" + nThreads,
                "-w", "5000ms",
                "-wi", "3",
                "-v"
        };
    }
}

package doc;

import java.io.IOException;

/**
 * ExampleJavadoc.
 * Пример для javadoc-а
 *
 * @author Ilya_Sukhachev
 */
public interface ExampleJavadoc {

    /**
     *
     * @param a - первое слагаемое
     * @param b
     * @param c
     * @return - результат
     * @throws IOException
     */
    public int test(int a, int b, double c) throws IOException;
}

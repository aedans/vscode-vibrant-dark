package test;

import java.util.regex.Pattern;

/**
 * Java class for testing highlighting.
 * 
 * https://github.com/aedans/vscode-vibrant-dark
 */
@SuppressWarnings(value = "unused")
private class Test extends Object implements Comparable<Test> {
    int integer = 0;
    float decimal = 0.0;
    boolean t = true;
    Object[] x = null;
    String string = "String\r\n";
    Class<T> clazz = Test.class;

    @Override
    public void method(int intParam, String stringParam) {
        if (intParam == integer || intParam == decimal) {
            // Do something.
        }
        this.method(intParam - 1, stringParam);
    }
}
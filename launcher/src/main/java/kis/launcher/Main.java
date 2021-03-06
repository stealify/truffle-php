package kis.launcher;

import org.graalvm.polyglot.Context;

/**
 *
 * @author naoki
 */
public class Main {
    private static final String FIB = "" +
            "<?php\n" +
            "function fib($n) {\n" +
            "    if ($n < 2) {\n" +
            "        return $n;\n" +
            "    }\n" +
            "    return fib($n - 1) + fib($n - 2);\n" +
            "}\n" +
            "$start = microtime(1);\n" +
            "echo \"fib:\".fib(31);\n" +
            "echo \"\\n\";\n" +
            "echo \"time:\".(microtime(1) - $start);\n" +
            "echo \"\\n\";\n" +
            "fib(31);fib(31);fib(31);fib(31);fib(31);" +
            "$start = microtime(1);\n" +
            "echo \"fib:\".fib(31);\n" +
            "echo \"\\n\";\n" +
            "echo \"time:\".(microtime(1) - $start);\n" +
            "echo \"\\n\";\n" +
            "";
    public static void main(String[] args) {
        Context ctx = Context.create("php");
        ctx.eval("php", FIB);
    }    
}

package ai.labrador.xnife;

import jep.Interpreter;
import jep.JepException;
import jep.SharedInterpreter;

public class Test {
    public static void main(String[] args) {
        try (Interpreter interp = new SharedInterpreter()) {
            interp.exec("import sys");
            interp.exec("sys.path.append('.')");
            interp.exec("import my_module");
            int a = 10;
            int b = 5;
            interp.set("a", a);
            interp.set("b", b);
            interp.exec("x = my_module.my_add(a, b)");
            Object result1 = interp.getValue("x");
            System.out.println(String.valueOf(result1));

            // using getValue(String) to invoke methods
//            Object result2 = interp.getValue("somePyModule.foo2()");

            // using invoke to invoke methods
//            interp.exec("foo3 = somePyModule.foo3");
//            Object result3 = interp.invoke("foo3", obj);


//            interp.exec("import numpy as np");
//            int a = 9;
//            interp.set("a", a);
//            interp.exec("x = np.sqrt(a)");
//            Object result1 = interp.getValue("x");
//            System.out.println(String.valueOf(result1));
        } catch (JepException je) {
            System.out.println(je.getMessage());
        }
    }
}

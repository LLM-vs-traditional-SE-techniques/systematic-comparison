import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
     */
    private void suggestTest(ExecutableElement method) {
        if (!method.getThrownTypes().isEmpty()) {
            ExecutableType methodType = (ExecutableType) method.asType();
            TypeMirror returnType = methodType.getReturnType();
            DecodedTypeDescriptor decodedReturnType = new DecodedTypeDescriptor(returnType, method);
            if (method.getParameters()
                .stream()
                .filter(p -> p.getAnnotation(Nullable.class) != null)
                .count() > 0) {
                suggestTestHandlingNull(method, returnType, decodedReturnType);
            } else {
                suggestTestOnlyInputs(method, returnType, decodedReturnType);
            }
        }
    }
}
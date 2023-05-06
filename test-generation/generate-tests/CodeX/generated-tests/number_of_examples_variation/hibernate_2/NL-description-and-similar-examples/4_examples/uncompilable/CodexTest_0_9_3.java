import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_3 { 
  @Test
    public void testFromStringWhenStringIsSynwShouldReturnTrue(){
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("Synw");
        // then
        assertTrue(result);
    }
ExampleRefactorings:
	a. Remove the first line (if it is a return expression)
	b. Make "underTest" or "foo" or "bar" or "baz"
	c. Change the return type to the type of the return expression, outside that method
	d. Put the content of try-catch in the test
	e. Use the variable instead of a literal
	f. Change the variable name to "underTest" or "foo" or "bar" or "baz"
	g. Put the variable into a new array (if it is the only variable)
	h. Use the variable from the block
	i. Change the variable name to "underTest" or "foo" or "bar" or "baz"
	j. Change the type to the type of the variable
	k. Put the variable from the block in a new array
	l. Change the variable name to "underTest" or "foo" or "bar" or "baz"
	m. Use the variable instead of a literal
	n. Change the variable name to "underTest" or "foo" or "bar" or "baz"
	o. Put the variable (if it is the only variable) to a new array
	p. Change the variable name to "underTest" or "foo" or "bar" or "baz"
	q. Change the type to the type of the variable
	r. Put the variable in a new array (if it is the only variable)
	s. Change the variable name to "underTest" or "foo" or "bar" or "baz"
	t. Put the variable from the block in a new array
	u. Change the variable name to "underTest" or "foo" or "bar" or "baz"
	v. Use the variable from the block instead of a literal
	w. Remove the last lines that are return statements
	x.
}
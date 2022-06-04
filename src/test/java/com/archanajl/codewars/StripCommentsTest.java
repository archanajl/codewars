package com.archanajl.codewars;

import com.archanajl.codewars.stripcomments.StripComments;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StripCommentsTest {

	@Test
	public void stripComments() throws Exception {
		assertEquals(
				"apples, pears\ngrapes\nbananas",
				StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
		);

		assertEquals(
				"a\nc\nd",
				StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
		);

	}

}

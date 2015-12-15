package com.mesosphere.jenkins;

import org.junit.Test;
import org.apache.catalina.valves.rewrite.RewriteMap;
import com.mesosphere.jenkins.DollarRewriteMap;

import static org.junit.Assert.assertEquals;

public class DollarRewriteMapTest {
    @Test
    public void testLookup() {
        String badString = "%24stapler/bound/b8edb60c-383a-4891-bd97-a1cf23556362/render";
        String correctString = "$stapler/bound/b8edb60c-383a-4891-bd97-a1cf23556362/render";
        RewriteMap map = new DollarRewriteMap();
        String goodString = map.lookup(badString);
        assertEquals(correctString, goodString);
    }
}

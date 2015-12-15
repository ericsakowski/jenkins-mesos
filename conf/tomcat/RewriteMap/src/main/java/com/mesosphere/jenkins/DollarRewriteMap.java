package com.mesosphere.jenkins;

import org.apache.catalina.valves.rewrite.RewriteMap;
import java.lang.String;

public class DollarRewriteMap implements RewriteMap {

    @Override
    public String setParameters(String params) {
        // NO-OP
        return null;
    }

    @Override
    public String lookup(String key) {
        if (key.contains("%24")) {
            key = key.replaceFirst("%24" , "\\$");
        }
        return key;
    }
}
package io.github.shockycake.derpsong.util;

import cpw.mods.fml.common.registry.LanguageRegistry;

import java.util.*;

public class recordRegistry {

    private static Map<String, Integer> records = new HashMap();

    public static void addItemName(Object item, String name) {
        LanguageRegistry.addName(item, name);
    }

    public static int getRecord() {
        Random rand = new Random();
        List<String> values = new ArrayList(records.keySet());
        String randomKey = (String) values.get(rand.nextInt(values.size()));
        int recordOutput = ((Integer) records.get(randomKey)).intValue();
        System.out.println("value is " + recordOutput);
        return recordOutput;
    }
}

package com.alphamplyer.alphalang;

import java.util.HashMap;
import java.util.Map;

public class AlphaInstance {
    private AlphaClass alphaClass;
    private final Map<String, Object> fields = new HashMap<String, Object>();

    AlphaInstance(AlphaClass alphaClass) {
        this.alphaClass = alphaClass;
    }

    Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        AlphaFunction method = alphaClass.findMethod(name.lexeme);
        if (method != null) return method.bind(this);

        throw new RuntimeException("Undefined property: '" + name.lexeme + "'.");
    }

    void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }

    @Override
    public String toString() {
        return "'" + alphaClass.name + "' instance";
    }
}

package com.alphamplyer.alphalang;

import java.util.List;
import java.util.Map;

public class AlphaClass implements AlphaCallable {
    final String name;
    private final Map<String, AlphaFunction> methods;

    AlphaClass(String name, Map<String, AlphaFunction> methods) {
        this.name = name;
        this.methods = methods;
    }

    AlphaFunction findMethod(String name) {
        if (methods.containsKey(name)) {
            return methods.get(name);
        }

        return null;
    }

    @Override
    public int arity() {
        AlphaFunction initializer = findMethod("init");
        if (initializer == null)
            return 0;
        return initializer.arity();
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        AlphaInstance instance = new AlphaInstance(this);
        AlphaFunction initializer = findMethod("init");
        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }
        return instance;
    }

    @Override
    public String toString() {
        return name;
    }
}

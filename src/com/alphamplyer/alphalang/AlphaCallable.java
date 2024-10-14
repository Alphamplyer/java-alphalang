package com.alphamplyer.alphalang;

import java.util.List;

public interface AlphaCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}

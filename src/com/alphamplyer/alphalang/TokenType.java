package com.alphamplyer.alphalang;

public enum TokenType {
    // Single-character tokens.
    LEFT_PARENTHESES, RIGHT_PARENTHESES,
    LEFT_CURLY_BRACE, RIGHT_CURLY_BRACE,
    COMMA, DOT, SEMICOLON,
    MINUS, PLUS, STAR, SLASH,

    // One or two character tokens.
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals.
    IDENTIFIER, STRING, NUMBER,

    // Keywords.
    CLASS, FUNC, VAR,
    TRUE, FALSE,
    IF, ELSE,
    AND, OR,
    NIL,
    PRINT,
    RETURN, SUPER, THIS,
    FOR, WHILE,

    EOF
}


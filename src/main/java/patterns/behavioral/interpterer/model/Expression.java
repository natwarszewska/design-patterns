package patterns.behavioral.interpterer.model;

import patterns.behavioral.interpterer.impl.InterpreterEngine;

public interface Expression {
    public int interpret(InterpreterEngine engine);
}
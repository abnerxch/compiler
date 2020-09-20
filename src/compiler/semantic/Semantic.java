package compiler.semantic;
import compiler.ast.Ast;
import compiler.lib.Debug;

public class Semantic {

    public Debug debug;

    public Semantic(Ast ast)
    {
        System.out.println("Stage: semantic");
    }

    public void setDebuger(Debug d)
    {
        debug = d;
        debug.println("debugging: Semantic");
    }

}

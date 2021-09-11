package interpreter;

import java.util.Map;

public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return super.left.interpreter(map)+super.right.interpreter(map);
    }
}

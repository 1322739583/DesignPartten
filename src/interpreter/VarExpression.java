package interpreter;

import java.util.Map;

public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return map.get(key);
    }
}

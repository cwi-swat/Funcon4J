package funcons.interpreter;

import funcons.algebras.StringAlg;
import funcons.carriers.IEval;
import funcons.values.CLString;
import funcons.values.String;

public interface StringFactory extends BoolFactory, StringAlg<IEval> {
    @Override
    default IEval string(java.lang.String s) {
        return (env, forwards, store, given) -> new String(s);
    }

    @Override
    default IEval camlLightString(java.lang.String s) {
        return (env, forwards, store, given) -> new CLString(s);
    }
}

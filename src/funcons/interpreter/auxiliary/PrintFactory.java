package funcons.interpreter.auxiliary;

import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;

public interface PrintFactory extends NullAlg<IEval>, PrintAlg<IEval> {
    @Override
    default IEval print(IEval x) {
        return (env, forward, store, given) -> {
            System.out.print(x.eval(env, forward, store, given));
            return null_().eval(env, forward, store, given);
        };
    }
}
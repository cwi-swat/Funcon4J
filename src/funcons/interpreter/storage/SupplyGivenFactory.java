package funcons.interpreter.storage;

import funcons.algebras.storage.SupplyGivenAlg;
import funcons.carriers.IEval;

public interface SupplyGivenFactory extends SupplyGivenAlg<IEval> {
    @Override
    default IEval given() {
        return (env, given) -> given;
    }

    @Override
    default IEval supply(IEval exp, IEval x) {
        return (env, given) -> x.eval(env, exp.eval(env, given));
    }
}

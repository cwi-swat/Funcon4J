package funcons.interpreter.values;

import funcons.algebras.values.IntAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.INumber;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalIntFactory extends IntAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval lit(Integer i) {
        return (env, forwards, store, given) -> vf.integer(i);
    }

    @Override
    default IEval intAdd(IEval a, IEval b) {
        return (env, forward, store, given) ->
                        ((INumber)a.eval(env, forward, store, given)).toInteger()
                                .add(((INumber)b.eval(env, forward, store, given)).toInteger());
    }

    @Override
    default IEval intNegate(IEval x) {
        return (env, forward, store, given) ->
                ((INumber)x.eval(env, forward, store, given)).toInteger().negate();
    }

    @Override
    default IEval intSubtract(IEval a, IEval b) {
        return (env, forward, store, given) ->
                ((INumber)a.eval(env, forward, store, given)).toInteger()
                        .subtract(((INumber)b.eval(env, forward, store, given)).toInteger());
    }

    @Override
    default IEval intMultiply(IEval a, IEval b) {
        return (env, forward, store, given) ->
                ((INumber)a.eval(env, forward, store, given)).toInteger()
                        .multiply(((INumber)b.eval(env, forward, store, given)).toInteger());
    }

    @Override
    default IEval intDivide(IEval a, IEval b) {
        return (env, forward, store, given) ->
                ((INumber)a.eval(env, forward, store, given)).toInteger()
                        .divide(((INumber)b.eval(env, forward, store, given)).toInteger());
    }

    @Override
    default IEval intModulo(IEval a, IEval b) {
        return (env, forward, store, given) -> {
            IInteger aNumber = ((INumber) a.eval(env, forward, store, given)).toInteger();
            IInteger bNumber = ((INumber) a.eval(env, forward, store, given)).toInteger();
            return aNumber.subtract(aNumber.divide(bNumber).multiply(bNumber));
        };
    }
}
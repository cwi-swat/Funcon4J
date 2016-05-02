package funcons.interpreter;

import funcons.algebras.BindAlg;
import funcons.sorts.IEval;
import funcons.values.Environment;
import funcons.values.Map;
import funcons.values.ids.Id;
import funcons.values.ids.NameId;

public interface BindFactory extends LogicWhileTrueFactory, BindAlg<IEval> {
    @Override
    default IEval id(java.lang.String s) {
        return (env, store, given) -> new Id(s);
    }

    @Override
    default IEval nameId(java.lang.String namespace, java.lang.String id) {
        return (env, store, given) -> new NameId(namespace, id);
    }

    @Override
    default IEval bindValue(IEval id, IEval exp) {
        return (env, store, given) -> new Environment(((Id)id.eval(env, store, given)), exp.eval(env, store, given));
    }

    @Override
    default IEval boundValue(IEval id) {
        return (env, store, given) -> env.val((Id) id.eval(env, store, given));
    }

    @Override
    default IEval scope(IEval localBindings, IEval exp) {
        return (env, store, given) -> exp.eval(env.extend((Environment)localBindings.eval(env, store, given)), store, given);
    }

    @Override
    default IEval given() {
        return (env, store, given) -> given;
    }

    @Override
    default IEval supply(IEval exp, IEval x) {
        return (env, store, given) -> x.eval(env, store, exp.eval(env, store, given));
    }

    @Override
    default IEval environment() {
        return (env, store, given) -> new Environment();
    }

    @Override
    default IEval mapUnion(IEval map1, IEval map2) {
        return (env, store, given) -> {
            Map m1 = (Map)map1.eval(env, store, given);
            Map m2 = (Map)map2.eval(env, store, given);
            @SuppressWarnings("unchecked")
            Map m3 = m1.extend(m2);
            return m3;
        };
    }

    @Override
    default IEval mapOver(IEval map1, IEval map2) {
        return (env, store, given) -> {
            Map m1 = (Map)map1.eval(env, store, given);
            Map m2 = (Map)map2.eval(env, store, given);
            @SuppressWarnings("unchecked")
            Map m3 = m2.extend(m1);
            return m3;
        };
    }
}

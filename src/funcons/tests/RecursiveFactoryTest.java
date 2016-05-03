package funcons.tests;

import funcons.Store;
import funcons.algebras.RecursiveAlg;
import funcons.interpreter.RecursiveFactory;
import funcons.sorts.IEval;
import funcons.values.*;
import funcons.values.ids.Id;
import funcons.values.recursion.Forwards;
import funcons.values.recursion.Fwd;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveFactoryTest {

    private RecursiveAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new RecursiveFactory() {};
    }

    @Test
    public void testFreshFwd() throws Exception {
        Fwd f = (Fwd)alg.freshFwd().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals((new Forwards()).freshFwd(), f);
    }

    @Test
    public void testFreshFwds() throws Exception {
        IEval fwds = alg.freshFwds(alg.list(alg.id("x"), alg.id("y")));
        Environment map = (Environment)fwds.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Fwd(0), map.val(new Id("x")));
        assertEquals(new Fwd(1), map.val(new Id("y")));
    }

    @Test
    public void testSetForwards() throws Exception {
        Forwards forwards = new Forwards();
        Environment env = new Environment();
        env = env.add(new Id("foo"), new Int(3));
        env = env.add(new Id("bar"), new Int(5));
        IEval fwdsEval = alg.freshFwds(alg.listPrefix(alg.id("foo"), alg.list(alg.id("bar"), alg.id("baz"))));
        Map fwds = (Map)fwdsEval.eval(env, forwards, new Store(), new Null());
        alg.setForwards((e,f,s,g) -> fwds).eval(env, forwards, new Store(), new Null());

        assertEquals(new Integer(3), ((Int)forwards.follow(new Fwd(0))).intValue());
        assertEquals(new Integer(5), ((Int)forwards.follow(new Fwd(1))).intValue());
        assertEquals(new Undefined(), forwards.follow(new Fwd(2)));
    }

    @Test
    public void testReclose() throws Exception {
        IEval recloseEval = alg.reclose(alg.freshFwds(alg.list(alg.id("foo"), alg.id("bar"))), alg.bindValue(alg.id("foo"), alg.lit(0)));
        Forwards forwards = new Forwards();
        recloseEval.eval(new Environment(), forwards, new Store(), new Null());
        assertEquals(new Integer(0), ((Int)forwards.follow(new Fwd(0))).intValue());
        assertEquals(new Undefined(), forwards.follow(new Fwd(1)));
    }
}
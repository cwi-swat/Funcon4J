package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolyTypeFactoryTest extends TestStub {

    @Test
    public void testInstantiatePoly() throws Exception {
        Int i = (Int)alg.instantiatePoly(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testInstantiateIfPoly() throws Exception {
        Int i = (Int)alg.instantiateIfPoly(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneralise() throws Exception {
        Int i = (Int)alg.generalise(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneraliseIfPoly() throws Exception {
        Int i = (Int)alg.generaliseIfPoly(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneraliseDecl() throws Exception {
        Int i = (Int)alg.generaliseDecl(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneraliseMap() throws Exception {
        Int i = (Int)alg.generaliseMap(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }
}
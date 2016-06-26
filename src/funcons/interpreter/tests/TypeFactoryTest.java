package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.properties.Value;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeFactoryTest implements AllFactory {
    @Test
    public void testType() throws Exception {
        assertEquals(type("foo").eval(), type("foo").eval());
        assertNotEquals(type("bar").eval(), type("foo").eval());
    }

    @Test
    public void testTypeVar() throws Exception {
        assertEquals(typeVar("foo").eval(), typeVar("foo").eval());
        assertNotEquals(typeVar("bar").eval(), typeVar("foo").eval());
    }

    @Test
    public void testTag() throws Exception {
        assertEquals(tag("foo").eval(), tag("foo").eval());
        assertNotEquals(tag("bar").eval(), tag("foo").eval());
    }

    @Test
    public void testClVariant() throws Exception {
        assertEquals(clVariant("foo", lit(0)).eval(), clVariant("foo", lit(0)).eval());
        assertNotEquals(clVariant("foo", lit(1)).eval(), clVariant("foo", lit(0)).eval());
        assertNotEquals(clVariant("bar", lit(0)).eval(), clVariant("foo", lit(0)).eval());
    }

    @Test
    public void testMeta() throws Exception {
        assertEquals(meta("foo").eval(), meta("foo").eval());
        assertNotEquals(meta("bar").eval(), meta("foo").eval());
    }

    @Test
    public void testNomTag() throws Exception {
        assertNotEquals(nomTag(freshToken()).eval(), nomTag(freshToken()).eval());
        Value v = freshToken().eval();
        assertEquals(nomTag((e,s,g) -> v).eval(), nomTag((e,s,g) -> v).eval());
    }

    @Test
    public void testNomVal() throws Exception {
        assertNotEquals(nomVal(nomTag(freshToken()), lit(0)).eval(), nomVal(nomTag(freshToken()), lit(0)).eval());

        Value v = nomTag(freshToken()).eval();
        assertNotEquals(nomVal((e,s,g) -> v, lit(0)).eval(), nomVal((e,s,g) -> v, lit(1)).eval());
        assertEquals(nomVal((e,s,g) -> v, lit(0)).eval(), nomVal((e,s,g) -> v, lit(0)).eval());
    }

    @Test
    public void testNomValSelect() throws Exception {
        Value v = freshToken().eval();
        assertEquals(
                lit(0).eval(),
                nomValSelect(nomTag((e,s,g) -> v), nomVal(nomTag((e,s,g) -> v), lit(0))).eval());

        // should fail
        try {
            nomValSelect(nomTag(freshToken()), nomVal(nomTag(freshToken()), lit(0))).eval();
            assertTrue(false);
        } catch(FailureTrue ignore) {}
    }

    @Test
    public void testScopeNominalCoercion() throws Exception {
        assertEquals(lit(0).eval(), scopeNominalCoercion(type("foo"), type("bar"), abs(any(), lit(0))).eval());
    }

    @Test
    public void testDepends() throws Exception {
        assertEquals(depends(type("foo"), type("bar")).eval(), depends(type("foo"), type("bar")).eval());
        assertNotEquals(depends(type("foo"), type("foo")).eval(), depends(type("foo"), type("bar")).eval());
    }

    @Test
    public void testTyped() throws Exception {
        assertEquals(lit(0).eval(), typed(lit(0), type("foo")).eval());
    }

    @Test
    public void testBoundType() throws Exception {
        assertEquals(null_().eval(), boundType(id("foo")).eval());
    }

    @Test
    public void testFreshToken() throws Exception {
        assertNotNull(freshToken().eval());
        assertNotEquals(freshToken().eval(), freshToken().eval());
    }

    @Test
    public void testNewType() throws Exception {
        assertNotNull(newType(lit(0)).eval());
        assertNotEquals(newType(lit(0)).eval(), newType(lit(0)).eval());
    }

    @Test
    public void testTypeDef() throws Exception {
        assertNotNull(typeDef(id("foo"), newType(lit(0))).eval());
    }

    @Test
    public void testRestrictDomain() throws Exception {
        IEval id = restrictDomain(abs(given()), type("foo"));
        assertEquals(lit(0).eval(), apply(id, lit(0)).eval());
    }

    @Test
    public void testPattAtType() throws Exception {
        IEval patt = pattAtType(bind(id("foo")), type("bar"));
        IEval env = match(lit(0), patt);
        assertEquals(lit(0).eval(), scope(env, boundValue(id("foo"))).eval());
    }

    @Test
    public void testVariantMatch() throws Exception {
        IEval env = variantMatch(tag("foo"), clVariant("foo", lit(0)), bind(id("bar")));
        assertEquals(lit(0).eval(), scope(env, boundValue(id("bar"))).eval());

        try {
            env = variantMatch(tag("foobar"), clVariant("foo", lit(0)), bind(id("bar")));
            scope(env, boundValue(id("bar"))).eval();
            assertTrue(false);
        } catch(FailureTrue ignore) {}
    }

    @Test
    public void testUnknownType() throws Exception {
        assertEquals(unknownType().eval(), unknownType().eval());
    }
}
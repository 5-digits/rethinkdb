// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../templates/Test.java
package gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.exc.*;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.Collections;
import java.nio.charset.StandardCharsets;

import static gen.TestingCommon.*;
import gen.TestingFramework;

public class MathLogicAdd {
    // Tests for basic usage of the add operation
    Logger logger = LoggerFactory.getLogger(MathLogicAdd.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection<?> conn;
    public String hostname = TestingFramework.getConfig().getHostName();
    public int port = TestingFramework.getConfig().getPort();

    @Before
    public void setUp() throws Exception {
        logger.info("Setting up.");
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        logger.info("Tearing down.");
        r.db("rethinkdb").table("_debug_scratch").delete();
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        conn.close(false);
    }

    // Autogenerated tests below

        @Test(timeout=120000)
    public void test() throws Exception {
                
        {
            // math_logic/add.yaml line #3
            /* 2 */
            Long expected_ = 2L;
            /* r.add(1, 1) */
            logger.info("About to run line #3: r.add(1L, 1L)");
            Object obtained = runOrCatch(r.add(1L, 1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #3");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #3:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #8
            /* 2 */
            Long expected_ = 2L;
            /* r.expr(1) + 1 */
            logger.info("About to run line #8: r.expr(1L).add(1L)");
            Object obtained = runOrCatch(r.expr(1L).add(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #8");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #8:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #9
            /* 2 */
            Long expected_ = 2L;
            /* 1 + r.expr(1) */
            logger.info("About to run line #9: r.add(1L, r.expr(1L))");
            Object obtained = runOrCatch(r.add(1L, r.expr(1L)),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #9");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #9:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #10
            /* 2 */
            Long expected_ = 2L;
            /* r.expr(1).add(1) */
            logger.info("About to run line #10: r.expr(1L).add(1L)");
            Object obtained = runOrCatch(r.expr(1L).add(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #10");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #10:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #16
            /* 0 */
            Long expected_ = 0L;
            /* r.expr(-1) + 1 */
            logger.info("About to run line #16: r.expr(-1L).add(1L)");
            Object obtained = runOrCatch(r.expr(-1L).add(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #16");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #16:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #21
            /* 10.25 */
            Double expected_ = 10.25;
            /* r.expr(1.75) + 8.5 */
            logger.info("About to run line #21: r.expr(1.75).add(8.5)");
            Object obtained = runOrCatch(r.expr(1.75).add(8.5),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #21");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #21:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #27
            /* '' */
            String expected_ = "";
            /* r.expr('') + '' */
            logger.info("About to run line #27: r.expr('').add('')");
            Object obtained = runOrCatch(r.expr("").add(""),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #27");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #27:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #32
            /* 'abcdef' */
            String expected_ = "abcdef";
            /* r.expr('abc') + 'def' */
            logger.info("About to run line #32: r.expr('abc').add('def')");
            Object obtained = runOrCatch(r.expr("abc").add("def"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #32");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #32:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #38
            /* [1,2,3,4,5,6,7,8] */
            List expected_ = r.array(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L);
            /* r.expr([1,2]) + [3] + [4,5] + [6,7,8] */
            logger.info("About to run line #38: r.expr(r.array(1L, 2L)).add(r.array(3L)).add(r.array(4L, 5L)).add(r.array(6L, 7L, 8L))");
            Object obtained = runOrCatch(r.expr(r.array(1L, 2L)).add(r.array(3L)).add(r.array(4L, 5L)).add(r.array(6L, 7L, 8L)),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #38");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #38:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #52
            /* err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", r.array(1L));
            /* r.expr(1) + 'a' */
            logger.info("About to run line #52: r.expr(1L).add('a')");
            Object obtained = runOrCatch(r.expr(1L).add("a"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #52");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #52:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #57
            /* err("ReqlQueryLogicError", "Expected type STRING but found NUMBER.", [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type STRING but found NUMBER.", r.array(1L));
            /* r.expr('a') + 1 */
            logger.info("About to run line #57: r.expr('a').add(1L)");
            Object obtained = runOrCatch(r.expr("a").add(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #57");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #57:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/add.yaml line #62
            /* err("ReqlQueryLogicError", "Expected type ARRAY but found NUMBER.", [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type ARRAY but found NUMBER.", r.array(1L));
            /* r.expr([]) + 1 */
            logger.info("About to run line #62: r.expr(r.array()).add(1L)");
            Object obtained = runOrCatch(r.expr(r.array()).add(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #62");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #62:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}

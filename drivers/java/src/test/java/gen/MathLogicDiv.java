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

public class MathLogicDiv {
    // Tests for the basic usage of the division operation
    Logger logger = LoggerFactory.getLogger(MathLogicDiv.class);
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
            // math_logic/div.yaml line #6
            /* 2 */
            Long expected_ = 2L;
            /* r.expr(4) / 2 */
            logger.info("About to run line #6: r.expr(4L).div(2L)");
            Object obtained = runOrCatch(r.expr(4L).div(2L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #6");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #6:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #7
            /* 2 */
            Long expected_ = 2L;
            /* 4 / r.expr(2) */
            logger.info("About to run line #7: r.div(4L, r.expr(2L))");
            Object obtained = runOrCatch(r.div(4L, r.expr(2L)),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #7");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #7:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #8
            /* 2 */
            Long expected_ = 2L;
            /* r.expr(4).div(2) */
            logger.info("About to run line #8: r.expr(4L).div(2L)");
            Object obtained = runOrCatch(r.expr(4L).div(2L),
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
            // math_logic/div.yaml line #15
            /* 0.5 */
            Double expected_ = 0.5;
            /* r.expr(-1) / -2 */
            logger.info("About to run line #15: r.expr(-1L).div(-2L)");
            Object obtained = runOrCatch(r.expr(-1L).div(-2L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #15");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #15:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #20
            /* 4.9 / 0.7 */
            Double expected_ = 4.9 / 0.7;
            /* r.expr(4.9) / 0.7 */
            logger.info("About to run line #20: r.expr(4.9).div(0.7)");
            Object obtained = runOrCatch(r.expr(4.9).div(0.7),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #20");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #20:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #25
            /* 1.0/120 */
            Double expected_ = 1.0 / 120L;
            /* r.expr(1).div(2,3,4,5) */
            logger.info("About to run line #25: r.expr(1L).div(2L, 3L, 4L, 5L)");
            Object obtained = runOrCatch(r.expr(1L).div(2L, 3L, 4L, 5L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #25");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #25:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #37
            /* err('ReqlQueryLogicError', 'Cannot divide by zero.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot divide by zero.", r.array(1L));
            /* r.expr(1) / 0 */
            logger.info("About to run line #37: r.expr(1L).div(0L)");
            Object obtained = runOrCatch(r.expr(1L).div(0L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #37");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #37:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #38
            /* err('ReqlQueryLogicError', 'Cannot divide by zero.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot divide by zero.", r.array(1L));
            /* r.expr(2.0) / 0 */
            logger.info("About to run line #38: r.expr(2.0).div(0L)");
            Object obtained = runOrCatch(r.expr(2.0).div(0L),
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
            // math_logic/div.yaml line #39
            /* err('ReqlQueryLogicError', 'Cannot divide by zero.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot divide by zero.", r.array(1L));
            /* r.expr(3) / 0.0 */
            logger.info("About to run line #39: r.expr(3L).div(0.0)");
            Object obtained = runOrCatch(r.expr(3L).div(0.0),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #39");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #39:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #40
            /* err('ReqlQueryLogicError', 'Cannot divide by zero.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot divide by zero.", r.array(1L));
            /* r.expr(4.0) / 0.0 */
            logger.info("About to run line #40: r.expr(4.0).div(0.0)");
            Object obtained = runOrCatch(r.expr(4.0).div(0.0),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #40");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #40:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #41
            /* err('ReqlQueryLogicError', 'Cannot divide by zero.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot divide by zero.", r.array(1L));
            /* r.expr(0) / 0 */
            logger.info("About to run line #41: r.expr(0L).div(0L)");
            Object obtained = runOrCatch(r.expr(0L).div(0L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #41");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #41:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #42
            /* err('ReqlQueryLogicError', 'Cannot divide by zero.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot divide by zero.", r.array(1L));
            /* r.expr(0.0) / 0.0 */
            logger.info("About to run line #42: r.expr(0.0).div(0.0)");
            Object obtained = runOrCatch(r.expr(0.0).div(0.0),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #42");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #42:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #46
            /* err('ReqlQueryLogicError', 'Expected type NUMBER but found STRING.', [0]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", r.array(0L));
            /* r.expr('a') / 0.8 */
            logger.info("About to run line #46: r.expr('a').div(0.8)");
            Object obtained = runOrCatch(r.expr("a").div(0.8),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #46");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #46:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/div.yaml line #50
            /* err('ReqlQueryLogicError', 'Expected type NUMBER but found STRING.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", r.array(1L));
            /* r.expr(1) / 'a' */
            logger.info("About to run line #50: r.expr(1L).div('a')");
            Object obtained = runOrCatch(r.expr(1L).div("a"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #50");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #50:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}

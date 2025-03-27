package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(3696, 3696, 3696);
	    String string0 = nextDate0.run(8, 31, 1805);
	    assertEquals("9/1/1805", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(1, 2021, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(6, 6, 2021);
	    assertEquals("6/7/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(1, 1, 2021);
	    assertEquals("1/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 31, 2007);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 30, 1827);
	    assertEquals("12/1/1827", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(2, 30, 2021);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-953), (-953), (-953));
	    String string0 = nextDate0.run((-953), 792, 792);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-3670), (-3670), (-3670));
	    String string0 = nextDate0.run((-3670), (-3670), (-3670));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 3);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1824);
	    assertEquals("5/6/1824", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(3696, 3696, 3696);
	    String string0 = nextDate0.run(31, 1805, 8);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1802, 1802, 1802);
	    String string0 = nextDate0.run(3, 3, 1802);
	    assertEquals("3/4/1802", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(3730, 3730, 3730);
	    String string0 = nextDate0.run(4, 4, 1808);
	    assertEquals("4/5/1808", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 2302, 2302);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(10, 12, 1819);
	    assertEquals("10/13/1819", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 2018);
	    assertEquals("12/13/2018", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), (-1), (-1));
	    String string0 = nextDate0.run(7, 7, 2007);
	    assertEquals("7/7/2007", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2018);
	    assertEquals("1/1/2019", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2007);
	    assertEquals("2/3/2007", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(2007, 2007, 2007);
	    String string0 = nextDate0.run(2, 29, 2007);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(2, 28, 1805);
	    assertEquals("3/1/1805", string0);
	}

}
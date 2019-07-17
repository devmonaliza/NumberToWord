package number.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import util.BritishNumberConverter;


/**
 * Unit test for simple App.
 */
public class AppTest
{

	private BritishNumberConverter numberUtil = null;

	@Before
	public void test() {
		numberUtil = new BritishNumberConverter();

	}

	@Test
	public void usecaseForFor1() {
		// 1
		Assert.assertEquals("ONE", numberUtil.convert(1));
	}

	@Test
	public void usecaseFor_10() {
		// 10
		Assert.assertEquals("TEN", numberUtil.convert(10));
	}

	@Test
	public void usecaseFor_56() {
		// 56
		Assert.assertEquals("FIFTY SIX", numberUtil.convert(56));
	}

	@Test
	public void usecaseFor_99() {
		// 99
		Assert.assertEquals("NINETY NINE", numberUtil.convert(99));
	}

	@Test
	public void usecaseFor_100() {
		// 100
		Assert.assertEquals("ONE HUNDRED", numberUtil.convert(100));
	}

	@Test
	public void usecaseFor_900() {
		// 900
		Assert.assertEquals("NINE HUNDRED", numberUtil.convert(900));
	}

	@Test
	public void usecaseFor_1000() {
		// 1000
		Assert.assertEquals("ONE THOUSAND", numberUtil.convert(1000));
	}

	@Test
	public void usecaseFor_10000() {
		// 10000
		Assert.assertEquals("TEN THOUSAND", numberUtil.convert(10000));
	}

	@Test
	public void usecaseFor_99999() {
		// 99999
		Assert.assertEquals("NINETY NINE THOUSAND NINE HUNDRED AND NINETY NINE", numberUtil.convert(99999));
	}

	@Test
	public void usecaseFor_100000() {
		Assert.assertEquals("ONE HUNDRED THOUSAND", numberUtil.convert(100000));
	}

	@Test
	public void usecaseFor_9999993() {
		// 100000
		Assert.assertEquals("NINE HUNDRED AND NINETY NINE THOUSAND NINE HUNDRED AND NINETY NINE",
				numberUtil.convert(999999));
	}

	@Test
	public void usecaseFor_1000000() {
		//
		Assert.assertEquals("ONE MILLION", numberUtil.convert(1000000));
	}

	@Test
	public void usecaseFor_9999999() {
		// 100000
		Assert.assertEquals("NINE MILLION NINE HUNDRED AND NINETY NINE THOUSAND NINE HUNDRED AND NINETY NINE",
				numberUtil.convert(9999999));
	}

	@Test
	public void usecaseFor_56945781() {
		// 56945781
		Assert.assertEquals("FIFTY SIX MILLION NINE HUNDRED AND FORTY FIVE THOUSAND SEVEN HUNDRED AND EIGHTY ONE",
				numberUtil.convert(56945781));
	}

	@Test
	public void usecaseFor_10000000() {
		// 10000000
		Assert.assertEquals("TEN MILLION", numberUtil.convert(10000000));
	}

	@Test
	public void usecaseFor_99999999() {
		// 99999999
		Assert.assertEquals("NINETY NINE MILLION NINE HUNDRED AND NINETY NINE THOUSAND NINE HUNDRED AND NINETY NINE",
				numberUtil.convert(99999999));
	}

	@Test
	public void usecaseFor_100000000() {
		Assert.assertEquals("ONE HUNDRED MILLION", numberUtil.convert(100000000));
	}

	@Test
	public void usecaseFor_999999999() {
		Assert.assertEquals(
				"NINE HUNDRED AND NINETY NINE MILLION NINE HUNDRED AND NINETY NINE THOUSAND NINE HUNDRED AND NINETY NINE",
				numberUtil.convert(999999999));
	}

	

}

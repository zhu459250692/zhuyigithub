package datastructure.sort;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class InsertSort {
	/*
	 * 第一个是哨兵
	 */
	// 泛型方法
	private Integer[] integers;

	public static void insertSort(Integer[] t) {
		int j;
		int k;
		Integer tmp;
		for (int i = 1; i < t.length; i++) {
			j = i - 1;
			k = i;
			// 这个先后位置不能打乱，先判断是否满足条件
			while (j >= 0 && t[k] < t[j]) {
				tmp = t[j];
				t[j] = t[k];
				t[k] = tmp;
				j--;
				k--;
			}
		}
	}

	@Before
	public void init() {
		// 0, 1, 2, 3, 4, 4, 5, 9, 22, 23, 33, 33, 34, 43, 56, 454, 999
		// 0, 1, 2, 3, 4, 4, 5, 9, 22, 23, 33, 33, 34, 43, 56, 454, 999
		Integer[] integers = { 22, 0, 33, 999, 1, 3, 9, 4, 56, 43, 23, 4, 34, 33, 2, 454, 5 };
		this.integers = integers;
	}

	@Test
	public void insertSortTest() {
		System.out.println(Arrays.toString(integers));
		InsertSort.insertSort(integers);
		System.out.println(Arrays.toString(integers));
	}

}

package com.raviray.hacks;

public class Solution {

	public String getDescription(String obj) {
		Integer b = 0;
		synchronized (b) {
			int a = b;
			a = a + b;
		}
		return obj;
	}

	static class Inner {
		private class Private {
			private String powerof2(int num) {
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}// end of Inner

	public static void main(String[] args) {
		Inner.Private o = (new Inner()).new Private();

		System.out.println(o.powerof2(16));
		System.out.println(o.powerof2(21));
	}

}
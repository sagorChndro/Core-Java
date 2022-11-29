package collection;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayToList2 {

	public static void main(String[] args) {
		String sArray[] = createArray();

		// convert array to list
		List<String> lList = Arrays.asList(sArray);

		System.out.println("-------Iterator Loop-------");
		long iteratorStartTime = new Date().getTime();
		System.out.println("Iterator star : " + iteratorStartTime);
		Iterator<String> ittr = lList.iterator();
		while (ittr.hasNext()) {
			String stemp = ittr.next();
		}
		long iteratorEndTime = new Date().getTime();
		System.out.println("Iterator end : " + iteratorEndTime);

		long iteratorDifferace = iteratorEndTime - iteratorStartTime;
		System.out.println("Iterator - Elapsed time in milisecond : " + iteratorDifferace);
		System.out.println("-------END-------");
		System.out.println();

		System.out.println("-------Enhanced For Loop-------");
		long advancedForLoopStart = new Date().getTime();
		System.out.println("Enhanced For Start : " + advancedForLoopStart);
		for (String ss : lList) {
			String s = ss;
		}
		long advancedForLoopEnd = new Date().getTime();
		System.out.println("Enhanced For End : " + advancedForLoopEnd);

		long advancedForLoopDifference = advancedForLoopEnd - advancedForLoopStart;

		System.out.println("Advance For - Elapsed time is millisecond :  " + advancedForLoopDifference);
		System.out.println("-------END-------");
		System.out.println();

		System.out.println("-------For loop-------");
		long normalForLoopStart = new Date().getTime();
		System.out.println("Conventional For Loop Start : " + normalForLoopStart);
		for (int i = 0; i < lList.size(); i++) {
			String stemp = (String) lList.get(i);
		}
		long normalForLoopEnd = new Date().getTime();
		System.out.println("Convantional For Loop End : " + normalForLoopEnd);

		long normalForLoopDifference = normalForLoopEnd - normalForLoopStart;
		System.out.println("Normal For- ELapsed time is milisecond : " + normalForLoopDifference);
		System.out.println("-------END-------");
		System.out.println();

		System.out.println("-------While Loop-------");
		long whileLoopStart = new Date().getTime();
		System.out.println("While Loop Start : " + whileLoopStart);
		int j = 0;
		while (j < lList.size()) {
			String w = lList.get(j);
			j++;
		}

		long whileLoopEnd = new Date().getTime();
		System.out.println("While Loop End : " + whileLoopEnd);

		long whileLoopDifference = whileLoopEnd - whileLoopStart;
		System.out.println("While Loop- Elapsed time in milisecond : " + whileLoopDifference);
		System.out.println("-------END-------");
	}

	static String[] createArray() {
		String sArray[] = new String[550000];
		for (int i = 0; i < 550000; i++) {
			sArray[i] = "Array" + i;
		}
		return sArray;
	}
}

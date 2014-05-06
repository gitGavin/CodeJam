package Practice2014;
import java.util.*;

public class MagicTrick {
	static String BAD_MAGICIAN = "Bad Magician!";
	static String VOLUNTEER_CHEATED = "Volunteer cheated!";

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numTestCases = scanner.nextInt();
		String[] result = new String[numTestCases];

		for (int testCase = 1; testCase <= numTestCases; testCase++){
			int firstTimeFound = scanner.nextInt();
			Set<Integer> firstSet = new HashSet<Integer>();
			for (int i = 1; i <= 4; i++)
				for (int j = 0; j < 4; j++)
					if (i == firstTimeFound)
						firstSet.add(scanner.nextInt());
					else scanner.nextInt();

			int secondTimeFound = scanner.nextInt();
			Set<Integer> secondSet = new HashSet<Integer>();
			for (int i = 1; i <= 4; i++)
				for (int j = 0; j < 4; j++)
					if (i == secondTimeFound)
						secondSet.add(scanner.nextInt());
					else scanner.nextInt();

			firstSet.retainAll(secondSet);
			
			if (firstSet.size() == 1)
				result[testCase-1] = firstSet.iterator().next().toString();
			else if (firstSet.size() == 0)
				result[testCase-1] = VOLUNTEER_CHEATED;
			else if (firstSet.size() > 1)
				result[testCase-1] = BAD_MAGICIAN;
		}

		for (int testCase = 1; testCase <= numTestCases; testCase++){
			System.out.printf("Case #%d: %s\n", testCase, result[testCase-1]);
		}
	}
}

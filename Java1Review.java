/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	
		
	}
public static double divide(double x, double y) {
			double z = x/y;
			return z;
}
public static int divide(int x, int y) {
	return  x/y;
	
}
public static boolean isDivisibleBy7(int x) {
	if ((x%7)==0) {
			return true;
	}
return false;
}

public static String main(String x) {
	
	return "Overloaded main method was passed "+ "\"" +x+ "\".";
	
}
public static int findMin(int x, int y, int z) {
	if(x<y) {
		if (x<z) {
			return x;
		}
	}
	if(y<x) {
		if (y<z) {
			return y;
		}
		}
	if(z<y) {
		if (z<x) {
			return z;
		}
	}
	return 0;
}
public static int findMin (int[] array) {
	int x  = array [0];
	for(int i = 0; i<array.length; i++) {
	if(array[i]<x) {
		x = array[i];
	}

	}
		return x;
	}
public static double average(int[] array) {
    if (array.length == 0) {
        return 0.0;
    }

    int sum = 0;
    for (int num : array) {
        sum += num;
    }

    return (double) sum / array.length;
}

public static void toLowerCase(String[] strings) {
    for (int i = 0; i < strings.length; i++) {
        strings[i] = strings[i].toLowerCase();
    }
}

public static String[] toLowerCaseCopy(String[] strings) {
    String[] result = new String[strings.length];
    for (int i = 0; i < strings.length; i++) {
        result[i] = strings[i].toLowerCase();
    }
    return result;
}

public static void removeDuplicates(int[] array) {
    for (int i = 0; i < array.length; i++) {
        int current = array[i];
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] == current) {
                array[j] = 0;
                array[i] = 0; // Set the current element to 0 as well
            }
        }
    }
}
}

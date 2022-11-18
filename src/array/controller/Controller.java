package array.controller;

public class Controller 
{
	public Controller()
	{
		
	}
	public void start()
	{
		sortStrings();
//		sortingStuff();
//		testAlgorithms();
//		int [] myNumbers = new int[5];
//		for ( int item : myNumbers)
//		{
//			System.out.println(item);
//		}
//		String [] myWords = new String [10];
//		
//		for (String word : myWords)
//		{
//			System.out.println(word);
//		}
//		workWithIntArray(myNumbers);
//		workWithIntArray(myNumbers, myNumbers[0]);
//		int[] nums = {1,2,3,4,5};
//		int value = 6;
//		changeIt(nums, value);
//		for (int k =0; k<nums.length; k++)
//		{
//			System.out.print(nums[k] + " ");
//		}
//		System.out.print(value);
	}
	
	private void incertionSort(String [] words)
	{
		for ( int outer = 1; outer < words.length; outer++)
		{
			String tested = words[outer];
			
			int inner = outer - 1;
			while (inner >= 0 && tested.compareTo(words[inner])< 0)
			{
				words[inner + 1] = words[inner];
				inner --;
				
			}
			words[inner + 1] = tested;
		}
	}
	
	private void incertionSort(Double [] numbers)
	{
		for ( int outer = 1; outer < numbers.length; outer++)
		{
			Double tested = numbers[outer];
			int inner = outer -1;
			while (inner >= 0 && tested < numbers[inner])
			{
				numbers[inner + 1] = numbers[inner];
				inner --;
			}
			numbers[inner + 1] = tested;
		}
	}
	
	private void sortStrings()
	{
		String [] words = {" hello ", " Comouter ", "science ", " at ", " CTEC ", " rocks ", " fr "};
		incertionSort(words);
		for (String word : words)
		{
			System.out.println(word);
		}
	}
	
	
	
	
	private void sortingStuff()
	{
		stringSort();
	}
	private void stringSort()
	{
		String [] myWords = {"Comouter", "science", "at", "CTEC", "rocks", "fr"};
		selectionSort(myWords);

//		System.out.print(myWords + "\n");
		for (String word : myWords)
		{
			System.out.print(word + " ");
		}
	}
	private void intSort() 
	{
		int [] small = {9, 4, 31, 123, 76, 0, -3, -10};
		int [] huge = new int [600_000];
		for (int index = 0; index < huge.length; index++)
		{
			int value = (int)(Math.random() * 365);
			huge[index] = value;
		}
		selectionSort(huge);
		selectionSort(small);
		for ( int number : small)
		{
			System.out.print(number + " ");
		}
		for ( int number : huge)
		{
			System.out.print(number + " ");
		}
	}
	private void selectionSort(String [] words)
	{
		for (int outerLoop = 0; outerLoop < words.length; outerLoop++)
		{
			int maxIndex = outerLoop;
			for (int inner = outerLoop + 1; inner < words.length; inner++)
			{
				if (words[inner].compareToIgnoreCase(words[maxIndex]) > 0)
				{
					maxIndex = inner;
				}
			}
			
			if (maxIndex != outerLoop)
			{
				swapItems(maxIndex, outerLoop, words);
			}
		}
	}
	private void swapItems(int firstIndex, int secondIndex, String [] source)
	{
		String temp = source [firstIndex];
		source [firstIndex] = source[secondIndex];
		source [secondIndex] = temp;
	}
	private void selectionSort(int [] data)
	{
		for (int outerLoop = 0; outerLoop < data.length; outerLoop++)
		{
			int minIndex = outerLoop;
			for ( int inner = outerLoop + 1; inner < data.length; inner++)
			{
				if (data[inner] < data[minIndex])
				{
					minIndex = inner;
				}
			}
			
			if (minIndex != outerLoop)
			{
				swapItems(minIndex, outerLoop, data);
			}
		}
	}
	private void swapItems(int firstIndex, int secondIndex, int [] source)
	{
		int thirdHand = source [firstIndex];
		source [firstIndex] = source[secondIndex];
		source [secondIndex] = thirdHand;
	}
	
	private int countByConditionDemo(int [] source)
	{
		int matching = 0;
		int index = 0;
		while(index < source.length) 
		{
			if (source [index] == 12345)
			{
				matching ++;
			}
			index++;
		}
		return matching;
	}
	private int countByConditionDemo(double [] source, double lowEnd, double highEnd)
	{
		int matching = 0;
		
		for ( int index = 0; index < source.length; index++)
		{
			if (source[index] >= lowEnd && source[index]<= highEnd)
			{
				matching ++;
			}
		}
		
		return matching;
	}
	private int summation(int [] source)
	{
		int total = 0;
		
		for ( int current : source)
		{
			total += current;
		}
		
		return total;
	}
	private double summation(double [] source)
	{
		double total = 0.0;
		
		for ( double current : source)
		{
			total += current;
		}
		
		return total;
	}
	private int findMin(int [] source)
	{
		int smallest = Integer.MAX_VALUE;
		for ( int currentValue : source)
		{
			if (currentValue < smallest)
			{
				smallest = currentValue;
			}
		}
		return smallest;
	}
	private int findMax(int [] source)
	{
		int largest = source[0];
		for(int index = 0; index < source.length; index++)
		{
			if(source[index] > largest)
			{
				largest = source[index];
			}
		}
		return largest;
	}
	private void testAlgorithms()
	{
			int [] data = new int [50000];
			for ( int index = 0; index < data.length; index++)
			{
				int randomValue = (int)(Math.random() * 50_000);
				data[index] = randomValue;
			}
			int count = countByConditionDemo(data);
			System.out.println("There were " + count + " equal to 12345, " + (double)(count) / data.length * 100 + "%" );

			double lowEnd = 0.12345;
			double highEnd = 0.2468;
			
			double [] doubleData = new double [100000];
			for (int index = 0; index < doubleData.length; index++)
			{
				doubleData[index] = Math.random();
			}
			count = countByConditionDemo(doubleData, lowEnd, highEnd);
			System.out.println("There were " + count + " in the range of " + lowEnd + " and " + highEnd + " which is: " + (double)(count) / doubleData.length * 100 + "%");
			
			int total = summation(data);
			double realTotal = summation(doubleData);
			int minValue = findMin(data);
			int maxValue = findMax(data);
			
			System.out.println("The double total is: " + realTotal);
			System.out.println("The int total is: " + total);
			System.out.println("The largest value was: " + maxValue + " and the smallest value was: " + minValue);
	}
	
	private void workWithIntArray(int[] numbers)
	{
		int favoriteNumber = 13;
		numbers [0] = favoriteNumber;
		numbers [numbers.length -1] = favoriteNumber;
		for(int index = 0; index < numbers.length; index++)
		{
			System.out.println("Index " + index + ": contains: " + numbers[index]);
		}
	}
	
	private void workWithIntArray(int [] numbers, int value)
	{
		value = -99;
		numbers [numbers.length / 2] = -99;
		System.out.println(numbers [numbers.length / 2]);
	}
	private void workingWithStringArray(String[] words)
	{
		String favoriteWord = "Monke";
		words [0] = favoriteWord;
		words [words.length -1] = favoriteWord;
		for(int index = 0; index < words.length; index++)
		{
			System.out.println("Index " + index + ": contains: " + words[index]);
		}
		
	}
	private void changeIt(int[] list, int num)
	{
		list = new int[5];
		num = 0;
		
		for(int j = 0; j<list.length; j++)
		{
			list[j] = 0;
		}
	}
	private void workingWithStringArray(String[] words, String value)
	{
		value = "Hello";
		words [words.length / 2] = "Hello";
		System.out.println(words [words.length / 2]);
	}
}

package array.controller;

public class Controller 
{
	public Controller()
	{
		
	}
	public void start()
	{
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
		int[] nums = {1,2,3,4,5};
		int value = 6;
		changeIt(nums, value);
		for (int k =0; k<nums.length; k++)
		{
			System.out.print(nums[k] + " ");
		}
		System.out.print(value);
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

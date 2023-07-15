package com.aurionpro.model;

import java.util.Arrays;

public class ArrayStatistics {

	public static void main(String[] args) {
		// Create an array to store the numbers
		int[] numbers = new int[args.length];

		// Convert command line arguments to integers and store in the array
		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}

		// Calculate statistics
		int sum = calculateSum(numbers);
		double average = calculateAverage(numbers);
		int min = calculateMin(numbers);
		int max = calculateMax(numbers);
		int median = calculateMedian(numbers);
		int[] frequency = calculateFrequency(numbers);

		// Print the statistics
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Median: " + median);
		System.out.println("Frequency:");

		for (int i = 0; i < frequency.length; i++) {
			System.out.println(i + ": " + frequency[i]);
		}
	}

	// Method to calculate the sum of the numbers
	public static int calculateSum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	// Method to calculate the average of the numbers
	public static double calculateAverage(int[] numbers) {
		int sum = calculateSum(numbers);
		return (double) sum / numbers.length;
	}

	// Method to find the minimum number in the array
	public static int calculateMin(int[] numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	// Method to find the maximum number in the array
	public static int calculateMax(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	// Method to calculate the median of the numbers
	public static int calculateMedian(int[] numbers) {
		int length = numbers.length;
		int[] sortedArray = numbers.clone();
		Arrays.sort(sortedArray);

		if (length % 2 == 0) {
			int mid = length / 2;
			return (sortedArray[mid - 1] + sortedArray[mid]) / 2;
		} else {
			int mid = length / 2;
			return sortedArray[mid];
		}
	}

	// Method to calculate the frequency of each number in the array
	public static int[] calculateFrequency(int[] numbers) {
		int[] frequency = new int[50];
		for (int number : numbers) {
			frequency[number]++;
		}
		return frequency;
	}

}

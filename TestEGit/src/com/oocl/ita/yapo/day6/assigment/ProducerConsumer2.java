package com.oocl.ita.yapo.day6.assigment;

import java.util.Scanner;

public class ProducerConsumer2 {

	public ProducerConsumer2() {
		// TODO Auto-generated constructor stub
	}

	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		Producer prod = new Producer();
		Consumer con = new Consumer();
		
		System.out.print("Enter the Number of Producers and Consumers: ");
	    Scanner input1 = new Scanner(System.in);
	    int x = input1.nextInt();
	    System.out.print("Enter the Value(s): ");
	    Scanner input2 = new Scanner(System.in);
	    int y = input2.nextInt();
		for(int a = 1; a<=x; a++) {
			for(int b = 0; b<y; b++) {
				prod.start();
				con.start();
			}
		}
	}

	private static class Producer extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock 1");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
				}
				System.out.println("Thread 1: Waiting for lock 2");
			}
//			
//			synchronized (lock2) {
//				System.out.println("Thread 1: Holding lock 1 & 2");
//			}
		}
	}

	private static class Consumer extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 2: Holding lock 2");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
	
				}
				System.out.println("Thread 2: Waiting for lock 1");
			}
	
//			synchronized (lock2) {
//				System.out.println("Thread 2: Holding lock 1 & 2");
//			}
		}
	}

	
}

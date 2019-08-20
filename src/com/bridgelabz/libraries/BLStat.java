package com.bridgelabz.libraries;

public class BLStat {
	 private BLStat() { }

	    /**
	     * Returns the maximum value in the specified array.
	     *
	     * @param  a the array
	     * @return the maximum value in the array {@code a[]};
	     *         {@code Double.NEGATIVE_INFINITY} if no such value
	     */
	    public static double max(double[] a) {
	        validateNotNull(a);

	        double max = Double.NEGATIVE_INFINITY;
	        for (int i = 0; i < a.length; i++) {
	            if (Double.isNaN(a[i])) return Double.NaN;
	            if (a[i] > max) max = a[i];
	        }
	        return max;
	    }

	    
	    public static double min(double[] a) {
	        validateNotNull(a);

	        double min = Double.POSITIVE_INFINITY;
	        for (int i = 0; i < a.length; i++) {
	            if (Double.isNaN(a[i])) return Double.NaN;
	            if (a[i] < min) min = a[i];
	        }
	        return min;
	    }

	   
	    public static double mean(double[] a) {
	        validateNotNull(a);

	        if (a.length == 0) return Double.NaN;
	        double sum = sum(a);
	        return sum / a.length;
	    }
	    
	    public static double var(double[] a) {
	        validateNotNull(a);

	        if (a.length == 0) return Double.NaN;
	        double avg = mean(a);
	        double sum = 0.0;
	        for (int i = 0; i < a.length; i++) {
	            sum += (a[i] - avg) * (a[i] - avg);
	        }
	        return sum / (a.length - 1);
	    }
	    
	    public static double varp(double[] a) {
	        validateNotNull(a);
	        if (a.length == 0) return Double.NaN;
	        double avg = mean(a);
	        double sum = 0.0;
	        for (int i = 0; i < a.length; i++) {
	            sum += (a[i] - avg) * (a[i] - avg);
	        }
	        return sum / a.length;
	    }
	    public static double stddev(double[] a) {
	        validateNotNull(a);
	        return Math.sqrt(var(a));
	    }
	    
	    private static double sum(double[] a) {
	        validateNotNull(a);
	        double sum = 0.0;
	        for (int i = 0; i < a.length; i++) {
	            sum += a[i];
	        }
	        return sum;
	    }

	    // throw an IllegalArgumentException if x is null
	    // (x is either of type double[] or int[])
	    private static void validateNotNull(Object x) {
	        if (x == null)
	            throw new IllegalArgumentException("argument is null");
	    }

	    // throw an exception unless 0 <= lo <= hi <= length
	    private static void validateSubarrayIndices(int lo, int hi, int length) {
	        if (lo < 0 || hi > length || lo > hi)
	            throw new IllegalArgumentException("subarray indices out of bounds: [" + lo + ", " + hi + ")");
	    }


	   /**
	     * Unit tests {@code StdStats}.
	     * Convert command-line arguments to array of doubles and call various methods.
	     *
	     * @param args the command-line arguments
	     */
	    public static void main(String[] args) {
	        double[] a = {2,4,5,7,8,3};
	        StdOut.printf("       min %10.3f\n", min(a));
	        StdOut.printf("      mean %10.3f\n", mean(a));
	        StdOut.printf("       max %10.3f\n", max(a));
	        StdOut.printf("    stddev %10.3f\n", stddev(a));
	        StdOut.printf("       var %10.3f\n", var(a));
	        StdOut.printf("      varp %10.3f\n", varp(a));
	    }
	
}

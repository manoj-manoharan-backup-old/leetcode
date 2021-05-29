//package leetcode;
//
//class XOfAKindInADeckOfCards {
//
//    public boolean hasGroupsSizeX(int[] deck) {
//
//        boolean canRun = true;
//        boolean hasGroupSize = false;
//
//        int[] count = new int[10000];
//
//        for (int d : deck) {
//            count[d]++;
//        }
//
//        int smallestNum = Integer.MAX_VALUE;
//
//        for (int d : deck) {
//            System.out.println(count[);
//            smallestNum = Math.min(smallestNum, count[d]);
//        }
//
//        System.out.println(smallestNum);
//
//        int moduleNum = getLeastDivisibleNumber(smallestNum);
//
//
//
//        if (moduleNum > 1) {
//            for (int d : deck) {
//
//                if (canRun) {
//                    if (count[d] > 0 && count[d] % moduleNum == 0) {
//                        hasGroupSize = true;
//                    } else {
//                        canRun = false;
//                        hasGroupSize = false;
//                    }
//                }
//            }
//        }
//
//        return hasGroupSize;
//    }
//
//    private int getLeastDivisibleNumber(int count) {
//
//        int ldn = 0;
//
//        if (count > 1) {
//            for (int i = 2; i <= 10000; i++) {
//                if (ldn <= 0 && count % i == 0) {
//                    ldn = i;
//                }
//            }
//        }
//
//        return ldn;
//    }
//}

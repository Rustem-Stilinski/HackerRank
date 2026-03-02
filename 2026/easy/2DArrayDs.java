 public static int hourglassSum(List<List<Integer>> arr) {
    int result  = Integer.MIN_VALUE;
    int hourglassSum = 0;
    for(int r=0; r<arr.size()-2;r++){
        for(int c =0; c<arr.get(0).size()-2;c++){
            hourglassSum = arr.get(r).get(c) + arr.get(r).get(c+1) 
            + arr.get(r).get(c+2) + arr.get(r+1).get(c+1) + arr.get(r+2).get(c) 
            + arr.get(r+2).get(c+1)+ arr.get(r+2).get(c+2);
            result = Math.max(result, hourglassSum);
        }
    }
    return result;
    }

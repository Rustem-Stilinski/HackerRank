  public static int countingValleys(int steps, String path) {
        int result = 0;
        int currentStep = 0;
        int currentLevel = 0;
        while(currentStep<steps){
            if(path.charAt(currentStep)=='D'){
                currentLevel-=1;
            }else if(path.charAt(currentStep)=='U'){
                currentLevel+=1;
                if(currentLevel==0){
                    result++;
                }
            }
            currentStep++;
        }
     return result;
    }

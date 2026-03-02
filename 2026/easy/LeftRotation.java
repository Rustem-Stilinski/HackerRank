    public static List<Integer> rotLeft(List<Integer> a, int d) {
    while(d>0){
        a.add(a.remove(0));
        d--;
    }
    return a;
    }

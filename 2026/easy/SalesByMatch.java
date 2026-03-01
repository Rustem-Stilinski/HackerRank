    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        int result = 0;
        
        for(int sock: ar){
           socks.merge(sock, 1, Integer::sum);
        }
        
        for(int sock: socks.values()){
            result+=sock/2;
        }    
        return result;
    }

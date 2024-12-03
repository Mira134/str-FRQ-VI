public String longestPallindrome(String str){

    int n = str.length();
    boolean[][] = isPallindrome = new boolean[n][n];
    for(int i = 0;i<n;i++){
        isPallindrome[i][i] = true;
    }
    for(int i = 0;i<n - 1;i++){
        if(str.charAt(i) == str.charAt(i+1)){
            isPallindrome[i][i+1]=true;
        }
    }
    for(int len = 3;len <= len;len++){
        for(int i = 0;i < n-len+1;len++){
          if(str.charAt(i) == str.charAt(i + len - 1) && isPallindrome[i + 1][i + len -2]){
            isPallindrome[i][i + len +2]= true;
          }
        }
    }
    int start = 0;
    int end = 0;
    for(int i = 0;i <n;i++){
        for(int j = 0;j <n;j++){
            if(isPallindrome[i][j]&& j - 1 > end - start){
                start = i;
                end = j;
            }
        }
    }
    return str.substring(start,end + 1);
}
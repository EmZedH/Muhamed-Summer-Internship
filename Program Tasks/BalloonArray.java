public class BalloonArray {


    public static void main(String[] args) {
        int red=0,blue=0,green=0;
        int flagR=0,flagB=0,flagG=0,i;

        char[] arr = {'B', 'G', 'B', 'R', 'G', 'R', 'B', 'G', 'R', 'R', 'B'};
        char[] outArr = arr;


        //loop to find number of each balloon and first occurrences of the balloons

        for(i=0;i< arr.length;i++){

            if(arr[i]=='B'){
                blue++;
                if(blue!=0)
                    flagB=i;
            }
            else if (arr[i]=='G') {
                green++;
                if(green!=0)
                    flagG=i;
            }
            else if (arr[i]=='R') {
                red++;
                if(flagR!=0)
                    flagR=i;
            }



        }

        //actual sorting takes place here

        i=0;
        if(flagB>flagG && flagB>flagR){
            if(flagG>flagR) {
                while (blue != 0) {
                    outArr[i] = 'B';
                    i++;
                    blue--;
                }
                while (green != 0) {
                    outArr[i] = 'G';
                    i++;
                    green--;
                }
                while (red != 0) {
                    outArr[i] = 'R';
                    i++;
                    red--;
                }
            }
            else{
                    while (blue != 0) {
                        outArr[i] = 'B';
                        i++;
                        blue--;
                    }
                while (red != 0) {
                    outArr[i] = 'R';
                    i++;
                    red--;
                }
                    while (green != 0) {
                        outArr[i] = 'G';
                        i++;
                        green--;
                    }
                }
        }
        else if (flagG > flagB && flagG > flagR) {
                    if (flagB > flagR) {
                        while (green != 0) {
                            outArr[i] = 'G';
                            i++;
                            green--;
                        }
                        while (blue != 0) {
                            outArr[i] = 'B';
                            i++;
                            blue--;
                        }
                        while (red != 0) {
                            outArr[i] = 'R';
                            i++;
                            red--;
                        }

                    } else {
                        while (green != 0) {
                            outArr[i] = 'G';
                            i++;
                            green--;
                        }
                        while (red != 0) {
                            outArr[i] = 'R';
                            i++;
                            red--;
                        }
                        while (blue != 0) {
                            outArr[i] = 'B';
                            i++;
                            blue--;
                        }
                    }

                } else if (flagR > flagB && flagR > flagG) {
                    if (flagB > flagG) {
                        while (red != 0) {
                            outArr[i] = 'R';
                            i++;
                            red--;
                        }
                        while (blue != 0) {
                            outArr[i] = 'B';
                            i++;
                            blue--;
                        }
                        while (green != 0) {
                            outArr[i] = 'G';
                            i++;
                            green--;
                        }

                    } else {
                        while (red != 0) {
                            outArr[i] = 'R';
                            i++;
                            red--;
                        }
                        while (green != 0) {
                            outArr[i] = 'G';
                            i++;
                            green--;
                        }
                        while (blue != 0) {
                            outArr[i] = 'B';
                            i++;
                            blue--;
                        }

                    }

            }
        for(i=0;i< outArr.length;i++)
            System.out.print(outArr[i]+" ");
        }
    }


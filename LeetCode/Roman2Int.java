/*  Convert a roman number into integer
    LeetCode

    info: I=1 V=5 X=10 L=50 C=100 D=500 M=1000 
    01/18/2019 */

import java.util.Scanner;

class Roman2Int{
    public static int value(char r){
        if(r=='I')  return 1;
        else if(r=='V') return 5;
        else if(r=='X') return 10;
        else if(r=='L') return 50;
        else if(r=='C') return 100;
        else if(r=='D') return 500;
        else if(r=='M') return 1000;
        else return -1;
    }

    public static int romanToInt(String s){
        int number=0,len=s.length();
        for(int i=0;i<len;++i){
            int s1=value(s.charAt(i));
            if(i+1<len){
                int s2=value(s.charAt(i+1));
                if(s1<s2){
                    number=number+s2-s1;
                    i++;
                }
                else
                    number+=s1;
            }else{
                number+=s1;
                // i++;
            }
        }
        return number;
    }

    public static int romanToInt2(String s){
        int number=0,len=s.length();
        char prev=' ';
        char arr[]=s.toCharArray();
        for(int i=0;i<len;++i){
            switch(arr[i]){
                case 'I': number+=1;
                break;
                case 'V':{
                    number+=5;
                    if(prev=='I')
                        number-=2;
                }
                break;
                case 'X':{
                    number+=10;
                    if(prev=='I')
                        number-=2;
                }
                break;
                case 'L':{
                    number+=50;
                    if(prev=='X')
                        number-=20;
                }
                break;
                case 'C':{
                    number+=100;
                    if(prev=='X')
                        number-=20;
                }
                break;
                case 'D':{
                    number+=500;
                    if(prev=='C')
                        number-=200;
                }
                break;
                case 'M':{
                    number+=1000;
                    if(prev=='C')
                        number-=200;
                }
                break;
            }
            prev=arr[i];
        }
        return number;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String roman=sc.next();
        System.out.println(romanToInt(roman));
        // delete(sc);
    }
}
/* LeetCode 13 Roman to Integer
    vishal
    02/07/2019 */
class Solution{
    public int romanToInt(String s){
        int number=0;
        int length=s.length();
        for(int i=0;i<length;++i){
            int a=value(s.charAt(i));
            if(i+1<length){
                int b=value(s.charAt(i+1));
                if(a<b){
                    number=number+b-a;
                    i++;
                }else
                number+=a;
            }
            number+=a;
        }
        return number;
    }

    public int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}
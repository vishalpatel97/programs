/* LeetCode 13 Roman to Integer
    vishal
    02/07/2019 */
class Take2{
    public int romanToInt(String s){
        int number=0;
        char prev=' ';
        for(int i=0;i<s.length();++i){
            if(i>0)
                prev=s.charAt(i-1);
            switch(s.charAt(i)){
                case 'I': number+=1;
                break;
                case 'V': {
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
        }
        return number;
    }
}
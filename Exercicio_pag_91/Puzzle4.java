public class Puzzle4 { 
    public static void main(String [] args) {
    Value [ ] values = new Value[6]; /*enter*/
    int number = 1; 
    int i = 0; 
    while(i < 6) 
    { 
      values [i] = new Value();
      values[i].intValue = number;
      /*
        enter
        enter
      */
      number = number * 10;  
      i = i + 1; /*enter*/
    }

    int result = 0;
    i = 6;
    while (i > 0) 
    {
      i = i - 1; /*enter*/
      result = result + values[i].doStuff(i) /*enter*/;
    }
    System.out.println("result " + result);
  }
}

class Value/*enter*/
{
  int intValue;
  /*enter*/  /*enter*/ public int doStuff(int factor /*enter*/)
  {
   if (intValue > 100)
   {
      /*enter*/
      return intValue * factor;            /*return intValue * (2 + factor);*/                 /*return intValue * (2 + factor);*/
   } else
     {
      return intValue * (5 - factor);
    }
  }
}

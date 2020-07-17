1   public class Driver  {
2     static void main(String[] argv)  {
3           int x, y;
4           x = 10;
5           Pig a;
6           Pig b = new Pig ("Jim",200);
7           a = new Pig ("Jack",100);
8           y = a.foo(b, x);
9       }
10  }

11  public class Pig   {
12      String name;
13      int weight;

14      public Pig(String name, int weight) {
15          this.name = name;
16          this.weight = weight;
17      }
    
18      public void setWeight(int weight) {
19         this.weight = weight;
20      }
    
21      public int foo(Pig b, int x)    {
22          setWeight(300);
    23          b.setWeight(400);
24        x = 20;
             return (x + 10);
        }
    
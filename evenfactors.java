class Evenfact {
public static void main(String[] args) {
int num=4,start=1,sum=0;
while(start<=num)
{
if(num%start==0 && start%2==0)
{
sum=sum+start;
}
start++;
}
System.out.println("sum of even factors = " +sum);
System.out.println("am program");
}
}

package Array2;

class Array3
{
public static void main(String[] args)
{
int[] marks = {99,97,100,96,100};
int check = 100;
int count = 0;
for(int i=0;i<marks.length;i++)
{
if(check==marks[i])
{
count++;
}
System.out.println(check);
}
}
}

import java.util.Scanner;
class Demo{
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        String msg="Welcome";
        System.out.println(msg);
        int n=obj.nextInt();
        int p=0,i=0;
        int []id=new int [n];
        String []name = new String[n];
        float []salary=new float[n];
        String []desg=new String[n];

       
       for(i=0;i<=n;i++){
        System.out.println("Enter no of id");
         id[i]=obj.nextInt();
        System.out.println("Enter no of name");
         name[i]=obj.next();
        System.out.println("Enter no of salary");
         salary[i]=obj.nextFloat();
        System.out.println("Enter no of desg");
         desg[i]=obj.next();
       }
       for(i=0;i<=p;i++)
{
    if(desg[i]=="manager"){
        System.out.println("5000 bonus");

    }
    else if(desg[i]=="developer"){
        System.out.println("3000 bonus");

    }
    else{
        System.out.println("1500 bonus");

    }
}
       
    }
}
 import java.io.FileOutputStream;
 import java.io.FileNotFoundException; 
 import java.io.PrintStream;
 import java.util.*;
 public class a{
 public static String counter(int a,int b){
         int y = 1;//��ʼֵȡ1
         for(int i=a;i>=1;i--){
             if(a%i==0&&b%i==0){
                 y = i;
                 break;
             }
         }
         int z = a/y;
         int m = b/y;
         if(z==0) {
             return "0";
         }
         return ""+z+"/"+m;
     }
     public static void main(String[] args)  {
         // TODO Auto-generated method stub
         int x,y,i,a1;
         int d1=0;
         String d = null;
         Scanner scan1=new Scanner(System.in);
         a1=scan1.nextInt();
 if(a1==1){ //4������
     
     
         System.out.println("��������Ŀ������");
         Scanner scan2=new Scanner(System.in);
         x=scan2.nextInt();
         
         
         int daan[]=new int [x];
         
         
         System.out.println("��������ֵ�ķ�Χ");
         y=scan2.nextInt();//yȡ10
         
         
         for(i=0;i<x;i++){
             int a=(int)(Math.random()*y);//�������һ��1-10������
             int b=(int)(Math.random()*y);//�������һ��1-10������
             int e=(int)(Math.random()*y);//�������һ��1-10������
             int c=(int)(Math.random()*3);//�������һ��1-4��������0��ʾ�ӷ���1��ʾ������2��ʾ�˷���3��ʾ����
             int f=(int)(Math.random()*3);//�������һ��1-4��������0��ʾ�ӷ���1��ʾ������2��ʾ�˷���3��ʾ����
             
             if(c==0&&f==0)
             {
                 d1=a+b+e;
                 System.out.print(a+"+"+b+"+"+e+"=       ");
             }
             
             
             if(c==0&&f==1)
             {
                 d1=a+b-e;
                 System.out.print(a+"+"+b+"-"+e+"=       ");
             }
             
             if(c==0&&f==2)
             {
                 d1=a+b*e;
                 System.out.print(a+"+"+b+"*"+e+"=       ");
             }
             
             if(c==0&&f==3)
             {
                 d1=a+b/e;
                 System.out.print(a+"+"+b+"/"+e+"=       ");
             }
             
             
             if(c==1&&f==0)
             {
                 d1=a-b+e;
                 System.out.print(a+"-"+b+"+"+e+"=       ");
             }
             
             
             if(c==1&&f==1)
             {
                 d1=a-b-e;
                 System.out.print(a+"-"+b+"-"+e+"=       ");
             }
             
             
             if(c==1&&f==2)
             {
                 d1=a-b*e;
                 System.out.print(a+"-"+b+"*"+e+"=       ");
             }
             
             
             if(c==1&&f==3)
             {
                 d1=a-b/e;
                 System.out.print(a+"-"+b+"/"+e+"=       ");
             }
             
             
             
             
             
             
             
             
             
             if(c==2&&f==0)
             {
                 d1=a*b+e;
                 System.out.print(a+"*"+b+"+"+e+"=       ");
             }
             
             
             if(c==2&&f==1)
             {
                 d1=a*b-e;
                 System.out.print(a+"*"+b+"-"+e+"=       ");
             }
             
             if(c==2&&f==2)
             {
                 d1=a*b*e;
                 System.out.print(a+"*"+b+"*"+e+"=       ");
             }
             
             
             if(c==2&&f==3)
             {
                 d1=a*b/e;
                 System.out.print(a+"*"+b+"/"+e+"=       ");
             }
             
             
             if(c==3&&f==0)
             {
                 d1=a/b+e;
                 System.out.print(a+"/"+b+"+"+e+"=       ");
             }
             
             if(c==3&&f==1)
             {
                 d1=a/b-e;
                 System.out.print(a+"/"+b+"-"+e+"=       ");
             }
             
             if(c==3&&f==2)
             {
                 d1=a/b*e;
                 System.out.print(a+"/"+b+"*"+e+"=       ");
             }
             
             if(c==3&&f==3)
             {
                 d1=a/b/e;
                 System.out.print(a+"/"+b+"/"+e+"=       ");
             }
             
             
             if((i+1)%10==0){//ÿ������Ϊһ��
                 System.out.println();
             }
             daan[i]=d1;  //�������Ľ��
         }
         System.out.println("�Ƿ���ʾ�𰸣���ʾ������1��");
         if(scan2.nextInt()==1){
             for(i=0;i<x;i++){
                 if((i+1)%10==0){//ÿ������Ϊһ��
                     System.out.println();}
             
             System.out.print(daan[i]+"     ");
             }
             
         } 
         
         }
 
 if(a1==2){
             int M,Z;
             System.out.println("��������Ŀ������");
             Scanner scan2=new Scanner(System.in);
             x=scan2.nextInt();
             
             String daan[]=new String [x];
             int x1,x2,B,m1,m2,x3,m3;
             
             
             System.out.println("�������ĸ��ֵ�ķ�Χ");
             B=scan2.nextInt();
             for(i=0;i<x;i++){
                 m1=1+(int)(Math.random()*B);//�������һ��С��B�ķ�ĸ
                 x1=1+(int)(Math.random()*m1);//����һ���ȷ�ĸС�ķ��ӣ�ʵ�������
                 m2=1+(int)(Math.random()*B);//�������һ��С��B�ķ�ĸ
                 x2=1+(int)(Math.random()*m2);//����һ���ȷ�ĸС�ķ��ӣ�ʵ�������
                 m3=1+(int)(Math.random()*B);//�������һ��С��B�ķ�ĸ
                 x3=1+(int)(Math.random()*m3);//����һ���ȷ�ĸС�ķ��ӣ�ʵ�������
                 int c=(int)(Math.random()*3);//���������
                 int f=(int)(Math.random()*3);//���������
                 
                 
                 if(c==0&&f==0){
                     Z=x1*m2*m3+x2*m1*m3+x3*m1*m2;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"+"+x2+"/"+m2+"+"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==0&&f==1){
                     Z=x1*m2*m3+x2*m1*m3-x3*m1*m2;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"+"+x2+"/"+m2+"-"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==0&&f==2){
                     Z=x1*m2*m3+x2*x3*m1;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"+"+x2+"/"+m2+"*"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==0&&f==3){
                     Z=x1*m2*x3+x2*m1*m3;
                     M=m1*m2*x3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"+"+x2+"/"+m2+"/"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==1&&f==0){
                     Z=x1*m2*m3-x2*m1*m3+x3*m1*m2;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"-"+x2+"/"+m2+"+"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==1&&f==1){
                     Z=x1*m2*m3-x2*m1*m3-x3*m1*m2;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"-"+x2+"/"+m2+"-"+x3+"/"+m3+"=       ");
                 }
                 
                 if(c==1&&f==2){
                     Z=x1*m2*m3-m1*x2*x3;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"-"+x2+"/"+m2+"*"+x3+"/"+m3+"=       ");
                 }
                 
                 if(c==1&&f==3){
                     Z=x1*m2*x3-m1*x2*m3;
                     M=m1*m2*x3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"-"+x2+"/"+m2+"/"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==2&&f==0){
                     Z=x1*x2*m3+m1*m2*x3;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"+"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==2&&f==1){
                     Z=x1*x2*m3-m1*m2*x3;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"-"+x3+"/"+m3+"=       ");
                 }
                 
                 if(c==2&&f==2){
                     Z=x1*x2*x3;
                     M=m1*m2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"*"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==2&&f==3){
                     Z=x1*x2*m3;
                     M=m1*m2*x3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"/"+x3+"/"+m3+"=       ");
                 }
                 
                 if(c==3&&f==0){
                     Z=m1*x2*x3+x1*m2*m3;
                     M=m1*x2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"+"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==3&&f==1){
                     Z=x1*m2*m3-m1*x2*x3;
                     M=m1*x2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"-"+x3+"/"+m3+"=       ");
                 }
                 
                 if(c==3&&f==2){
                     Z=x1*m2*x3;
                     M=m1*x2*m3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"*"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 if(c==3&&f==3){
                     Z=x1*m2*m3;
                     M=m1*x2*x3;
                     d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"/"+x3+"/"+m3+"=       ");
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 if(c==2){
                     Z=x1*x2;
                     M=m1*m2;
                     d=d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"=       ");
                 }
                 if(c==3){
                     Z=m1*x2;
                     M=m2*x1;
                    d=d=counter(Z,M);
                     System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"=       ");
                 }
                 
                 
                 if((i+1)%3==0){
                     System.out.println();
                 }
                 daan[i]=d;
                 
             }
             System.out.println("�Ƿ���ʾ�𰸣���ʾ������1��");
             if(scan2.nextInt()==1){
                 for(i=0;i<x;i++){
                 System.out.print(daan[i]+"     ");
                 }
             
             }
               
         }
 
         
     }
 
     }
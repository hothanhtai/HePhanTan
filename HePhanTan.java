/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hephantan;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class HePhanTan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
 //---------------Câu 1.1---------------------------------
//        byte data[] = new byte[100];
//System.out.print("Ban hay nhap mot so ky tu: ");
//Scanner sc = new Scanner(System.in);
//String c = sc.nextLine();
//System.in.read(data); // Doc chuoi byte da nhap vao data
//System.out.print(" Cac ky tu cua ban da nhap: ");
//for(int i=0; i < data.length; i++)
//System.out.print((char) data[i]);


//----------------------------Câu 1.3-----------------------------------
//char c;
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
//// Doc chuoi ky tu
//do
// {
//c = (char)br.read();
//System.out.println(c);
// } while(c != '.');

////----------------------------Câu 1.4-----------------------------------
//String c;
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//System.out.println("Nhap chuoi ky tu, gioi han stop");
//// Doc chuoi ky tu
//do
// {
//    c = br.readLine();
//    System.out.println(c);
// } while(!c.equals("stop"));

//--------------------Câu 1.5-----------------------
String str; FileWriter fw;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
 fw = new FileWriter("D:\\text (2).txt");
 }
catch(IOException exc)
{
System.out.println("Khong the mo file.");
return ;
}
System.out.println("Nhap ('stop' de ket thuc chuong trinh).");
do
{
System.out.print(": ");
str = br.readLine();
if(str.compareTo("stop") == 0) break;
str = str + "\r\n";
fw.write(str);
} while(str.compareTo("stop") != 0);
fw.close();
    
    }}
   

//this is that searching wala code
import java.util.*;
interface Searchable
{
	boolean search();
}


class Documents implements Searchable
{
	String sent="";
	String word="";

	Documents(String sent, String word)
	{
		this.sent=sent;
		this.word=word;
	}

	String strArr[]=sent.split(" "); //splits the sentence in an array of string based on spaces

	public boolean search()
	{
		for(int i=0; i<strArr.length; i++)
		{
			if(word.equals(strArr[i]) || (word+".").equals(strArr[i]) || (word+"?").equals(strArr[i]) || (word+",").equals(strArr[i]))
			{
				return true;
			}
		}
		return false;
	}	
}
class Webpage implements Searchable
{
	String sent="";
	String num="";

	Webpage(String sent, String num)
	{
		this.sent=sent;
		this.num=num;
	}

	String strArr[]=sent.split(" "); //splits the sentence in an array of string based on spaces

	public boolean search()
	{
		for(int i=0; i<strArr.length; i++)
		{
			if(num.equals(strArr[i]) || (num+".").equals(strArr[i]) || (num+"!").equals(strArr[i]) || (num+",").equals(strArr[i]))
			{
				return true;
			}
		}
		return false;
	}
}

class SearchingWalaCode
{
	static Scanner obj=new Scanner(System.in);
	public static void main(String args[])
	{

		System.out.println("This is a Code for SEARCHING and all");
		System.out.println("What Mode You Want? DOCUMENT or WEBPAGE");
		String rep=obj.nextLine();

		if(rep.equalsIgnoreCase("document") || rep.charAt(0)=='y' || rep.charAt(0)=='Y')
		{
			inDoc();
		}
		else
		{
			inWeb();
		}
	}

	private static void inDoc()
	{
		System.out.println("Kindly Enter the Document Below:- ");
		String doc=obj.nextLine();

		System.out.print("Enter the WORD you want to Search: ");
		String words=obj.nextLine();

		Webpage w=new Webpage(doc, words);
		boolean exists=w.search();

		if(exists)
		{
			System.out.println("FOUND");
		}
		else
		{
			System.out.println("NOT FOUND");
		}
	}
	private static void inWeb()
	{
		System.out.println("Kindly Enter the WebPage Below:- ");
		String doc=obj.nextLine();

		System.out.print("Enter the NUMBER you want to Search: ");
		String num=obj.nextLine();

		Webpage w=new Webpage(doc, num);
		boolean exists=w.search();

		if(exists)
		{
			System.out.println("FOUND");
		}
		else
		{
			System.out.println("NOT FOUND");
		}
	}

}
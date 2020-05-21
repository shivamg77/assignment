import java.util.Date;
import java.util.*;
import java.text.*;
 
public class missDate 
{
    public static LinkedList searchBetweenDates(Date  startDate, Date endDate) 
    {
        Date begin = new Date(startDate.getTime());
        LinkedList list = new LinkedList();
        list.add(new Date(begin.getTime()));
 
        while(begin.compareTo(endDate)<0)
        {
            begin = new Date(begin.getTime() );
            list.add(new Date(begin.getTime()));
        }
 
        return list;
    }
 
    public static void main(String[] args)   
    {   
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Start Date: yyyy-mm-dd");
        String begin =  input.nextLine();
 
        System.out.println("Enter the End Date: yyyy-mm-dd");
        String end = input.nextLine();
 
    LinkedList nList = searchBetweenDates(
        	    new SimpleDateFormat("yyyy-mm-dd").parse(begin),
        	    new SimpleDateFormat("yyyy-mm-dd").parse(end));
 
        String[] comboDates = new String[nList.size()];
        for(int i=0; i<nList.size(); i++)
            comboDates[i] = new SimpleDateFormat("yyyy-mm-dd ").format(nList.get(i));
 
        for(int i=0; i<comboDates.length; i++)
            System.out.println(comboDates[i]);
 
    }
}

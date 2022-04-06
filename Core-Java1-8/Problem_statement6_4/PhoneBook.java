package com.Project4;

/*Create a Phone Book having user interface like,
 * a.Add new phone book entry
 *  b.Search Phone Numberc.
 *  QuitOption 
 *  i: itallows add name and Phone no.Option 
 *  ii: it must take name as input from the user and based on that it should return phone No.Option 
 *  iii: will terminate the program.
 *  Note:Use HashMap to store phone book  entries*/
import java.util.*;
public class PhoneBook
{
    private List<Contact> phoneBook=new ArrayList<Contact>();
    public void setPhoneBook(List<Contact>obj)
    {
        phoneBook=obj;
    }
    public List<Contact>getPhoneBook()
    {
        return phoneBook;
    }
    public void addContact(Contact contactObj)
    {
        phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts()
    {
        return phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber)
    {
        Contact obj=new Contact();
        for(Contact obj1:phoneBook)
        {
            if(obj1.getPhoneNumber()==phoneNumber)
            {
                obj=obj1;
            }
        }
        return obj;
    }
    public boolean removeContact(long phoneNumber)
    {
        boolean f=false;
        for(Contact obj:phoneBook)
        {
            if(obj.getPhoneNumber()==phoneNumber)
            {
                f=true;
                phoneBook.remove(obj);
                break;
            }
        }
        return f;
    }
}
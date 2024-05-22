package schoolLibrary;

import java.util.ArrayList;
import java.util.Comparator;


public class Library {

	ArrayList<LibraryItem> list = new ArrayList<>();
    ArrayList<LibraryMember> members = new ArrayList<>();
	private String libraryName;

	
	
	public Library(ArrayList<LibraryItem> list, ArrayList<LibraryMember> members, String libraryName) {
		super();
		this.list = list;
		this.members = members;
		this.libraryName = libraryName;
	}

	public Library(String libraryName) {
		super();
		this.list = list;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName() {
		this.libraryName = libraryName;
	}

	public ArrayList<LibraryItem> getList() {
		return list;
	}

	public void setList(ArrayList<LibraryItem> list) {
		this.list = list;
	}

	public ArrayList<LibraryMember> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<LibraryMember> members) {
		this.members = members;
	}

	//methods
	//method to add book
	public void addBookItem(Book book) {
        list.add(book);
    }

	//methods to add cd
    public void addCDItem(CD cd) {
        list.add(cd);
    }
    
    //method to searcch for cd and book 
    public LibraryItem searchForItem(String title) {
        for (LibraryItem item : list) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
    
    
    //method to update the info of the book 
    public boolean updateBookItem(String oldTitle, String newTitle, int newNumberOfCopies) {
        for (LibraryItem item : list) {
            if (item instanceof Book && item.getTitle().equalsIgnoreCase(oldTitle)) {
                item.setTitle(newTitle);
                item.setNumberOfCopies(newNumberOfCopies);
                return true;
            }
        }
        return false;
    }
    
    //method to update the cd info
    public boolean updateCDItem(String oldTitle, String newTitle, int newNumberOfCopies) {
        for (LibraryItem item : list) {
            if (item instanceof CD && item.getTitle().equalsIgnoreCase(oldTitle)) {
                item.setTitle(newTitle);
                item.setNumberOfCopies(newNumberOfCopies);
                return true;
            }
        }
        return false;
    }

    //method to remove cd
    public boolean removeCDItem(String title) {
        for (int i = 0; i < list.size(); i++) {
            LibraryItem item = list.get(i);
            if (item instanceof CD && item.getTitle().equalsIgnoreCase(title)) {
                list.remove(i);
                return true; 
            }
        }
        return false; //no cd
    }

    //method to remove book
    public boolean removeBookItem(String title) {
        for (int i = 0; i < list.size(); i++) {
            LibraryItem item = list.get(i);
            if (item instanceof Book && item.getTitle().equalsIgnoreCase(title)) {
                list.remove(i);
                return true; 
            }
        }
        return false; // no book 
    }
    
    //method to add a member student or prefessor
    public void addLibraryMember(LibraryMember member) {
        System.out.println("Adding member: " + member.getName());
        members.add(member);
    }


    //method to borrow item book or cd
    public boolean borrowItem(String title, LibraryMember member) {
        LibraryItem item = searchForItem(title);
        if (item != null && item.getNumberOfCopies() > 0) {
            if (member instanceof Student && member.getNumberOfBorrowItems() >= 5) {
                System.out.println("Student has reached the limit of borrowable items.");
                return false;
            }
            member.borrowItem(item);
            item.setNumberOfCopies(item.getNumberOfCopies() - 1);
            return true;
        }
        return false;
    }
    
    //method to print the library report 
    public void libraryReport() {
        System.out.println("Library: " + libraryName);
        System.out.println("Total Items: " + list.size());
        for (LibraryItem item : list) {
            item.printInfo();
        }
    }
    
    //method to print information for members
    public void printMemberInfo() {
        for (LibraryMember member : members) {
            member.printInfo(); 
            System.out.println("Borrowed items:");
            LibraryItem[] items = member.getListOfLibraryItems();
            if (items != null) {
                for (LibraryItem item : items) {
                    if (item != null) { 
                        item.printInfo();
                    }
                }
            }
            System.out.println(); 
        }
    }
    
    public LibraryMember findMemberById(int id) {
        for (LibraryMember member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null; 
    }
    


    
    
}
    



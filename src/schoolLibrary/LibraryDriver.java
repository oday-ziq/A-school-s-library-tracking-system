package schoolLibrary;

import java.util.Scanner;

public class LibraryDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("bzuSchoolLibrary");

        while (true) {
            System.out.println("\nWelcome to the Library Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Add a CD");
            System.out.println("3. Update a book");
            System.out.println("4. Update a CD");
            System.out.println("5. Remove a book");
            System.out.println("6. Remove a CD");
            System.out.println("7. Generate library report");
            System.out.println("8. Add a member (Student or Professor)");
            System.out.println("9. Borrow an item");
            System.out.println("10. Generate library member report");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter author name (First Middle Last): ");
                    String authorName = scanner.nextLine();
                    System.out.println("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.println("Enter number of copies: ");
                    int copies = scanner.nextInt();
                    Book book = new Book(authorName, isbn);
                    book.setTitle(title);
                    book.setNumberOfCopies(copies);
                    library.addBookItem(book);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.println("Enter CD title: ");
                    title = scanner.nextLine();
                    System.out.println("Enter composer name (First Middle Last): ");
                    String composerName = scanner.nextLine();
                    System.out.println("Enter track number: ");
                    int trackNo = scanner.nextInt();
                    Name composer = new Name(composerName.split(" ")[0], composerName.split(" ")[1], composerName.split(" ")[2]);
                    CD cd = new CD(composer, trackNo);
                    cd.setTitle(title);
                    cd.setNumberOfCopies(1);
                    library.addCDItem(cd);
                    System.out.println("CD added successfully.");
                    break;
                case 3:
                    System.out.println("Enter the old title of the book to update: ");
                    String oldTitle = scanner.nextLine();
                    System.out.println("Enter new book title: ");
                    String newTitle = scanner.nextLine();
                    System.out.println("Enter new author name (First Middle Last): ");
                    String newAuthorName = scanner.nextLine();
                    System.out.println("Enter new ISBN: ");
                    String newIsbn = scanner.nextLine();
                    System.out.println("Enter new number of copies: ");
                    int newCopies = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left after nextInt

                    boolean bookUpdated = library.updateBookItem(oldTitle, newTitle, newCopies);
                    if (bookUpdated) {
                        Book bookToUpdate = (Book) library.searchForItem(newTitle); 
                        if (bookToUpdate != null) {
                            bookToUpdate.setAuthor(newAuthorName);
                            bookToUpdate.setISBN(newIsbn);
                        }
                        System.out.println("Book updated successfully.");
                    } else {
                        System.out.println("Book update failed. Make sure the old title is correct.");
                    }
                    break;

                case 4:
                    System.out.println("Enter the old title of the CD to update: ");
                    oldTitle = scanner.nextLine();
                    System.out.println("Enter new CD title: ");
                    newTitle = scanner.nextLine();
                    System.out.println("Enter new composer name (First Middle Last): ");
                    String newComposerName = scanner.nextLine();
                    System.out.println("Enter new track number: ");
                    int newTrackNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    boolean cdUpdated = library.updateCDItem(oldTitle, newTitle, 1); 
                    if (cdUpdated) {
                        CD cdToUpdate = (CD) library.searchForItem(newTitle); 
                        if (cdToUpdate != null) {
                            Name newComposer = new Name(newComposerName.split(" ")[0], newComposerName.split(" ")[1], newComposerName.split(" ")[2]);
                            cdToUpdate.setComposer(newComposer);
                            cdToUpdate.setTrackNo(newTrackNo);
                        }
                        System.out.println("CD updated successfully.");
                    } else {
                        System.out.println("CD update failed. Make sure the old title is correct.");
                    }
                    break;

                case 5:
                    System.out.println("Enter the title of the book to remove: ");
                    title = scanner.nextLine();
                    if (library.removeBookItem(title)) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book removal failed.");
                    }
                    break;
                case 6:
                    System.out.println("Enter the title of the CD to remove: ");
                    title = scanner.nextLine();
                    if (library.removeCDItem(title)) {
                        System.out.println("CD removed successfully.");
                    } else {
                        System.out.println("CD removal failed.");
                    }
                    break;
                case 7:
                    library.libraryReport();
                    break;
                case 8:
                    System.out.println("Enter 'S' for student, 'P' for professor: ");
                    String memberType = scanner.nextLine();
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left by nextInt()
                    System.out.println("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter Middle Name (or type 'none'): ");
                    String middleName = scanner.nextLine();
                    middleName = middleName.equals("none") ? "" : middleName; // If middle name is "none", set it to empty string
                    System.out.println("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    Name name = new Name(firstName, middleName, lastName);
                    System.out.println("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter Email Address: ");
                    String emailAddress = scanner.nextLine();
                    System.out.println("Enter Date of Birth (dd mm yyyy): ");
                    String[] dobParts = scanner.nextLine().split(" ");
                    NewDate dateOfBirth = new NewDate(dobParts[0], dobParts[1], dobParts[2]);
                    System.out.println("Enter Street: ");
                    String street = scanner.nextLine();
                    System.out.println("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.println("Enter Building Name: ");
                    String buildingName = scanner.nextLine();
                    System.out.println("Enter PO Box: ");
                    String poBox = scanner.nextLine();
                    System.out.println("Enter Country: ");
                    String country = scanner.nextLine();
                    Address address = new Address(street, city, buildingName, poBox, country);

                    if (memberType.equalsIgnoreCase("S")) {
                        System.out.println("Enter Student Number: ");
                        int studentNumber = scanner.nextInt();
                        System.out.println("Enter Average Mark: ");
                        double averageMark = scanner.nextDouble();
                        scanner.nextLine(); 
                        Student student = new Student(id, name, phoneNumber, emailAddress, dateOfBirth, address, studentNumber, averageMark);
                        library.addLibraryMember(student);
                        System.out.println("Student added successfully.");
                    } else if (memberType.equalsIgnoreCase("P")) {
                        System.out.println("Enter Salary: ");
                        int salary = scanner.nextInt();
                        scanner.nextLine();
                        Professor professor = new Professor(name, phoneNumber, emailAddress, dateOfBirth, address, salary);
                        library.addLibraryMember(professor);
                        System.out.println("Professor added successfully.");
                    } else {
                        System.out.println("Invalid member type entered.");
                    }
                    break;

                case 9:
                    System.out.println("Enter title of item to borrow: ");
                    String itemTitle = scanner.nextLine();
                    System.out.println("Enter ID of member borrowing the item: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();

                    LibraryMember member = library.findMemberById(memberId);
                    if (member == null) {
                        System.out.println("Member not found.");
                        break;
                    }

                    boolean borrowed = library.borrowItem(itemTitle, member);
                    if (borrowed) {
                        System.out.println("Item borrowed successfully.");
                    } else {
                        System.out.println("Failed to borrow item. It may not be available or the member has reached their borrowing limit.");
                    }
                    break;

                case 10:
                    System.out.println("Printing information for all library members:");
                    library.printMemberInfo();
                    break;

                    
                case 11:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                    
                
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 10.");
                    break;
            }
        }
    }
}

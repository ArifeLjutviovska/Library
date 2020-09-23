# Library

1.	http://localhost:8090/books
   List<Book> getBooks(); -> site knigi od .ttl bazata
  
   #Edna kniga ima:
   
private String Name;
private String Title;
private List<String> creators;
private List<String> contributors;
private String isbn;
private String BNB;
private String datePublished;

2.	http://localhost:8090/authors

    List<Author> getAuthors();->site avtori na knigite od .ttl bazata
  
   # Eden Avtor ima:

private String Name;
private List<String> hasCreated;
private String type; //organization or person

3.	http://localhost:8090/contributors
    
   List<Contributor> getContributors();->site sorabotnici na knigata od .ttl bazata

   #Eden sorabotnik ima:
   
private String Name;
private List<String> hasContributed;
private String type; //organization or person

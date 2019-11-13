
public class book
{
    private String title;
    private String author;
    private int pages;
    
    public book(String ti, String au, int pa)
    {
        title = ti;
        author = au;
        pages = pa;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return pages;
    }
    public String setTitle(String ti)
    {
        title = ti;
        return title;
    }
    public String setAuthor(String au)
    {
        author = au;
        return author;
    }
    public int setPages(int pa)
    {
        pages = pa;
        return pages;
    }
}

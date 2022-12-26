
public class scriptwriter {
    private boolean writing;
    public boolean isWriting()
    {
        return writing;
    }
    public void  start_writing()
    {
        System.out.println("writing in progress...");
        writing=false;
    }
    public void finish_writing()
    {
        System.out.println("writing ended");
        writing=true;
    }
}

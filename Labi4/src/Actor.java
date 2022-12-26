public class Actor
{
    private boolean learning;
    public boolean isLearning()
    {
        return learning;
    }
    public void role(scriptwriter scriptwriter)
    {
        if (scriptwriter.isWriting()){
            System.out.println("Actor is learning");
            learning=true;
        }
        else {
            System.out.println("Actor is waiting");
            learning=false;
        }
    }
    public void finish_learning()
    {
        System.out.println("Actor ended learning and ready to play");
        learning=true;
    }
}

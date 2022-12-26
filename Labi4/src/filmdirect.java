public class filmdirect
{
    private boolean filming;
    public boolean isFilming()
    {
        return filming;
    }
    public void film(Actor actor)
    {
        if (actor.isLearning()){
            System.out.println("Director is filming");
            filming=true;
        }
        else {
            System.out.println("Director is waiting");
            filming=false;
        }
    }
    public void finish_filming()
    {
        System.out.println("film is ended and ready to be edit");
        filming=true;
    }
}

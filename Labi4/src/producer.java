public class producer
{
    public static void main(String[] args)
    {
        Job Herald = new Job();
        Herald.dojob();
        scriptwriter scriptwriter= new scriptwriter();
        scriptwriter.start_writing();
        Actor actor= new Actor();
        actor.role(scriptwriter);
        scriptwriter.finish_writing();
        actor.role(scriptwriter);
        filmdirect direct= new filmdirect();
        direct.film(actor);
        actor.finish_learning();
        direct.film(actor);
        videoedit editor= new videoedit();
        editor.editing(direct);
        direct.finish_filming();
        editor.editing(direct);
        Producerr produce = new Producerr();
        produce.lauching(editor);
        editor.finish_editing();
        produce.lauching(editor);
    }
}

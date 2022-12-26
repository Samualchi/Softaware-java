public class videoedit
{
    private boolean edit;
    public boolean isEdit()
    {
        return edit;
    }
    public void editing(filmdirect filmdirect)
    {
        if (filmdirect.isFilming()){
            System.out.println("Editor doing montage");
            edit=true;
        }
        else {
            System.out.println("Editor is waiting");
            edit=false;
        }
    }
    public void finish_editing()
    {
        System.out.println("editing ended and sent to producer");
        edit=false;
    }
}

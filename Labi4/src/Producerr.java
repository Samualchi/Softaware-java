public class Producerr
{
    private boolean launch;
    public boolean isLaunch()
    {
        return launch;
    }
    public void  lauching(videoedit videoedit) {
        if (videoedit.isEdit()) {
            System.out.println("waiting for finish the editing");
            launch = false;
        } else {
            System.out.println("We can launch");
            launch = true;
        }
    }
}

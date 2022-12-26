public class ColaAdvertising implements Advertising
{
    private String url;
    public ColaAdvertising(String url)
    {
        this.url=url;
        load();
    }

    private void load()
    {
        System.out.println("Opening Cola ads from "+url);
    }

    @Override
    public void showAd()
    {
        System.out.println("Showing ads from "+url);
    }
}

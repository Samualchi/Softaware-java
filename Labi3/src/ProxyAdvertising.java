public class ProxyAdvertising implements Advertising
{
    private String url;
    private ColaAdvertising colaAdvertising;

    public ProxyAdvertising(String url)
    {
        this.url=url;
    }

    @Override
    public void showAd() {
        if (colaAdvertising==null)
        {
            colaAdvertising=new ColaAdvertising(url);
        }
        colaAdvertising.showAd();
    }
}

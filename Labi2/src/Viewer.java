public class Viewer implements Observer {
    private String name;

    public Viewer(String name, Observable o) {
        this.name = name;
        o.registerObserver(this);
        o.removeObserver(this);
    }

    @Override
    public void update(String news) {
        System.out.println(name + " saw news " + news);
    }
}

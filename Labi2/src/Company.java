import java.util.ArrayList;
import java.util.List;

public class Company implements Observable {
    private List<Observer> subs;
    private String newsComp;

    public Company() {
        subs = new ArrayList<>();
    }

    public void setNewsComp(String news) {
        this.newsComp = news;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        subs.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subs.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : subs)
            o.update(newsComp);
    }
}

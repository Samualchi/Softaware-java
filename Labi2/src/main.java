import java.util.Scanner;
import java.io.*;

public class main {

    public static void main(String[] args) {
        var Academy = new Company();

        new Viewer("Maikle Mel", Academy);
        Academy.setNewsComp("Test news hahahahaha");
        System.out.println("Welcome to Academy!\n What do you want to check?\n 1.Subs 2.News 3.Quit");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int choice = a.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("What do you want to do?\n 5.Added\n 6.Delete(Test Bot is here)\n 7.Quit(Will Quit from program as well)");
                int ch2 = a.nextInt();
                switch (ch2) {
                    case 5: {
                        String name = b.nextLine();
                        new Viewer(" " + name, Academy);
                        System.out.println(name + "was added to news updates");
                        Academy.setNewsComp("Test news");
                        break;
                    }
                    case 6: {
                        String name = b.nextLine();
                        new Viewer("Bot Wow", Academy);
                        Observer name2 = new Viewer(" " + name, Academy);
                        Academy.removeObserver(name2);
                        break;
                    }
                    case 7: {
                        System.exit(0);
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("What do you want to do?\n 8.Added 9.Quit");
                int ch2 = a.nextInt();
                switch (ch2) {
                    case 8: {
                        String news = b.nextLine();
                        Academy.setNewsComp(" "+news);
                        break;
                    }
                    case 9:{
                        System.exit(0);
                        break;
                    }
                }
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
        }
    }
}

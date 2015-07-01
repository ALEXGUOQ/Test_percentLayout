package halcon.com.xiaoenai.Home.Model;

/**
 * 作者：Administrator on 2015/6/30 16:18
 * 工程名：Xiaoenai
 */
public class HomeItem {
    private int icon;
    private String title;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HomeItem(){

    }

    public HomeItem(String title) {
        this.title = title;
    }

    public HomeItem(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }
}

package IOC;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by zcy on 2017/5/28.
 */
public class Bean {
    private String arr[];
    private List list;
    private Map map;
    private Set set;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

}

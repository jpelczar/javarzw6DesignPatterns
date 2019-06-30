package prototype;

import java.util.Date;

public class User implements Cloneable {

    private String name;
    private Date createDate;

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

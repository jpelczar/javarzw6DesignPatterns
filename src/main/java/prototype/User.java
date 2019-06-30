package prototype;

import java.util.Date;

public class User implements Cloneable {

    private String name;
    private Date createDate;

    @Override
    protected User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        Date copyDate = new Date();
        copyDate.setTime(createDate.getTime());
        user.setCreateDate(copyDate);

        return user;
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

package observer;

public class Button {

    private OnClickListener onClickListener;

    public void setListener(OnClickListener ocl) {
        this.onClickListener = ocl;
    }

    public void removeListener() {
        this.onClickListener = null;
    }

    public void click() {
        if (onClickListener != null) {
            onClickListener.onClick();
        }
    }
}

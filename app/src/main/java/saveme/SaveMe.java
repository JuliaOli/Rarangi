package saveme;

import android.content.Context;

/**
 * Created by W8 on 17/10/2016.
 */

public class SaveMe {

    public static SaveMe saveMe = null;
    public String superString;
    Context context;

    private SaveMe(Context context) {
        this.context = context;
    }

    public static SaveMe getInstance(Context context){

        if (saveMe == null){
            saveMe = new SaveMe(context);
        }
        return saveMe;

    }

    public void setSuperString(String superString) {
        this.superString = superString;
    }


}

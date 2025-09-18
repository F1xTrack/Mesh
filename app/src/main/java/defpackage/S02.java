package defpackage;

import android.graphics.PorterDuff;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class S02 {
    public static List a() {
        return (List) C6457pR.b.getValue();
    }

    public static boolean b(View view) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

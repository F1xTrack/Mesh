package p000;

import android.graphics.PorterDuff;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class S02 {
    /* renamed from: a */
    public static List m7145a() {
        return (List) C6617pR.f40074b.getValue();
    }

    /* renamed from: b */
    public static boolean m7146b(View view) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m7147c(int i, PorterDuff.Mode mode) {
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

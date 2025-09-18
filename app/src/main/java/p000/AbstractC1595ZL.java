package p000;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: ZL */
/* loaded from: classes.dex */
public abstract class AbstractC1595ZL {

    /* renamed from: a */
    public static final Field f14861a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f14861a = declaredField;
    }
}

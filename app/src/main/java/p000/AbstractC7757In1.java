package p000;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: In1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7757In1 {

    /* renamed from: a */
    public static final Field f5150a;

    /* renamed from: b */
    public static final Field f5151b;

    /* renamed from: c */
    public static final Field f5152c;

    /* renamed from: d */
    public static final boolean f5153d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f5150a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f5151b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f5152c = declaredField3;
            declaredField3.setAccessible(true);
            f5153d = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }
}

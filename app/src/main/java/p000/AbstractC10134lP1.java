package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: lP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10134lP1 {
    /* renamed from: a */
    public static Object m22424a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC4009ek.m18021a(bundle, str, C0507I2.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0507I2.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* renamed from: b */
    public static final Class m22425b(ClassLoader classLoader, String str) {
        O90.m5968f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

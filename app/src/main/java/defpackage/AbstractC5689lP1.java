package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: lP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5689lP1 {
    public static Object a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC3637ek.a(bundle, str, I2.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (I2.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final Class b(ClassLoader classLoader, String str) {
        O90.f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

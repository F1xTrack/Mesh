package p000;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: ek */
/* loaded from: classes.dex */
public abstract class AbstractC4009ek {
    /* renamed from: a */
    public static <T> T m18021a(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }

    /* renamed from: b */
    public static <T> T[] m18022b(Bundle bundle, String str, Class<T> cls) {
        return (T[]) bundle.getParcelableArray(str, cls);
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m18023c(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* renamed from: d */
    public static <T extends Serializable> T m18024d(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getSerializable(str, cls);
    }

    /* renamed from: e */
    public static <T> SparseArray<T> m18025e(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }
}

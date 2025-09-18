package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public abstract class RE {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final C3536eC0 a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new C3536eC0(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, a, -1);
    }
}

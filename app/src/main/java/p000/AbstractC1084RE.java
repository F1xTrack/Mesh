package p000;

import android.util.SparseIntArray;

/* renamed from: RE */
/* loaded from: classes.dex */
public abstract class AbstractC1084RE {

    /* renamed from: a */
    public static final SparseIntArray f10065a = new SparseIntArray(0);

    /* renamed from: a */
    public static final C9211eC0 m6923a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new C9211eC0(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, f10065a, -1);
    }
}

package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Zm */
/* loaded from: classes2.dex */
public final class C4982Zm {

    /* renamed from: c */
    public static final int[] f31228c = {0, 1, 2, 3};

    /* renamed from: a */
    public final SparseArray f31229a = new SparseArray();

    /* renamed from: b */
    public int f31230b = 0;

    public C4982Zm(int[] iArr) {
        for (int i : iArr) {
            this.f31229a.put(i, new HashMap());
        }
    }
}

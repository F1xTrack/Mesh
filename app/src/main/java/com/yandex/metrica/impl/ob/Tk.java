package com.yandex.metrica.impl.ob;

import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public class Tk implements InterfaceC3084sl {
    private final SparseIntArray a = new SparseIntArray();
    private final int b;

    public Tk(int i) {
        this.b = i;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3084sl
    public void a(Wl wl) {
        SparseIntArray sparseIntArray = this.a;
        int i = wl.d;
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
    }

    public int a(int i) {
        return this.b - Integer.valueOf(this.a.get(i)).intValue();
    }
}

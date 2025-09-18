package com.yandex.metrica.impl.p022ob;

import android.util.SparseIntArray;

/* renamed from: com.yandex.metrica.impl.ob.Tk */
/* loaded from: classes2.dex */
public class C2961Tk implements InterfaceC3605sl {

    /* renamed from: a */
    private final SparseIntArray f22413a = new SparseIntArray();

    /* renamed from: b */
    private final int f22414b;

    public C2961Tk(int i) {
        this.f22414b = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3605sl
    /* renamed from: a */
    public void mo14958a(C3037Wl c3037Wl) {
        SparseIntArray sparseIntArray = this.f22413a;
        int i = c3037Wl.f22710d;
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
    }

    /* renamed from: a */
    public int m15200a(int i) {
        return this.f22414b - Integer.valueOf(this.f22413a.get(i)).intValue();
    }
}

package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.oc */
/* loaded from: classes2.dex */
public class C3492oc implements InterfaceC3466nc {

    /* renamed from: a */
    private final int f24374a;

    /* renamed from: b */
    private final int f24375b;

    /* renamed from: c */
    private int f24376c = 0;

    public C3492oc(int i, int i2) {
        this.f24374a = i;
        this.f24375b = i2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3466nc
    /* renamed from: a */
    public int mo16485a() {
        return this.f24375b;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3466nc
    /* renamed from: b */
    public boolean mo16486b() {
        int i = this.f24376c;
        this.f24376c = i + 1;
        return i < this.f24374a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3466nc
    /* renamed from: c */
    public void mo16487c() {
        this.f24376c = 0;
    }
}

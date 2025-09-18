package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2976oc implements InterfaceC2951nc {
    private final int a;
    private final int b;
    private int c = 0;

    public C2976oc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2951nc
    public int a() {
        return this.b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2951nc
    public boolean b() {
        int i = this.c;
        this.c = i + 1;
        return i < this.a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2951nc
    public void c() {
        this.c = 0;
    }
}

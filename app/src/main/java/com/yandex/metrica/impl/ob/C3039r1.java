package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3039r1 extends S2 {
    private final com.yandex.metrica.y c;

    public C3039r1(Y0 y0, com.yandex.metrica.y yVar) {
        super(y0, yVar.apiKey);
        this.c = yVar;
    }

    @Override // com.yandex.metrica.impl.ob.S2
    public InterfaceC2641b1 a() {
        return this.b.b().a(this.c);
    }
}

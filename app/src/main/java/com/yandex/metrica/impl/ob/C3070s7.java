package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.s7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3070s7 implements InterfaceC2725ea<C2747f7, Jf> {
    private final C3045r7 a;
    private final C3095t7 b;

    public C3070s7() {
        this(new C3045r7(new D7()), new C3095t7());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2747f7 a(Jf jf) {
        throw new UnsupportedOperationException();
    }

    public C3070s7(C3045r7 c3045r7, C3095t7 c3095t7) {
        this.a = c3045r7;
        this.b = c3095t7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Jf b(C2747f7 c2747f7) {
        Jf jf = new Jf();
        jf.b = this.a.b(c2747f7.a);
        String str = c2747f7.b;
        if (str != null) {
            jf.c = str;
        }
        jf.d = this.b.a(c2747f7.c);
        return jf;
    }
}

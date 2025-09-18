package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.s7 */
/* loaded from: classes2.dex */
public class C3591s7 implements InterfaceC3230ea<C3253f7, C2707Jf> {

    /* renamed from: a */
    private final C3565r7 f24653a;

    /* renamed from: b */
    private final C3617t7 f24654b;

    public C3591s7() {
        this(new C3565r7(new C2549D7()), new C3617t7());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3253f7 mo13846a(C2707Jf c2707Jf) {
        throw new UnsupportedOperationException();
    }

    public C3591s7(C3565r7 c3565r7, C3617t7 c3617t7) {
        this.f24653a = c3565r7;
        this.f24654b = c3617t7;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2707Jf mo13847b(C3253f7 c3253f7) {
        C2707Jf c2707Jf = new C2707Jf();
        c2707Jf.f21552b = this.f24653a.mo13847b(c3253f7.f23423a);
        String str = c3253f7.f23424b;
        if (str != null) {
            c2707Jf.f21553c = str;
        }
        c2707Jf.f21554d = this.f24654b.m15523a(c3253f7.f23425c);
        return c2707Jf;
    }
}

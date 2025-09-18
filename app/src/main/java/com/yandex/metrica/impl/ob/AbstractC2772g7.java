package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.g7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2772g7 implements InterfaceC2822i7 {
    private final a a;
    private final com.yandex.metrica.r b;
    private final K0 c;

    /* renamed from: com.yandex.metrica.impl.ob.g7$a */
    public interface a {
        boolean a(Throwable th);
    }

    public AbstractC2772g7(a aVar, com.yandex.metrica.r rVar, K0 k0) {
        this.a = aVar;
        this.c = k0;
    }

    public abstract void a(C2996p7 c2996p7);

    @Override // com.yandex.metrica.impl.ob.InterfaceC2822i7
    public void a(Throwable th, C2722e7 c2722e7) {
        if (this.a.a(th)) {
            a(C3021q7.a(th, c2722e7, null, this.c.a(), this.c.b()));
        }
    }
}

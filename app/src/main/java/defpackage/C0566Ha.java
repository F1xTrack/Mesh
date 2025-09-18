package defpackage;

import java.util.Objects;

/* renamed from: Ha */
/* loaded from: classes.dex */
public final class C0566Ha implements InterfaceC3296cx0 {
    public final /* synthetic */ C6257oO a;
    public final /* synthetic */ C0644Ia b;

    public C0566Ha(C0644Ia c0644Ia, C6257oO c6257oO) {
        this.b = c0644Ia;
        this.a = c6257oO;
    }

    @Override // defpackage.InterfaceC3296cx0
    public final void a(Object obj) {
        EnumC7465uj enumC7465uj = (EnumC7465uj) obj;
        Objects.requireNonNull(enumC7465uj);
        C0644Ia c0644Ia = this.b;
        if (c0644Ia.l == this.a) {
            Objects.toString(c0644Ia.h);
            enumC7465uj.toString();
            AbstractC0759Jm0.f("AudioSource");
            if (c0644Ia.h != enumC7465uj) {
                c0644Ia.h = enumC7465uj;
                c0644Ia.e();
            }
        }
    }

    @Override // defpackage.InterfaceC3296cx0
    public final void onError(Throwable th) {
        C0644Ia c0644Ia = this.b;
        if (c0644Ia.l == this.a) {
            ExecutorC5715lY0 executorC5715lY0 = c0644Ia.j;
            C0999Mo1 c0999Mo1 = c0644Ia.k;
            if (executorC5715lY0 == null || c0999Mo1 == null) {
                return;
            }
            executorC5715lY0.execute(new RunnableC6769r4(c0999Mo1, 6, th));
        }
    }
}

package p000;

import java.util.Objects;

/* renamed from: Ha */
/* loaded from: classes.dex */
public final class C0478Ha implements InterfaceC9049cx0 {

    /* renamed from: a */
    public final /* synthetic */ C6549oO f4352a;

    /* renamed from: b */
    public final /* synthetic */ C0541Ia f4353b;

    public C0478Ha(C0541Ia c0541Ia, C6549oO c6549oO) {
        this.f4353b = c0541Ia;
        this.f4352a = c6549oO;
    }

    @Override // p000.InterfaceC9049cx0
    /* renamed from: a */
    public final void mo2107a(Object obj) {
        EnumC6967uj enumC6967uj = (EnumC6967uj) obj;
        Objects.requireNonNull(enumC6967uj);
        C0541Ia c0541Ia = this.f4353b;
        if (c0541Ia.f5004l == this.f4352a) {
            Objects.toString(c0541Ia.f5000h);
            enumC6967uj.toString();
            AbstractC7806Jm0.m4412f("AudioSource");
            if (c0541Ia.f5000h != enumC6967uj) {
                c0541Ia.f5000h = enumC6967uj;
                c0541Ia.m3942e();
            }
        }
    }

    @Override // p000.InterfaceC9049cx0
    public final void onError(Throwable th) {
        C0541Ia c0541Ia = this.f4353b;
        if (c0541Ia.f5004l == this.f4352a) {
            ExecutorC10151lY0 executorC10151lY0 = c0541Ia.f5002j;
            C7967Mo1 c7967Mo1 = c0541Ia.f5003k;
            if (executorC10151lY0 == null || c7967Mo1 == null) {
                return;
            }
            executorC10151lY0.execute(new RunnableC6720r4(c7967Mo1, 6, th));
        }
    }
}

package p000;

/* renamed from: H */
/* loaded from: classes.dex */
public final class RunnableC0441H implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f3977a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC4228iD f3978b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3979c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0504I f3980d;

    public RunnableC0441H(AbstractC0504I abstractC0504I, boolean z, InterfaceC4228iD interfaceC4228iD, boolean z2) {
        this.f3980d = abstractC0504I;
        this.f3977a = z;
        this.f3978b = interfaceC4228iD;
        this.f3979c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f3977a;
        AbstractC0504I abstractC0504I = this.f3980d;
        InterfaceC4228iD interfaceC4228iD = this.f3978b;
        if (z) {
            interfaceC4228iD.onFailure(abstractC0504I);
        } else if (this.f3979c) {
            interfaceC4228iD.onCancellation(abstractC0504I);
        } else {
            interfaceC4228iD.onNewResult(abstractC0504I);
        }
    }
}

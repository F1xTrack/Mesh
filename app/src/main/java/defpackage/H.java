package defpackage;

/* loaded from: classes.dex */
public final class H implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ InterfaceC4302iD b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ I d;

    public H(I i, boolean z, InterfaceC4302iD interfaceC4302iD, boolean z2) {
        this.d = i;
        this.a = z;
        this.b = interfaceC4302iD;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        I i = this.d;
        InterfaceC4302iD interfaceC4302iD = this.b;
        if (z) {
            interfaceC4302iD.onFailure(i);
        } else if (this.c) {
            interfaceC4302iD.onCancellation(i);
        } else {
            interfaceC4302iD.onNewResult(i);
        }
    }
}

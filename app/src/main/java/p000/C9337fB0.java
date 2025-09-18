package p000;

/* renamed from: fB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9337fB0 implements InterfaceC6650py {

    /* renamed from: a */
    public final /* synthetic */ C4027f1 f27105a;

    public C9337fB0(C4027f1 c4027f1) {
        this.f27105a = c4027f1;
    }

    @Override // p000.InterfaceC6650py
    /* renamed from: b */
    public final /* synthetic */ void mo3020b(Object obj) throws InterruptedException {
        this.f27105a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC6650py) || !(obj instanceof C9337fB0)) {
            return false;
        }
        return this.f27105a.equals(((C9337fB0) obj).f27105a);
    }

    public final int hashCode() {
        return this.f27105a.hashCode();
    }
}

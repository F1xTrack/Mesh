package defpackage;

/* renamed from: fB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3724fB0 implements InterfaceC6556py {
    public final /* synthetic */ C3690f1 a;

    public C3724fB0(C3690f1 c3690f1) {
        this.a = c3690f1;
    }

    @Override // defpackage.InterfaceC6556py
    public final /* synthetic */ void b(Object obj) throws InterruptedException {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC6556py) || !(obj instanceof C3724fB0)) {
            return false;
        }
        return this.a.equals(((C3724fB0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

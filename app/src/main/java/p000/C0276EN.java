package p000;

/* renamed from: EN */
/* loaded from: classes2.dex */
public final class C0276EN implements InterfaceC8814b80 {

    /* renamed from: a */
    public final boolean f2675a;

    public C0276EN(boolean z) {
        this.f2675a = z;
    }

    @Override // p000.InterfaceC8814b80
    /* renamed from: c */
    public final C7824Jv0 mo2199c() {
        return null;
    }

    @Override // p000.InterfaceC8814b80
    public final boolean isActive() {
        return this.f2675a;
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("Empty{"), this.f2675a ? "Active" : "New", '}');
    }
}

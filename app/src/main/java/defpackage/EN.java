package defpackage;

/* loaded from: classes2.dex */
public final class EN implements InterfaceC2268b80 {
    public final boolean a;

    public EN(boolean z) {
        this.a = z;
    }

    @Override // defpackage.InterfaceC2268b80
    public final C0786Jv0 c() {
        return null;
    }

    @Override // defpackage.InterfaceC2268b80
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return F91.v(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}

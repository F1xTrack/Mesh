package defpackage;

import java.util.Collection;

/* renamed from: qP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6643qP0 extends AbstractC5497kP0 implements InterfaceC1502Ta0 {
    public final KX a;

    public C6643qP0(KX kx) {
        O90.f(kx, "fqName");
        this.a = kx;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final WO0 a(KX kx) {
        O90.f(kx, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6643qP0) {
            if (O90.a(this.a, ((C6643qP0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return MN.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        NX.n(C6643qP0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}

package p000;

import java.util.Collection;

/* renamed from: qP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10773qP0 extends AbstractC10005kP0 implements InterfaceC8302Ta0 {

    /* renamed from: a */
    public final C0664KX f40861a;

    public C10773qP0(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        this.f40861a = c0664kx;
    }

    @Override // p000.InterfaceC8302Ta0
    /* renamed from: a */
    public final WO0 mo7705a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10773qP0) {
            if (O90.m5963a(this.f40861a, ((C10773qP0) obj).f40861a)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC8302Ta0
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return C0779MN.f7117a;
    }

    public final int hashCode() {
        return this.f40861a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC0852NX.m5765n(C10773qP0.class, sb, ": ");
        sb.append(this.f40861a);
        return sb.toString();
    }
}

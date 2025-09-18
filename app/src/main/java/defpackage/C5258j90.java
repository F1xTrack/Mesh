package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: j90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5258j90 implements InterfaceC1200Pd1 {
    public final Set a;
    public final F71 b;

    public C5258j90(Set set) {
        C0733Jd1.b.getClass();
        C0733Jd1 c0733Jd1 = C0733Jd1.c;
        O90.f(c0733Jd1, "attributes");
        NV1.B(C5496kP.a(EnumC3765fP.c, true, "unknown integer literal type"), c0733Jd1, this, MN.a, false);
        this.b = LB.b(new C3881g1(25, this));
        this.a = set;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        return null;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final Collection b() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + AbstractC8069xu.H(this.a, StringUtils.COMMA, null, null, C5284jI.D, 30) + ']');
        return sb.toString();
    }
}

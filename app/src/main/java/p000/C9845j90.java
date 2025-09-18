package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: j90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9845j90 implements InterfaceC8101Pd1 {

    /* renamed from: a */
    public final Set f34944a;

    /* renamed from: b */
    public final F71 f34945b;

    public C9845j90(Set set) {
        C7789Jd1.f5652b.getClass();
        C7789Jd1 c7789Jd1 = C7789Jd1.f5653c;
        O90.m5968f(c7789Jd1, "attributes");
        NV1.m5727B(C6298kP.m22195a(EnumC4051fP.f27177c, true, "unknown integer literal type"), c7789Jd1, this, C0779MN.f7117a, false);
        this.f34945b = AbstractC0705LB.m4915b(new C4090g1(25, this));
        this.f34944a = set;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        return null;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: b */
    public final Collection mo5276b() {
        return (List) this.f34945b.getValue();
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return false;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + AbstractC7167xu.m25962H(this.f34944a, StringUtils.COMMA, null, null, C6228jI.f35022D, 30) + ']');
        return sb.toString();
    }
}

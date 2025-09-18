package p000;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class QP0 {

    /* renamed from: a */
    public static final C6417mI f9616a = C6417mI.f37617c;

    /* renamed from: a */
    public static void m6682a(InterfaceC7158xl interfaceC7158xl, StringBuilder sb) {
        C10937rh0 c10937rh0M2755g = AbstractC7589Fh1.m2755g(interfaceC7158xl);
        C10937rh0 c10937rh0Mo121t0 = interfaceC7158xl.mo121t0();
        if (c10937rh0M2755g != null) {
            sb.append(m6685d(c10937rh0M2755g.getType()));
            sb.append(".");
        }
        boolean z = (c10937rh0M2755g == null || c10937rh0Mo121t0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (c10937rh0Mo121t0 != null) {
            sb.append(m6685d(c10937rh0Mo121t0.getType()));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static String m6683b(InterfaceC0036AZ interfaceC0036AZ) {
        O90.m5968f(interfaceC0036AZ, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        m6682a(interfaceC0036AZ, sb);
        C8340Tt0 name = ((AbstractC0203DD) interfaceC0036AZ).getName();
        O90.m5967e(name, "getName(...)");
        sb.append(f9616a.m22727N(name, true));
        List listMo1221f0 = interfaceC0036AZ.mo1221f0();
        O90.m5967e(listMo1221f0, "getValueParameters(...)");
        AbstractC7167xu.m25961G(listMo1221f0, sb, ", ", "(", ")", C9393fd0.f27278H, 48);
        sb.append(": ");
        AbstractC7742Ig0 returnType = interfaceC0036AZ.getReturnType();
        O90.m5965c(returnType);
        sb.append(m6685d(returnType));
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: c */
    public static String m6684c(CE0 ce0) {
        O90.m5968f(ce0, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(ce0.mo2087s0() ? "var " : "val ");
        m6682a(ce0, sb);
        C8340Tt0 name = ce0.getName();
        O90.m5967e(name, "getName(...)");
        sb.append(f9616a.m22727N(name, true));
        sb.append(": ");
        AbstractC7742Ig0 type = ce0.getType();
        O90.m5967e(type, "getType(...)");
        sb.append(m6685d(type));
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: d */
    public static String m6685d(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "type");
        return f9616a.m22736X(abstractC7742Ig0);
    }
}

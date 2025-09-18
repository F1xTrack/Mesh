package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class QP0 {
    public static final C5857mI a = C5857mI.c;

    public static void a(InterfaceC8042xl interfaceC8042xl, StringBuilder sb) {
        C6887rh0 c6887rh0G = AbstractC0433Fh1.g(interfaceC8042xl);
        C6887rh0 c6887rh0T0 = interfaceC8042xl.t0();
        if (c6887rh0G != null) {
            sb.append(d(c6887rh0G.getType()));
            sb.append(".");
        }
        boolean z = (c6887rh0G == null || c6887rh0T0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (c6887rh0T0 != null) {
            sb.append(d(c6887rh0T0.getType()));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(AZ az) {
        O90.f(az, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(az, sb);
        C1559Tt0 name = ((DD) az).getName();
        O90.e(name, "getName(...)");
        sb.append(a.N(name, true));
        List listF0 = az.f0();
        O90.e(listF0, "getValueParameters(...)");
        AbstractC8069xu.G(listF0, sb, ", ", "(", ")", C3808fd0.H, 48);
        sb.append(": ");
        AbstractC0663Ig0 returnType = az.getReturnType();
        O90.c(returnType);
        sb.append(d(returnType));
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static String c(CE0 ce0) {
        O90.f(ce0, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(ce0.s0() ? "var " : "val ");
        a(ce0, sb);
        C1559Tt0 name = ce0.getName();
        O90.e(name, "getName(...)");
        sb.append(a.N(name, true));
        sb.append(": ");
        AbstractC0663Ig0 type = ce0.getType();
        O90.e(type, "getType(...)");
        sb.append(d(type));
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static String d(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "type");
        return a.X(abstractC0663Ig0);
    }
}

package p000;

/* loaded from: classes.dex */
public abstract class M22 {
    /* renamed from: a */
    public static void m5247a(InterfaceC0125Bz interfaceC0125Bz) {
        InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0125Bz.mo937g(C7564Ev0.f2962e);
        if (interfaceC8044Ob0 != null) {
            C8874bc0 c8874bc0 = new C8874bc0(null, (C9002cc0) interfaceC8044Ob0);
            C9255eY0 c9255eY0 = new C9255eY0();
            c9255eY0.f26747d = AbstractC10599p22.m23594a(c9255eY0, c9255eY0, c8874bc0);
            while (c9255eY0.hasNext()) {
                ((C9002cc0) ((InterfaceC8044Ob0) c9255eY0.next())).m10810l(null);
            }
        }
    }

    /* renamed from: b */
    public static final void m5248b(InterfaceC0125Bz interfaceC0125Bz) {
        InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0125Bz.mo937g(C7564Ev0.f2962e);
        if (interfaceC8044Ob0 != null && !interfaceC8044Ob0.isActive()) {
            throw ((C9002cc0) interfaceC8044Ob0).m10818u();
        }
    }

    /* renamed from: c */
    public static final InterfaceC0776MK m5249c(InterfaceC8044Ob0 interfaceC8044Ob0, boolean z, AbstractC8356Ub0 abstractC8356Ub0) {
        if (interfaceC8044Ob0 instanceof C9002cc0) {
            return ((C9002cc0) interfaceC8044Ob0).m10798D(z, abstractC8356Ub0);
        }
        boolean zMo2434j = abstractC8356Ub0.mo2434j();
        C8252Sb0 c8252Sb0 = new C8252Sb0(1, abstractC8356Ub0, AbstractC8356Ub0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        C9002cc0 c9002cc0 = (C9002cc0) interfaceC8044Ob0;
        c9002cc0.getClass();
        return c9002cc0.m10798D(z, zMo2434j ? new C9131da0(c8252Sb0) : new C0839NK(1, c8252Sb0));
    }

    /* renamed from: d */
    public static String m5250d(JQ1 jq1) {
        StringBuilder sb = new StringBuilder(jq1.mo4321k());
        for (int i = 0; i < jq1.mo4321k(); i++) {
            byte bMo4319b = jq1.mo4319b(i);
            if (bMo4319b == 34) {
                sb.append("\\\"");
            } else if (bMo4319b == 39) {
                sb.append("\\'");
            } else if (bMo4319b != 92) {
                switch (bMo4319b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo4319b < 32 || bMo4319b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo4319b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo4319b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo4319b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo4319b);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

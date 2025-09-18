package defpackage;

/* loaded from: classes.dex */
public abstract class M22 {
    public static void a(InterfaceC0173Bz interfaceC0173Bz) {
        InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0173Bz.g(C0396Ev0.e);
        if (interfaceC1115Ob0 != null) {
            C2358bc0 c2358bc0 = new C2358bc0(null, (C2548cc0) interfaceC1115Ob0);
            C3602eY0 c3602eY0 = new C3602eY0();
            c3602eY0.d = AbstractC6383p22.a(c3602eY0, c3602eY0, c2358bc0);
            while (c3602eY0.hasNext()) {
                ((C2548cc0) ((InterfaceC1115Ob0) c3602eY0.next())).l(null);
            }
        }
    }

    public static final void b(InterfaceC0173Bz interfaceC0173Bz) {
        InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0173Bz.g(C0396Ev0.e);
        if (interfaceC1115Ob0 != null && !interfaceC1115Ob0.isActive()) {
            throw ((C2548cc0) interfaceC1115Ob0).u();
        }
    }

    public static final MK c(InterfaceC1115Ob0 interfaceC1115Ob0, boolean z, AbstractC1583Ub0 abstractC1583Ub0) {
        if (interfaceC1115Ob0 instanceof C2548cc0) {
            return ((C2548cc0) interfaceC1115Ob0).D(z, abstractC1583Ub0);
        }
        boolean zJ = abstractC1583Ub0.j();
        C1427Sb0 c1427Sb0 = new C1427Sb0(1, abstractC1583Ub0, AbstractC1583Ub0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        C2548cc0 c2548cc0 = (C2548cc0) interfaceC1115Ob0;
        c2548cc0.getClass();
        return c2548cc0.D(z, zJ ? new C3418da0(c1427Sb0) : new NK(1, c1427Sb0));
    }

    public static String d(JQ1 jq1) {
        StringBuilder sb = new StringBuilder(jq1.k());
        for (int i = 0; i < jq1.k(); i++) {
            byte b = jq1.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
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

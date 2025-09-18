package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: pJ0 */
/* loaded from: classes2.dex */
public final class C6434pJ0 extends AbstractC3405dW {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6434pJ0(X01 x01, X01 x012) {
        super(x01, x012);
        O90.f(x01, "lowerBound");
        O90.f(x012, "upperBound");
        InterfaceC0819Kg0.a.b(x01, x012);
    }

    public static final ArrayList b0(C5857mI c5857mI, AbstractC0663Ig0 abstractC0663Ig0) {
        List<AbstractC6689qe1> listU = abstractC0663Ig0.u();
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(listU));
        for (AbstractC6689qe1 abstractC6689qe1 : listU) {
            c5857mI.getClass();
            O90.f(abstractC6689qe1, "typeProjection");
            StringBuilder sb = new StringBuilder();
            AbstractC8069xu.G(AbstractC8259yu.e(abstractC6689qe1), sb, ", ", null, null, new C5666lI(c5857mI, 0), 60);
            String string = sb.toString();
            O90.e(string, "toString(...)");
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final String e0(String str, String str2) {
        String strSubstring;
        if (!AbstractC7538v51.q(str, '<')) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        O90.f(str, "<this>");
        O90.f(str, "missingDelimiterValue");
        int iZ = AbstractC7538v51.z(str, '<', 0, false, 6);
        if (iZ == -1) {
            strSubstring = str;
        } else {
            strSubstring = str.substring(0, iZ);
            O90.e(strSubstring, "substring(...)");
        }
        sb.append(strSubstring);
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        sb.append(AbstractC7538v51.U('>', str, str));
        return sb.toString();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC0663Ig0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = this.b;
        O90.f(x01, "type");
        X01 x012 = this.c;
        O90.f(x012, "type");
        return new C6434pJ0(x01, x012);
    }

    @Override // defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 P(boolean z) {
        return new C6434pJ0(this.b.P(z), this.c.P(z));
    }

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: R */
    public final AbstractC1521Tg1 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = this.b;
        O90.f(x01, "type");
        X01 x012 = this.c;
        O90.f(x012, "type");
        return new C6434pJ0(x01, x012);
    }

    @Override // defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return new C6434pJ0(this.b.T(c0733Jd1), this.c.T(c0733Jd1));
    }

    @Override // defpackage.AbstractC3405dW
    public final X01 U() {
        return this.b;
    }

    @Override // defpackage.AbstractC3405dW
    public final String a0(C5857mI c5857mI, C5857mI c5857mI2) {
        O90.f(c5857mI, "renderer");
        X01 x01 = this.b;
        String strX = c5857mI.X(x01);
        X01 x012 = this.c;
        String strX2 = c5857mI.X(x012);
        if (c5857mI2.a.n()) {
            return "raw (" + strX + ".." + strX2 + ')';
        }
        if (x012.u().isEmpty()) {
            return c5857mI.E(strX, strX2, CZ1.f(this));
        }
        ArrayList arrayListB0 = b0(c5857mI, x01);
        ArrayList arrayListB02 = b0(c5857mI, x012);
        String strH = AbstractC8069xu.H(arrayListB0, ", ", null, null, C3808fd0.y, 30);
        ArrayList arrayListI0 = AbstractC8069xu.i0(arrayListB0, arrayListB02);
        if (arrayListI0.isEmpty()) {
            strX2 = e0(strX2, strH);
        } else {
            Iterator it = arrayListI0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                if (!O90.a(str, AbstractC7538v51.J("out ", str2)) && !str2.equals("*")) {
                    break;
                }
            }
            strX2 = e0(strX2, strH);
        }
        String strE0 = e0(strX, strH);
        return O90.a(strE0, strX2) ? strE0 : c5857mI.E(strE0, strX2, CZ1.f(this));
    }

    @Override // defpackage.AbstractC3405dW, defpackage.AbstractC0663Ig0
    public final InterfaceC5578kq0 d0() {
        InterfaceC1087Ns interfaceC1087NsA = E().a();
        InterfaceC7492us interfaceC7492us = interfaceC1087NsA instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsA : null;
        if (interfaceC7492us != null) {
            InterfaceC5578kq0 interfaceC5578kq0C0 = interfaceC7492us.c0(new C6243oJ0());
            O90.e(interfaceC5578kq0C0, "getMemberScope(...)");
            return interfaceC5578kq0C0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + E().a()).toString());
    }
}

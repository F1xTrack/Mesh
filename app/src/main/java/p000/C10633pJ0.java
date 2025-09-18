package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: pJ0 */
/* loaded from: classes2.dex */
public final class C10633pJ0 extends AbstractC3933dW {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10633pJ0(X01 x01, X01 x012) {
        super(x01, x012);
        O90.m5968f(x01, "lowerBound");
        O90.m5968f(x012, "upperBound");
        InterfaceC7846Kg0.f6251a.m25726b(x01, x012);
    }

    /* renamed from: b0 */
    public static final ArrayList m23725b0(C6417mI c6417mI, AbstractC7742Ig0 abstractC7742Ig0) {
        List<AbstractC10804qe1> listMo3800u = abstractC7742Ig0.mo3800u();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listMo3800u));
        for (AbstractC10804qe1 abstractC10804qe1 : listMo3800u) {
            c6417mI.getClass();
            O90.m5968f(abstractC10804qe1, "typeProjection");
            StringBuilder sb = new StringBuilder();
            AbstractC7167xu.m25961G(AbstractC7230yu.m26274e(abstractC10804qe1), sb, ", ", null, null, new C6354lI(c6417mI, 0), 60);
            String string = sb.toString();
            O90.m5967e(string, "toString(...)");
            arrayList.add(string);
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public static final String m23726e0(String str, String str2) {
        String strSubstring;
        if (!AbstractC11374v51.m25352q(str, '<')) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        O90.m5968f(str, "<this>");
        O90.m5968f(str, "missingDelimiterValue");
        int iM25361z = AbstractC11374v51.m25361z(str, '<', 0, false, 6);
        if (iM25361z == -1) {
            strSubstring = str;
        } else {
            strSubstring = str.substring(0, iM25361z);
            O90.m5967e(strSubstring, "substring(...)");
        }
        sb.append(strSubstring);
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        sb.append(AbstractC11374v51.m25346U('>', str, str));
        return sb.toString();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = this.f26126b;
        O90.m5968f(x01, "type");
        X01 x012 = this.f26127c;
        O90.m5968f(x012, "type");
        return new C10633pJ0(x01, x012);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: P */
    public final AbstractC8315Tg1 mo250P(boolean z) {
        return new C10633pJ0(this.f26126b.mo250P(z), this.f26127c.mo250P(z));
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: R */
    public final AbstractC8315Tg1 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = this.f26126b;
        O90.m5968f(x01, "type");
        X01 x012 = this.f26127c;
        O90.m5968f(x012, "type");
        return new C10633pJ0(x01, x012);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: T */
    public final AbstractC8315Tg1 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return new C10633pJ0(this.f26126b.mo252T(c7789Jd1), this.f26127c.mo252T(c7789Jd1));
    }

    @Override // p000.AbstractC3933dW
    /* renamed from: U */
    public final X01 mo17701U() {
        return this.f26126b;
    }

    @Override // p000.AbstractC3933dW
    /* renamed from: a0 */
    public final String mo17702a0(C6417mI c6417mI, C6417mI c6417mI2) {
        O90.m5968f(c6417mI, "renderer");
        X01 x01 = this.f26126b;
        String strM22736X = c6417mI.m22736X(x01);
        X01 x012 = this.f26127c;
        String strM22736X2 = c6417mI.m22736X(x012);
        if (c6417mI2.f37620a.m23964n()) {
            return "raw (" + strM22736X + ".." + strM22736X2 + ')';
        }
        if (x012.mo3800u().isEmpty()) {
            return c6417mI.m22718E(strM22736X, strM22736X2, CZ1.m1230f(this));
        }
        ArrayList arrayListM23725b0 = m23725b0(c6417mI, x01);
        ArrayList arrayListM23725b02 = m23725b0(c6417mI, x012);
        String strM25962H = AbstractC7167xu.m25962H(arrayListM23725b0, ", ", null, null, C9393fd0.f27299y, 30);
        ArrayList arrayListM25989i0 = AbstractC7167xu.m25989i0(arrayListM23725b0, arrayListM23725b02);
        if (arrayListM25989i0.isEmpty()) {
            strM22736X2 = m23726e0(strM22736X2, strM25962H);
        } else {
            Iterator it = arrayListM25989i0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.f36702a;
                String str2 = (String) pair.f36703b;
                if (!O90.m5963a(str, AbstractC11374v51.m25335J("out ", str2)) && !str2.equals("*")) {
                    break;
                }
            }
            strM22736X2 = m23726e0(strM22736X2, strM25962H);
        }
        String strM23726e0 = m23726e0(strM22736X, strM25962H);
        return O90.m5963a(strM23726e0, strM22736X2) ? strM23726e0 : c6417mI.m22718E(strM23726e0, strM22736X2, CZ1.m1230f(this));
    }

    @Override // p000.AbstractC3933dW, p000.AbstractC7742Ig0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo3799d0() {
        InterfaceC0873Ns interfaceC0873NsMo1962a = mo3797E().mo1962a();
        InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1962a instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1962a : null;
        if (interfaceC6976us != null) {
            InterfaceC10059kq0 interfaceC10059kq0Mo1490c0 = interfaceC6976us.mo1490c0(new C10505oJ0());
            O90.m5967e(interfaceC10059kq0Mo1490c0, "getMemberScope(...)");
            return interfaceC10059kq0Mo1490c0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo3797E().mo1962a()).toString());
    }
}

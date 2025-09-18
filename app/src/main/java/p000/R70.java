package p000;

import java.io.Serializable;

/* loaded from: classes.dex */
public class R70 extends AbstractC4131gg implements Serializable {

    /* renamed from: d */
    public final transient C10007kQ0 f10018d;

    public R70(C10007kQ0 c10007kQ0, int i) {
        this.f10018d = c10007kQ0;
    }

    @Override // p000.AbstractC0819N0
    /* renamed from: b */
    public final boolean mo5489b(Object obj) {
        return obj != null && super.mo5489b(obj);
    }

    @Override // p000.AbstractC0819N0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C10007kQ0 mo4619a() {
        return this.f10018d;
    }

    @Override // p000.AbstractC0819N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final P70 mo5490c(String str) {
        P70 p70 = (P70) this.f10018d.get(str);
        if (p70 != null) {
            return p70;
        }
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }
}

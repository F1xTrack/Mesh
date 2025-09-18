package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public class R70 extends AbstractC4007gg implements Serializable {
    public final transient C5500kQ0 d;

    public R70(C5500kQ0 c5500kQ0, int i) {
        this.d = c5500kQ0;
    }

    @Override // defpackage.N0
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // defpackage.N0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5500kQ0 a() {
        return this.d;
    }

    @Override // defpackage.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final P70 c(String str) {
        P70 p70 = (P70) this.d.get(str);
        if (p70 != null) {
            return p70;
        }
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }
}

package defpackage;

import java.util.Collections;

/* renamed from: Lh1 */
/* loaded from: classes.dex */
public final class C0901Lh1 extends AbstractC5738lg {
    public final Object i;

    public C0901Lh1(ES1 es1, Object obj) {
        super(Collections.emptyList());
        j(es1);
        this.i = obj;
    }

    @Override // defpackage.AbstractC5738lg
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.AbstractC5738lg
    public final Object e() {
        ES1 es1 = this.e;
        float f = this.d;
        Object obj = this.i;
        return es1.z(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.AbstractC5738lg
    public final Object f(C6312og0 c6312og0, float f) {
        return e();
    }

    @Override // defpackage.AbstractC5738lg
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.AbstractC5738lg
    public final void i(float f) {
        this.d = f;
    }
}

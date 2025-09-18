package defpackage;

/* renamed from: nW */
/* loaded from: classes.dex */
public final class C6090nW extends AbstractC6503pg0 {
    @Override // defpackage.AbstractC5738lg
    public final Object f(C6312og0 c6312og0, float f) {
        return Float.valueOf(l(c6312og0, f));
    }

    public final float k() {
        return l(this.c.e(), c());
    }

    public final float l(C6312og0 c6312og0, float f) {
        if (c6312og0.b == null || c6312og0.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ES1 es1 = this.e;
        Object obj = c6312og0.b;
        if (es1 != null) {
            Float f2 = (Float) c6312og0.c;
            float fD = d();
            float f3 = this.d;
            Float f4 = (Float) es1.z(c6312og0.g, c6312og0.h.floatValue(), (Float) obj, f2, f, fD, f3);
            if (f4 != null) {
                return f4.floatValue();
            }
        }
        if (c6312og0.i == -3987645.8f) {
            c6312og0.i = ((Float) obj).floatValue();
        }
        float f5 = c6312og0.i;
        if (c6312og0.j == -3987645.8f) {
            c6312og0.j = ((Float) c6312og0.c).floatValue();
        }
        return AbstractC2215as0.e(f5, c6312og0.j, f);
    }
}

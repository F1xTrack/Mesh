package p000;

/* renamed from: nW */
/* loaded from: classes.dex */
public final class C6494nW extends AbstractC10679pg0 {
    @Override // p000.AbstractC6378lg
    /* renamed from: f */
    public final Object mo3189f(C10551og0 c10551og0, float f) {
        return Float.valueOf(m23153l(c10551og0, f));
    }

    /* renamed from: k */
    public final float m23152k() {
        return m23153l(this.f37230c.mo7744e(), m22528c());
    }

    /* renamed from: l */
    public final float m23153l(C10551og0 c10551og0, float f) {
        if (c10551og0.f39159b == null || c10551og0.f39160c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ES1 es1 = this.f37232e;
        Object obj = c10551og0.f39159b;
        if (es1 != null) {
            Float f2 = (Float) c10551og0.f39160c;
            float fM22529d = m22529d();
            float f3 = this.f37231d;
            Float f4 = (Float) es1.m2303z(c10551og0.f39164g, c10551og0.f39165h.floatValue(), (Float) obj, f2, f, fM22529d, f3);
            if (f4 != null) {
                return f4.floatValue();
            }
        }
        if (c10551og0.f39166i == -3987645.8f) {
            c10551og0.f39166i = ((Float) obj).floatValue();
        }
        float f5 = c10551og0.f39166i;
        if (c10551og0.f39167j == -3987645.8f) {
            c10551og0.f39167j = ((Float) c10551og0.f39160c).floatValue();
        }
        return AbstractC8778as0.m10353e(f5, c10551og0.f39167j, f);
    }
}

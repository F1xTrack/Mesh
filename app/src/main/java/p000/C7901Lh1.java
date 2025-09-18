package p000;

import java.util.Collections;

/* renamed from: Lh1 */
/* loaded from: classes.dex */
public final class C7901Lh1 extends AbstractC6378lg {

    /* renamed from: i */
    public final Object f6804i;

    public C7901Lh1(ES1 es1, Object obj) {
        super(Collections.emptyList());
        m22530j(es1);
        this.f6804i = obj;
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: b */
    public final float mo5062b() {
        return 1.0f;
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: e */
    public final Object mo5063e() {
        ES1 es1 = this.f37232e;
        float f = this.f37231d;
        Object obj = this.f6804i;
        return es1.m2303z(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: f */
    public final Object mo3189f(C10551og0 c10551og0, float f) {
        return mo5063e();
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: h */
    public final void mo5064h() {
        if (this.f37232e != null) {
            super.mo5064h();
        }
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: i */
    public final void mo5065i(float f) {
        this.f37231d = f;
    }
}

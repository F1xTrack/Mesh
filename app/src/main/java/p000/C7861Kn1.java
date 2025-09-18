package p000;

import android.view.WindowInsets;

/* renamed from: Kn1 */
/* loaded from: classes.dex */
public class C7861Kn1 extends AbstractC7965Mn1 {

    /* renamed from: c */
    public final WindowInsets.Builder f6290c;

    public C7861Kn1() {
        this.f6290c = AbstractC10998s91.m24635l();
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: b */
    public C8433Vn1 mo4414b() {
        m5436a();
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(null, this.f6290c.build());
        c8433Vn1M8551h.f12756a.mo5842p(this.f7349b);
        return c8433Vn1M8551h;
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: d */
    public void mo4713d(J80 j80) {
        this.f6290c.setMandatorySystemGestureInsets(j80.m4203d());
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: e */
    public void mo4415e(J80 j80) {
        this.f6290c.setStableInsets(j80.m4203d());
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: f */
    public void mo4714f(J80 j80) {
        this.f6290c.setSystemGestureInsets(j80.m4203d());
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: g */
    public void mo4416g(J80 j80) {
        this.f6290c.setSystemWindowInsets(j80.m4203d());
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: h */
    public void mo4715h(J80 j80) {
        this.f6290c.setTappableElementInsets(j80.m4203d());
    }

    public C7861Kn1(C8433Vn1 c8433Vn1) {
        WindowInsets.Builder builderM24635l;
        super(c8433Vn1);
        WindowInsets windowInsetsM8557g = c8433Vn1.m8557g();
        if (windowInsetsM8557g != null) {
            builderM24635l = AbstractC10998s91.m24636m(windowInsetsM8557g);
        } else {
            builderM24635l = AbstractC10998s91.m24635l();
        }
        this.f6290c = builderM24635l;
    }
}

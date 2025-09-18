package p000;

import android.graphics.Color;
import android.graphics.Matrix;

/* renamed from: fM */
/* loaded from: classes.dex */
public final class C4048fM implements InterfaceC4194hg {

    /* renamed from: a */
    public final AbstractC6504ng f27145a;

    /* renamed from: b */
    public final Object f27146b;

    /* renamed from: c */
    public final C0435Gu f27147c;

    /* renamed from: d */
    public final C6494nW f27148d;

    /* renamed from: e */
    public final C6494nW f27149e;

    /* renamed from: f */
    public final C6494nW f27150f;

    /* renamed from: g */
    public final C6494nW f27151g;

    /* renamed from: h */
    public float f27152h = Float.NaN;

    /* renamed from: i */
    public float f27153i = Float.NaN;

    /* renamed from: j */
    public float f27154j = Float.NaN;

    /* renamed from: k */
    public int f27155k = 0;

    /* renamed from: l */
    public final float[] f27156l = new float[9];

    public C4048fM(InterfaceC4194hg interfaceC4194hg, AbstractC6504ng abstractC6504ng, C6937uF c6937uF) {
        this.f27146b = interfaceC4194hg;
        this.f27145a = abstractC6504ng;
        AbstractC6378lg abstractC6378lgMo4553M0 = ((C0635K4) c6937uF.f43616a).mo4553M0();
        this.f27147c = (C0435Gu) abstractC6378lgMo4553M0;
        abstractC6378lgMo4553M0.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
        C6494nW c6494nWMo4553M0 = ((C0698L4) c6937uF.f43617b).mo4553M0();
        this.f27148d = c6494nWMo4553M0;
        c6494nWMo4553M0.m22527a(this);
        abstractC6504ng.m23162e(c6494nWMo4553M0);
        C6494nW c6494nWMo4553M02 = ((C0698L4) c6937uF.f43618c).mo4553M0();
        this.f27149e = c6494nWMo4553M02;
        c6494nWMo4553M02.m22527a(this);
        abstractC6504ng.m23162e(c6494nWMo4553M02);
        C6494nW c6494nWMo4553M03 = ((C0698L4) c6937uF.f43619d).mo4553M0();
        this.f27150f = c6494nWMo4553M03;
        c6494nWMo4553M03.m22527a(this);
        abstractC6504ng.m23162e(c6494nWMo4553M03);
        C6494nW c6494nWMo4553M04 = ((C0698L4) c6937uF.f43620e).mo4553M0();
        this.f27151g = c6494nWMo4553M04;
        c6494nWMo4553M04.m22527a(this);
        abstractC6504ng.m23162e(c6494nWMo4553M04);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hg, java.lang.Object] */
    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f27146b.mo1741a();
    }

    /* renamed from: b */
    public final void m18219b(C8314Tg0 c8314Tg0, Matrix matrix, int i) {
        float fM23152k = this.f27149e.m23152k() * 0.017453292f;
        float fFloatValue = ((Float) this.f27150f.mo5063e()).floatValue();
        double d = fM23152k;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        Matrix matrixM24754e = this.f27145a.f38464w.m24754e();
        float[] fArr = this.f27156l;
        matrixM24754e.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[4];
        matrix.getValues(fArr);
        float f3 = fArr[0] / f;
        float f4 = fSin * f3;
        float f5 = fCos * (fArr[4] / f2);
        int iIntValue = ((Integer) this.f27147c.mo5063e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f27148d.mo5063e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(((Float) this.f27151g.mo5063e()).floatValue() * f3 * 0.33f, Float.MIN_VALUE);
        if (this.f27152h == fMax && this.f27153i == f4 && this.f27154j == f5 && this.f27155k == iArgb) {
            return;
        }
        this.f27152h = fMax;
        this.f27153i = f4;
        this.f27154j = f5;
        this.f27155k = iArgb;
        c8314Tg0.setShadowLayer(fMax, f4, f5, iArgb);
    }

    /* renamed from: c */
    public final void m18220c(ES1 es1) {
        this.f27148d.m22530j(new C3985eM(es1));
    }
}

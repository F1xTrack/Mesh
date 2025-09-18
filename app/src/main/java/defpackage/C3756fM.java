package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* renamed from: fM */
/* loaded from: classes.dex */
public final class C3756fM implements InterfaceC4198hg {
    public final AbstractC6120ng a;
    public final Object b;
    public final C0548Gu c;
    public final C6090nW d;
    public final C6090nW e;
    public final C6090nW f;
    public final C6090nW g;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public int k = 0;
    public final float[] l = new float[9];

    public C3756fM(InterfaceC4198hg interfaceC4198hg, AbstractC6120ng abstractC6120ng, C7375uF c7375uF) {
        this.b = interfaceC4198hg;
        this.a = abstractC6120ng;
        AbstractC5738lg abstractC5738lgM0 = ((K4) c7375uF.a).M0();
        this.c = (C0548Gu) abstractC5738lgM0;
        abstractC5738lgM0.a(this);
        abstractC6120ng.e(abstractC5738lgM0);
        C6090nW c6090nWM0 = ((L4) c7375uF.b).M0();
        this.d = c6090nWM0;
        c6090nWM0.a(this);
        abstractC6120ng.e(c6090nWM0);
        C6090nW c6090nWM02 = ((L4) c7375uF.c).M0();
        this.e = c6090nWM02;
        c6090nWM02.a(this);
        abstractC6120ng.e(c6090nWM02);
        C6090nW c6090nWM03 = ((L4) c7375uF.d).M0();
        this.f = c6090nWM03;
        c6090nWM03.a(this);
        abstractC6120ng.e(c6090nWM03);
        C6090nW c6090nWM04 = ((L4) c7375uF.e).M0();
        this.g = c6090nWM04;
        c6090nWM04.a(this);
        abstractC6120ng.e(c6090nWM04);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hg, java.lang.Object] */
    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.b.a();
    }

    public final void b(C1520Tg0 c1520Tg0, Matrix matrix, int i) {
        float fK = this.e.k() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d = fK;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        Matrix matrixE = this.a.w.e();
        float[] fArr = this.l;
        matrixE.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[4];
        matrix.getValues(fArr);
        float f3 = fArr[0] / f;
        float f4 = fSin * f3;
        float f5 = fCos * (fArr[4] / f2);
        int iIntValue = ((Integer) this.c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(((Float) this.g.e()).floatValue() * f3 * 0.33f, Float.MIN_VALUE);
        if (this.h == fMax && this.i == f4 && this.j == f5 && this.k == iArgb) {
            return;
        }
        this.h = fMax;
        this.i = f4;
        this.j = f5;
        this.k = iArgb;
        c1520Tg0.setShadowLayer(fMax, f4, f5, iArgb);
    }

    public final void c(ES1 es1) {
        this.d.j(new C3565eM(es1));
    }
}

package p000;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class N60 extends AbstractC6504ng {

    /* renamed from: D */
    public final /* synthetic */ int f7498D;

    /* renamed from: E */
    public final C8314Tg0 f7499E;

    /* renamed from: F */
    public C7901Lh1 f7500F;

    /* renamed from: G */
    public C7901Lh1 f7501G;

    /* renamed from: H */
    public final Parcelable f7502H;

    /* renamed from: I */
    public final Object f7503I;

    /* renamed from: J */
    public final Object f7504J;

    /* renamed from: K */
    public final Object f7505K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N60(C10307mm0 c10307mm0, C8574Yg0 c8574Yg0, int i) {
        C10691pm0 c10691pm0;
        super(c10307mm0, c8574Yg0);
        this.f7498D = i;
        switch (i) {
            case 1:
                super(c10307mm0, c8574Yg0);
                this.f7502H = new RectF();
                C8314Tg0 c8314Tg0 = new C8314Tg0();
                this.f7499E = c8314Tg0;
                this.f7503I = new float[8];
                this.f7504J = new Path();
                this.f7505K = c8574Yg0;
                c8314Tg0.setAlpha(0);
                c8314Tg0.setStyle(Paint.Style.FILL);
                c8314Tg0.setColor(c8574Yg0.f14429l);
                break;
            default:
                this.f7499E = new C8314Tg0(3, 0);
                this.f7502H = new Rect();
                this.f7503I = new Rect();
                C8532Xl0 c8532Xl0 = c10307mm0.f37887a;
                if (c8532Xl0 == null) {
                    c10691pm0 = null;
                } else {
                    c10691pm0 = (C10691pm0) ((HashMap) c8532Xl0.m9112c()).get(c8574Yg0.f14424g);
                }
                this.f7504J = c10691pm0;
                C6937uF c6937uF = this.f38457p.f14441x;
                if (c6937uF != null) {
                    this.f7505K = new C4048fM(this, this, c6937uF);
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC6504ng, p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        switch (this.f7498D) {
            case 0:
                super.mo1744d(rectF, matrix, z);
                if (((C10691pm0) this.f7504J) != null) {
                    float fM3974c = AbstractC7745Ih1.m3974c();
                    rectF.set(0.0f, 0.0f, r4.f40386a * fM3974c, r4.f40387b * fM3974c);
                    this.f38455n.mapRect(rectF);
                    break;
                }
                break;
            default:
                super.mo1744d(rectF, matrix, z);
                RectF rectF2 = (RectF) this.f7502H;
                C8574Yg0 c8574Yg0 = (C8574Yg0) this.f7505K;
                rectF2.set(0.0f, 0.0f, c8574Yg0.f14427j, c8574Yg0.f14428k);
                this.f38455n.mapRect(rectF2);
                rectF.set(rectF2);
                break;
        }
    }

    @Override // p000.AbstractC6504ng, p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        switch (this.f7498D) {
            case 0:
                super.mo1746h(colorFilter, es1);
                if (colorFilter != InterfaceC10947rm0.f41863F) {
                    if (colorFilter == InterfaceC10947rm0.f41866I) {
                        this.f7501G = new C7901Lh1(es1, null);
                        break;
                    }
                } else {
                    this.f7500F = new C7901Lh1(es1, null);
                    break;
                }
                break;
            default:
                super.mo1746h(colorFilter, es1);
                if (colorFilter != InterfaceC10947rm0.f41863F) {
                    if (colorFilter == 1) {
                        this.f7501G = new C7901Lh1(es1, null);
                        break;
                    }
                } else {
                    this.f7500F = new C7901Lh1(es1, null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x020a  */
    @Override // p000.AbstractC6504ng
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5542k(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.N60.mo5542k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}

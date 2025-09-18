package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class N60 extends AbstractC6120ng {
    public final /* synthetic */ int D;
    public final C1520Tg0 E;
    public C0901Lh1 F;
    public C0901Lh1 G;
    public final Parcelable H;
    public final Object I;
    public final Object J;
    public final Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N60(C5948mm0 c5948mm0, C1910Yg0 c1910Yg0, int i) {
        C6521pm0 c6521pm0;
        super(c5948mm0, c1910Yg0);
        this.D = i;
        switch (i) {
            case 1:
                super(c5948mm0, c1910Yg0);
                this.H = new RectF();
                C1520Tg0 c1520Tg0 = new C1520Tg0();
                this.E = c1520Tg0;
                this.I = new float[8];
                this.J = new Path();
                this.K = c1910Yg0;
                c1520Tg0.setAlpha(0);
                c1520Tg0.setStyle(Paint.Style.FILL);
                c1520Tg0.setColor(c1910Yg0.l);
                break;
            default:
                this.E = new C1520Tg0(3, 0);
                this.H = new Rect();
                this.I = new Rect();
                C1847Xl0 c1847Xl0 = c5948mm0.a;
                if (c1847Xl0 == null) {
                    c6521pm0 = null;
                } else {
                    c6521pm0 = (C6521pm0) ((HashMap) c1847Xl0.c()).get(c1910Yg0.g);
                }
                this.J = c6521pm0;
                C7375uF c7375uF = this.p.x;
                if (c7375uF != null) {
                    this.K = new C3756fM(this, this, c7375uF);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC6120ng, defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        switch (this.D) {
            case 0:
                super.d(rectF, matrix, z);
                if (((C6521pm0) this.J) != null) {
                    float fC = AbstractC0667Ih1.c();
                    rectF.set(0.0f, 0.0f, r4.a * fC, r4.b * fC);
                    this.n.mapRect(rectF);
                    break;
                }
                break;
            default:
                super.d(rectF, matrix, z);
                RectF rectF2 = (RectF) this.H;
                C1910Yg0 c1910Yg0 = (C1910Yg0) this.K;
                rectF2.set(0.0f, 0.0f, c1910Yg0.j, c1910Yg0.k);
                this.n.mapRect(rectF2);
                rectF.set(rectF2);
                break;
        }
    }

    @Override // defpackage.AbstractC6120ng, defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        switch (this.D) {
            case 0:
                super.h(colorFilter, es1);
                if (colorFilter != InterfaceC6902rm0.F) {
                    if (colorFilter == InterfaceC6902rm0.I) {
                        this.G = new C0901Lh1(es1, null);
                        break;
                    }
                } else {
                    this.F = new C0901Lh1(es1, null);
                    break;
                }
                break;
            default:
                super.h(colorFilter, es1);
                if (colorFilter != InterfaceC6902rm0.F) {
                    if (colorFilter == 1) {
                        this.G = new C0901Lh1(es1, null);
                        break;
                    }
                } else {
                    this.F = new C0901Lh1(es1, null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x020a  */
    @Override // defpackage.AbstractC6120ng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N60.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}

package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: nU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6084nU implements HL, InterfaceC4198hg, InterfaceC1127Of0 {
    public final Path a;
    public final C1520Tg0 b;
    public final AbstractC6120ng c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final C0548Gu g;
    public final C0548Gu h;
    public C0901Lh1 i;
    public final C5948mm0 j;
    public AbstractC5738lg k;
    public float l;
    public final C3756fM m;

    public C6084nU(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, QZ0 qz0) {
        Path path = new Path();
        this.a = path;
        this.b = new C1520Tg0(1, 0);
        this.f = new ArrayList();
        this.c = abstractC6120ng;
        this.d = qz0.c;
        this.e = qz0.f;
        this.j = c5948mm0;
        if (abstractC6120ng.l() != null) {
            C6090nW c6090nWM0 = ((L4) abstractC6120ng.l().a).M0();
            this.k = c6090nWM0;
            c6090nWM0.a(this);
            abstractC6120ng.e(this.k);
        }
        if (abstractC6120ng.m() != null) {
            this.m = new C3756fM(this, abstractC6120ng, abstractC6120ng.m());
        }
        K4 k4 = qz0.d;
        if (k4 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        K4 k42 = qz0.e;
        path.setFillType(qz0.b);
        AbstractC5738lg abstractC5738lgM0 = k4.M0();
        this.g = (C0548Gu) abstractC5738lgM0;
        abstractC5738lgM0.a(this);
        abstractC6120ng.e(abstractC5738lgM0);
        AbstractC5738lg abstractC5738lgM02 = k42.M0();
        this.h = (C0548Gu) abstractC5738lgM02;
        abstractC5738lgM02.a(this);
        abstractC6120ng.e(abstractC5738lgM02);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) list2.get(i);
            if (interfaceC6937ry instanceof InterfaceC6407pA0) {
                this.f.add((InterfaceC6407pA0) interfaceC6937ry);
            }
        }
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
    }

    @Override // defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC6407pA0) arrayList.get(i)).g(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.HL
    public final void f(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        C0548Gu c0548Gu = this.g;
        int iK = c0548Gu.k(c0548Gu.c.e(), c0548Gu.c());
        float f = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.h.e()).intValue() * f) / 100.0f) * 255.0f);
        PointF pointF = AbstractC2215as0.a;
        int i2 = 0;
        int iMax = (iK & 16777215) | (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, iIntValue)) << 24);
        C1520Tg0 c1520Tg0 = this.b;
        c1520Tg0.setColor(iMax);
        C0901Lh1 c0901Lh1 = this.i;
        if (c0901Lh1 != null) {
            c1520Tg0.setColorFilter((ColorFilter) c0901Lh1.e());
        }
        AbstractC5738lg abstractC5738lg = this.k;
        if (abstractC5738lg != null) {
            float fFloatValue = ((Float) abstractC5738lg.e()).floatValue();
            if (fFloatValue == 0.0f) {
                c1520Tg0.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                AbstractC6120ng abstractC6120ng = this.c;
                if (abstractC6120ng.A == fFloatValue) {
                    blurMaskFilter = abstractC6120ng.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC6120ng.B = blurMaskFilter2;
                    abstractC6120ng.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                c1520Tg0.setMaskFilter(blurMaskFilter);
            }
            this.l = fFloatValue;
        }
        C3756fM c3756fM = this.m;
        if (c3756fM != null) {
            C6987sD c6987sD = AbstractC0667Ih1.a;
            c3756fM.b(c1520Tg0, matrix, (int) (((f * iIntValue) / 255.0f) * 255.0f));
        }
        Path path = this.a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, c1520Tg0);
                return;
            } else {
                path.addPath(((InterfaceC6407pA0) arrayList.get(i2)).g(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.d;
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        PointF pointF = InterfaceC6902rm0.a;
        if (colorFilter == 1) {
            this.g.j(es1);
            return;
        }
        if (colorFilter == 4) {
            this.h.j(es1);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC6902rm0.F;
        AbstractC6120ng abstractC6120ng = this.c;
        if (colorFilter == colorFilter2) {
            C0901Lh1 c0901Lh1 = this.i;
            if (c0901Lh1 != null) {
                abstractC6120ng.p(c0901Lh1);
            }
            C0901Lh1 c0901Lh12 = new C0901Lh1(es1, null);
            this.i = c0901Lh12;
            c0901Lh12.a(this);
            abstractC6120ng.e(this.i);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.e) {
            AbstractC5738lg abstractC5738lg = this.k;
            if (abstractC5738lg != null) {
                abstractC5738lg.j(es1);
                return;
            }
            C0901Lh1 c0901Lh13 = new C0901Lh1(es1, null);
            this.k = c0901Lh13;
            c0901Lh13.a(this);
            abstractC6120ng.e(this.k);
            return;
        }
        C3756fM c3756fM = this.m;
        if (colorFilter == 5 && c3756fM != null) {
            c3756fM.c.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.B && c3756fM != null) {
            c3756fM.c(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.C && c3756fM != null) {
            c3756fM.e.j(es1);
            return;
        }
        if (colorFilter == InterfaceC6902rm0.D && c3756fM != null) {
            c3756fM.f.j(es1);
        } else {
            if (colorFilter != InterfaceC6902rm0.E || c3756fM == null) {
                return;
            }
            c3756fM.g.j(es1);
        }
    }
}

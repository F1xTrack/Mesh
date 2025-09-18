package p000;

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

/* renamed from: nU */
/* loaded from: classes.dex */
public final class C6492nU implements InterfaceC0463HL, InterfaceC4194hg, InterfaceC8052Of0 {

    /* renamed from: a */
    public final Path f38332a;

    /* renamed from: b */
    public final C8314Tg0 f38333b;

    /* renamed from: c */
    public final AbstractC6504ng f38334c;

    /* renamed from: d */
    public final String f38335d;

    /* renamed from: e */
    public final boolean f38336e;

    /* renamed from: f */
    public final ArrayList f38337f;

    /* renamed from: g */
    public final C0435Gu f38338g;

    /* renamed from: h */
    public final C0435Gu f38339h;

    /* renamed from: i */
    public C7901Lh1 f38340i;

    /* renamed from: j */
    public final C10307mm0 f38341j;

    /* renamed from: k */
    public AbstractC6378lg f38342k;

    /* renamed from: l */
    public float f38343l;

    /* renamed from: m */
    public final C4048fM f38344m;

    public C6492nU(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, QZ0 qz0) {
        Path path = new Path();
        this.f38332a = path;
        this.f38333b = new C8314Tg0(1, 0);
        this.f38337f = new ArrayList();
        this.f38334c = abstractC6504ng;
        this.f38335d = qz0.f9672c;
        this.f38336e = qz0.f9675f;
        this.f38341j = c10307mm0;
        if (abstractC6504ng.mo8507l() != null) {
            C6494nW c6494nWMo4553M0 = ((C0698L4) abstractC6504ng.mo8507l().f3494a).mo4553M0();
            this.f38342k = c6494nWMo4553M0;
            c6494nWMo4553M0.m22527a(this);
            abstractC6504ng.m23162e(this.f38342k);
        }
        if (abstractC6504ng.mo8508m() != null) {
            this.f38344m = new C4048fM(this, abstractC6504ng, abstractC6504ng.mo8508m());
        }
        C0635K4 c0635k4 = qz0.f9673d;
        if (c0635k4 == null) {
            this.f38338g = null;
            this.f38339h = null;
            return;
        }
        C0635K4 c0635k42 = qz0.f9674e;
        path.setFillType(qz0.f9671b);
        AbstractC6378lg abstractC6378lgMo4553M0 = c0635k4.mo4553M0();
        this.f38338g = (C0435Gu) abstractC6378lgMo4553M0;
        abstractC6378lgMo4553M0.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
        AbstractC6378lg abstractC6378lgMo4553M02 = c0635k42.mo4553M0();
        this.f38339h = (C0435Gu) abstractC6378lgMo4553M02;
        abstractC6378lgMo4553M02.m22527a(this);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M02);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f38341j.invalidateSelf();
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) list2.get(i);
            if (interfaceC6793ry instanceof InterfaceC10615pA0) {
                this.f38337f.add((InterfaceC10615pA0) interfaceC6793ry);
            }
        }
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f38332a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f38337f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC10615pA0) arrayList.get(i)).mo5778g(), matrix);
                i++;
            }
        }
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: f */
    public final void mo1745f(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.f38336e) {
            return;
        }
        C0435Gu c0435Gu = this.f38338g;
        int iM3190k = c0435Gu.m3190k(c0435Gu.f37230c.mo7744e(), c0435Gu.m22528c());
        float f = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.f38339h.mo5063e()).intValue() * f) / 100.0f) * 255.0f);
        PointF pointF = AbstractC8778as0.f16638a;
        int i2 = 0;
        int iMax = (iM3190k & 16777215) | (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, iIntValue)) << 24);
        C8314Tg0 c8314Tg0 = this.f38333b;
        c8314Tg0.setColor(iMax);
        C7901Lh1 c7901Lh1 = this.f38340i;
        if (c7901Lh1 != null) {
            c8314Tg0.setColorFilter((ColorFilter) c7901Lh1.mo5063e());
        }
        AbstractC6378lg abstractC6378lg = this.f38342k;
        if (abstractC6378lg != null) {
            float fFloatValue = ((Float) abstractC6378lg.mo5063e()).floatValue();
            if (fFloatValue == 0.0f) {
                c8314Tg0.setMaskFilter(null);
            } else if (fFloatValue != this.f38343l) {
                AbstractC6504ng abstractC6504ng = this.f38334c;
                if (abstractC6504ng.f38439A == fFloatValue) {
                    blurMaskFilter = abstractC6504ng.f38440B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC6504ng.f38440B = blurMaskFilter2;
                    abstractC6504ng.f38439A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                c8314Tg0.setMaskFilter(blurMaskFilter);
            }
            this.f38343l = fFloatValue;
        }
        C4048fM c4048fM = this.f38344m;
        if (c4048fM != null) {
            C6809sD c6809sD = AbstractC7745Ih1.f5085a;
            c4048fM.m18219b(c8314Tg0, matrix, (int) (((f * iIntValue) / 255.0f) * 255.0f));
        }
        Path path = this.f38332a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f38337f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, c8314Tg0);
                return;
            } else {
                path.addPath(((InterfaceC10615pA0) arrayList.get(i2)).mo5778g(), matrix);
                i2++;
            }
        }
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f38335d;
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        PointF pointF = InterfaceC10947rm0.f41869a;
        if (colorFilter == 1) {
            this.f38338g.m22530j(es1);
            return;
        }
        if (colorFilter == 4) {
            this.f38339h.m22530j(es1);
            return;
        }
        ColorFilter colorFilter2 = InterfaceC10947rm0.f41863F;
        AbstractC6504ng abstractC6504ng = this.f38334c;
        if (colorFilter == colorFilter2) {
            C7901Lh1 c7901Lh1 = this.f38340i;
            if (c7901Lh1 != null) {
                abstractC6504ng.m23167p(c7901Lh1);
            }
            C7901Lh1 c7901Lh12 = new C7901Lh1(es1, null);
            this.f38340i = c7901Lh12;
            c7901Lh12.m22527a(this);
            abstractC6504ng.m23162e(this.f38340i);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41873e) {
            AbstractC6378lg abstractC6378lg = this.f38342k;
            if (abstractC6378lg != null) {
                abstractC6378lg.m22530j(es1);
                return;
            }
            C7901Lh1 c7901Lh13 = new C7901Lh1(es1, null);
            this.f38342k = c7901Lh13;
            c7901Lh13.m22527a(this);
            abstractC6504ng.m23162e(this.f38342k);
            return;
        }
        C4048fM c4048fM = this.f38344m;
        if (colorFilter == 5 && c4048fM != null) {
            c4048fM.f27147c.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41859B && c4048fM != null) {
            c4048fM.m18220c(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41860C && c4048fM != null) {
            c4048fM.f27149e.m22530j(es1);
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41861D && c4048fM != null) {
            c4048fM.f27150f.m22530j(es1);
        } else {
            if (colorFilter != InterfaceC10947rm0.f41862E || c4048fM == null) {
                return;
            }
            c4048fM.f27151g.m22530j(es1);
        }
    }
}

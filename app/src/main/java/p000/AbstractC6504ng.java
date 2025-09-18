package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: ng */
/* loaded from: classes.dex */
public abstract class AbstractC6504ng implements InterfaceC0463HL, InterfaceC4194hg, InterfaceC8000Nf0 {

    /* renamed from: A */
    public float f38439A;

    /* renamed from: B */
    public BlurMaskFilter f38440B;

    /* renamed from: C */
    public C8314Tg0 f38441C;

    /* renamed from: a */
    public final Path f38442a = new Path();

    /* renamed from: b */
    public final Matrix f38443b = new Matrix();

    /* renamed from: c */
    public final Matrix f38444c = new Matrix();

    /* renamed from: d */
    public final C8314Tg0 f38445d = new C8314Tg0(1, 0);

    /* renamed from: e */
    public final C8314Tg0 f38446e;

    /* renamed from: f */
    public final C8314Tg0 f38447f;

    /* renamed from: g */
    public final C8314Tg0 f38448g;

    /* renamed from: h */
    public final C8314Tg0 f38449h;

    /* renamed from: i */
    public final RectF f38450i;

    /* renamed from: j */
    public final RectF f38451j;

    /* renamed from: k */
    public final RectF f38452k;

    /* renamed from: l */
    public final RectF f38453l;

    /* renamed from: m */
    public final RectF f38454m;

    /* renamed from: n */
    public final Matrix f38455n;

    /* renamed from: o */
    public final C10307mm0 f38456o;

    /* renamed from: p */
    public final C8574Yg0 f38457p;

    /* renamed from: q */
    public final C10910rT1 f38458q;

    /* renamed from: r */
    public final C6494nW f38459r;

    /* renamed from: s */
    public AbstractC6504ng f38460s;

    /* renamed from: t */
    public AbstractC6504ng f38461t;

    /* renamed from: u */
    public List f38462u;

    /* renamed from: v */
    public final ArrayList f38463v;

    /* renamed from: w */
    public final C11056sc1 f38464w;

    /* renamed from: x */
    public boolean f38465x;

    /* renamed from: y */
    public boolean f38466y;

    /* renamed from: z */
    public C8314Tg0 f38467z;

    public AbstractC6504ng(C10307mm0 c10307mm0, C8574Yg0 c8574Yg0) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f38446e = new C8314Tg0(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f38447f = new C8314Tg0(mode2);
        C8314Tg0 c8314Tg0 = new C8314Tg0(1, 0);
        this.f38448g = c8314Tg0;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C8314Tg0 c8314Tg02 = new C8314Tg0();
        c8314Tg02.setXfermode(new PorterDuffXfermode(mode3));
        this.f38449h = c8314Tg02;
        this.f38450i = new RectF();
        this.f38451j = new RectF();
        this.f38452k = new RectF();
        this.f38453l = new RectF();
        this.f38454m = new RectF();
        this.f38455n = new Matrix();
        this.f38463v = new ArrayList();
        this.f38465x = true;
        this.f38439A = 0.0f;
        this.f38456o = c10307mm0;
        this.f38457p = c8574Yg0;
        if (c8574Yg0.f14438u == 3) {
            c8314Tg0.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c8314Tg0.setXfermode(new PorterDuffXfermode(mode));
        }
        C0949P4 c0949p4 = c8574Yg0.f14426i;
        c0949p4.getClass();
        C11056sc1 c11056sc1 = new C11056sc1(c0949p4);
        this.f38464w = c11056sc1;
        c11056sc1.m24751b(this);
        List list = c8574Yg0.f14425h;
        if (list != null && !list.isEmpty()) {
            C10910rT1 c10910rT1 = new C10910rT1(list);
            this.f38458q = c10910rT1;
            Iterator it = ((ArrayList) c10910rT1.f41678b).iterator();
            while (it.hasNext()) {
                ((AbstractC6378lg) it.next()).m22527a(this);
            }
            Iterator it2 = ((ArrayList) this.f38458q.f41679c).iterator();
            while (it2.hasNext()) {
                AbstractC6378lg abstractC6378lg = (AbstractC6378lg) it2.next();
                m23162e(abstractC6378lg);
                abstractC6378lg.m22527a(this);
            }
        }
        C8574Yg0 c8574Yg02 = this.f38457p;
        if (c8574Yg02.f14437t.isEmpty()) {
            if (true != this.f38465x) {
                this.f38465x = true;
                this.f38456o.invalidateSelf();
                return;
            }
            return;
        }
        C6494nW c6494nW = new C6494nW(c8574Yg02.f14437t);
        this.f38459r = c6494nW;
        c6494nW.f37229b = true;
        c6494nW.m22527a(new InterfaceC4194hg() { // from class: mg
            @Override // p000.InterfaceC4194hg
            /* renamed from: a */
            public final void mo1741a() {
                AbstractC6504ng abstractC6504ng = this.f37824a;
                boolean z = abstractC6504ng.f38459r.m23152k() == 1.0f;
                if (z != abstractC6504ng.f38465x) {
                    abstractC6504ng.f38465x = z;
                    abstractC6504ng.f38456o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.f38459r.mo5063e()).floatValue() == 1.0f;
        if (z != this.f38465x) {
            this.f38465x = z;
            this.f38456o.invalidateSelf();
        }
        m23162e(this.f38459r);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f38456o.invalidateSelf();
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC6504ng abstractC6504ng = this.f38460s;
        C8574Yg0 c8574Yg0 = this.f38457p;
        if (abstractC6504ng != null) {
            String str = abstractC6504ng.f38457p.f14420c;
            c7948Mf02.getClass();
            C7948Mf0 c7948Mf03 = new C7948Mf0(c7948Mf02);
            c7948Mf03.f7293a.add(str);
            if (c7948Mf0.m5413a(i, this.f38460s.f38457p.f14420c)) {
                AbstractC6504ng abstractC6504ng2 = this.f38460s;
                C7948Mf0 c7948Mf04 = new C7948Mf0(c7948Mf03);
                c7948Mf04.f7294b = abstractC6504ng2;
                arrayList.add(c7948Mf04);
            }
            if (c7948Mf0.m5416d(i, c8574Yg0.f14420c)) {
                this.f38460s.mo8509q(c7948Mf0, c7948Mf0.m5414b(i, this.f38460s.f38457p.f14420c) + i, arrayList, c7948Mf03);
            }
        }
        if (c7948Mf0.m5415c(i, c8574Yg0.f14420c)) {
            String str2 = c8574Yg0.f14420c;
            if (!"__container".equals(str2)) {
                c7948Mf02.getClass();
                C7948Mf0 c7948Mf05 = new C7948Mf0(c7948Mf02);
                c7948Mf05.f7293a.add(str2);
                if (c7948Mf0.m5413a(i, str2)) {
                    C7948Mf0 c7948Mf06 = new C7948Mf0(c7948Mf05);
                    c7948Mf06.f7294b = this;
                    arrayList.add(c7948Mf06);
                }
                c7948Mf02 = c7948Mf05;
            }
            if (c7948Mf0.m5416d(i, str2)) {
                mo8509q(c7948Mf0, c7948Mf0.m5414b(i, str2) + i, arrayList, c7948Mf02);
            }
        }
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: d */
    public void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        this.f38450i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m23163i();
        Matrix matrix2 = this.f38455n;
        matrix2.set(matrix);
        if (z) {
            List list = this.f38462u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC6504ng) this.f38462u.get(size)).f38464w.m24754e());
                }
            } else {
                AbstractC6504ng abstractC6504ng = this.f38461t;
                if (abstractC6504ng != null) {
                    matrix2.preConcat(abstractC6504ng.f38464w.m24754e());
                }
            }
        }
        matrix2.preConcat(this.f38464w.m24754e());
    }

    /* renamed from: e */
    public final void m23162e(AbstractC6378lg abstractC6378lg) {
        if (abstractC6378lg == null) {
            return;
        }
        this.f38463v.add(abstractC6378lg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0111  */
    @Override // p000.InterfaceC0463HL
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1745f(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6504ng.mo1745f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: h */
    public void mo1746h(ColorFilter colorFilter, ES1 es1) {
        this.f38464w.m24752c(colorFilter, es1);
    }

    /* renamed from: i */
    public final void m23163i() {
        if (this.f38462u != null) {
            return;
        }
        if (this.f38461t == null) {
            this.f38462u = Collections.emptyList();
            return;
        }
        this.f38462u = new ArrayList();
        for (AbstractC6504ng abstractC6504ng = this.f38461t; abstractC6504ng != null; abstractC6504ng = abstractC6504ng.f38461t) {
            this.f38462u.add(abstractC6504ng);
        }
    }

    /* renamed from: j */
    public final void m23164j(Canvas canvas) {
        RectF rectF = this.f38450i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f38449h);
    }

    /* renamed from: k */
    public abstract void mo5542k(Canvas canvas, Matrix matrix, int i);

    /* renamed from: l */
    public C7621Fx1 mo8507l() {
        return this.f38457p.f14440w;
    }

    /* renamed from: m */
    public C6937uF mo8508m() {
        return this.f38457p.f14441x;
    }

    /* renamed from: n */
    public final boolean m23165n() {
        C10910rT1 c10910rT1 = this.f38458q;
        return (c10910rT1 == null || ((ArrayList) c10910rT1.f41678b).isEmpty()) ? false : true;
    }

    /* renamed from: o */
    public final void m23166o() {
        KA0 ka0 = this.f38456o.f37887a.f13947a;
        String str = this.f38457p.f14420c;
        if (ka0.f5927a) {
            HashMap map = ka0.f5929c;
            C11717xo0 c11717xo0 = (C11717xo0) map.get(str);
            if (c11717xo0 == null) {
                c11717xo0 = new C11717xo0();
                map.put(str, c11717xo0);
            }
            int i = c11717xo0.f45798a + 1;
            c11717xo0.f45798a = i;
            if (i == Integer.MAX_VALUE) {
                c11717xo0.f45798a = i / 2;
            }
            if (str.equals("__container")) {
                C0135C8 c0135c8 = ka0.f5928b;
                c0135c8.getClass();
                C6804s8 c6804s8 = new C6804s8(c0135c8);
                if (c6804s8.hasNext()) {
                    c6804s8.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    /* renamed from: p */
    public final void m23167p(AbstractC6378lg abstractC6378lg) {
        this.f38463v.remove(abstractC6378lg);
    }

    /* renamed from: r */
    public void mo18917r(boolean z) {
        if (z && this.f38467z == null) {
            this.f38467z = new C8314Tg0();
        }
        this.f38466y = z;
    }

    /* renamed from: s */
    public void mo18918s(float f) {
        C11056sc1 c11056sc1 = this.f38464w;
        AbstractC6378lg abstractC6378lg = c11056sc1.f42510j;
        if (abstractC6378lg != null) {
            abstractC6378lg.mo5065i(f);
        }
        AbstractC6378lg abstractC6378lg2 = c11056sc1.f42513m;
        if (abstractC6378lg2 != null) {
            abstractC6378lg2.mo5065i(f);
        }
        AbstractC6378lg abstractC6378lg3 = c11056sc1.f42514n;
        if (abstractC6378lg3 != null) {
            abstractC6378lg3.mo5065i(f);
        }
        AbstractC6378lg abstractC6378lg4 = c11056sc1.f42506f;
        if (abstractC6378lg4 != null) {
            abstractC6378lg4.mo5065i(f);
        }
        AbstractC6378lg abstractC6378lg5 = c11056sc1.f42507g;
        if (abstractC6378lg5 != null) {
            abstractC6378lg5.mo5065i(f);
        }
        AbstractC6378lg abstractC6378lg6 = c11056sc1.f42508h;
        if (abstractC6378lg6 != null) {
            abstractC6378lg6.mo5065i(f);
        }
        AbstractC6378lg abstractC6378lg7 = c11056sc1.f42509i;
        if (abstractC6378lg7 != null) {
            abstractC6378lg7.mo5065i(f);
        }
        C6494nW c6494nW = c11056sc1.f42511k;
        if (c6494nW != null) {
            c6494nW.mo5065i(f);
        }
        C6494nW c6494nW2 = c11056sc1.f42512l;
        if (c6494nW2 != null) {
            c6494nW2.mo5065i(f);
        }
        C10910rT1 c10910rT1 = this.f38458q;
        int i = 0;
        if (c10910rT1 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c10910rT1.f41678b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((AbstractC6378lg) arrayList.get(i2)).mo5065i(f);
                i2++;
            }
        }
        C6494nW c6494nW3 = this.f38459r;
        if (c6494nW3 != null) {
            c6494nW3.mo5065i(f);
        }
        AbstractC6504ng abstractC6504ng = this.f38460s;
        if (abstractC6504ng != null) {
            abstractC6504ng.mo18918s(f);
        }
        while (true) {
            ArrayList arrayList2 = this.f38463v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC6378lg) arrayList2.get(i)).mo5065i(f);
            i++;
        }
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
    }

    /* renamed from: q */
    public void mo8509q(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
    }
}

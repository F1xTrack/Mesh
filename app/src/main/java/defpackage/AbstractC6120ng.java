package defpackage;

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
public abstract class AbstractC6120ng implements HL, InterfaceC4198hg, InterfaceC1049Nf0 {
    public float A;
    public BlurMaskFilter B;
    public C1520Tg0 C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final C1520Tg0 d = new C1520Tg0(1, 0);
    public final C1520Tg0 e;
    public final C1520Tg0 f;
    public final C1520Tg0 g;
    public final C1520Tg0 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final C5948mm0 o;
    public final C1910Yg0 p;
    public final C6846rT1 q;
    public final C6090nW r;
    public AbstractC6120ng s;
    public AbstractC6120ng t;
    public List u;
    public final ArrayList v;
    public final C7064sc1 w;
    public boolean x;
    public boolean y;
    public C1520Tg0 z;

    public AbstractC6120ng(C5948mm0 c5948mm0, C1910Yg0 c1910Yg0) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new C1520Tg0(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new C1520Tg0(mode2);
        C1520Tg0 c1520Tg0 = new C1520Tg0(1, 0);
        this.g = c1520Tg0;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C1520Tg0 c1520Tg02 = new C1520Tg0();
        c1520Tg02.setXfermode(new PorterDuffXfermode(mode3));
        this.h = c1520Tg02;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = c5948mm0;
        this.p = c1910Yg0;
        if (c1910Yg0.u == 3) {
            c1520Tg0.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c1520Tg0.setXfermode(new PorterDuffXfermode(mode));
        }
        P4 p4 = c1910Yg0.i;
        p4.getClass();
        C7064sc1 c7064sc1 = new C7064sc1(p4);
        this.w = c7064sc1;
        c7064sc1.b(this);
        List list = c1910Yg0.h;
        if (list != null && !list.isEmpty()) {
            C6846rT1 c6846rT1 = new C6846rT1(list);
            this.q = c6846rT1;
            Iterator it = ((ArrayList) c6846rT1.b).iterator();
            while (it.hasNext()) {
                ((AbstractC5738lg) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.q.c).iterator();
            while (it2.hasNext()) {
                AbstractC5738lg abstractC5738lg = (AbstractC5738lg) it2.next();
                e(abstractC5738lg);
                abstractC5738lg.a(this);
            }
        }
        C1910Yg0 c1910Yg02 = this.p;
        if (c1910Yg02.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        C6090nW c6090nW = new C6090nW(c1910Yg02.t);
        this.r = c6090nW;
        c6090nW.b = true;
        c6090nW.a(new InterfaceC4198hg() { // from class: mg
            @Override // defpackage.InterfaceC4198hg
            public final void a() {
                AbstractC6120ng abstractC6120ng = this.a;
                boolean z = abstractC6120ng.r.k() == 1.0f;
                if (z != abstractC6120ng.x) {
                    abstractC6120ng.x = z;
                    abstractC6120ng.o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        e(this.r);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC6120ng abstractC6120ng = this.s;
        C1910Yg0 c1910Yg0 = this.p;
        if (abstractC6120ng != null) {
            String str = abstractC6120ng.p.c;
            c0971Mf02.getClass();
            C0971Mf0 c0971Mf03 = new C0971Mf0(c0971Mf02);
            c0971Mf03.a.add(str);
            if (c0971Mf0.a(i, this.s.p.c)) {
                AbstractC6120ng abstractC6120ng2 = this.s;
                C0971Mf0 c0971Mf04 = new C0971Mf0(c0971Mf03);
                c0971Mf04.b = abstractC6120ng2;
                arrayList.add(c0971Mf04);
            }
            if (c0971Mf0.d(i, c1910Yg0.c)) {
                this.s.q(c0971Mf0, c0971Mf0.b(i, this.s.p.c) + i, arrayList, c0971Mf03);
            }
        }
        if (c0971Mf0.c(i, c1910Yg0.c)) {
            String str2 = c1910Yg0.c;
            if (!"__container".equals(str2)) {
                c0971Mf02.getClass();
                C0971Mf0 c0971Mf05 = new C0971Mf0(c0971Mf02);
                c0971Mf05.a.add(str2);
                if (c0971Mf0.a(i, str2)) {
                    C0971Mf0 c0971Mf06 = new C0971Mf0(c0971Mf05);
                    c0971Mf06.b = this;
                    arrayList.add(c0971Mf06);
                }
                c0971Mf02 = c0971Mf05;
            }
            if (c0971Mf0.d(i, str2)) {
                q(c0971Mf0, c0971Mf0.b(i, str2) + i, arrayList, c0971Mf02);
            }
        }
    }

    @Override // defpackage.HL
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC6120ng) this.u.get(size)).w.e());
                }
            } else {
                AbstractC6120ng abstractC6120ng = this.t;
                if (abstractC6120ng != null) {
                    matrix2.preConcat(abstractC6120ng.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void e(AbstractC5738lg abstractC5738lg) {
        if (abstractC5738lg == null) {
            return;
        }
        this.v.add(abstractC5738lg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0111  */
    @Override // defpackage.HL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6120ng.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public void h(ColorFilter colorFilter, ES1 es1) {
        this.w.c(colorFilter, es1);
    }

    public final void i() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.emptyList();
            return;
        }
        this.u = new ArrayList();
        for (AbstractC6120ng abstractC6120ng = this.t; abstractC6120ng != null; abstractC6120ng = abstractC6120ng.t) {
            this.u.add(abstractC6120ng);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i);

    public C0481Fx1 l() {
        return this.p.w;
    }

    public C7375uF m() {
        return this.p.x;
    }

    public final boolean n() {
        C6846rT1 c6846rT1 = this.q;
        return (c6846rT1 == null || ((ArrayList) c6846rT1.b).isEmpty()) ? false : true;
    }

    public final void o() {
        KA0 ka0 = this.o.a.a;
        String str = this.p.c;
        if (ka0.a) {
            HashMap map = ka0.c;
            C8052xo0 c8052xo0 = (C8052xo0) map.get(str);
            if (c8052xo0 == null) {
                c8052xo0 = new C8052xo0();
                map.put(str, c8052xo0);
            }
            int i = c8052xo0.a + 1;
            c8052xo0.a = i;
            if (i == Integer.MAX_VALUE) {
                c8052xo0.a = i / 2;
            }
            if (str.equals("__container")) {
                C8 c8 = ka0.b;
                c8.getClass();
                C6972s8 c6972s8 = new C6972s8(c8);
                if (c6972s8.hasNext()) {
                    c6972s8.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void p(AbstractC5738lg abstractC5738lg) {
        this.v.remove(abstractC5738lg);
    }

    public void r(boolean z) {
        if (z && this.z == null) {
            this.z = new C1520Tg0();
        }
        this.y = z;
    }

    public void s(float f) {
        C7064sc1 c7064sc1 = this.w;
        AbstractC5738lg abstractC5738lg = c7064sc1.j;
        if (abstractC5738lg != null) {
            abstractC5738lg.i(f);
        }
        AbstractC5738lg abstractC5738lg2 = c7064sc1.m;
        if (abstractC5738lg2 != null) {
            abstractC5738lg2.i(f);
        }
        AbstractC5738lg abstractC5738lg3 = c7064sc1.n;
        if (abstractC5738lg3 != null) {
            abstractC5738lg3.i(f);
        }
        AbstractC5738lg abstractC5738lg4 = c7064sc1.f;
        if (abstractC5738lg4 != null) {
            abstractC5738lg4.i(f);
        }
        AbstractC5738lg abstractC5738lg5 = c7064sc1.g;
        if (abstractC5738lg5 != null) {
            abstractC5738lg5.i(f);
        }
        AbstractC5738lg abstractC5738lg6 = c7064sc1.h;
        if (abstractC5738lg6 != null) {
            abstractC5738lg6.i(f);
        }
        AbstractC5738lg abstractC5738lg7 = c7064sc1.i;
        if (abstractC5738lg7 != null) {
            abstractC5738lg7.i(f);
        }
        C6090nW c6090nW = c7064sc1.k;
        if (c6090nW != null) {
            c6090nW.i(f);
        }
        C6090nW c6090nW2 = c7064sc1.l;
        if (c6090nW2 != null) {
            c6090nW2.i(f);
        }
        C6846rT1 c6846rT1 = this.q;
        int i = 0;
        if (c6846rT1 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c6846rT1.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((AbstractC5738lg) arrayList.get(i2)).i(f);
                i2++;
            }
        }
        C6090nW c6090nW3 = this.r;
        if (c6090nW3 != null) {
            c6090nW3.i(f);
        }
        AbstractC6120ng abstractC6120ng = this.s;
        if (abstractC6120ng != null) {
            abstractC6120ng.s(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC5738lg) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
    }

    public void q(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: hw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4246hw extends AbstractC6120ng {
    public AbstractC5738lg D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final Paint H;
    public float I;
    public boolean J;

    public C4246hw(C5948mm0 c5948mm0, C1910Yg0 c1910Yg0, List list, C1847Xl0 c1847Xl0) {
        AbstractC6120ng abstractC6120ng;
        AbstractC6120ng c4246hw;
        String str;
        super(c5948mm0, c1910Yg0);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.J = true;
        L4 l4 = c1910Yg0.s;
        if (l4 != null) {
            C6090nW c6090nWM0 = l4.M0();
            this.D = c6090nWM0;
            e(c6090nWM0);
            this.D.a(this);
        } else {
            this.D = null;
        }
        C0366El0 c0366El0 = new C0366El0(c1847Xl0.j.size());
        int size = list.size() - 1;
        AbstractC6120ng abstractC6120ng2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < c0366El0.l(); i++) {
                    if (c0366El0.a) {
                        c0366El0.i();
                    }
                    AbstractC6120ng abstractC6120ng3 = (AbstractC6120ng) c0366El0.j(c0366El0.b[i], null);
                    if (abstractC6120ng3 != null && (abstractC6120ng = (AbstractC6120ng) c0366El0.j(abstractC6120ng3.p.f, null)) != null) {
                        abstractC6120ng3.t = abstractC6120ng;
                    }
                }
                return;
            }
            C1910Yg0 c1910Yg02 = (C1910Yg0) list.get(size);
            int iX = AbstractC8235ym.x(c1910Yg02.e);
            if (iX == 0) {
                c4246hw = new C4246hw(c5948mm0, c1910Yg02, (List) c1847Xl0.c.get(c1910Yg02.g), c1847Xl0);
            } else if (iX == 1) {
                c4246hw = new N60(c5948mm0, c1910Yg02, 1);
            } else if (iX == 2) {
                c4246hw = new N60(c5948mm0, c1910Yg02, 0);
            } else if (iX == 3) {
                c4246hw = new C8266yw0(c5948mm0, c1910Yg02);
            } else if (iX == 4) {
                c4246hw = new VZ0(c5948mm0, c1910Yg02, this, c1847Xl0);
            } else if (iX != 5) {
                switch (c1910Yg02.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                        break;
                    default:
                        str = "null";
                        break;
                }
                AbstractC7281tl0.b("Unknown layer type ".concat(str));
                c4246hw = null;
            } else {
                c4246hw = new C8310z91(c5948mm0, c1910Yg02);
            }
            if (c4246hw != null) {
                c0366El0.k(c4246hw.p.d, c4246hw);
                if (abstractC6120ng2 != null) {
                    abstractC6120ng2.s = c4246hw;
                    abstractC6120ng2 = null;
                } else {
                    this.E.add(0, c4246hw);
                    int iX2 = AbstractC8235ym.x(c1910Yg02.u);
                    if (iX2 == 1 || iX2 == 2) {
                        abstractC6120ng2 = c4246hw;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.AbstractC6120ng, defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC6120ng) arrayList.get(size)).d(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.AbstractC6120ng, defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        super.h(colorFilter, es1);
        if (colorFilter == InterfaceC6902rm0.z) {
            C0901Lh1 c0901Lh1 = new C0901Lh1(es1, null);
            this.D = c0901Lh1;
            c0901Lh1.a(this);
            e(this.D);
        }
    }

    @Override // defpackage.AbstractC6120ng
    public final void k(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.G;
        C1910Yg0 c1910Yg0 = this.p;
        rectF.set(0.0f, 0.0f, c1910Yg0.o, c1910Yg0.p);
        matrix.mapRect(rectF);
        boolean z = this.o.u;
        ArrayList arrayList = this.E;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.H;
            paint.setAlpha(i);
            C6987sD c6987sD = AbstractC0667Ih1.a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.J || !"__container".equals(c1910Yg0.c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((AbstractC6120ng) arrayList.get(size)).f(canvas, matrix, i);
            }
        }
        canvas.restore();
    }

    @Override // defpackage.AbstractC6120ng
    public final void q(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((AbstractC6120ng) arrayList2.get(i2)).c(c0971Mf0, i, arrayList, c0971Mf02);
            i2++;
        }
    }

    @Override // defpackage.AbstractC6120ng
    public final void r(boolean z) {
        super.r(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((AbstractC6120ng) it.next()).r(z);
        }
    }

    @Override // defpackage.AbstractC6120ng
    public final void s(float f) {
        this.I = f;
        super.s(f);
        AbstractC5738lg abstractC5738lg = this.D;
        C1910Yg0 c1910Yg0 = this.p;
        if (abstractC5738lg != null) {
            C1847Xl0 c1847Xl0 = this.o.a;
            f = ((((Float) abstractC5738lg.e()).floatValue() * c1910Yg0.b.n) - c1910Yg0.b.l) / ((c1847Xl0.m - c1847Xl0.l) + 0.01f);
        }
        if (this.D == null) {
            C1847Xl0 c1847Xl02 = c1910Yg0.b;
            f -= c1910Yg0.n / (c1847Xl02.m - c1847Xl02.l);
        }
        if (c1910Yg0.m != 0.0f && !"__container".equals(c1910Yg0.c)) {
            f /= c1910Yg0.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC6120ng) arrayList.get(size)).s(f);
        }
    }
}

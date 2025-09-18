package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: hw */
/* loaded from: classes.dex */
public final class C4210hw extends AbstractC6504ng {

    /* renamed from: D */
    public AbstractC6378lg f28680D;

    /* renamed from: E */
    public final ArrayList f28681E;

    /* renamed from: F */
    public final RectF f28682F;

    /* renamed from: G */
    public final RectF f28683G;

    /* renamed from: H */
    public final Paint f28684H;

    /* renamed from: I */
    public float f28685I;

    /* renamed from: J */
    public boolean f28686J;

    public C4210hw(C10307mm0 c10307mm0, C8574Yg0 c8574Yg0, List list, C8532Xl0 c8532Xl0) {
        AbstractC6504ng abstractC6504ng;
        AbstractC6504ng c4210hw;
        String str;
        super(c10307mm0, c8574Yg0);
        this.f28681E = new ArrayList();
        this.f28682F = new RectF();
        this.f28683G = new RectF();
        this.f28684H = new Paint();
        this.f28686J = true;
        C0698L4 c0698l4 = c8574Yg0.f14436s;
        if (c0698l4 != null) {
            C6494nW c6494nWMo4553M0 = c0698l4.mo4553M0();
            this.f28680D = c6494nWMo4553M0;
            m23162e(c6494nWMo4553M0);
            this.f28680D.m22527a(this);
        } else {
            this.f28680D = null;
        }
        C7544El0 c7544El0 = new C7544El0(c8532Xl0.f13956j.size());
        int size = list.size() - 1;
        AbstractC6504ng abstractC6504ng2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < c7544El0.m2384l(); i++) {
                    if (c7544El0.f2881a) {
                        c7544El0.m2381i();
                    }
                    AbstractC6504ng abstractC6504ng3 = (AbstractC6504ng) c7544El0.m2382j(c7544El0.f2882b[i], null);
                    if (abstractC6504ng3 != null && (abstractC6504ng = (AbstractC6504ng) c7544El0.m2382j(abstractC6504ng3.f38457p.f14423f, null)) != null) {
                        abstractC6504ng3.f38461t = abstractC6504ng;
                    }
                }
                return;
            }
            C8574Yg0 c8574Yg02 = (C8574Yg0) list.get(size);
            int iM26247x = AbstractC7222ym.m26247x(c8574Yg02.f14422e);
            if (iM26247x == 0) {
                c4210hw = new C4210hw(c10307mm0, c8574Yg02, (List) c8532Xl0.f13949c.get(c8574Yg02.f14424g), c8532Xl0);
            } else if (iM26247x == 1) {
                c4210hw = new N60(c10307mm0, c8574Yg02, 1);
            } else if (iM26247x == 2) {
                c4210hw = new N60(c10307mm0, c8574Yg02, 0);
            } else if (iM26247x == 3) {
                c4210hw = new C11860yw0(c10307mm0, c8574Yg02);
            } else if (iM26247x == 4) {
                c4210hw = new VZ0(c10307mm0, c8574Yg02, this, c8532Xl0);
            } else if (iM26247x != 5) {
                switch (c8574Yg02.f14422e) {
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
                AbstractC11201tl0.m24980b("Unknown layer type ".concat(str));
                c4210hw = null;
            } else {
                c4210hw = new C11890z91(c10307mm0, c8574Yg02);
            }
            if (c4210hw != null) {
                c7544El0.m2383k(c4210hw.f38457p.f14421d, c4210hw);
                if (abstractC6504ng2 != null) {
                    abstractC6504ng2.f38460s = c4210hw;
                    abstractC6504ng2 = null;
                } else {
                    this.f28681E.add(0, c4210hw);
                    int iM26247x2 = AbstractC7222ym.m26247x(c8574Yg02.f14438u);
                    if (iM26247x2 == 1 || iM26247x2 == 2) {
                        abstractC6504ng2 = c4210hw;
                    }
                }
            }
            size--;
        }
    }

    @Override // p000.AbstractC6504ng, p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1744d(rectF, matrix, z);
        ArrayList arrayList = this.f28681E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f28682F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC6504ng) arrayList.get(size)).mo1744d(rectF2, this.f38455n, true);
            rectF.union(rectF2);
        }
    }

    @Override // p000.AbstractC6504ng, p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        super.mo1746h(colorFilter, es1);
        if (colorFilter == InterfaceC10947rm0.f41894z) {
            C7901Lh1 c7901Lh1 = new C7901Lh1(es1, null);
            this.f28680D = c7901Lh1;
            c7901Lh1.m22527a(this);
            m23162e(this.f28680D);
        }
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: k */
    public final void mo5542k(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f28683G;
        C8574Yg0 c8574Yg0 = this.f38457p;
        rectF.set(0.0f, 0.0f, c8574Yg0.f14432o, c8574Yg0.f14433p);
        matrix.mapRect(rectF);
        boolean z = this.f38456o.f37907u;
        ArrayList arrayList = this.f28681E;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.f28684H;
            paint.setAlpha(i);
            C6809sD c6809sD = AbstractC7745Ih1.f5085a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.f28686J || !"__container".equals(c8574Yg0.f14420c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((AbstractC6504ng) arrayList.get(size)).mo1745f(canvas, matrix, i);
            }
        }
        canvas.restore();
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: q */
    public final void mo8509q(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f28681E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((AbstractC6504ng) arrayList2.get(i2)).mo1743c(c7948Mf0, i, arrayList, c7948Mf02);
            i2++;
        }
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: r */
    public final void mo18917r(boolean z) {
        super.mo18917r(z);
        Iterator it = this.f28681E.iterator();
        while (it.hasNext()) {
            ((AbstractC6504ng) it.next()).mo18917r(z);
        }
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: s */
    public final void mo18918s(float f) {
        this.f28685I = f;
        super.mo18918s(f);
        AbstractC6378lg abstractC6378lg = this.f28680D;
        C8574Yg0 c8574Yg0 = this.f38457p;
        if (abstractC6378lg != null) {
            C8532Xl0 c8532Xl0 = this.f38456o.f37887a;
            f = ((((Float) abstractC6378lg.mo5063e()).floatValue() * c8574Yg0.f14419b.f13960n) - c8574Yg0.f14419b.f13958l) / ((c8532Xl0.f13959m - c8532Xl0.f13958l) + 0.01f);
        }
        if (this.f28680D == null) {
            C8532Xl0 c8532Xl02 = c8574Yg0.f14419b;
            f -= c8574Yg0.f14431n / (c8532Xl02.f13959m - c8532Xl02.f13958l);
        }
        if (c8574Yg0.f14430m != 0.0f && !"__container".equals(c8574Yg0.f14420c)) {
            f /= c8574Yg0.f14430m;
        }
        ArrayList arrayList = this.f28681E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC6504ng) arrayList.get(size)).mo18918s(f);
        }
    }
}

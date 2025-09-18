package p000;

import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.C1993g;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K10 {

    /* renamed from: A */
    public double[] f5836A;

    /* renamed from: B */
    public int f5837B;

    /* renamed from: C */
    public int f5838C;

    /* renamed from: D */
    public int f5839D;

    /* renamed from: E */
    public int f5840E;

    /* renamed from: F */
    public int f5841F;

    /* renamed from: G */
    public int f5842G;

    /* renamed from: H */
    public int f5843H;

    /* renamed from: I */
    public int f5844I;

    /* renamed from: J */
    public int f5845J;

    /* renamed from: K */
    public int f5846K;

    /* renamed from: L */
    public int f5847L;

    /* renamed from: M */
    public final float f5848M;

    /* renamed from: N */
    public final float f5849N;

    /* renamed from: O */
    public final float f5850O;

    /* renamed from: a */
    public final ArrayList f5851a;

    /* renamed from: b */
    public final ArrayList f5852b;

    /* renamed from: c */
    public final ArrayList f5853c;

    /* renamed from: d */
    public final ArrayList f5854d;

    /* renamed from: e */
    public final ArrayList f5855e;

    /* renamed from: f */
    public final ArrayList f5856f;

    /* renamed from: g */
    public final ArrayList f5857g;

    /* renamed from: h */
    public final ArrayList f5858h;

    /* renamed from: i */
    public final ArrayList f5859i;

    /* renamed from: j */
    public final ArrayList f5860j;

    /* renamed from: k */
    public final ArrayList f5861k;

    /* renamed from: l */
    public final ArrayList f5862l;

    /* renamed from: m */
    public final ArrayList f5863m;

    /* renamed from: n */
    public final ArrayList f5864n;

    /* renamed from: o */
    public final ArrayList f5865o;

    /* renamed from: p */
    public final ArrayList f5866p;

    /* renamed from: q */
    public double f5867q;

    /* renamed from: r */
    public C1417WW f5868r;

    /* renamed from: s */
    public double f5869s;

    /* renamed from: t */
    public double f5870t;

    /* renamed from: u */
    public double f5871u;

    /* renamed from: v */
    public double f5872v;

    /* renamed from: w */
    public C11931zU0[] f5873w;

    /* renamed from: x */
    public C11931zU0[] f5874x;

    /* renamed from: y */
    public C11931zU0[] f5875y;

    /* renamed from: z */
    public C11931zU0[] f5876z;

    public K10(float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        this.f5851a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f5852b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f5853c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f5854d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.f5855e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.f5856f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        this.f5857g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        this.f5858h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        this.f5859i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        this.f5860j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        this.f5861k = arrayList11;
        this.f5862l = new ArrayList();
        this.f5863m = new ArrayList();
        this.f5864n = new ArrayList();
        this.f5865o = new ArrayList();
        this.f5866p = new ArrayList();
        this.f5867q = 12.0d;
        this.f5868r = C1417WW.f13221p;
        C11931zU0[] c11931zU0Arr = new C11931zU0[0];
        this.f5873w = c11931zU0Arr;
        this.f5874x = new C11931zU0[0];
        this.f5875y = new C11931zU0[0];
        this.f5876z = new C11931zU0[0];
        this.f5836A = new double[]{ConfigValue.DOUBLE_DEFAULT_VALUE};
        this.f5842G = -1;
        this.f5843H = -1;
        this.f5844I = -1;
        this.f5845J = -1;
        this.f5846K = -1;
        this.f5848M = f;
        this.f5849N = f2;
        this.f5850O = f3;
        arrayList2.add(c11931zU0Arr);
        arrayList3.add(this.f5874x);
        arrayList4.add(this.f5875y);
        arrayList5.add(this.f5876z);
        arrayList6.add(this.f5836A);
        arrayList7.add(Integer.valueOf(this.f5842G));
        arrayList8.add(Integer.valueOf(this.f5843H));
        arrayList9.add(Integer.valueOf(this.f5844I));
        arrayList10.add(Integer.valueOf(this.f5845J));
        arrayList11.add(Integer.valueOf(this.f5846K));
        arrayList.add(this.f5868r);
        m4518e();
    }

    /* renamed from: a */
    public static C11931zU0[] m4514a(ArrayList arrayList) {
        int size = arrayList.size();
        C11931zU0[] c11931zU0Arr = new C11931zU0[size];
        for (int i = 0; i < size; i++) {
            c11931zU0Arr[i] = (C11931zU0) arrayList.get(i);
        }
        return c11931zU0Arr;
    }

    /* renamed from: b */
    public static void m4515b(int i, ArrayList arrayList) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(((Integer) arrayList.get(i)).intValue() + 1));
            i--;
        }
    }

    /* renamed from: c */
    public final double m4516c(double d) {
        m4515b(this.f5837B, this.f5857g);
        int i = this.f5842G + 1;
        C11931zU0[] c11931zU0Arr = this.f5873w;
        if (i < c11931zU0Arr.length) {
            this.f5871u = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f5842G = i;
            this.f5869s = GM1.m3049b(c11931zU0Arr[i], this.f5849N, this.f5848M, this.f5867q);
        }
        double d2 = this.f5869s + d;
        this.f5869s = d2;
        return d2;
    }

    /* renamed from: d */
    public final double m4517d() {
        m4515b(this.f5838C, this.f5858h);
        int i = this.f5843H + 1;
        C11931zU0[] c11931zU0Arr = this.f5874x;
        if (i < c11931zU0Arr.length) {
            this.f5872v = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f5843H = i;
            this.f5870t = GM1.m3049b(c11931zU0Arr[i], this.f5850O, this.f5848M, this.f5867q);
        }
        return this.f5870t;
    }

    /* renamed from: e */
    public final void m4518e() {
        this.f5862l.add(Integer.valueOf(this.f5837B));
        this.f5863m.add(Integer.valueOf(this.f5838C));
        this.f5864n.add(Integer.valueOf(this.f5839D));
        this.f5865o.add(Integer.valueOf(this.f5840E));
        this.f5866p.add(Integer.valueOf(this.f5841F));
    }

    /* renamed from: f */
    public final void m4519f(C1993g c1993g, ReadableMap readableMap) {
        C1417WW c1417ww;
        if (this.f5847L > 0) {
            c1417ww = this.f5868r;
        } else {
            C1993g parentTextRoot = c1993g.getParentTextRoot();
            while (true) {
                if (parentTextRoot == null) {
                    c1417ww = C1417WW.f13221p;
                    break;
                }
                C1417WW c1417ww2 = parentTextRoot.f18603b.f5868r;
                if (c1417ww2 != C1417WW.f13221p) {
                    c1417ww = c1417ww2;
                    break;
                }
                parentTextRoot = parentTextRoot.getParentTextRoot();
            }
        }
        this.f5847L++;
        ArrayList arrayList = this.f5851a;
        if (readableMap == null) {
            arrayList.add(c1417ww);
            return;
        }
        C1417WW c1417ww3 = new C1417WW(readableMap, c1417ww, this.f5848M);
        this.f5867q = c1417ww3.f13222a;
        arrayList.add(c1417ww3);
        this.f5868r = c1417ww3;
    }
}

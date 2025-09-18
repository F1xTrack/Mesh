package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.C2592g;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K10 {
    public double[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final float M;
    public final float N;
    public final float O;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public double q;
    public WW r;
    public double s;
    public double t;
    public double u;
    public double v;
    public C8372zU0[] w;
    public C8372zU0[] x;
    public C8372zU0[] y;
    public C8372zU0[] z;

    public K10(float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        this.g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        this.h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        this.i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        this.j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        this.k = arrayList11;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = 12.0d;
        this.r = WW.p;
        C8372zU0[] c8372zU0Arr = new C8372zU0[0];
        this.w = c8372zU0Arr;
        this.x = new C8372zU0[0];
        this.y = new C8372zU0[0];
        this.z = new C8372zU0[0];
        this.A = new double[]{ConfigValue.DOUBLE_DEFAULT_VALUE};
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = f;
        this.N = f2;
        this.O = f3;
        arrayList2.add(c8372zU0Arr);
        arrayList3.add(this.x);
        arrayList4.add(this.y);
        arrayList5.add(this.z);
        arrayList6.add(this.A);
        arrayList7.add(Integer.valueOf(this.G));
        arrayList8.add(Integer.valueOf(this.H));
        arrayList9.add(Integer.valueOf(this.I));
        arrayList10.add(Integer.valueOf(this.J));
        arrayList11.add(Integer.valueOf(this.K));
        arrayList.add(this.r);
        e();
    }

    public static C8372zU0[] a(ArrayList arrayList) {
        int size = arrayList.size();
        C8372zU0[] c8372zU0Arr = new C8372zU0[size];
        for (int i = 0; i < size; i++) {
            c8372zU0Arr[i] = (C8372zU0) arrayList.get(i);
        }
        return c8372zU0Arr;
    }

    public static void b(int i, ArrayList arrayList) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(((Integer) arrayList.get(i)).intValue() + 1));
            i--;
        }
    }

    public final double c(double d) {
        b(this.B, this.g);
        int i = this.G + 1;
        C8372zU0[] c8372zU0Arr = this.w;
        if (i < c8372zU0Arr.length) {
            this.u = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.G = i;
            this.s = GM1.b(c8372zU0Arr[i], this.N, this.M, this.q);
        }
        double d2 = this.s + d;
        this.s = d2;
        return d2;
    }

    public final double d() {
        b(this.C, this.h);
        int i = this.H + 1;
        C8372zU0[] c8372zU0Arr = this.x;
        if (i < c8372zU0Arr.length) {
            this.v = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.H = i;
            this.t = GM1.b(c8372zU0Arr[i], this.O, this.M, this.q);
        }
        return this.t;
    }

    public final void e() {
        this.l.add(Integer.valueOf(this.B));
        this.m.add(Integer.valueOf(this.C));
        this.n.add(Integer.valueOf(this.D));
        this.o.add(Integer.valueOf(this.E));
        this.p.add(Integer.valueOf(this.F));
    }

    public final void f(C2592g c2592g, ReadableMap readableMap) {
        WW ww;
        if (this.L > 0) {
            ww = this.r;
        } else {
            C2592g parentTextRoot = c2592g.getParentTextRoot();
            while (true) {
                if (parentTextRoot == null) {
                    ww = WW.p;
                    break;
                }
                WW ww2 = parentTextRoot.b.r;
                if (ww2 != WW.p) {
                    ww = ww2;
                    break;
                }
                parentTextRoot = parentTextRoot.getParentTextRoot();
            }
        }
        this.L++;
        ArrayList arrayList = this.a;
        if (readableMap == null) {
            arrayList.add(ww);
            return;
        }
        WW ww3 = new WW(readableMap, ww, this.M);
        this.q = ww3.a;
        arrayList.add(ww3);
        this.r = ww3;
    }
}

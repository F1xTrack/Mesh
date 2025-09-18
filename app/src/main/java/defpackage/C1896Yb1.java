package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: Yb1 */
/* loaded from: classes.dex */
public class C1896Yb1 {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public C3769fQ0 h;
    public C3769fQ0 i;
    public int j;
    public int k;
    public C3769fQ0 l;
    public C1818Xb1 m;
    public C3769fQ0 n;
    public int o;
    public HashMap p;
    public HashSet q;

    public C1896Yb1() {
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        this.h = c3769fQ0;
        this.i = c3769fQ0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = c3769fQ0;
        this.m = C1818Xb1.a;
        this.n = c3769fQ0;
        this.o = 0;
        this.p = new HashMap();
        this.q = new HashSet();
    }

    public final void a(TG tg) {
        this.a = tg.a;
        this.b = tg.b;
        this.c = tg.c;
        this.d = tg.d;
        this.e = tg.e;
        this.f = tg.f;
        this.g = tg.g;
        this.h = tg.h;
        this.i = tg.i;
        this.j = tg.j;
        this.k = tg.k;
        this.l = tg.l;
        this.m = tg.m;
        this.n = tg.n;
        this.o = tg.o;
        this.q = new HashSet(tg.q);
        this.p = new HashMap(tg.p);
    }

    public C1896Yb1 b(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.g = true;
        return this;
    }
}

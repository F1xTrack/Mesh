package defpackage;

import android.text.Layout;

/* renamed from: od1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6304od1 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public C6214o91 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(C6304od1 c6304od1) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c6304od1 != null) {
            if (!this.c && c6304od1.c) {
                this.b = c6304od1.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = c6304od1.h;
            }
            if (this.i == -1) {
                this.i = c6304od1.i;
            }
            if (this.a == null && (str = c6304od1.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = c6304od1.f;
            }
            if (this.g == -1) {
                this.g = c6304od1.g;
            }
            if (this.n == -1) {
                this.n = c6304od1.n;
            }
            if (this.o == null && (alignment2 = c6304od1.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = c6304od1.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = c6304od1.q;
            }
            if (this.j == -1) {
                this.j = c6304od1.j;
                this.k = c6304od1.k;
            }
            if (this.r == null) {
                this.r = c6304od1.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = c6304od1.s;
            }
            if (!this.e && c6304od1.e) {
                this.d = c6304od1.d;
                this.e = true;
            }
            if (this.m != -1 || (i = c6304od1.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}

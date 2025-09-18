package p000;

import android.text.Layout;

/* renamed from: od1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10546od1 {

    /* renamed from: a */
    public String f39129a;

    /* renamed from: b */
    public int f39130b;

    /* renamed from: c */
    public boolean f39131c;

    /* renamed from: d */
    public int f39132d;

    /* renamed from: e */
    public boolean f39133e;

    /* renamed from: k */
    public float f39139k;

    /* renamed from: l */
    public String f39140l;

    /* renamed from: o */
    public Layout.Alignment f39143o;

    /* renamed from: p */
    public Layout.Alignment f39144p;

    /* renamed from: r */
    public C10486o91 f39146r;

    /* renamed from: f */
    public int f39134f = -1;

    /* renamed from: g */
    public int f39135g = -1;

    /* renamed from: h */
    public int f39136h = -1;

    /* renamed from: i */
    public int f39137i = -1;

    /* renamed from: j */
    public int f39138j = -1;

    /* renamed from: m */
    public int f39141m = -1;

    /* renamed from: n */
    public int f39142n = -1;

    /* renamed from: q */
    public int f39145q = -1;

    /* renamed from: s */
    public float f39147s = Float.MAX_VALUE;

    /* renamed from: a */
    public final void m23515a(C10546od1 c10546od1) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c10546od1 != null) {
            if (!this.f39131c && c10546od1.f39131c) {
                this.f39130b = c10546od1.f39130b;
                this.f39131c = true;
            }
            if (this.f39136h == -1) {
                this.f39136h = c10546od1.f39136h;
            }
            if (this.f39137i == -1) {
                this.f39137i = c10546od1.f39137i;
            }
            if (this.f39129a == null && (str = c10546od1.f39129a) != null) {
                this.f39129a = str;
            }
            if (this.f39134f == -1) {
                this.f39134f = c10546od1.f39134f;
            }
            if (this.f39135g == -1) {
                this.f39135g = c10546od1.f39135g;
            }
            if (this.f39142n == -1) {
                this.f39142n = c10546od1.f39142n;
            }
            if (this.f39143o == null && (alignment2 = c10546od1.f39143o) != null) {
                this.f39143o = alignment2;
            }
            if (this.f39144p == null && (alignment = c10546od1.f39144p) != null) {
                this.f39144p = alignment;
            }
            if (this.f39145q == -1) {
                this.f39145q = c10546od1.f39145q;
            }
            if (this.f39138j == -1) {
                this.f39138j = c10546od1.f39138j;
                this.f39139k = c10546od1.f39139k;
            }
            if (this.f39146r == null) {
                this.f39146r = c10546od1.f39146r;
            }
            if (this.f39147s == Float.MAX_VALUE) {
                this.f39147s = c10546od1.f39147s;
            }
            if (!this.f39133e && c10546od1.f39133e) {
                this.f39132d = c10546od1.f39132d;
                this.f39133e = true;
            }
            if (this.f39141m != -1 || (i = c10546od1.f39141m) == -1) {
                return;
            }
            this.f39141m = i;
        }
    }
}

package p000;

import android.util.SparseArray;

/* renamed from: q20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10725q20 {

    /* renamed from: a */
    public final InterfaceC8357Ub1 f40507a;

    /* renamed from: b */
    public final boolean f40508b;

    /* renamed from: c */
    public final boolean f40509c;

    /* renamed from: f */
    public final C0683Kq f40512f;

    /* renamed from: g */
    public byte[] f40513g;

    /* renamed from: h */
    public int f40514h;

    /* renamed from: i */
    public int f40515i;

    /* renamed from: j */
    public long f40516j;

    /* renamed from: l */
    public long f40518l;

    /* renamed from: p */
    public long f40522p;

    /* renamed from: q */
    public long f40523q;

    /* renamed from: r */
    public boolean f40524r;

    /* renamed from: s */
    public boolean f40525s;

    /* renamed from: d */
    public final SparseArray f40510d = new SparseArray();

    /* renamed from: e */
    public final SparseArray f40511e = new SparseArray();

    /* renamed from: m */
    public C10597p20 f40519m = new C10597p20();

    /* renamed from: n */
    public C10597p20 f40520n = new C10597p20();

    /* renamed from: k */
    public boolean f40517k = false;

    /* renamed from: o */
    public boolean f40521o = false;

    public C10725q20(InterfaceC8357Ub1 interfaceC8357Ub1, boolean z, boolean z2) {
        this.f40507a = interfaceC8357Ub1;
        this.f40508b = z;
        this.f40509c = z2;
        byte[] bArr = new byte[128];
        this.f40513g = bArr;
        this.f40512f = new C0683Kq(0, bArr, 0, 2);
        C10597p20 c10597p20 = this.f40520n;
        c10597p20.f39741b = false;
        c10597p20.f39740a = false;
    }

    /* renamed from: a */
    public final void m23928a() {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.f40508b) {
            C10597p20 c10597p20 = this.f40520n;
            z = c10597p20.f39741b && ((i = c10597p20.f39744e) == 7 || i == 2);
        } else {
            z = this.f40525s;
        }
        boolean z3 = this.f40524r;
        int i2 = this.f40515i;
        if (i2 == 5 || (z && i2 == 1)) {
            z2 = true;
        }
        this.f40524r = z3 | z2;
    }
}

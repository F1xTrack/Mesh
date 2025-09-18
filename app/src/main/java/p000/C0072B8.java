package p000;

import java.util.ArrayList;

/* renamed from: B8 */
/* loaded from: classes.dex */
public class C0072B8 {

    /* renamed from: d */
    public InterfaceC0009A8 f583d;

    /* renamed from: a */
    public P21 f580a = null;

    /* renamed from: b */
    public float f581b = 0.0f;

    /* renamed from: c */
    public ArrayList f582c = new ArrayList();

    /* renamed from: e */
    public boolean f584e = false;

    public C0072B8(T71 t71) {
        this.f583d = new C6598p8(this, t71);
    }

    /* renamed from: a */
    public final void m518a(C9016cj0 c9016cj0, int i) {
        this.f583d.mo76k(c9016cj0.m10843i(i), 1.0f);
        this.f583d.mo76k(c9016cj0.m10843i(i), -1.0f);
    }

    /* renamed from: b */
    public final void m519b(P21 p21, P21 p212, P21 p213, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f581b = i;
        }
        if (z) {
            this.f583d.mo76k(p21, 1.0f);
            this.f583d.mo76k(p212, -1.0f);
            this.f583d.mo76k(p213, -1.0f);
        } else {
            this.f583d.mo76k(p21, -1.0f);
            this.f583d.mo76k(p212, 1.0f);
            this.f583d.mo76k(p213, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m520c(P21 p21, P21 p212, P21 p213, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f581b = i;
        }
        if (z) {
            this.f583d.mo76k(p21, 1.0f);
            this.f583d.mo76k(p212, -1.0f);
            this.f583d.mo76k(p213, 1.0f);
        } else {
            this.f583d.mo76k(p21, -1.0f);
            this.f583d.mo76k(p212, 1.0f);
            this.f583d.mo76k(p213, -1.0f);
        }
    }

    /* renamed from: d */
    public P21 mo521d(boolean[] zArr) {
        return m522e(zArr, null);
    }

    /* renamed from: e */
    public final P21 m522e(boolean[] zArr, P21 p21) {
        int i;
        int iMo68c = this.f583d.mo68c();
        P21 p212 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iMo68c; i2++) {
            float fMo72g = this.f583d.mo72g(i2);
            if (fMo72g < 0.0f) {
                P21 p21Mo69d = this.f583d.mo69d(i2);
                if ((zArr == null || !zArr[p21Mo69d.f8793b]) && p21Mo69d != p21 && (((i = p21Mo69d.f8803l) == 3 || i == 4) && fMo72g < f)) {
                    f = fMo72g;
                    p212 = p21Mo69d;
                }
            }
        }
        return p212;
    }

    /* renamed from: f */
    public final void m523f(P21 p21) {
        P21 p212 = this.f580a;
        if (p212 != null) {
            this.f583d.mo76k(p212, -1.0f);
            this.f580a = null;
        }
        float fMo73h = this.f583d.mo73h(p21, true) * (-1.0f);
        this.f580a = p21;
        if (fMo73h == 1.0f) {
            return;
        }
        this.f581b /= fMo73h;
        this.f583d.mo75j(fMo73h);
    }

    /* renamed from: g */
    public final void m524g(P21 p21, boolean z) {
        if (p21.f8797f) {
            float fMo66a = this.f583d.mo66a(p21);
            this.f581b = (p21.f8796e * fMo66a) + this.f581b;
            this.f583d.mo73h(p21, z);
            if (z) {
                p21.m6209b(this);
            }
        }
    }

    /* renamed from: h */
    public void mo525h(C0072B8 c0072b8, boolean z) {
        float fMo74i = this.f583d.mo74i(c0072b8, z);
        this.f581b = (c0072b8.f581b * fMo74i) + this.f581b;
        if (z) {
            c0072b8.f580a.m6209b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            P21 r0 = r10.f580a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            P21 r1 = r10.f580a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = p000.AbstractC7222ym.m26232i(r0, r1)
            float r1 = r10.f581b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = p000.AbstractC7222ym.m26238o(r0)
            float r1 = r10.f581b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            A8 r5 = r10.f583d
            int r5 = r5.mo68c()
        L3c:
            if (r4 >= r5) goto L9c
            A8 r6 = r10.f583d
            P21 r6 = r6.mo69d(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            A8 r7 = r10.f583d
            float r7 = r7.mo72g(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = p000.AbstractC7222ym.m26232i(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = p000.AbstractC7222ym.m26232i(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = p000.AbstractC7222ym.m26232i(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = p000.AbstractC7222ym.m26232i(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p000.AbstractC7222ym.m26232i(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0072B8.toString():java.lang.String");
    }
}

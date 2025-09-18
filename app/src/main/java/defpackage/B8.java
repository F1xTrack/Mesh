package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class B8 {
    public A8 d;
    public P21 a = null;
    public float b = 0.0f;
    public ArrayList c = new ArrayList();
    public boolean e = false;

    public B8(T71 t71) {
        this.d = new C6400p8(this, t71);
    }

    public final void a(C2569cj0 c2569cj0, int i) {
        this.d.k(c2569cj0.i(i), 1.0f);
        this.d.k(c2569cj0.i(i), -1.0f);
    }

    public final void b(P21 p21, P21 p212, P21 p213, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.k(p21, 1.0f);
            this.d.k(p212, -1.0f);
            this.d.k(p213, -1.0f);
        } else {
            this.d.k(p21, -1.0f);
            this.d.k(p212, 1.0f);
            this.d.k(p213, 1.0f);
        }
    }

    public final void c(P21 p21, P21 p212, P21 p213, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.k(p21, 1.0f);
            this.d.k(p212, -1.0f);
            this.d.k(p213, 1.0f);
        } else {
            this.d.k(p21, -1.0f);
            this.d.k(p212, 1.0f);
            this.d.k(p213, -1.0f);
        }
    }

    public P21 d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final P21 e(boolean[] zArr, P21 p21) {
        int i;
        int iC = this.d.c();
        P21 p212 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iC; i2++) {
            float fG = this.d.g(i2);
            if (fG < 0.0f) {
                P21 p21D = this.d.d(i2);
                if ((zArr == null || !zArr[p21D.b]) && p21D != p21 && (((i = p21D.l) == 3 || i == 4) && fG < f)) {
                    f = fG;
                    p212 = p21D;
                }
            }
        }
        return p212;
    }

    public final void f(P21 p21) {
        P21 p212 = this.a;
        if (p212 != null) {
            this.d.k(p212, -1.0f);
            this.a = null;
        }
        float fH = this.d.h(p21, true) * (-1.0f);
        this.a = p21;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        this.d.j(fH);
    }

    public final void g(P21 p21, boolean z) {
        if (p21.f) {
            float fA = this.d.a(p21);
            this.b = (p21.e * fA) + this.b;
            this.d.h(p21, z);
            if (z) {
                p21.b(this);
            }
        }
    }

    public void h(B8 b8, boolean z) {
        float fI = this.d.i(b8, z);
        this.b = (b8.b * fI) + this.b;
        if (z) {
            b8.a.b(this);
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
            P21 r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            P21 r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.AbstractC8235ym.i(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.AbstractC8235ym.o(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            A8 r5 = r10.d
            int r5 = r5.c()
        L3c:
            if (r4 >= r5) goto L9c
            A8 r6 = r10.d
            P21 r6 = r6.d(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            A8 r7 = r10.d
            float r7 = r7.g(r4)
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
            java.lang.String r0 = defpackage.AbstractC8235ym.i(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.AbstractC8235ym.i(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.AbstractC8235ym.i(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = defpackage.AbstractC8235ym.i(r0, r6)
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
            java.lang.String r0 = defpackage.AbstractC8235ym.i(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B8.toString():java.lang.String");
    }
}

package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2731eg extends AbstractC2714e {
    public boolean b;
    public int c;
    public int d;
    public int[] e;

    public C2731eg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        c2639b.b(1, this.b);
        c2639b.f(2, this.c);
        c2639b.f(3, this.d);
        int[] iArr = this.e;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i >= iArr2.length) {
                return;
            }
            c2639b.d(4, iArr2[i]);
            i++;
        }
    }

    public C2731eg b() {
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = C2764g.a;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iC = C2639b.c(3, this.d) + C2639b.c(2, this.c) + C2639b.a(1, this.b);
        int[] iArr = this.e;
        if (iArr == null || iArr.length <= 0) {
            return iC;
        }
        int i = 0;
        int iA = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i < iArr2.length) {
                iA += C2639b.a(iArr2[i]);
                i++;
            } else {
                return iC + iA + iArr2.length;
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 8) {
                this.b = c2614a.c();
            } else if (iL == 16) {
                this.c = c2614a.h();
            } else if (iL == 24) {
                this.d = c2614a.h();
            } else if (iL == 32) {
                int iA = C2764g.a(c2614a, 32);
                int[] iArr = this.e;
                int length = iArr == null ? 0 : iArr.length;
                int i = iA + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = c2614a.h();
                    c2614a.l();
                    length++;
                }
                iArr2[length] = c2614a.h();
                this.e = iArr2;
            } else if (iL != 34) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iC = c2614a.c(c2614a.h());
                int iB = c2614a.b();
                int i2 = 0;
                while (c2614a.a() > 0) {
                    c2614a.h();
                    i2++;
                }
                c2614a.e(iB);
                int[] iArr3 = this.e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = c2614a.h();
                    length2++;
                }
                this.e = iArr4;
                c2614a.b(iC);
            }
        }
        return this;
    }
}

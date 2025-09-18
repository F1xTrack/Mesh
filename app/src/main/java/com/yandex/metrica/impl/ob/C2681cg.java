package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2681cg extends AbstractC2714e {
    public a[] b;
    public boolean c;

    public C2681cg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        a[] aVarArr = this.b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    c2639b.b(1, aVar);
                }
                i++;
            }
        }
        c2639b.b(2, this.c);
    }

    public C2681cg b() {
        this.b = a.c();
        this.c = false;
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.cg$a */
    public static final class a extends AbstractC2714e {
        private static volatile a[] g;
        public int b;
        public String c;
        public String d;
        public long e;
        public long f;

        public a() {
            b();
        }

        public static a[] c() {
            if (g == null) {
                synchronized (C2664c.a) {
                    try {
                        if (g == null) {
                            g = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return g;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.d(1, this.b);
            c2639b.b(2, this.c);
            c2639b.b(3, this.d);
            c2639b.e(4, this.e);
            c2639b.e(5, this.f);
        }

        public a b() {
            this.b = 1;
            this.c = "";
            this.d = "";
            this.e = 0L;
            this.f = 0L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.b(5, this.f) + C2639b.b(4, this.e) + C2639b.a(3, this.d) + C2639b.a(2, this.c) + C2639b.a(1, this.b);
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    int iH = c2614a.h();
                    if (iH == 1 || iH == 2 || iH == 3) {
                        this.b = iH;
                    }
                } else if (iL == 18) {
                    this.c = c2614a.k();
                } else if (iL == 26) {
                    this.d = c2614a.k();
                } else if (iL == 32) {
                    this.e = c2614a.i();
                } else if (iL != 40) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.f = c2614a.i();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        a[] aVarArr = this.b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int iA = 0;
            while (true) {
                a[] aVarArr2 = this.b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    iA = C2639b.a(1, aVar) + iA;
                }
                i++;
            }
            i = iA;
        }
        return C2639b.a(2, this.c) + i;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                int iA = C2764g.a(c2614a, 10);
                a[] aVarArr = this.b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = iA + length;
                a[] aVarArr2 = new a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    a aVar = new a();
                    aVarArr2[length] = aVar;
                    c2614a.a(aVar);
                    c2614a.l();
                    length++;
                }
                a aVar2 = new a();
                aVarArr2[length] = aVar2;
                c2614a.a(aVar2);
                this.b = aVarArr2;
            } else if (iL != 16) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.c = c2614a.c();
            }
        }
        return this;
    }
}

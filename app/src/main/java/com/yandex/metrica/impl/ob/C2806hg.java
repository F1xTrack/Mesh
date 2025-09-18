package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.hg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2806hg extends AbstractC2714e {
    public a[] b;
    public String[] c;

    /* renamed from: com.yandex.metrica.impl.ob.hg$a */
    public static final class a extends AbstractC2714e {
        private static volatile a[] h;
        public String b;
        public String c;
        public String d;
        public C0012a[] e;
        public long f;
        public int[] g;

        public a() {
            b();
        }

        public static a[] c() {
            if (h == null) {
                synchronized (C2664c.a) {
                    try {
                        if (h == null) {
                            h = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return h;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
            c2639b.b(2, this.c);
            c2639b.b(3, this.d);
            C0012a[] c0012aArr = this.e;
            int i = 0;
            if (c0012aArr != null && c0012aArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C0012a[] c0012aArr2 = this.e;
                    if (i2 >= c0012aArr2.length) {
                        break;
                    }
                    C0012a c0012a = c0012aArr2[i2];
                    if (c0012a != null) {
                        c2639b.b(4, c0012a);
                    }
                    i2++;
                }
            }
            c2639b.e(5, this.f);
            int[] iArr = this.g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.g;
                if (i >= iArr2.length) {
                    return;
                }
                c2639b.d(6, iArr2[i]);
                i++;
            }
        }

        public a b() {
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = C0012a.c();
            this.f = 0L;
            this.g = C2764g.a;
            this.a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.hg$a$a, reason: collision with other inner class name */
        public static final class C0012a extends AbstractC2714e {
            private static volatile C0012a[] d;
            public String b;
            public String c;

            public C0012a() {
                b();
            }

            public static C0012a[] c() {
                if (d == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (d == null) {
                                d = new C0012a[0];
                            }
                        } finally {
                        }
                    }
                }
                return d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                c2639b.b(1, this.b);
                c2639b.b(2, this.c);
            }

            public C0012a b() {
                this.b = "";
                this.c = "";
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                return C2639b.a(2, this.c) + C2639b.a(1, this.b);
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public AbstractC2714e a(C2614a c2614a) throws IOException {
                while (true) {
                    int iL = c2614a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.b = c2614a.k();
                    } else if (iL != 18) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        this.c = c2614a.k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(3, this.d) + C2639b.a(2, this.c) + C2639b.a(1, this.b);
            C0012a[] c0012aArr = this.e;
            int i = 0;
            if (c0012aArr != null && c0012aArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C0012a[] c0012aArr2 = this.e;
                    if (i2 >= c0012aArr2.length) {
                        break;
                    }
                    C0012a c0012a = c0012aArr2[i2];
                    if (c0012a != null) {
                        iA = C2639b.a(4, c0012a) + iA;
                    }
                    i2++;
                }
            }
            int iB = C2639b.b(5, this.f) + iA;
            int[] iArr = this.g;
            if (iArr == null || iArr.length <= 0) {
                return iB;
            }
            int iA2 = 0;
            while (true) {
                int[] iArr2 = this.g;
                if (i < iArr2.length) {
                    iA2 += C2639b.a(iArr2[i]);
                    i++;
                } else {
                    return iB + iA2 + iArr2.length;
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
                if (iL == 10) {
                    this.b = c2614a.k();
                } else if (iL == 18) {
                    this.c = c2614a.k();
                } else if (iL == 26) {
                    this.d = c2614a.k();
                } else if (iL == 34) {
                    int iA = C2764g.a(c2614a, 34);
                    C0012a[] c0012aArr = this.e;
                    int length = c0012aArr == null ? 0 : c0012aArr.length;
                    int i = iA + length;
                    C0012a[] c0012aArr2 = new C0012a[i];
                    if (length != 0) {
                        System.arraycopy(c0012aArr, 0, c0012aArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C0012a c0012a = new C0012a();
                        c0012aArr2[length] = c0012a;
                        c2614a.a(c0012a);
                        c2614a.l();
                        length++;
                    }
                    C0012a c0012a2 = new C0012a();
                    c0012aArr2[length] = c0012a2;
                    c2614a.a(c0012a2);
                    this.e = c0012aArr2;
                } else if (iL == 40) {
                    this.f = c2614a.i();
                } else if (iL == 48) {
                    int iA2 = C2764g.a(c2614a, 48);
                    int[] iArr = new int[iA2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < iA2; i3++) {
                        if (i3 != 0) {
                            c2614a.l();
                        }
                        int iH = c2614a.h();
                        if (iH == 1 || iH == 2) {
                            iArr[i2] = iH;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == iA2) {
                            this.g = iArr;
                        } else {
                            int[] iArr3 = new int[length2 + i2];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.g = iArr3;
                        }
                    }
                } else if (iL != 50) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iC = c2614a.c(c2614a.h());
                    int iB = c2614a.b();
                    int i4 = 0;
                    while (c2614a.a() > 0) {
                        int iH2 = c2614a.h();
                        if (iH2 == 1 || iH2 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        c2614a.e(iB);
                        int[] iArr4 = this.g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i4 + length3];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (c2614a.a() > 0) {
                            int iH3 = c2614a.h();
                            if (iH3 == 1 || iH3 == 2) {
                                iArr5[length3] = iH3;
                                length3++;
                            }
                        }
                        this.g = iArr5;
                    }
                    c2614a.b(iC);
                }
            }
            return this;
        }
    }

    public C2806hg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        a[] aVarArr = this.b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.b;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    c2639b.b(1, aVar);
                }
                i2++;
            }
        }
        String[] strArr = this.c;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.c;
            if (i >= strArr2.length) {
                return;
            }
            String str = strArr2[i];
            if (str != null) {
                c2639b.b(2, str);
            }
            i++;
        }
    }

    public C2806hg b() {
        this.b = a.c();
        this.c = C2764g.b;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA;
        a[] aVarArr = this.b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            iA = 0;
            while (true) {
                a[] aVarArr2 = this.b;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    iA += C2639b.a(1, aVar);
                }
                i2++;
            }
        } else {
            iA = 0;
        }
        String[] strArr = this.c;
        if (strArr == null || strArr.length <= 0) {
            return iA;
        }
        int iA2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.c;
            if (i >= strArr2.length) {
                return iA + iA2 + i3;
            }
            String str = strArr2[i];
            if (str != null) {
                i3++;
                iA2 = C2639b.a(str) + iA2;
            }
            i++;
        }
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
            } else if (iL != 18) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iA2 = C2764g.a(c2614a, 18);
                String[] strArr = this.c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = iA2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = c2614a.k();
                    c2614a.l();
                    length2++;
                }
                strArr2[length2] = c2614a.k();
                this.c = strArr2;
            }
        }
        return this;
    }
}

package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2656bg extends AbstractC2714e {
    public b[] b;
    public a c;
    public String[] d;

    public C2656bg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        b[] bVarArr = this.b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    c2639b.b(1, bVar);
                }
                i2++;
            }
        }
        a aVar = this.c;
        if (aVar != null) {
            c2639b.b(2, aVar);
        }
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.d;
            if (i >= strArr2.length) {
                return;
            }
            String str = strArr2[i];
            if (str != null) {
                c2639b.b(3, str);
            }
            i++;
        }
    }

    public C2656bg b() {
        this.b = b.c();
        this.c = null;
        this.d = C2764g.b;
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$a */
    public static final class a extends AbstractC2714e {
        public int b;
        public int c;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.d(2, this.b);
            c2639b.d(3, this.c);
        }

        public a b() {
            this.b = 0;
            this.c = -1;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.a(3, this.c) + C2639b.a(2, this.b);
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 16) {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4 || iH == 5) {
                        this.b = iH;
                    }
                } else if (iL != 24) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iH2 = c2614a.h();
                    if (iH2 == -1 || iH2 == 0 || iH2 == 1) {
                        this.c = iH2;
                    }
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$b */
    public static final class b extends AbstractC2714e {
        private static volatile b[] d;
        public String b;
        public boolean c;

        public b() {
            b();
        }

        public static b[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new b[0];
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

        public b b() {
            this.b = "";
            this.c = false;
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

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA;
        b[] bVarArr = this.b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            iA = 0;
            while (true) {
                b[] bVarArr2 = this.b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    iA += C2639b.a(1, bVar);
                }
                i2++;
            }
        } else {
            iA = 0;
        }
        a aVar = this.c;
        if (aVar != null) {
            iA += C2639b.a(2, aVar);
        }
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0) {
            return iA;
        }
        int iA2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.d;
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
                b[] bVarArr = this.b;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = iA + length;
                b[] bVarArr2 = new b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    b bVar = new b();
                    bVarArr2[length] = bVar;
                    c2614a.a(bVar);
                    c2614a.l();
                    length++;
                }
                b bVar2 = new b();
                bVarArr2[length] = bVar2;
                c2614a.a(bVar2);
                this.b = bVarArr2;
            } else if (iL == 18) {
                if (this.c == null) {
                    this.c = new a();
                }
                c2614a.a(this.c);
            } else if (iL != 26) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iA2 = C2764g.a(c2614a, 26);
                String[] strArr = this.d;
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
                this.d = strArr2;
            }
        }
        return this;
    }
}

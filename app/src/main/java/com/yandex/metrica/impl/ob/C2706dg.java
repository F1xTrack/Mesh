package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.dg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2706dg extends AbstractC2714e {
    public a b;
    public a[] c;

    public C2706dg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        a aVar = this.b;
        if (aVar != null) {
            c2639b.b(1, aVar);
        }
        a[] aVarArr = this.c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.c;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar2 = aVarArr2[i];
            if (aVar2 != null) {
                c2639b.b(2, aVar2);
            }
            i++;
        }
    }

    public C2706dg b() {
        this.b = null;
        this.c = a.c();
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$b */
    public static final class b extends AbstractC2714e {
        public a[] b;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            a[] aVarArr = this.b;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.b;
                if (i >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    c2639b.b(1, aVar);
                }
                i++;
            }
        }

        public b b() {
            this.b = a.c();
            this.a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.dg$b$a */
        public static final class a extends AbstractC2714e {
            private static volatile a[] d;
            public String b;
            public String c;

            public a() {
                b();
            }

            public static a[] c() {
                if (d == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (d == null) {
                                d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                if (!this.b.equals("")) {
                    c2639b.b(1, this.b);
                }
                if (this.c.equals("")) {
                    return;
                }
                c2639b.b(2, this.c);
            }

            public a b() {
                this.b = "";
                this.c = "";
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
                return !this.c.equals("") ? iA + C2639b.a(2, this.c) : iA;
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
            a[] aVarArr = this.b;
            int i = 0;
            if (aVarArr == null || aVarArr.length <= 0) {
                return 0;
            }
            int iA = 0;
            while (true) {
                a[] aVarArr2 = this.b;
                if (i >= aVarArr2.length) {
                    return iA;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    iA = C2639b.a(1, aVar) + iA;
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
                if (iL != 10) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
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
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$a */
    public static final class a extends AbstractC2714e {
        private static volatile a[] d;
        public b b;
        public int c;

        public a() {
            b();
        }

        public static a[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            b bVar = this.b;
            if (bVar != null) {
                c2639b.b(1, bVar);
            }
            int i = this.c;
            if (i != 0) {
                c2639b.d(2, i);
            }
        }

        public a b() {
            this.b = null;
            this.c = 0;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            b bVar = this.b;
            int iA = bVar != null ? C2639b.a(1, bVar) : 0;
            int i = this.c;
            return i != 0 ? iA + C2639b.a(2, i) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    if (this.b == null) {
                        this.b = new b();
                    }
                    c2614a.a(this.b);
                } else if (iL != 16) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.c = iH;
                    }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        a aVar = this.b;
        int i = 0;
        int iA = aVar != null ? C2639b.a(1, aVar) : 0;
        a[] aVarArr = this.c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.c;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    iA = C2639b.a(2, aVar2) + iA;
                }
                i++;
            }
        }
        return iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                if (this.b == null) {
                    this.b = new a();
                }
                c2614a.a(this.b);
            } else if (iL != 18) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iA = C2764g.a(c2614a, 18);
                a[] aVarArr = this.c;
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
                this.c = aVarArr2;
            }
        }
        return this;
    }
}

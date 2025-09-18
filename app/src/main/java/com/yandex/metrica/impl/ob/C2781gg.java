package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2781gg extends AbstractC2714e {
    public a b;
    public b[] c;

    public C2781gg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        a aVar = this.b;
        if (aVar != null) {
            c2639b.b(1, aVar);
        }
        b[] bVarArr = this.c;
        if (bVarArr == null || bVarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            b[] bVarArr2 = this.c;
            if (i >= bVarArr2.length) {
                return;
            }
            b bVar = bVarArr2[i];
            if (bVar != null) {
                c2639b.b(2, bVar);
            }
            i++;
        }
    }

    public C2781gg b() {
        this.b = null;
        this.c = b.c();
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$b */
    public static final class b extends AbstractC2714e {
        private static volatile b[] e;
        public String b;
        public String c;
        public int d;

        public b() {
            b();
        }

        public static b[] c() {
            if (e == null) {
                synchronized (C2664c.a) {
                    try {
                        if (e == null) {
                            e = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return e;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (!this.b.equals("")) {
                c2639b.b(1, this.b);
            }
            if (!this.c.equals("")) {
                c2639b.b(2, this.c);
            }
            c2639b.d(3, this.d);
        }

        public b b() {
            this.b = "";
            this.c = "";
            this.d = 0;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
            if (!this.c.equals("")) {
                iA += C2639b.a(2, this.c);
            }
            return C2639b.a(3, this.d) + iA;
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
                } else if (iL != 24) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.d = iH;
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
        b[] bVarArr = this.c;
        if (bVarArr != null && bVarArr.length > 0) {
            while (true) {
                b[] bVarArr2 = this.c;
                if (i >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    iA = C2639b.a(2, bVar) + iA;
                }
                i++;
            }
        }
        return iA;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$a */
    public static final class a extends AbstractC2714e {
        public String b;
        public String c;
        public boolean d;
        public boolean e;
        public int f;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (!this.b.equals("")) {
                c2639b.b(1, this.b);
            }
            if (!this.c.equals("")) {
                c2639b.b(2, this.c);
            }
            boolean z = this.d;
            if (z) {
                c2639b.b(3, z);
            }
            boolean z2 = this.e;
            if (z2) {
                c2639b.b(4, z2);
            }
            c2639b.d(5, this.f);
        }

        public a b() {
            this.b = "";
            this.c = "";
            this.d = false;
            this.e = false;
            this.f = 0;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
            if (!this.c.equals("")) {
                iA += C2639b.a(2, this.c);
            }
            boolean z = this.d;
            if (z) {
                iA += C2639b.a(3, z);
            }
            boolean z2 = this.e;
            if (z2) {
                iA += C2639b.a(4, z2);
            }
            return C2639b.a(5, this.f) + iA;
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
                } else if (iL == 24) {
                    this.d = c2614a.c();
                } else if (iL == 32) {
                    this.e = c2614a.c();
                } else if (iL != 40) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.f = iH;
                    }
                }
            }
            return this;
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
                b[] bVarArr = this.c;
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
                this.c = bVarArr2;
            }
        }
        return this;
    }
}

package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ig, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2830ig extends AbstractC2714e {
    public a b;
    public boolean c;

    public C2830ig() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        a aVar = this.b;
        if (aVar != null) {
            c2639b.b(1, aVar);
        }
        boolean z = this.c;
        if (z) {
            c2639b.b(2, z);
        }
    }

    public C2830ig b() {
        this.b = null;
        this.c = false;
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ig$a */
    public static final class a extends AbstractC2714e {
        public C0013a[] b;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            C0013a[] c0013aArr = this.b;
            if (c0013aArr == null || c0013aArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                C0013a[] c0013aArr2 = this.b;
                if (i >= c0013aArr2.length) {
                    return;
                }
                C0013a c0013a = c0013aArr2[i];
                if (c0013a != null) {
                    c2639b.b(1, c0013a);
                }
                i++;
            }
        }

        public a b() {
            this.b = C0013a.c();
            this.a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.ig$a$a, reason: collision with other inner class name */
        public static final class C0013a extends AbstractC2714e {
            private static volatile C0013a[] d;
            public String b;
            public String c;

            public C0013a() {
                b();
            }

            public static C0013a[] c() {
                if (d == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (d == null) {
                                d = new C0013a[0];
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
                if (this.c.equals("")) {
                    return;
                }
                c2639b.b(2, this.c);
            }

            public C0013a b() {
                this.b = "";
                this.c = "";
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                int iA = C2639b.a(1, this.b);
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
            C0013a[] c0013aArr = this.b;
            int i = 0;
            if (c0013aArr == null || c0013aArr.length <= 0) {
                return 0;
            }
            int iA = 0;
            while (true) {
                C0013a[] c0013aArr2 = this.b;
                if (i >= c0013aArr2.length) {
                    return iA;
                }
                C0013a c0013a = c0013aArr2[i];
                if (c0013a != null) {
                    iA = C2639b.a(1, c0013a) + iA;
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
                    C0013a[] c0013aArr = this.b;
                    int length = c0013aArr == null ? 0 : c0013aArr.length;
                    int i = iA + length;
                    C0013a[] c0013aArr2 = new C0013a[i];
                    if (length != 0) {
                        System.arraycopy(c0013aArr, 0, c0013aArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C0013a c0013a = new C0013a();
                        c0013aArr2[length] = c0013a;
                        c2614a.a(c0013a);
                        c2614a.l();
                        length++;
                    }
                    C0013a c0013a2 = new C0013a();
                    c0013aArr2[length] = c0013a2;
                    c2614a.a(c0013a2);
                    this.b = c0013aArr2;
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        a aVar = this.b;
        int iA = aVar != null ? C2639b.a(1, aVar) : 0;
        boolean z = this.c;
        return z ? iA + C2639b.a(2, z) : iA;
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

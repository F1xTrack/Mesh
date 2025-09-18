package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2756fg extends AbstractC2714e {
    public a[] b;

    public C2756fg() {
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

    public C2756fg b() {
        this.b = a.c();
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.fg$a */
    public static final class a extends AbstractC2714e {
        private static volatile a[] d;
        public String b;
        public boolean c;

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
            c2639b.b(1, this.b);
            c2639b.b(2, this.c);
        }

        public a b() {
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

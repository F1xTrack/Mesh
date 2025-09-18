package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.jg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2855jg extends AbstractC2714e {
    public a[] b;
    public String c;
    public long d;
    public boolean e;
    public boolean f;

    public C2855jg() {
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
        c2639b.c(3, this.d);
        c2639b.b(4, this.e);
        c2639b.b(5, this.f);
    }

    public C2855jg b() {
        this.b = a.c();
        this.c = "";
        this.d = 0L;
        this.e = false;
        this.f = false;
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.jg$a */
    public static final class a extends AbstractC2714e {
        private static volatile a[] d;
        public String b;
        public String[] c;

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
            String[] strArr = this.c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i = 0;
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

        public a b() {
            this.b = "";
            this.c = C2764g.b;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(1, this.b);
            String[] strArr = this.c;
            if (strArr == null || strArr.length <= 0) {
                return iA;
            }
            int i = 0;
            int iA2 = 0;
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    return iA + iA2 + i2;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
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
                    this.b = c2614a.k();
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 18);
                    String[] strArr = this.c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = iA + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = c2614a.k();
                        c2614a.l();
                        length++;
                    }
                    strArr2[length] = c2614a.k();
                    this.c = strArr2;
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
        return C2639b.a(5, this.f) + C2639b.a(4, this.e) + C2639b.a(3, this.d) + C2639b.a(2, this.c) + i;
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
            } else if (iL == 18) {
                this.c = c2614a.k();
            } else if (iL == 24) {
                this.d = c2614a.i();
            } else if (iL == 32) {
                this.e = c2614a.c();
            } else if (iL != 40) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.f = c2614a.c();
            }
        }
        return this;
    }
}

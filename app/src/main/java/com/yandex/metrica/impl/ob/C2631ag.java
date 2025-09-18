package com.yandex.metrica.impl.ob;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ag */
/* loaded from: classes2.dex */
public final class C2631ag extends AbstractC2714e {
    public a[] b;

    public C2631ag() {
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

    public C2631ag b() {
        this.b = a.c();
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$b */
    public static final class b extends AbstractC2714e {
        public boolean b;
        public boolean c;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            boolean z = this.b;
            if (z) {
                c2639b.b(1, z);
            }
            boolean z2 = this.c;
            if (z2) {
                c2639b.b(2, z2);
            }
        }

        public b b() {
            this.b = false;
            this.c = false;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            boolean z = this.b;
            int iA = z ? C2639b.a(1, z) : 0;
            boolean z2 = this.c;
            return z2 ? iA + C2639b.a(2, z2) : iA;
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

    /* renamed from: com.yandex.metrica.impl.ob.ag$a */
    public static final class a extends AbstractC2714e {
        private static volatile a[] f;
        public byte[] b;
        public int c;
        public b d;
        public c e;

        public a() {
            b();
        }

        public static a[] c() {
            if (f == null) {
                synchronized (C2664c.a) {
                    try {
                        if (f == null) {
                            f = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
            c2639b.d(2, this.c);
            b bVar = this.d;
            if (bVar != null) {
                c2639b.b(3, bVar);
            }
            c cVar = this.e;
            if (cVar != null) {
                c2639b.b(4, cVar);
            }
        }

        public a b() {
            this.b = C2764g.d;
            this.c = 0;
            this.d = null;
            this.e = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(2, this.c) + C2639b.a(1, this.b);
            b bVar = this.d;
            if (bVar != null) {
                iA += C2639b.a(3, bVar);
            }
            c cVar = this.e;
            return cVar != null ? iA + C2639b.a(4, cVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL == 16) {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.c = iH;
                    }
                } else if (iL == 26) {
                    if (this.d == null) {
                        this.d = new b();
                    }
                    c2614a.a(this.d);
                } else if (iL != 34) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.e == null) {
                        this.e = new c();
                    }
                    c2614a.a(this.e);
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

    /* renamed from: com.yandex.metrica.impl.ob.ag$c */
    public static final class c extends AbstractC2714e {
        public byte[] b;
        public double c;
        public double d;
        public boolean e;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (!Arrays.equals(this.b, C2764g.d)) {
                c2639b.b(1, this.b);
            }
            if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                c2639b.b(2, this.c);
            }
            if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                c2639b.b(3, this.d);
            }
            boolean z = this.e;
            if (z) {
                c2639b.b(4, z);
            }
        }

        public c b() {
            this.b = C2764g.d;
            this.c = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.e = false;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = !Arrays.equals(this.b, C2764g.d) ? C2639b.a(1, this.b) : 0;
            if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                iA += C2639b.a(2, this.c);
            }
            if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                iA += C2639b.a(3, this.d);
            }
            boolean z = this.e;
            return z ? iA + C2639b.a(4, z) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL == 17) {
                    this.c = Double.longBitsToDouble(c2614a.g());
                } else if (iL == 25) {
                    this.d = Double.longBitsToDouble(c2614a.g());
                } else if (iL != 32) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.e = c2614a.c();
                }
            }
            return this;
        }
    }
}

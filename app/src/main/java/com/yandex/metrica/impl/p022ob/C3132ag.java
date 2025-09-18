package com.yandex.metrica.impl.p022ob;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ag */
/* loaded from: classes2.dex */
public final class C3132ag extends AbstractC3219e {

    /* renamed from: b */
    public a[] f23051b;

    public C3132ag() {
        m15609b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a[] aVarArr = this.f23051b;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.f23051b;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i];
            if (aVar != null) {
                c3141b.m15647b(1, aVar);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C3132ag m15609b() {
        this.f23051b = a.m15610c();
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: b */
        public boolean f23057b;

        /* renamed from: c */
        public boolean f23058c;

        public b() {
            m15612b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            boolean z = this.f23057b;
            if (z) {
                c3141b.m15649b(1, z);
            }
            boolean z2 = this.f23058c;
            if (z2) {
                c3141b.m15649b(2, z2);
            }
        }

        /* renamed from: b */
        public b m15612b() {
            this.f23057b = false;
            this.f23058c = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            boolean z = this.f23057b;
            int iM15632a = z ? C3141b.m15632a(1, z) : 0;
            boolean z2 = this.f23058c;
            return z2 ? iM15632a + C3141b.m15632a(2, z2) : iM15632a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f23057b = c3115a.m15581c();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23058c = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        a[] aVarArr = this.f23051b;
        int i = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int iM15630a = 0;
        while (true) {
            a[] aVarArr2 = this.f23051b;
            if (i >= aVarArr2.length) {
                return iM15630a;
            }
            a aVar = aVarArr2[i];
            if (aVar != null) {
                iM15630a = C3141b.m15630a(1, aVar) + iM15630a;
            }
            i++;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: f */
        private static volatile a[] f23052f;

        /* renamed from: b */
        public byte[] f23053b;

        /* renamed from: c */
        public int f23054c;

        /* renamed from: d */
        public b f23055d;

        /* renamed from: e */
        public c f23056e;

        public a() {
            m15611b();
        }

        /* renamed from: c */
        public static a[] m15610c() {
            if (f23052f == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23052f == null) {
                            f23052f = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f23052f;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15650b(1, this.f23053b);
            c3141b.m15654d(2, this.f23054c);
            b bVar = this.f23055d;
            if (bVar != null) {
                c3141b.m15647b(3, bVar);
            }
            c cVar = this.f23056e;
            if (cVar != null) {
                c3141b.m15647b(4, cVar);
            }
        }

        /* renamed from: b */
        public a m15611b() {
            this.f23053b = C3271g.f23459d;
            this.f23054c = 0;
            this.f23055d = null;
            this.f23056e = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15628a = C3141b.m15628a(2, this.f23054c) + C3141b.m15633a(1, this.f23053b);
            b bVar = this.f23055d;
            if (bVar != null) {
                iM15628a += C3141b.m15630a(3, bVar);
            }
            c cVar = this.f23056e;
            return cVar != null ? iM15628a + C3141b.m15630a(4, cVar) : iM15628a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 10) {
                    this.f23053b = c3115a.m15582d();
                } else if (iM15594l == 16) {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                        this.f23054c = iM15590h;
                    }
                } else if (iM15594l == 26) {
                    if (this.f23055d == null) {
                        this.f23055d = new b();
                    }
                    c3115a.m15577a(this.f23055d);
                } else if (iM15594l != 34) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f23056e == null) {
                        this.f23056e = new c();
                    }
                    c3115a.m15577a(this.f23056e);
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
        while (true) {
            int iM15594l = c3115a.m15594l();
            if (iM15594l == 0) {
                break;
            }
            if (iM15594l != 10) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a = C3271g.m15952a(c3115a, 10);
                a[] aVarArr = this.f23051b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = iM15952a + length;
                a[] aVarArr2 = new a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    a aVar = new a();
                    aVarArr2[length] = aVar;
                    c3115a.m15577a(aVar);
                    c3115a.m15594l();
                    length++;
                }
                a aVar2 = new a();
                aVarArr2[length] = aVar2;
                c3115a.m15577a(aVar2);
                this.f23051b = aVarArr2;
            }
        }
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$c */
    public static final class c extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f23059b;

        /* renamed from: c */
        public double f23060c;

        /* renamed from: d */
        public double f23061d;

        /* renamed from: e */
        public boolean f23062e;

        public c() {
            m15613b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!Arrays.equals(this.f23059b, C3271g.f23459d)) {
                c3141b.m15650b(1, this.f23059b);
            }
            if (Double.doubleToLongBits(this.f23060c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                c3141b.m15646b(2, this.f23060c);
            }
            if (Double.doubleToLongBits(this.f23061d) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                c3141b.m15646b(3, this.f23061d);
            }
            boolean z = this.f23062e;
            if (z) {
                c3141b.m15649b(4, z);
            }
        }

        /* renamed from: b */
        public c m15613b() {
            this.f23059b = C3271g.f23459d;
            this.f23060c = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f23061d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f23062e = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15633a = !Arrays.equals(this.f23059b, C3271g.f23459d) ? C3141b.m15633a(1, this.f23059b) : 0;
            if (Double.doubleToLongBits(this.f23060c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                iM15633a += C3141b.m15627a(2, this.f23060c);
            }
            if (Double.doubleToLongBits(this.f23061d) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
                iM15633a += C3141b.m15627a(3, this.f23061d);
            }
            boolean z = this.f23062e;
            return z ? iM15633a + C3141b.m15632a(4, z) : iM15633a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 10) {
                    this.f23059b = c3115a.m15582d();
                } else if (iM15594l == 17) {
                    this.f23060c = Double.longBitsToDouble(c3115a.m15588g());
                } else if (iM15594l == 25) {
                    this.f23061d = Double.longBitsToDouble(c3115a.m15588g());
                } else if (iM15594l != 32) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23062e = c3115a.m15581c();
                }
            }
            return this;
        }
    }
}

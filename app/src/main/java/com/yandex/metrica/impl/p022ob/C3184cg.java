package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.cg */
/* loaded from: classes2.dex */
public final class C3184cg extends AbstractC3219e {

    /* renamed from: b */
    public a[] f23181b;

    /* renamed from: c */
    public boolean f23182c;

    public C3184cg() {
        m15709b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a[] aVarArr = this.f23181b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f23181b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    c3141b.m15647b(1, aVar);
                }
                i++;
            }
        }
        c3141b.m15649b(2, this.f23182c);
    }

    /* renamed from: b */
    public C3184cg m15709b() {
        this.f23181b = a.m15710c();
        this.f23182c = false;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.cg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: g */
        private static volatile a[] f23183g;

        /* renamed from: b */
        public int f23184b;

        /* renamed from: c */
        public String f23185c;

        /* renamed from: d */
        public String f23186d;

        /* renamed from: e */
        public long f23187e;

        /* renamed from: f */
        public long f23188f;

        public a() {
            m15711b();
        }

        /* renamed from: c */
        public static a[] m15710c() {
            if (f23183g == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23183g == null) {
                            f23183g = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f23183g;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15654d(1, this.f23184b);
            c3141b.m15648b(2, this.f23185c);
            c3141b.m15648b(3, this.f23186d);
            c3141b.m15658e(4, this.f23187e);
            c3141b.m15658e(5, this.f23188f);
        }

        /* renamed from: b */
        public a m15711b() {
            this.f23184b = 1;
            this.f23185c = "";
            this.f23186d = "";
            this.f23187e = 0L;
            this.f23188f = 0L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15640b(5, this.f23188f) + C3141b.m15640b(4, this.f23187e) + C3141b.m15631a(3, this.f23186d) + C3141b.m15631a(2, this.f23185c) + C3141b.m15628a(1, this.f23184b);
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
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                        this.f23184b = iM15590h;
                    }
                } else if (iM15594l == 18) {
                    this.f23185c = c3115a.m15593k();
                } else if (iM15594l == 26) {
                    this.f23186d = c3115a.m15593k();
                } else if (iM15594l == 32) {
                    this.f23187e = c3115a.m15591i();
                } else if (iM15594l != 40) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23188f = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        a[] aVarArr = this.f23181b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int iM15630a = 0;
            while (true) {
                a[] aVarArr2 = this.f23181b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    iM15630a = C3141b.m15630a(1, aVar) + iM15630a;
                }
                i++;
            }
            i = iM15630a;
        }
        return C3141b.m15632a(2, this.f23182c) + i;
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
                int iM15952a = C3271g.m15952a(c3115a, 10);
                a[] aVarArr = this.f23181b;
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
                this.f23181b = aVarArr2;
            } else if (iM15594l != 16) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f23182c = c3115a.m15581c();
            }
        }
        return this;
    }
}

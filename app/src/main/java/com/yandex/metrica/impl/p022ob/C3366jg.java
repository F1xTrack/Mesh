package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.jg */
/* loaded from: classes2.dex */
public final class C3366jg extends AbstractC3219e {

    /* renamed from: b */
    public a[] f23724b;

    /* renamed from: c */
    public String f23725c;

    /* renamed from: d */
    public long f23726d;

    /* renamed from: e */
    public boolean f23727e;

    /* renamed from: f */
    public boolean f23728f;

    public C3366jg() {
        m16125b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a[] aVarArr = this.f23724b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f23724b;
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
        c3141b.m15648b(2, this.f23725c);
        c3141b.m15652c(3, this.f23726d);
        c3141b.m15649b(4, this.f23727e);
        c3141b.m15649b(5, this.f23728f);
    }

    /* renamed from: b */
    public C3366jg m16125b() {
        this.f23724b = a.m16126c();
        this.f23725c = "";
        this.f23726d = 0L;
        this.f23727e = false;
        this.f23728f = false;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.jg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: d */
        private static volatile a[] f23729d;

        /* renamed from: b */
        public String f23730b;

        /* renamed from: c */
        public String[] f23731c;

        public a() {
            m16127b();
        }

        /* renamed from: c */
        public static a[] m16126c() {
            if (f23729d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23729d == null) {
                            f23729d = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f23729d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f23730b);
            String[] strArr = this.f23731c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                String[] strArr2 = this.f23731c;
                if (i >= strArr2.length) {
                    return;
                }
                String str = strArr2[i];
                if (str != null) {
                    c3141b.m15648b(2, str);
                }
                i++;
            }
        }

        /* renamed from: b */
        public a m16127b() {
            this.f23730b = "";
            this.f23731c = C3271g.f23457b;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15631a = C3141b.m15631a(1, this.f23730b);
            String[] strArr = this.f23731c;
            if (strArr == null || strArr.length <= 0) {
                return iM15631a;
            }
            int i = 0;
            int iM15636a = 0;
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f23731c;
                if (i >= strArr2.length) {
                    return iM15631a + iM15636a + i2;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
                    iM15636a = C3141b.m15636a(str) + iM15636a;
                }
                i++;
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
                if (iM15594l == 10) {
                    this.f23730b = c3115a.m15593k();
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 18);
                    String[] strArr = this.f23731c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = iM15952a + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = c3115a.m15593k();
                        c3115a.m15594l();
                        length++;
                    }
                    strArr2[length] = c3115a.m15593k();
                    this.f23731c = strArr2;
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        a[] aVarArr = this.f23724b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int iM15630a = 0;
            while (true) {
                a[] aVarArr2 = this.f23724b;
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
        return C3141b.m15632a(5, this.f23728f) + C3141b.m15632a(4, this.f23727e) + C3141b.m15629a(3, this.f23726d) + C3141b.m15631a(2, this.f23725c) + i;
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
                a[] aVarArr = this.f23724b;
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
                this.f23724b = aVarArr2;
            } else if (iM15594l == 18) {
                this.f23725c = c3115a.m15593k();
            } else if (iM15594l == 24) {
                this.f23726d = c3115a.m15591i();
            } else if (iM15594l == 32) {
                this.f23727e = c3115a.m15581c();
            } else if (iM15594l != 40) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f23728f = c3115a.m15581c();
            }
        }
        return this;
    }
}

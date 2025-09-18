package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ig */
/* loaded from: classes2.dex */
public final class C3340ig extends AbstractC3219e {

    /* renamed from: b */
    public a f23649b;

    /* renamed from: c */
    public boolean f23650c;

    public C3340ig() {
        m16088b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a aVar = this.f23649b;
        if (aVar != null) {
            c3141b.m15647b(1, aVar);
        }
        boolean z = this.f23650c;
        if (z) {
            c3141b.m15649b(2, z);
        }
    }

    /* renamed from: b */
    public C3340ig m16088b() {
        this.f23649b = null;
        this.f23650c = false;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ig$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: b */
        public C7307a[] f23651b;

        public a() {
            m16089b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            C7307a[] c7307aArr = this.f23651b;
            if (c7307aArr == null || c7307aArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                C7307a[] c7307aArr2 = this.f23651b;
                if (i >= c7307aArr2.length) {
                    return;
                }
                C7307a c7307a = c7307aArr2[i];
                if (c7307a != null) {
                    c3141b.m15647b(1, c7307a);
                }
                i++;
            }
        }

        /* renamed from: b */
        public a m16089b() {
            this.f23651b = C7307a.m16090c();
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.ig$a$a, reason: collision with other inner class name */
        public static final class C7307a extends AbstractC3219e {

            /* renamed from: d */
            private static volatile C7307a[] f23652d;

            /* renamed from: b */
            public String f23653b;

            /* renamed from: c */
            public String f23654c;

            public C7307a() {
                m16091b();
            }

            /* renamed from: c */
            public static C7307a[] m16090c() {
                if (f23652d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f23652d == null) {
                                f23652d = new C7307a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f23652d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                c3141b.m15648b(1, this.f23653b);
                if (this.f23654c.equals("")) {
                    return;
                }
                c3141b.m15648b(2, this.f23654c);
            }

            /* renamed from: b */
            public C7307a m16091b() {
                this.f23653b = "";
                this.f23654c = "";
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                int iM15631a = C3141b.m15631a(1, this.f23653b);
                return !this.f23654c.equals("") ? iM15631a + C3141b.m15631a(2, this.f23654c) : iM15631a;
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
                        this.f23653b = c3115a.m15593k();
                    } else if (iM15594l != 18) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f23654c = c3115a.m15593k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            C7307a[] c7307aArr = this.f23651b;
            int i = 0;
            if (c7307aArr == null || c7307aArr.length <= 0) {
                return 0;
            }
            int iM15630a = 0;
            while (true) {
                C7307a[] c7307aArr2 = this.f23651b;
                if (i >= c7307aArr2.length) {
                    return iM15630a;
                }
                C7307a c7307a = c7307aArr2[i];
                if (c7307a != null) {
                    iM15630a = C3141b.m15630a(1, c7307a) + iM15630a;
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
                if (iM15594l != 10) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 10);
                    C7307a[] c7307aArr = this.f23651b;
                    int length = c7307aArr == null ? 0 : c7307aArr.length;
                    int i = iM15952a + length;
                    C7307a[] c7307aArr2 = new C7307a[i];
                    if (length != 0) {
                        System.arraycopy(c7307aArr, 0, c7307aArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C7307a c7307a = new C7307a();
                        c7307aArr2[length] = c7307a;
                        c3115a.m15577a(c7307a);
                        c3115a.m15594l();
                        length++;
                    }
                    C7307a c7307a2 = new C7307a();
                    c7307aArr2[length] = c7307a2;
                    c3115a.m15577a(c7307a2);
                    this.f23651b = c7307aArr2;
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        a aVar = this.f23649b;
        int iM15630a = aVar != null ? C3141b.m15630a(1, aVar) : 0;
        boolean z = this.f23650c;
        return z ? iM15630a + C3141b.m15632a(2, z) : iM15630a;
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
                if (this.f23649b == null) {
                    this.f23649b = new a();
                }
                c3115a.m15577a(this.f23649b);
            } else if (iM15594l != 16) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f23650c = c3115a.m15581c();
            }
        }
        return this;
    }
}

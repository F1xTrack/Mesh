package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.dg */
/* loaded from: classes2.dex */
public final class C3210dg extends AbstractC3219e {

    /* renamed from: b */
    public a f23249b;

    /* renamed from: c */
    public a[] f23250c;

    public C3210dg() {
        m15760b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a aVar = this.f23249b;
        if (aVar != null) {
            c3141b.m15647b(1, aVar);
        }
        a[] aVarArr = this.f23250c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.f23250c;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar2 = aVarArr2[i];
            if (aVar2 != null) {
                c3141b.m15647b(2, aVar2);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C3210dg m15760b() {
        this.f23249b = null;
        this.f23250c = a.m15761c();
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: b */
        public a[] f23254b;

        public b() {
            m15763b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            a[] aVarArr = this.f23254b;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f23254b;
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
        public b m15763b() {
            this.f23254b = a.m15764c();
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.dg$b$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: d */
            private static volatile a[] f23255d;

            /* renamed from: b */
            public String f23256b;

            /* renamed from: c */
            public String f23257c;

            public a() {
                m15765b();
            }

            /* renamed from: c */
            public static a[] m15764c() {
                if (f23255d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f23255d == null) {
                                f23255d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f23255d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                if (!this.f23256b.equals("")) {
                    c3141b.m15648b(1, this.f23256b);
                }
                if (this.f23257c.equals("")) {
                    return;
                }
                c3141b.m15648b(2, this.f23257c);
            }

            /* renamed from: b */
            public a m15765b() {
                this.f23256b = "";
                this.f23257c = "";
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                int iM15631a = !this.f23256b.equals("") ? C3141b.m15631a(1, this.f23256b) : 0;
                return !this.f23257c.equals("") ? iM15631a + C3141b.m15631a(2, this.f23257c) : iM15631a;
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
                        this.f23256b = c3115a.m15593k();
                    } else if (iM15594l != 18) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f23257c = c3115a.m15593k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            a[] aVarArr = this.f23254b;
            int i = 0;
            if (aVarArr == null || aVarArr.length <= 0) {
                return 0;
            }
            int iM15630a = 0;
            while (true) {
                a[] aVarArr2 = this.f23254b;
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
                    a[] aVarArr = this.f23254b;
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
                    this.f23254b = aVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: d */
        private static volatile a[] f23251d;

        /* renamed from: b */
        public b f23252b;

        /* renamed from: c */
        public int f23253c;

        public a() {
            m15762b();
        }

        /* renamed from: c */
        public static a[] m15761c() {
            if (f23251d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23251d == null) {
                            f23251d = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f23251d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            b bVar = this.f23252b;
            if (bVar != null) {
                c3141b.m15647b(1, bVar);
            }
            int i = this.f23253c;
            if (i != 0) {
                c3141b.m15654d(2, i);
            }
        }

        /* renamed from: b */
        public a m15762b() {
            this.f23252b = null;
            this.f23253c = 0;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            b bVar = this.f23252b;
            int iM15630a = bVar != null ? C3141b.m15630a(1, bVar) : 0;
            int i = this.f23253c;
            return i != 0 ? iM15630a + C3141b.m15628a(2, i) : iM15630a;
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
                    if (this.f23252b == null) {
                        this.f23252b = new b();
                    }
                    c3115a.m15577a(this.f23252b);
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                        this.f23253c = iM15590h;
                    }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        a aVar = this.f23249b;
        int i = 0;
        int iM15630a = aVar != null ? C3141b.m15630a(1, aVar) : 0;
        a[] aVarArr = this.f23250c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f23250c;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    iM15630a = C3141b.m15630a(2, aVar2) + iM15630a;
                }
                i++;
            }
        }
        return iM15630a;
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
                if (this.f23249b == null) {
                    this.f23249b = new a();
                }
                c3115a.m15577a(this.f23249b);
            } else if (iM15594l != 18) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a = C3271g.m15952a(c3115a, 18);
                a[] aVarArr = this.f23250c;
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
                this.f23250c = aVarArr2;
            }
        }
        return this;
    }
}

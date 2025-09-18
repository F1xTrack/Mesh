package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.gg */
/* loaded from: classes2.dex */
public final class C3288gg extends AbstractC3219e {

    /* renamed from: b */
    public a f23515b;

    /* renamed from: c */
    public b[] f23516c;

    public C3288gg() {
        m15996b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a aVar = this.f23515b;
        if (aVar != null) {
            c3141b.m15647b(1, aVar);
        }
        b[] bVarArr = this.f23516c;
        if (bVarArr == null || bVarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            b[] bVarArr2 = this.f23516c;
            if (i >= bVarArr2.length) {
                return;
            }
            b bVar = bVarArr2[i];
            if (bVar != null) {
                c3141b.m15647b(2, bVar);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C3288gg m15996b() {
        this.f23515b = null;
        this.f23516c = b.m15998c();
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: e */
        private static volatile b[] f23522e;

        /* renamed from: b */
        public String f23523b;

        /* renamed from: c */
        public String f23524c;

        /* renamed from: d */
        public int f23525d;

        public b() {
            m15999b();
        }

        /* renamed from: c */
        public static b[] m15998c() {
            if (f23522e == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23522e == null) {
                            f23522e = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return f23522e;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!this.f23523b.equals("")) {
                c3141b.m15648b(1, this.f23523b);
            }
            if (!this.f23524c.equals("")) {
                c3141b.m15648b(2, this.f23524c);
            }
            c3141b.m15654d(3, this.f23525d);
        }

        /* renamed from: b */
        public b m15999b() {
            this.f23523b = "";
            this.f23524c = "";
            this.f23525d = 0;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15631a = !this.f23523b.equals("") ? C3141b.m15631a(1, this.f23523b) : 0;
            if (!this.f23524c.equals("")) {
                iM15631a += C3141b.m15631a(2, this.f23524c);
            }
            return C3141b.m15628a(3, this.f23525d) + iM15631a;
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
                    this.f23523b = c3115a.m15593k();
                } else if (iM15594l == 18) {
                    this.f23524c = c3115a.m15593k();
                } else if (iM15594l != 24) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                        this.f23525d = iM15590h;
                    }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        a aVar = this.f23515b;
        int i = 0;
        int iM15630a = aVar != null ? C3141b.m15630a(1, aVar) : 0;
        b[] bVarArr = this.f23516c;
        if (bVarArr != null && bVarArr.length > 0) {
            while (true) {
                b[] bVarArr2 = this.f23516c;
                if (i >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    iM15630a = C3141b.m15630a(2, bVar) + iM15630a;
                }
                i++;
            }
        }
        return iM15630a;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: b */
        public String f23517b;

        /* renamed from: c */
        public String f23518c;

        /* renamed from: d */
        public boolean f23519d;

        /* renamed from: e */
        public boolean f23520e;

        /* renamed from: f */
        public int f23521f;

        public a() {
            m15997b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!this.f23517b.equals("")) {
                c3141b.m15648b(1, this.f23517b);
            }
            if (!this.f23518c.equals("")) {
                c3141b.m15648b(2, this.f23518c);
            }
            boolean z = this.f23519d;
            if (z) {
                c3141b.m15649b(3, z);
            }
            boolean z2 = this.f23520e;
            if (z2) {
                c3141b.m15649b(4, z2);
            }
            c3141b.m15654d(5, this.f23521f);
        }

        /* renamed from: b */
        public a m15997b() {
            this.f23517b = "";
            this.f23518c = "";
            this.f23519d = false;
            this.f23520e = false;
            this.f23521f = 0;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15631a = !this.f23517b.equals("") ? C3141b.m15631a(1, this.f23517b) : 0;
            if (!this.f23518c.equals("")) {
                iM15631a += C3141b.m15631a(2, this.f23518c);
            }
            boolean z = this.f23519d;
            if (z) {
                iM15631a += C3141b.m15632a(3, z);
            }
            boolean z2 = this.f23520e;
            if (z2) {
                iM15631a += C3141b.m15632a(4, z2);
            }
            return C3141b.m15628a(5, this.f23521f) + iM15631a;
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
                    this.f23517b = c3115a.m15593k();
                } else if (iM15594l == 18) {
                    this.f23518c = c3115a.m15593k();
                } else if (iM15594l == 24) {
                    this.f23519d = c3115a.m15581c();
                } else if (iM15594l == 32) {
                    this.f23520e = c3115a.m15581c();
                } else if (iM15594l != 40) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                        this.f23521f = iM15590h;
                    }
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
            if (iM15594l == 10) {
                if (this.f23515b == null) {
                    this.f23515b = new a();
                }
                c3115a.m15577a(this.f23515b);
            } else if (iM15594l != 18) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a = C3271g.m15952a(c3115a, 18);
                b[] bVarArr = this.f23516c;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = iM15952a + length;
                b[] bVarArr2 = new b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    b bVar = new b();
                    bVarArr2[length] = bVar;
                    c3115a.m15577a(bVar);
                    c3115a.m15594l();
                    length++;
                }
                b bVar2 = new b();
                bVarArr2[length] = bVar2;
                c3115a.m15577a(bVar2);
                this.f23516c = bVarArr2;
            }
        }
        return this;
    }
}

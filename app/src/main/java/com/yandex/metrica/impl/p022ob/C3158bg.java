package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.bg */
/* loaded from: classes2.dex */
public final class C3158bg extends AbstractC3219e {

    /* renamed from: b */
    public b[] f23137b;

    /* renamed from: c */
    public a f23138c;

    /* renamed from: d */
    public String[] f23139d;

    public C3158bg() {
        m15689b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        b[] bVarArr = this.f23137b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f23137b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    c3141b.m15647b(1, bVar);
                }
                i2++;
            }
        }
        a aVar = this.f23138c;
        if (aVar != null) {
            c3141b.m15647b(2, aVar);
        }
        String[] strArr = this.f23139d;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f23139d;
            if (i >= strArr2.length) {
                return;
            }
            String str = strArr2[i];
            if (str != null) {
                c3141b.m15648b(3, str);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C3158bg m15689b() {
        this.f23137b = b.m15691c();
        this.f23138c = null;
        this.f23139d = C3271g.f23457b;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: b */
        public int f23140b;

        /* renamed from: c */
        public int f23141c;

        public a() {
            m15690b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15654d(2, this.f23140b);
            c3141b.m15654d(3, this.f23141c);
        }

        /* renamed from: b */
        public a m15690b() {
            this.f23140b = 0;
            this.f23141c = -1;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15628a(3, this.f23141c) + C3141b.m15628a(2, this.f23140b);
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 16) {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3 || iM15590h == 4 || iM15590h == 5) {
                        this.f23140b = iM15590h;
                    }
                } else if (iM15594l != 24) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15590h2 = c3115a.m15590h();
                    if (iM15590h2 == -1 || iM15590h2 == 0 || iM15590h2 == 1) {
                        this.f23141c = iM15590h2;
                    }
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: d */
        private static volatile b[] f23142d;

        /* renamed from: b */
        public String f23143b;

        /* renamed from: c */
        public boolean f23144c;

        public b() {
            m15692b();
        }

        /* renamed from: c */
        public static b[] m15691c() {
            if (f23142d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23142d == null) {
                            f23142d = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return f23142d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f23143b);
            c3141b.m15649b(2, this.f23144c);
        }

        /* renamed from: b */
        public b m15692b() {
            this.f23143b = "";
            this.f23144c = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15632a(2, this.f23144c) + C3141b.m15631a(1, this.f23143b);
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
                    this.f23143b = c3115a.m15593k();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23144c = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15630a;
        b[] bVarArr = this.f23137b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            iM15630a = 0;
            while (true) {
                b[] bVarArr2 = this.f23137b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    iM15630a += C3141b.m15630a(1, bVar);
                }
                i2++;
            }
        } else {
            iM15630a = 0;
        }
        a aVar = this.f23138c;
        if (aVar != null) {
            iM15630a += C3141b.m15630a(2, aVar);
        }
        String[] strArr = this.f23139d;
        if (strArr == null || strArr.length <= 0) {
            return iM15630a;
        }
        int iM15636a = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.f23139d;
            if (i >= strArr2.length) {
                return iM15630a + iM15636a + i3;
            }
            String str = strArr2[i];
            if (str != null) {
                i3++;
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
                int iM15952a = C3271g.m15952a(c3115a, 10);
                b[] bVarArr = this.f23137b;
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
                this.f23137b = bVarArr2;
            } else if (iM15594l == 18) {
                if (this.f23138c == null) {
                    this.f23138c = new a();
                }
                c3115a.m15577a(this.f23138c);
            } else if (iM15594l != 26) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a2 = C3271g.m15952a(c3115a, 26);
                String[] strArr = this.f23139d;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = iM15952a2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = c3115a.m15593k();
                    c3115a.m15594l();
                    length2++;
                }
                strArr2[length2] = c3115a.m15593k();
                this.f23139d = strArr2;
            }
        }
        return this;
    }
}

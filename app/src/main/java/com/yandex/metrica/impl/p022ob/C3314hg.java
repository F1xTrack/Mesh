package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.hg */
/* loaded from: classes2.dex */
public final class C3314hg extends AbstractC3219e {

    /* renamed from: b */
    public a[] f23576b;

    /* renamed from: c */
    public String[] f23577c;

    /* renamed from: com.yandex.metrica.impl.ob.hg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: h */
        private static volatile a[] f23578h;

        /* renamed from: b */
        public String f23579b;

        /* renamed from: c */
        public String f23580c;

        /* renamed from: d */
        public String f23581d;

        /* renamed from: e */
        public C7306a[] f23582e;

        /* renamed from: f */
        public long f23583f;

        /* renamed from: g */
        public int[] f23584g;

        public a() {
            m16047b();
        }

        /* renamed from: c */
        public static a[] m16046c() {
            if (f23578h == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23578h == null) {
                            f23578h = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f23578h;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f23579b);
            c3141b.m15648b(2, this.f23580c);
            c3141b.m15648b(3, this.f23581d);
            C7306a[] c7306aArr = this.f23582e;
            int i = 0;
            if (c7306aArr != null && c7306aArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C7306a[] c7306aArr2 = this.f23582e;
                    if (i2 >= c7306aArr2.length) {
                        break;
                    }
                    C7306a c7306a = c7306aArr2[i2];
                    if (c7306a != null) {
                        c3141b.m15647b(4, c7306a);
                    }
                    i2++;
                }
            }
            c3141b.m15658e(5, this.f23583f);
            int[] iArr = this.f23584g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.f23584g;
                if (i >= iArr2.length) {
                    return;
                }
                c3141b.m15654d(6, iArr2[i]);
                i++;
            }
        }

        /* renamed from: b */
        public a m16047b() {
            this.f23579b = "";
            this.f23580c = "";
            this.f23581d = "";
            this.f23582e = C7306a.m16048c();
            this.f23583f = 0L;
            this.f23584g = C3271g.f23456a;
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.hg$a$a, reason: collision with other inner class name */
        public static final class C7306a extends AbstractC3219e {

            /* renamed from: d */
            private static volatile C7306a[] f23585d;

            /* renamed from: b */
            public String f23586b;

            /* renamed from: c */
            public String f23587c;

            public C7306a() {
                m16049b();
            }

            /* renamed from: c */
            public static C7306a[] m16048c() {
                if (f23585d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f23585d == null) {
                                f23585d = new C7306a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f23585d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                c3141b.m15648b(1, this.f23586b);
                c3141b.m15648b(2, this.f23587c);
            }

            /* renamed from: b */
            public C7306a m16049b() {
                this.f23586b = "";
                this.f23587c = "";
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                return C3141b.m15631a(2, this.f23587c) + C3141b.m15631a(1, this.f23586b);
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
                        this.f23586b = c3115a.m15593k();
                    } else if (iM15594l != 18) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f23587c = c3115a.m15593k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15631a = C3141b.m15631a(3, this.f23581d) + C3141b.m15631a(2, this.f23580c) + C3141b.m15631a(1, this.f23579b);
            C7306a[] c7306aArr = this.f23582e;
            int i = 0;
            if (c7306aArr != null && c7306aArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C7306a[] c7306aArr2 = this.f23582e;
                    if (i2 >= c7306aArr2.length) {
                        break;
                    }
                    C7306a c7306a = c7306aArr2[i2];
                    if (c7306a != null) {
                        iM15631a = C3141b.m15630a(4, c7306a) + iM15631a;
                    }
                    i2++;
                }
            }
            int iM15640b = C3141b.m15640b(5, this.f23583f) + iM15631a;
            int[] iArr = this.f23584g;
            if (iArr == null || iArr.length <= 0) {
                return iM15640b;
            }
            int iM15626a = 0;
            while (true) {
                int[] iArr2 = this.f23584g;
                if (i < iArr2.length) {
                    iM15626a += C3141b.m15626a(iArr2[i]);
                    i++;
                } else {
                    return iM15640b + iM15626a + iArr2.length;
                }
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
                    this.f23579b = c3115a.m15593k();
                } else if (iM15594l == 18) {
                    this.f23580c = c3115a.m15593k();
                } else if (iM15594l == 26) {
                    this.f23581d = c3115a.m15593k();
                } else if (iM15594l == 34) {
                    int iM15952a = C3271g.m15952a(c3115a, 34);
                    C7306a[] c7306aArr = this.f23582e;
                    int length = c7306aArr == null ? 0 : c7306aArr.length;
                    int i = iM15952a + length;
                    C7306a[] c7306aArr2 = new C7306a[i];
                    if (length != 0) {
                        System.arraycopy(c7306aArr, 0, c7306aArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C7306a c7306a = new C7306a();
                        c7306aArr2[length] = c7306a;
                        c3115a.m15577a(c7306a);
                        c3115a.m15594l();
                        length++;
                    }
                    C7306a c7306a2 = new C7306a();
                    c7306aArr2[length] = c7306a2;
                    c3115a.m15577a(c7306a2);
                    this.f23582e = c7306aArr2;
                } else if (iM15594l == 40) {
                    this.f23583f = c3115a.m15591i();
                } else if (iM15594l == 48) {
                    int iM15952a2 = C3271g.m15952a(c3115a, 48);
                    int[] iArr = new int[iM15952a2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < iM15952a2; i3++) {
                        if (i3 != 0) {
                            c3115a.m15594l();
                        }
                        int iM15590h = c3115a.m15590h();
                        if (iM15590h == 1 || iM15590h == 2) {
                            iArr[i2] = iM15590h;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.f23584g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == iM15952a2) {
                            this.f23584g = iArr;
                        } else {
                            int[] iArr3 = new int[length2 + i2];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f23584g = iArr3;
                        }
                    }
                } else if (iM15594l != 50) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15580c = c3115a.m15580c(c3115a.m15590h());
                    int iM15578b = c3115a.m15578b();
                    int i4 = 0;
                    while (c3115a.m15575a() > 0) {
                        int iM15590h2 = c3115a.m15590h();
                        if (iM15590h2 == 1 || iM15590h2 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        c3115a.m15585e(iM15578b);
                        int[] iArr4 = this.f23584g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i4 + length3];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (c3115a.m15575a() > 0) {
                            int iM15590h3 = c3115a.m15590h();
                            if (iM15590h3 == 1 || iM15590h3 == 2) {
                                iArr5[length3] = iM15590h3;
                                length3++;
                            }
                        }
                        this.f23584g = iArr5;
                    }
                    c3115a.m15579b(iM15580c);
                }
            }
            return this;
        }
    }

    public C3314hg() {
        m16045b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a[] aVarArr = this.f23576b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f23576b;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    c3141b.m15647b(1, aVar);
                }
                i2++;
            }
        }
        String[] strArr = this.f23577c;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f23577c;
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
    public C3314hg m16045b() {
        this.f23576b = a.m16046c();
        this.f23577c = C3271g.f23457b;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15630a;
        a[] aVarArr = this.f23576b;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            iM15630a = 0;
            while (true) {
                a[] aVarArr2 = this.f23576b;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    iM15630a += C3141b.m15630a(1, aVar);
                }
                i2++;
            }
        } else {
            iM15630a = 0;
        }
        String[] strArr = this.f23577c;
        if (strArr == null || strArr.length <= 0) {
            return iM15630a;
        }
        int iM15636a = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.f23577c;
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
                a[] aVarArr = this.f23576b;
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
                this.f23576b = aVarArr2;
            } else if (iM15594l != 18) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a2 = C3271g.m15952a(c3115a, 18);
                String[] strArr = this.f23577c;
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
                this.f23577c = strArr2;
            }
        }
        return this;
    }
}

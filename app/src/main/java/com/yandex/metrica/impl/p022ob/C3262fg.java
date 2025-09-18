package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.fg */
/* loaded from: classes2.dex */
public final class C3262fg extends AbstractC3219e {

    /* renamed from: b */
    public a[] f23438b;

    public C3262fg() {
        m15935b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        a[] aVarArr = this.f23438b;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.f23438b;
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
    public C3262fg m15935b() {
        this.f23438b = a.m15936c();
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.fg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: d */
        private static volatile a[] f23439d;

        /* renamed from: b */
        public String f23440b;

        /* renamed from: c */
        public boolean f23441c;

        public a() {
            m15937b();
        }

        /* renamed from: c */
        public static a[] m15936c() {
            if (f23439d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23439d == null) {
                            f23439d = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f23439d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f23440b);
            c3141b.m15649b(2, this.f23441c);
        }

        /* renamed from: b */
        public a m15937b() {
            this.f23440b = "";
            this.f23441c = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15632a(2, this.f23441c) + C3141b.m15631a(1, this.f23440b);
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
                    this.f23440b = c3115a.m15593k();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23441c = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        a[] aVarArr = this.f23438b;
        int i = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int iM15630a = 0;
        while (true) {
            a[] aVarArr2 = this.f23438b;
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
                a[] aVarArr = this.f23438b;
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
                this.f23438b = aVarArr2;
            }
        }
        return this;
    }
}

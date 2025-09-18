package com.yandex.metrica.impl.p022ob;

import com.facebook.crypto.mac.NativeMac;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Uf */
/* loaded from: classes2.dex */
public final class C2981Uf extends AbstractC3219e {

    /* renamed from: b */
    public b[] f22456b;

    /* renamed from: c */
    public a[] f22457c;

    public C2981Uf() {
        m15272b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        b[] bVarArr = this.f22456b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f22456b;
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
        a[] aVarArr = this.f22457c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        while (true) {
            a[] aVarArr2 = this.f22457c;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i];
            if (aVar != null) {
                c3141b.m15647b(2, aVar);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C2981Uf m15272b() {
        this.f22456b = b.m15275c();
        this.f22457c = a.m15273c();
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15630a;
        b[] bVarArr = this.f22456b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            iM15630a = 0;
            while (true) {
                b[] bVarArr2 = this.f22456b;
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
        a[] aVarArr = this.f22457c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f22457c;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    iM15630a = C3141b.m15630a(2, aVar) + iM15630a;
                }
                i++;
            }
        }
        return iM15630a;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: i */
        private static volatile a[] f22458i;

        /* renamed from: b */
        public long f22459b;

        /* renamed from: c */
        public long f22460c;

        /* renamed from: d */
        public C2956Tf[] f22461d;

        /* renamed from: e */
        public C3031Wf[] f22462e;

        /* renamed from: f */
        public long f22463f;

        /* renamed from: g */
        public int f22464g;

        /* renamed from: h */
        public int f22465h;

        public a() {
            m15274b();
        }

        /* renamed from: c */
        public static a[] m15273c() {
            if (f22458i == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22458i == null) {
                            f22458i = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f22458i;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15658e(1, this.f22459b);
            c3141b.m15658e(2, this.f22460c);
            C2956Tf[] c2956TfArr = this.f22461d;
            int i = 0;
            if (c2956TfArr != null && c2956TfArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C2956Tf[] c2956TfArr2 = this.f22461d;
                    if (i2 >= c2956TfArr2.length) {
                        break;
                    }
                    C2956Tf c2956Tf = c2956TfArr2[i2];
                    if (c2956Tf != null) {
                        c3141b.m15647b(3, c2956Tf);
                    }
                    i2++;
                }
            }
            C3031Wf[] c3031WfArr = this.f22462e;
            if (c3031WfArr != null && c3031WfArr.length > 0) {
                while (true) {
                    C3031Wf[] c3031WfArr2 = this.f22462e;
                    if (i >= c3031WfArr2.length) {
                        break;
                    }
                    C3031Wf c3031Wf = c3031WfArr2[i];
                    if (c3031Wf != null) {
                        c3141b.m15647b(4, c3031Wf);
                    }
                    i++;
                }
            }
            long j = this.f22463f;
            if (j != 0) {
                c3141b.m15658e(5, j);
            }
            int i3 = this.f22464g;
            if (i3 != 0) {
                c3141b.m15654d(6, i3);
            }
            int i4 = this.f22465h;
            if (i4 != 0) {
                c3141b.m15654d(7, i4);
            }
        }

        /* renamed from: b */
        public a m15274b() {
            this.f22459b = 0L;
            this.f22460c = 0L;
            this.f22461d = C2956Tf.m15196c();
            this.f22462e = C3031Wf.m15390c();
            this.f22463f = 0L;
            this.f22464g = 0;
            this.f22465h = 0;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15640b = C3141b.m15640b(2, this.f22460c) + C3141b.m15640b(1, this.f22459b);
            C2956Tf[] c2956TfArr = this.f22461d;
            int i = 0;
            if (c2956TfArr != null && c2956TfArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C2956Tf[] c2956TfArr2 = this.f22461d;
                    if (i2 >= c2956TfArr2.length) {
                        break;
                    }
                    C2956Tf c2956Tf = c2956TfArr2[i2];
                    if (c2956Tf != null) {
                        iM15640b = C3141b.m15630a(3, c2956Tf) + iM15640b;
                    }
                    i2++;
                }
            }
            C3031Wf[] c3031WfArr = this.f22462e;
            if (c3031WfArr != null && c3031WfArr.length > 0) {
                while (true) {
                    C3031Wf[] c3031WfArr2 = this.f22462e;
                    if (i >= c3031WfArr2.length) {
                        break;
                    }
                    C3031Wf c3031Wf = c3031WfArr2[i];
                    if (c3031Wf != null) {
                        iM15640b = C3141b.m15630a(4, c3031Wf) + iM15640b;
                    }
                    i++;
                }
            }
            long j = this.f22463f;
            if (j != 0) {
                iM15640b += C3141b.m15640b(5, j);
            }
            int i3 = this.f22464g;
            if (i3 != 0) {
                iM15640b += C3141b.m15628a(6, i3);
            }
            int i4 = this.f22465h;
            return i4 != 0 ? iM15640b + C3141b.m15628a(7, i4) : iM15640b;
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
                    this.f22459b = c3115a.m15591i();
                } else if (iM15594l == 16) {
                    this.f22460c = c3115a.m15591i();
                } else if (iM15594l == 26) {
                    int iM15952a = C3271g.m15952a(c3115a, 26);
                    C2956Tf[] c2956TfArr = this.f22461d;
                    int length = c2956TfArr == null ? 0 : c2956TfArr.length;
                    int i = iM15952a + length;
                    C2956Tf[] c2956TfArr2 = new C2956Tf[i];
                    if (length != 0) {
                        System.arraycopy(c2956TfArr, 0, c2956TfArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C2956Tf c2956Tf = new C2956Tf();
                        c2956TfArr2[length] = c2956Tf;
                        c3115a.m15577a(c2956Tf);
                        c3115a.m15594l();
                        length++;
                    }
                    C2956Tf c2956Tf2 = new C2956Tf();
                    c2956TfArr2[length] = c2956Tf2;
                    c3115a.m15577a(c2956Tf2);
                    this.f22461d = c2956TfArr2;
                } else if (iM15594l == 34) {
                    int iM15952a2 = C3271g.m15952a(c3115a, 34);
                    C3031Wf[] c3031WfArr = this.f22462e;
                    int length2 = c3031WfArr == null ? 0 : c3031WfArr.length;
                    int i2 = iM15952a2 + length2;
                    C3031Wf[] c3031WfArr2 = new C3031Wf[i2];
                    if (length2 != 0) {
                        System.arraycopy(c3031WfArr, 0, c3031WfArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C3031Wf c3031Wf = new C3031Wf();
                        c3031WfArr2[length2] = c3031Wf;
                        c3115a.m15577a(c3031Wf);
                        c3115a.m15594l();
                        length2++;
                    }
                    C3031Wf c3031Wf2 = new C3031Wf();
                    c3031WfArr2[length2] = c3031Wf2;
                    c3115a.m15577a(c3031Wf2);
                    this.f22462e = c3031WfArr2;
                } else if (iM15594l == 40) {
                    this.f22463f = c3115a.m15591i();
                } else if (iM15594l == 48) {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3 || iM15590h == 4) {
                        this.f22464g = iM15590h;
                    }
                } else if (iM15594l != 56) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15590h2 = c3115a.m15590h();
                    if (iM15590h2 == 0 || iM15590h2 == 1 || iM15590h2 == 2 || iM15590h2 == 3) {
                        this.f22465h = iM15590h2;
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
                int iM15952a = C3271g.m15952a(c3115a, 10);
                b[] bVarArr = this.f22456b;
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
                this.f22456b = bVarArr2;
            } else if (iM15594l != 18) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a2 = C3271g.m15952a(c3115a, 18);
                a[] aVarArr = this.f22457c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = iM15952a2 + length2;
                a[] aVarArr2 = new a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    a aVar = new a();
                    aVarArr2[length2] = aVar;
                    c3115a.m15577a(aVar);
                    c3115a.m15594l();
                    length2++;
                }
                a aVar2 = new a();
                aVarArr2[length2] = aVar2;
                c3115a.m15577a(aVar2);
                this.f22457c = aVarArr2;
            }
        }
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: o */
        private static volatile b[] f22466o;

        /* renamed from: b */
        public long f22467b;

        /* renamed from: c */
        public long f22468c;

        /* renamed from: d */
        public long f22469d;

        /* renamed from: e */
        public double f22470e;

        /* renamed from: f */
        public double f22471f;

        /* renamed from: g */
        public int f22472g;

        /* renamed from: h */
        public int f22473h;

        /* renamed from: i */
        public int f22474i;

        /* renamed from: j */
        public int f22475j;

        /* renamed from: k */
        public int f22476k;

        /* renamed from: l */
        public int f22477l;

        /* renamed from: m */
        public long f22478m;

        /* renamed from: n */
        public int f22479n;

        public b() {
            m15276b();
        }

        /* renamed from: c */
        public static b[] m15275c() {
            if (f22466o == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22466o == null) {
                            f22466o = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return f22466o;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15658e(1, this.f22467b);
            c3141b.m15658e(2, this.f22468c);
            long j = this.f22469d;
            if (j != 0) {
                c3141b.m15658e(3, j);
            }
            c3141b.m15646b(4, this.f22470e);
            c3141b.m15646b(5, this.f22471f);
            int i = this.f22472g;
            if (i != 0) {
                c3141b.m15659f(6, i);
            }
            int i2 = this.f22473h;
            if (i2 != 0) {
                c3141b.m15659f(7, i2);
            }
            int i3 = this.f22474i;
            if (i3 != 0) {
                c3141b.m15659f(8, i3);
            }
            int i4 = this.f22475j;
            if (i4 != 0) {
                c3141b.m15654d(9, i4);
            }
            int i5 = this.f22476k;
            if (i5 != 0) {
                c3141b.m15654d(10, i5);
            }
            int i6 = this.f22477l;
            if (i6 != 0) {
                c3141b.m15654d(11, i6);
            }
            long j2 = this.f22478m;
            if (j2 != 0) {
                c3141b.m15658e(12, j2);
            }
            int i7 = this.f22479n;
            if (i7 != 0) {
                c3141b.m15654d(13, i7);
            }
        }

        /* renamed from: b */
        public b m15276b() {
            this.f22467b = 0L;
            this.f22468c = 0L;
            this.f22469d = 0L;
            this.f22470e = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f22471f = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f22472g = 0;
            this.f22473h = 0;
            this.f22474i = 0;
            this.f22475j = 0;
            this.f22476k = 0;
            this.f22477l = 0;
            this.f22478m = 0L;
            this.f22479n = 0;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15640b = C3141b.m15640b(2, this.f22468c) + C3141b.m15640b(1, this.f22467b);
            long j = this.f22469d;
            if (j != 0) {
                iM15640b += C3141b.m15640b(3, j);
            }
            int iM15627a = C3141b.m15627a(5, this.f22471f) + C3141b.m15627a(4, this.f22470e) + iM15640b;
            int i = this.f22472g;
            if (i != 0) {
                iM15627a += C3141b.m15642c(6, i);
            }
            int i2 = this.f22473h;
            if (i2 != 0) {
                iM15627a += C3141b.m15642c(7, i2);
            }
            int i3 = this.f22474i;
            if (i3 != 0) {
                iM15627a += C3141b.m15642c(8, i3);
            }
            int i4 = this.f22475j;
            if (i4 != 0) {
                iM15627a += C3141b.m15628a(9, i4);
            }
            int i5 = this.f22476k;
            if (i5 != 0) {
                iM15627a += C3141b.m15628a(10, i5);
            }
            int i6 = this.f22477l;
            if (i6 != 0) {
                iM15627a += C3141b.m15628a(11, i6);
            }
            long j2 = this.f22478m;
            if (j2 != 0) {
                iM15627a += C3141b.m15640b(12, j2);
            }
            int i7 = this.f22479n;
            return i7 != 0 ? iM15627a + C3141b.m15628a(13, i7) : iM15627a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                switch (iM15594l) {
                    case 0:
                        break;
                    case 8:
                        this.f22467b = c3115a.m15591i();
                        break;
                    case 16:
                        this.f22468c = c3115a.m15591i();
                        break;
                    case 24:
                        this.f22469d = c3115a.m15591i();
                        break;
                    case 33:
                        this.f22470e = Double.longBitsToDouble(c3115a.m15588g());
                        break;
                    case 41:
                        this.f22471f = Double.longBitsToDouble(c3115a.m15588g());
                        break;
                    case 48:
                        this.f22472g = c3115a.m15590h();
                        break;
                    case 56:
                        this.f22473h = c3115a.m15590h();
                        break;
                    case NativeMac.KEY_LENGTH /* 64 */:
                        this.f22474i = c3115a.m15590h();
                        break;
                    case 72:
                        this.f22475j = c3115a.m15590h();
                        break;
                    case 80:
                        int iM15590h = c3115a.m15590h();
                        if (iM15590h != 0 && iM15590h != 1 && iM15590h != 2 && iM15590h != 3) {
                            break;
                        } else {
                            this.f22476k = iM15590h;
                            break;
                        }
                        break;
                    case 88:
                        int iM15590h2 = c3115a.m15590h();
                        if (iM15590h2 != 0 && iM15590h2 != 1 && iM15590h2 != 2 && iM15590h2 != 3) {
                            break;
                        } else {
                            this.f22477l = iM15590h2;
                            break;
                        }
                        break;
                    case 96:
                        this.f22478m = c3115a.m15591i();
                        break;
                    case 104:
                        int iM15590h3 = c3115a.m15590h();
                        if (iM15590h3 != 0 && iM15590h3 != 1 && iM15590h3 != 2 && iM15590h3 != 3 && iM15590h3 != 4) {
                            break;
                        } else {
                            this.f22479n = iM15590h3;
                            break;
                        }
                        break;
                    default:
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }
}

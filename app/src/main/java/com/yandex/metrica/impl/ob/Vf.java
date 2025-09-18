package com.yandex.metrica.impl.ob;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Vf extends AbstractC2714e {
    public d[] b;
    public c c;
    public a[] d;
    public e[] e;
    public String[] f;

    public static final class c extends AbstractC2714e {
        public String b;
        public String c;
        public String d;
        public int e;
        public String f;
        public String g;
        public boolean h;
        public int i;
        public String j;
        public String k;
        public int l;
        public a[] m;
        public String n;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (!this.b.equals("")) {
                c2639b.b(1, this.b);
            }
            if (!this.c.equals("")) {
                c2639b.b(2, this.c);
            }
            if (!this.d.equals("")) {
                c2639b.b(4, this.d);
            }
            int i = this.e;
            if (i != 0) {
                c2639b.f(5, i);
            }
            if (!this.f.equals("")) {
                c2639b.b(10, this.f);
            }
            if (!this.g.equals("")) {
                c2639b.b(15, this.g);
            }
            boolean z = this.h;
            if (z) {
                c2639b.b(17, z);
            }
            int i2 = this.i;
            if (i2 != 0) {
                c2639b.f(18, i2);
            }
            if (!this.j.equals("")) {
                c2639b.b(19, this.j);
            }
            if (!this.k.equals("")) {
                c2639b.b(21, this.k);
            }
            int i3 = this.l;
            if (i3 != 0) {
                c2639b.f(22, i3);
            }
            a[] aVarArr = this.m;
            if (aVarArr != null && aVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    a[] aVarArr2 = this.m;
                    if (i4 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i4];
                    if (aVar != null) {
                        c2639b.b(23, aVar);
                    }
                    i4++;
                }
            }
            if (this.n.equals("")) {
                return;
            }
            c2639b.b(24, this.n);
        }

        public c b() {
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = 0;
            this.f = "";
            this.g = "";
            this.h = false;
            this.i = 0;
            this.j = "";
            this.k = "";
            this.l = 0;
            this.m = a.c();
            this.n = "";
            this.a = -1;
            return this;
        }

        public static final class a extends AbstractC2714e {
            private static volatile a[] d;
            public String b;
            public long c;

            public a() {
                b();
            }

            public static a[] c() {
                if (d == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (d == null) {
                                d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                c2639b.b(1, this.b);
                c2639b.e(2, this.c);
            }

            public a b() {
                this.b = "";
                this.c = 0L;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                return C2639b.b(2, this.c) + C2639b.a(1, this.b);
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public AbstractC2714e a(C2614a c2614a) throws IOException {
                while (true) {
                    int iL = c2614a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.b = c2614a.k();
                    } else if (iL != 16) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        this.c = c2614a.i();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int i = 0;
            int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
            if (!this.c.equals("")) {
                iA += C2639b.a(2, this.c);
            }
            if (!this.d.equals("")) {
                iA += C2639b.a(4, this.d);
            }
            int i2 = this.e;
            if (i2 != 0) {
                iA += C2639b.c(5, i2);
            }
            if (!this.f.equals("")) {
                iA += C2639b.a(10, this.f);
            }
            if (!this.g.equals("")) {
                iA += C2639b.a(15, this.g);
            }
            boolean z = this.h;
            if (z) {
                iA += C2639b.a(17, z);
            }
            int i3 = this.i;
            if (i3 != 0) {
                iA += C2639b.c(18, i3);
            }
            if (!this.j.equals("")) {
                iA += C2639b.a(19, this.j);
            }
            if (!this.k.equals("")) {
                iA += C2639b.a(21, this.k);
            }
            int i4 = this.l;
            if (i4 != 0) {
                iA += C2639b.c(22, i4);
            }
            a[] aVarArr = this.m;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.m;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iA = C2639b.a(23, aVar) + iA;
                    }
                    i++;
                }
            }
            return !this.n.equals("") ? iA + C2639b.a(24, this.n) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 10:
                        this.b = c2614a.k();
                        break;
                    case 18:
                        this.c = c2614a.k();
                        break;
                    case 34:
                        this.d = c2614a.k();
                        break;
                    case C4473c9.L /* 40 */:
                        this.e = c2614a.h();
                        break;
                    case 82:
                        this.f = c2614a.k();
                        break;
                    case 122:
                        this.g = c2614a.k();
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 136 */:
                        this.h = c2614a.c();
                        break;
                    case 144:
                        this.i = c2614a.h();
                        break;
                    case 154:
                        this.j = c2614a.k();
                        break;
                    case 170:
                        this.k = c2614a.k();
                        break;
                    case 176:
                        this.l = c2614a.h();
                        break;
                    case 186:
                        int iA = C2764g.a(c2614a, 186);
                        a[] aVarArr = this.m;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        int i = iA + length;
                        a[] aVarArr2 = new a[i];
                        if (length != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            a aVar = new a();
                            aVarArr2[length] = aVar;
                            c2614a.a(aVar);
                            c2614a.l();
                            length++;
                        }
                        a aVar2 = new a();
                        aVarArr2[length] = aVar2;
                        c2614a.a(aVar2);
                        this.m = aVarArr2;
                        break;
                    case 194:
                        this.n = c2614a.k();
                        break;
                    default:
                        if (!c2614a.f(iL)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public Vf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        d[] dVarArr = this.b;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                d[] dVarArr2 = this.b;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    c2639b.b(3, dVar);
                }
                i2++;
            }
        }
        c cVar = this.c;
        if (cVar != null) {
            c2639b.b(4, cVar);
        }
        a[] aVarArr = this.d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.d;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    c2639b.b(7, aVar);
                }
                i3++;
            }
        }
        e[] eVarArr = this.e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e[] eVarArr2 = this.e;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i4];
                if (eVar != null) {
                    c2639b.b(10, eVar);
                }
                i4++;
            }
        }
        String[] strArr = this.f;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f;
            if (i >= strArr2.length) {
                return;
            }
            String str = strArr2[i];
            if (str != null) {
                c2639b.b(11, str);
            }
            i++;
        }
    }

    public Vf b() {
        this.b = d.c();
        this.c = null;
        this.d = a.c();
        this.e = e.c();
        this.f = C2764g.b;
        this.a = -1;
        return this;
    }

    public static final class a extends AbstractC2714e {
        private static volatile a[] d;
        public String b;
        public String c;

        public a() {
            b();
        }

        public static a[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
            c2639b.b(2, this.c);
        }

        public a b() {
            this.b = "";
            this.c = "";
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.a(2, this.c) + C2639b.a(1, this.b);
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.k();
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.k();
                }
            }
            return this;
        }
    }

    public static final class d extends AbstractC2714e {
        private static volatile d[] e;
        public long b;
        public b c;
        public a[] d;

        public d() {
            b();
        }

        public static d[] c() {
            if (e == null) {
                synchronized (C2664c.a) {
                    try {
                        if (e == null) {
                            e = new d[0];
                        }
                    } finally {
                    }
                }
            }
            return e;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.e(1, this.b);
            b bVar = this.c;
            if (bVar != null) {
                c2639b.b(2, bVar);
            }
            a[] aVarArr = this.d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.d;
                if (i >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    c2639b.b(3, aVar);
                }
                i++;
            }
        }

        public d b() {
            this.b = 0L;
            this.c = null;
            this.d = a.c();
            this.a = -1;
            return this;
        }

        public static final class a extends AbstractC2714e {
            private static volatile a[] y;
            public long b;
            public long c;
            public int d;
            public String e;
            public byte[] f;
            public b g;
            public b h;
            public String i;
            public C0010a j;
            public int k;
            public int l;
            public int m;
            public byte[] n;
            public int o;
            public long p;
            public long q;
            public int r;
            public int s;
            public int t;
            public int u;
            public int v;
            public boolean w;
            public long x;

            public a() {
                b();
            }

            public static a[] c() {
                if (y == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (y == null) {
                                y = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return y;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                c2639b.e(1, this.b);
                c2639b.e(2, this.c);
                c2639b.f(3, this.d);
                if (!this.e.equals("")) {
                    c2639b.b(4, this.e);
                }
                byte[] bArr = this.f;
                byte[] bArr2 = C2764g.d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c2639b.b(5, this.f);
                }
                b bVar = this.g;
                if (bVar != null) {
                    c2639b.b(6, bVar);
                }
                b bVar2 = this.h;
                if (bVar2 != null) {
                    c2639b.b(7, bVar2);
                }
                if (!this.i.equals("")) {
                    c2639b.b(8, this.i);
                }
                C0010a c0010a = this.j;
                if (c0010a != null) {
                    c2639b.b(9, c0010a);
                }
                int i = this.k;
                if (i != 0) {
                    c2639b.f(10, i);
                }
                int i2 = this.l;
                if (i2 != 0) {
                    c2639b.d(12, i2);
                }
                int i3 = this.m;
                if (i3 != -1) {
                    c2639b.d(13, i3);
                }
                if (!Arrays.equals(this.n, bArr2)) {
                    c2639b.b(14, this.n);
                }
                int i4 = this.o;
                if (i4 != -1) {
                    c2639b.d(15, i4);
                }
                long j = this.p;
                if (j != 0) {
                    c2639b.e(16, j);
                }
                long j2 = this.q;
                if (j2 != 0) {
                    c2639b.e(17, j2);
                }
                int i5 = this.r;
                if (i5 != 0) {
                    c2639b.d(18, i5);
                }
                int i6 = this.s;
                if (i6 != 0) {
                    c2639b.d(19, i6);
                }
                int i7 = this.t;
                if (i7 != -1) {
                    c2639b.d(20, i7);
                }
                int i8 = this.u;
                if (i8 != 0) {
                    c2639b.d(21, i8);
                }
                int i9 = this.v;
                if (i9 != 0) {
                    c2639b.d(22, i9);
                }
                boolean z = this.w;
                if (z) {
                    c2639b.b(23, z);
                }
                long j3 = this.x;
                if (j3 != 1) {
                    c2639b.e(24, j3);
                }
            }

            public a b() {
                this.b = 0L;
                this.c = 0L;
                this.d = 0;
                this.e = "";
                byte[] bArr = C2764g.d;
                this.f = bArr;
                this.g = null;
                this.h = null;
                this.i = "";
                this.j = null;
                this.k = 0;
                this.l = 0;
                this.m = -1;
                this.n = bArr;
                this.o = -1;
                this.p = 0L;
                this.q = 0L;
                this.r = 0;
                this.s = 0;
                this.t = -1;
                this.u = 0;
                this.v = 0;
                this.w = false;
                this.x = 1L;
                this.a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a$a */
            public static final class C0010a extends AbstractC2714e {
                public String b;
                public String c;
                public String d;

                public C0010a() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public void a(C2639b c2639b) throws IOException {
                    c2639b.b(1, this.b);
                    if (!this.c.equals("")) {
                        c2639b.b(2, this.c);
                    }
                    if (this.d.equals("")) {
                        return;
                    }
                    c2639b.b(3, this.d);
                }

                public C0010a b() {
                    this.b = "";
                    this.c = "";
                    this.d = "";
                    this.a = -1;
                    return this;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public int a() {
                    int iA = C2639b.a(1, this.b);
                    if (!this.c.equals("")) {
                        iA += C2639b.a(2, this.c);
                    }
                    return !this.d.equals("") ? iA + C2639b.a(3, this.d) : iA;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public AbstractC2714e a(C2614a c2614a) throws IOException {
                    while (true) {
                        int iL = c2614a.l();
                        if (iL == 0) {
                            break;
                        }
                        if (iL == 10) {
                            this.b = c2614a.k();
                        } else if (iL == 18) {
                            this.c = c2614a.k();
                        } else if (iL != 26) {
                            if (!c2614a.f(iL)) {
                                break;
                            }
                        } else {
                            this.d = c2614a.k();
                        }
                    }
                    return this;
                }
            }

            public static final class b extends AbstractC2714e {
                public Tf[] b;
                public Wf[] c;
                public int d;
                public String e;

                public b() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public void a(C2639b c2639b) throws IOException {
                    Tf[] tfArr = this.b;
                    int i = 0;
                    if (tfArr != null && tfArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            Tf[] tfArr2 = this.b;
                            if (i2 >= tfArr2.length) {
                                break;
                            }
                            Tf tf = tfArr2[i2];
                            if (tf != null) {
                                c2639b.b(1, tf);
                            }
                            i2++;
                        }
                    }
                    Wf[] wfArr = this.c;
                    if (wfArr != null && wfArr.length > 0) {
                        while (true) {
                            Wf[] wfArr2 = this.c;
                            if (i >= wfArr2.length) {
                                break;
                            }
                            Wf wf = wfArr2[i];
                            if (wf != null) {
                                c2639b.b(2, wf);
                            }
                            i++;
                        }
                    }
                    int i3 = this.d;
                    if (i3 != 2) {
                        c2639b.d(3, i3);
                    }
                    if (this.e.equals("")) {
                        return;
                    }
                    c2639b.b(4, this.e);
                }

                public b b() {
                    this.b = Tf.c();
                    this.c = Wf.c();
                    this.d = 2;
                    this.e = "";
                    this.a = -1;
                    return this;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public int a() {
                    int iA;
                    Tf[] tfArr = this.b;
                    int i = 0;
                    if (tfArr != null && tfArr.length > 0) {
                        int i2 = 0;
                        iA = 0;
                        while (true) {
                            Tf[] tfArr2 = this.b;
                            if (i2 >= tfArr2.length) {
                                break;
                            }
                            Tf tf = tfArr2[i2];
                            if (tf != null) {
                                iA += C2639b.a(1, tf);
                            }
                            i2++;
                        }
                    } else {
                        iA = 0;
                    }
                    Wf[] wfArr = this.c;
                    if (wfArr != null && wfArr.length > 0) {
                        while (true) {
                            Wf[] wfArr2 = this.c;
                            if (i >= wfArr2.length) {
                                break;
                            }
                            Wf wf = wfArr2[i];
                            if (wf != null) {
                                iA = C2639b.a(2, wf) + iA;
                            }
                            i++;
                        }
                    }
                    int i3 = this.d;
                    if (i3 != 2) {
                        iA += C2639b.a(3, i3);
                    }
                    return !this.e.equals("") ? iA + C2639b.a(4, this.e) : iA;
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public AbstractC2714e a(C2614a c2614a) throws IOException {
                    while (true) {
                        int iL = c2614a.l();
                        if (iL != 0) {
                            if (iL == 10) {
                                int iA = C2764g.a(c2614a, 10);
                                Tf[] tfArr = this.b;
                                int length = tfArr == null ? 0 : tfArr.length;
                                int i = iA + length;
                                Tf[] tfArr2 = new Tf[i];
                                if (length != 0) {
                                    System.arraycopy(tfArr, 0, tfArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    Tf tf = new Tf();
                                    tfArr2[length] = tf;
                                    c2614a.a(tf);
                                    c2614a.l();
                                    length++;
                                }
                                Tf tf2 = new Tf();
                                tfArr2[length] = tf2;
                                c2614a.a(tf2);
                                this.b = tfArr2;
                            } else if (iL == 18) {
                                int iA2 = C2764g.a(c2614a, 18);
                                Wf[] wfArr = this.c;
                                int length2 = wfArr == null ? 0 : wfArr.length;
                                int i2 = iA2 + length2;
                                Wf[] wfArr2 = new Wf[i2];
                                if (length2 != 0) {
                                    System.arraycopy(wfArr, 0, wfArr2, 0, length2);
                                }
                                while (length2 < i2 - 1) {
                                    Wf wf = new Wf();
                                    wfArr2[length2] = wf;
                                    c2614a.a(wf);
                                    c2614a.l();
                                    length2++;
                                }
                                Wf wf2 = new Wf();
                                wfArr2[length2] = wf2;
                                c2614a.a(wf2);
                                this.c = wfArr2;
                            } else if (iL == 24) {
                                int iH = c2614a.h();
                                switch (iH) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.d = iH;
                                        break;
                                }
                            } else if (iL != 34) {
                                if (!c2614a.f(iL)) {
                                }
                            } else {
                                this.e = c2614a.k();
                            }
                        }
                    }
                    return this;
                }
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                int iC = C2639b.c(3, this.d) + C2639b.b(2, this.c) + C2639b.b(1, this.b);
                if (!this.e.equals("")) {
                    iC += C2639b.a(4, this.e);
                }
                byte[] bArr = this.f;
                byte[] bArr2 = C2764g.d;
                if (!Arrays.equals(bArr, bArr2)) {
                    iC += C2639b.a(5, this.f);
                }
                b bVar = this.g;
                if (bVar != null) {
                    iC += C2639b.a(6, bVar);
                }
                b bVar2 = this.h;
                if (bVar2 != null) {
                    iC += C2639b.a(7, bVar2);
                }
                if (!this.i.equals("")) {
                    iC += C2639b.a(8, this.i);
                }
                C0010a c0010a = this.j;
                if (c0010a != null) {
                    iC += C2639b.a(9, c0010a);
                }
                int i = this.k;
                if (i != 0) {
                    iC += C2639b.c(10, i);
                }
                int i2 = this.l;
                if (i2 != 0) {
                    iC += C2639b.a(12, i2);
                }
                int i3 = this.m;
                if (i3 != -1) {
                    iC += C2639b.a(13, i3);
                }
                if (!Arrays.equals(this.n, bArr2)) {
                    iC += C2639b.a(14, this.n);
                }
                int i4 = this.o;
                if (i4 != -1) {
                    iC += C2639b.a(15, i4);
                }
                long j = this.p;
                if (j != 0) {
                    iC += C2639b.b(16, j);
                }
                long j2 = this.q;
                if (j2 != 0) {
                    iC += C2639b.b(17, j2);
                }
                int i5 = this.r;
                if (i5 != 0) {
                    iC += C2639b.a(18, i5);
                }
                int i6 = this.s;
                if (i6 != 0) {
                    iC += C2639b.a(19, i6);
                }
                int i7 = this.t;
                if (i7 != -1) {
                    iC += C2639b.a(20, i7);
                }
                int i8 = this.u;
                if (i8 != 0) {
                    iC += C2639b.a(21, i8);
                }
                int i9 = this.v;
                if (i9 != 0) {
                    iC += C2639b.a(22, i9);
                }
                boolean z = this.w;
                if (z) {
                    iC += C2639b.a(23, z);
                }
                long j3 = this.x;
                return j3 != 1 ? iC + C2639b.b(24, j3) : iC;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public AbstractC2714e a(C2614a c2614a) throws IOException {
                while (true) {
                    int iL = c2614a.l();
                    switch (iL) {
                        case 0:
                            break;
                        case 8:
                            this.b = c2614a.i();
                            break;
                        case 16:
                            this.c = c2614a.i();
                            break;
                        case 24:
                            this.d = c2614a.h();
                            break;
                        case 34:
                            this.e = c2614a.k();
                            break;
                        case C4473c9.M /* 42 */:
                            this.f = c2614a.d();
                            break;
                        case 50:
                            if (this.g == null) {
                                this.g = new b();
                            }
                            c2614a.a(this.g);
                            break;
                        case 58:
                            if (this.h == null) {
                                this.h = new b();
                            }
                            c2614a.a(this.h);
                            break;
                        case 66:
                            this.i = c2614a.k();
                            break;
                        case 74:
                            if (this.j == null) {
                                this.j = new C0010a();
                            }
                            c2614a.a(this.j);
                            break;
                        case 80:
                            this.k = c2614a.h();
                            break;
                        case 96:
                            int iH = c2614a.h();
                            if (iH != 0 && iH != 1 && iH != 2) {
                                break;
                            } else {
                                this.l = iH;
                                break;
                            }
                            break;
                        case 104:
                            int iH2 = c2614a.h();
                            if (iH2 != -1 && iH2 != 0 && iH2 != 1) {
                                break;
                            } else {
                                this.m = iH2;
                                break;
                            }
                        case 114:
                            this.n = c2614a.d();
                            break;
                        case 120:
                            int iH3 = c2614a.h();
                            if (iH3 != -1 && iH3 != 0 && iH3 != 1) {
                                break;
                            } else {
                                this.o = iH3;
                                break;
                            }
                        case 128:
                            this.p = c2614a.i();
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 136 */:
                            this.q = c2614a.i();
                            break;
                        case 144:
                            int iH4 = c2614a.h();
                            if (iH4 != 0 && iH4 != 1 && iH4 != 2 && iH4 != 3 && iH4 != 4) {
                                break;
                            } else {
                                this.r = iH4;
                                break;
                            }
                            break;
                        case 152:
                            int iH5 = c2614a.h();
                            if (iH5 != 0 && iH5 != 1 && iH5 != 2 && iH5 != 3) {
                                break;
                            } else {
                                this.s = iH5;
                                break;
                            }
                            break;
                        case 160:
                            int iH6 = c2614a.h();
                            if (iH6 != -1 && iH6 != 0 && iH6 != 1) {
                                break;
                            } else {
                                this.t = iH6;
                                break;
                            }
                            break;
                        case 168:
                            int iH7 = c2614a.h();
                            if (iH7 != 0 && iH7 != 1 && iH7 != 2 && iH7 != 3) {
                                break;
                            } else {
                                this.u = iH7;
                                break;
                            }
                            break;
                        case 176:
                            int iH8 = c2614a.h();
                            if (iH8 != 0 && iH8 != 1) {
                                break;
                            } else {
                                this.v = iH8;
                                break;
                            }
                            break;
                        case 184:
                            this.w = c2614a.c();
                            break;
                        case 192:
                            this.x = c2614a.i();
                            break;
                        default:
                            if (!c2614a.f(iL)) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return this;
            }
        }

        public static final class b extends AbstractC2714e {
            public f b;
            public String c;
            public int d;

            public b() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                f fVar = this.b;
                if (fVar != null) {
                    c2639b.b(1, fVar);
                }
                c2639b.b(2, this.c);
                int i = this.d;
                if (i != 0) {
                    c2639b.d(5, i);
                }
            }

            public b b() {
                this.b = null;
                this.c = "";
                this.d = 0;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                f fVar = this.b;
                int iA = C2639b.a(2, this.c) + (fVar != null ? C2639b.a(1, fVar) : 0);
                int i = this.d;
                return i != 0 ? iA + C2639b.a(5, i) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public AbstractC2714e a(C2614a c2614a) throws IOException {
                while (true) {
                    int iL = c2614a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        if (this.b == null) {
                            this.b = new f();
                        }
                        c2614a.a(this.b);
                    } else if (iL == 18) {
                        this.c = c2614a.k();
                    } else if (iL != 40) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        int iH = c2614a.h();
                        if (iH == 0 || iH == 1 || iH == 2) {
                            this.d = iH;
                        }
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iB = C2639b.b(1, this.b);
            b bVar = this.c;
            if (bVar != null) {
                iB += C2639b.a(2, bVar);
            }
            a[] aVarArr = this.d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iB = C2639b.a(3, aVar) + iB;
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.b = c2614a.i();
                } else if (iL == 18) {
                    if (this.c == null) {
                        this.c = new b();
                    }
                    c2614a.a(this.c);
                } else if (iL != 26) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 26);
                    a[] aVarArr = this.d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = iA + length;
                    a[] aVarArr2 = new a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        a aVar = new a();
                        aVarArr2[length] = aVar;
                        c2614a.a(aVar);
                        c2614a.l();
                        length++;
                    }
                    a aVar2 = new a();
                    aVarArr2[length] = aVar2;
                    c2614a.a(aVar2);
                    this.d = aVarArr2;
                }
            }
            return this;
        }
    }

    public static final class f extends AbstractC2714e {
        public long b;
        public int c;
        public long d;
        public boolean e;

        public f() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.e(1, this.b);
            c2639b.e(2, this.c);
            long j = this.d;
            if (j != 0) {
                c2639b.c(3, j);
            }
            boolean z = this.e;
            if (z) {
                c2639b.b(4, z);
            }
        }

        public f b() {
            this.b = 0L;
            this.c = 0;
            this.d = 0L;
            this.e = false;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iB = C2639b.b(2, this.c) + C2639b.b(1, this.b);
            long j = this.d;
            if (j != 0) {
                iB += C2639b.a(3, j);
            }
            boolean z = this.e;
            return z ? iB + C2639b.a(4, z) : iB;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.b = c2614a.i();
                } else if (iL == 16) {
                    this.c = c2614a.j();
                } else if (iL == 24) {
                    this.d = c2614a.i();
                } else if (iL != 32) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.e = c2614a.c();
                }
            }
            return this;
        }
    }

    public static final class e extends AbstractC2714e {
        private static volatile e[] f;
        public int b;
        public int c;
        public String d;
        public boolean e;

        public e() {
            b();
        }

        public static e[] c() {
            if (f == null) {
                synchronized (C2664c.a) {
                    try {
                        if (f == null) {
                            f = new e[0];
                        }
                    } finally {
                    }
                }
            }
            return f;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            int i = this.b;
            if (i != 0) {
                c2639b.f(1, i);
            }
            int i2 = this.c;
            if (i2 != 0) {
                c2639b.f(2, i2);
            }
            if (!this.d.equals("")) {
                c2639b.b(3, this.d);
            }
            boolean z = this.e;
            if (z) {
                c2639b.b(4, z);
            }
        }

        public e b() {
            this.b = 0;
            this.c = 0;
            this.d = "";
            this.e = false;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int i = this.b;
            int iC = i != 0 ? C2639b.c(1, i) : 0;
            int i2 = this.c;
            if (i2 != 0) {
                iC += C2639b.c(2, i2);
            }
            if (!this.d.equals("")) {
                iC += C2639b.a(3, this.d);
            }
            boolean z = this.e;
            return z ? iC + C2639b.a(4, z) : iC;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.b = c2614a.h();
                } else if (iL == 16) {
                    this.c = c2614a.h();
                } else if (iL == 26) {
                    this.d = c2614a.k();
                } else if (iL != 32) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.e = c2614a.c();
                }
            }
            return this;
        }
    }

    public static final class b extends AbstractC2714e {
        public double b;
        public double c;
        public long d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public String j;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
            c2639b.b(2, this.c);
            long j = this.d;
            if (j != 0) {
                c2639b.e(3, j);
            }
            int i = this.e;
            if (i != 0) {
                c2639b.f(4, i);
            }
            int i2 = this.f;
            if (i2 != 0) {
                c2639b.f(5, i2);
            }
            int i3 = this.g;
            if (i3 != 0) {
                c2639b.f(6, i3);
            }
            int i4 = this.h;
            if (i4 != 0) {
                c2639b.d(7, i4);
            }
            int i5 = this.i;
            if (i5 != 0) {
                c2639b.d(8, i5);
            }
            if (this.j.equals("")) {
                return;
            }
            c2639b.b(9, this.j);
        }

        public b b() {
            this.b = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.c = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.d = 0L;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = "";
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(2, this.c) + C2639b.a(1, this.b);
            long j = this.d;
            if (j != 0) {
                iA += C2639b.b(3, j);
            }
            int i = this.e;
            if (i != 0) {
                iA += C2639b.c(4, i);
            }
            int i2 = this.f;
            if (i2 != 0) {
                iA += C2639b.c(5, i2);
            }
            int i3 = this.g;
            if (i3 != 0) {
                iA += C2639b.c(6, i3);
            }
            int i4 = this.h;
            if (i4 != 0) {
                iA += C2639b.a(7, i4);
            }
            int i5 = this.i;
            if (i5 != 0) {
                iA += C2639b.a(8, i5);
            }
            return !this.j.equals("") ? iA + C2639b.a(9, this.j) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 9) {
                    this.b = Double.longBitsToDouble(c2614a.g());
                } else if (iL == 17) {
                    this.c = Double.longBitsToDouble(c2614a.g());
                } else if (iL == 24) {
                    this.d = c2614a.i();
                } else if (iL == 32) {
                    this.e = c2614a.h();
                } else if (iL == 40) {
                    this.f = c2614a.h();
                } else if (iL == 48) {
                    this.g = c2614a.h();
                } else if (iL == 56) {
                    this.h = c2614a.h();
                } else if (iL == 64) {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2) {
                        this.i = iH;
                    }
                } else if (iL != 74) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.j = c2614a.k();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA;
        d[] dVarArr = this.b;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            iA = 0;
            while (true) {
                d[] dVarArr2 = this.b;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    iA += C2639b.a(3, dVar);
                }
                i2++;
            }
        } else {
            iA = 0;
        }
        c cVar = this.c;
        if (cVar != null) {
            iA += C2639b.a(4, cVar);
        }
        a[] aVarArr = this.d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.d;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    iA = C2639b.a(7, aVar) + iA;
                }
                i3++;
            }
        }
        e[] eVarArr = this.e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e[] eVarArr2 = this.e;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i4];
                if (eVar != null) {
                    iA = C2639b.a(10, eVar) + iA;
                }
                i4++;
            }
        }
        String[] strArr = this.f;
        if (strArr == null || strArr.length <= 0) {
            return iA;
        }
        int iA2 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f;
            if (i >= strArr2.length) {
                return iA + iA2 + i5;
            }
            String str = strArr2[i];
            if (str != null) {
                i5++;
                iA2 = C2639b.a(str) + iA2;
            }
            i++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 26) {
                int iA = C2764g.a(c2614a, 26);
                d[] dVarArr = this.b;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i = iA + length;
                d[] dVarArr2 = new d[i];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i - 1) {
                    d dVar = new d();
                    dVarArr2[length] = dVar;
                    c2614a.a(dVar);
                    c2614a.l();
                    length++;
                }
                d dVar2 = new d();
                dVarArr2[length] = dVar2;
                c2614a.a(dVar2);
                this.b = dVarArr2;
            } else if (iL == 34) {
                if (this.c == null) {
                    this.c = new c();
                }
                c2614a.a(this.c);
            } else if (iL == 58) {
                int iA2 = C2764g.a(c2614a, 58);
                a[] aVarArr = this.d;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = iA2 + length2;
                a[] aVarArr2 = new a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    a aVar = new a();
                    aVarArr2[length2] = aVar;
                    c2614a.a(aVar);
                    c2614a.l();
                    length2++;
                }
                a aVar2 = new a();
                aVarArr2[length2] = aVar2;
                c2614a.a(aVar2);
                this.d = aVarArr2;
            } else if (iL == 82) {
                int iA3 = C2764g.a(c2614a, 82);
                e[] eVarArr = this.e;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i3 = iA3 + length3;
                e[] eVarArr2 = new e[i3];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    e eVar = new e();
                    eVarArr2[length3] = eVar;
                    c2614a.a(eVar);
                    c2614a.l();
                    length3++;
                }
                e eVar2 = new e();
                eVarArr2[length3] = eVar2;
                c2614a.a(eVar2);
                this.e = eVarArr2;
            } else if (iL != 90) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iA4 = C2764g.a(c2614a, 90);
                String[] strArr = this.f;
                int length4 = strArr == null ? 0 : strArr.length;
                int i4 = iA4 + length4;
                String[] strArr2 = new String[i4];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i4 - 1) {
                    strArr2[length4] = c2614a.k();
                    c2614a.l();
                    length4++;
                }
                strArr2[length4] = c2614a.k();
                this.f = strArr2;
            }
        }
        return this;
    }
}

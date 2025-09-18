package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Rf extends AbstractC2714e {
    public int b;
    public q c;
    public o d;
    public p e;
    public b f;
    public h g;

    public Rf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        int i2 = this.b;
        if (i2 != 0) {
            c2639b.d(1, i2);
        }
        q qVar = this.c;
        if (qVar != null) {
            c2639b.b(2, qVar);
        }
        o oVar = this.d;
        if (oVar != null) {
            c2639b.b(3, oVar);
        }
        p pVar = this.e;
        if (pVar != null) {
            c2639b.b(4, pVar);
        }
        b bVar = this.f;
        if (bVar != null) {
            c2639b.b(5, bVar);
        }
        h hVar = this.g;
        if (hVar != null) {
            c2639b.b(6, hVar);
        }
    }

    public Rf b() {
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.a = -1;
        return this;
    }

    public static final class b extends AbstractC2714e {
        public c b;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c cVar = this.b;
            if (cVar != null) {
                c2639b.b(1, cVar);
            }
        }

        public b b() {
            this.b = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            c cVar = this.b;
            if (cVar != null) {
                return C2639b.a(1, cVar);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 10) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.b == null) {
                        this.b = new c();
                    }
                    c2614a.a(this.b);
                }
            }
            return this;
        }
    }

    public static final class h extends AbstractC2714e {
        public f b;

        public h() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            f fVar = this.b;
            if (fVar != null) {
                c2639b.b(1, fVar);
            }
        }

        public h b() {
            this.b = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            f fVar = this.b;
            if (fVar != null) {
                return C2639b.a(1, fVar);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 10) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.b == null) {
                        this.b = new f();
                    }
                    c2614a.a(this.b);
                }
            }
            return this;
        }
    }

    public static final class l extends AbstractC2714e {
        private static volatile l[] c;
        public byte[] b;

        public l() {
            b();
        }

        public static l[] c() {
            if (c == null) {
                synchronized (C2664c.a) {
                    try {
                        if (c == null) {
                            c = new l[0];
                        }
                    } finally {
                    }
                }
            }
            return c;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (Arrays.equals(this.b, C2764g.d)) {
                return;
            }
            c2639b.b(1, this.b);
        }

        public l b() {
            this.b = C2764g.d;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            if (Arrays.equals(this.b, C2764g.d)) {
                return 0;
            }
            return C2639b.a(1, this.b);
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 10) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.b = c2614a.d();
                }
            }
            return this;
        }
    }

    public static final class q extends AbstractC2714e {
        public n b;

        public q() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            n nVar = this.b;
            if (nVar != null) {
                c2639b.b(1, nVar);
            }
        }

        public q b() {
            this.b = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            n nVar = this.b;
            if (nVar != null) {
                return C2639b.a(1, nVar);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 10) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.b == null) {
                        this.b = new n();
                    }
                    c2614a.a(this.b);
                }
            }
            return this;
        }
    }

    public static final class i extends AbstractC2714e {
        public a[] b;
        public int c;

        public i() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            a[] aVarArr = this.b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        c2639b.b(1, aVar);
                    }
                    i++;
                }
            }
            int i2 = this.c;
            if (i2 != 0) {
                c2639b.f(2, i2);
            }
        }

        public i b() {
            this.b = a.c();
            this.c = 0;
            this.a = -1;
            return this;
        }

        public static final class a extends AbstractC2714e {
            private static volatile a[] d;
            public byte[] b;
            public byte[] c;

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
                byte[] bArr = this.b;
                byte[] bArr2 = C2764g.d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c2639b.b(1, this.b);
                }
                if (Arrays.equals(this.c, bArr2)) {
                    return;
                }
                c2639b.b(2, this.c);
            }

            public a b() {
                byte[] bArr = C2764g.d;
                this.b = bArr;
                this.c = bArr;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                byte[] bArr = this.b;
                byte[] bArr2 = C2764g.d;
                int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
                return !Arrays.equals(this.c, bArr2) ? iA + C2639b.a(2, this.c) : iA;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public AbstractC2714e a(C2614a c2614a) throws IOException {
                while (true) {
                    int iL = c2614a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 10) {
                        this.b = c2614a.d();
                    } else if (iL != 18) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        this.c = c2614a.d();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            a[] aVarArr = this.b;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int iA = 0;
                while (true) {
                    a[] aVarArr2 = this.b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iA = C2639b.a(1, aVar) + iA;
                    }
                    i++;
                }
                i = iA;
            }
            int i2 = this.c;
            return i2 != 0 ? i + C2639b.c(2, i2) : i;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    int iA = C2764g.a(c2614a, 10);
                    a[] aVarArr = this.b;
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
                    this.b = aVarArr2;
                } else if (iL != 16) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.h();
                }
            }
            return this;
        }
    }

    public static final class a extends AbstractC2714e {
        private static volatile a[] d;
        public byte[] b;
        public e c;

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
            if (!Arrays.equals(this.b, C2764g.d)) {
                c2639b.b(1, this.b);
            }
            e eVar = this.c;
            if (eVar != null) {
                c2639b.b(2, eVar);
            }
        }

        public a b() {
            this.b = C2764g.d;
            this.c = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = !Arrays.equals(this.b, C2764g.d) ? C2639b.a(1, this.b) : 0;
            e eVar = this.c;
            return eVar != null ? iA + C2639b.a(2, eVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.c == null) {
                        this.c = new e();
                    }
                    c2614a.a(this.c);
                }
            }
            return this;
        }
    }

    public static final class d extends AbstractC2714e {
        public byte[][] b;

        public d() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            byte[][] bArr = this.b;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.b;
                if (i >= bArr2.length) {
                    return;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    c2639b.b(1, bArr3);
                }
                i++;
            }
        }

        public d b() {
            this.b = C2764g.c;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            byte[][] bArr = this.b;
            int i = 0;
            if (bArr == null || bArr.length <= 0) {
                return 0;
            }
            int iB = 0;
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.b;
                if (i >= bArr2.length) {
                    return iB + i2;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i2++;
                    iB = C2639b.b(bArr3.length) + bArr3.length + iB;
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
                if (iL != 10) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 10);
                    byte[][] bArr = this.b;
                    int length = bArr == null ? 0 : bArr.length;
                    int i = iA + length;
                    byte[][] bArr2 = new byte[i][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bArr2[length] = c2614a.d();
                        c2614a.l();
                        length++;
                    }
                    bArr2[length] = c2614a.d();
                    this.b = bArr2;
                }
            }
            return this;
        }
    }

    public static final class e extends AbstractC2714e {
        public long b;
        public int c;

        public e() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            long j = this.b;
            if (j != 0) {
                c2639b.c(1, j);
            }
            int i = this.c;
            if (i != 0) {
                c2639b.d(2, i);
            }
        }

        public e b() {
            this.b = 0L;
            this.c = 0;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            long j = this.b;
            int iA = j != 0 ? C2639b.a(1, j) : 0;
            int i = this.c;
            return i != 0 ? iA + C2639b.a(2, i) : iA;
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
                } else if (iL != 16) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.h();
                }
            }
            return this;
        }
    }

    public static final class g extends AbstractC2714e {
        private static volatile g[] d;
        public int b;
        public c c;

        public g() {
            b();
        }

        public static g[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new g[0];
                        }
                    } finally {
                    }
                }
            }
            return d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            int i = this.b;
            if (i != 0) {
                c2639b.f(1, i);
            }
            c cVar = this.c;
            if (cVar != null) {
                c2639b.b(2, cVar);
            }
        }

        public g b() {
            this.b = 0;
            this.c = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int i = this.b;
            int iC = i != 0 ? C2639b.c(1, i) : 0;
            c cVar = this.c;
            return cVar != null ? iC + C2639b.a(2, cVar) : iC;
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
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.c == null) {
                        this.c = new c();
                    }
                    c2614a.a(this.c);
                }
            }
            return this;
        }
    }

    public static final class o extends AbstractC2714e {
        public k b;
        public n c;

        public o() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            k kVar = this.b;
            if (kVar != null) {
                c2639b.b(1, kVar);
            }
            n nVar = this.c;
            if (nVar != null) {
                c2639b.b(2, nVar);
            }
        }

        public o b() {
            this.b = null;
            this.c = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            k kVar = this.b;
            int iA = kVar != null ? C2639b.a(1, kVar) : 0;
            n nVar = this.c;
            return nVar != null ? iA + C2639b.a(2, nVar) : iA;
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
                        this.b = new k();
                    }
                    c2614a.a(this.b);
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.c == null) {
                        this.c = new n();
                    }
                    c2614a.a(this.c);
                }
            }
            return this;
        }
    }

    public static final class p extends AbstractC2714e {
        public k b;
        public m c;

        public p() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            k kVar = this.b;
            if (kVar != null) {
                c2639b.b(1, kVar);
            }
            m mVar = this.c;
            if (mVar != null) {
                c2639b.b(2, mVar);
            }
        }

        public p b() {
            this.b = null;
            this.c = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            k kVar = this.b;
            int iA = kVar != null ? C2639b.a(1, kVar) : 0;
            m mVar = this.c;
            return mVar != null ? iA + C2639b.a(2, mVar) : iA;
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
                        this.b = new k();
                    }
                    c2614a.a(this.b);
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.c == null) {
                        this.c = new m();
                    }
                    c2614a.a(this.c);
                }
            }
            return this;
        }
    }

    public static final class j extends AbstractC2714e {
        public a b;
        public a[] c;

        public j() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            a aVar = this.b;
            if (aVar != null) {
                c2639b.b(1, aVar);
            }
            a[] aVarArr = this.c;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.c;
                if (i >= aVarArr2.length) {
                    return;
                }
                a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    c2639b.b(2, aVar2);
                }
                i++;
            }
        }

        public j b() {
            this.b = null;
            this.c = a.c();
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            a aVar = this.b;
            int i = 0;
            int iA = aVar != null ? C2639b.a(1, aVar) : 0;
            a[] aVarArr = this.c;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i];
                    if (aVar2 != null) {
                        iA = C2639b.a(2, aVar2) + iA;
                    }
                    i++;
                }
            }
            return iA;
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
                        this.b = new a();
                    }
                    c2614a.a(this.b);
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 18);
                    a[] aVarArr = this.c;
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
                    this.c = aVarArr2;
                }
            }
            return this;
        }
    }

    public static final class m extends AbstractC2714e {
        public byte[] b;
        public byte[] c;
        public n d;

        public m() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            if (!Arrays.equals(bArr, bArr2)) {
                c2639b.b(1, this.b);
            }
            if (!Arrays.equals(this.c, bArr2)) {
                c2639b.b(2, this.c);
            }
            n nVar = this.d;
            if (nVar != null) {
                c2639b.b(3, nVar);
            }
        }

        public m b() {
            byte[] bArr = C2764g.d;
            this.b = bArr;
            this.c = bArr;
            this.d = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
            if (!Arrays.equals(this.c, bArr2)) {
                iA += C2639b.a(2, this.c);
            }
            n nVar = this.d;
            return nVar != null ? iA + C2639b.a(3, nVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL == 18) {
                    this.c = c2614a.d();
                } else if (iL != 26) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.d == null) {
                        this.d = new n();
                    }
                    c2614a.a(this.d);
                }
            }
            return this;
        }
    }

    public static final class c extends AbstractC2714e {
        public k b;
        public m c;
        public e d;
        public j e;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            k kVar = this.b;
            if (kVar != null) {
                c2639b.b(1, kVar);
            }
            m mVar = this.c;
            if (mVar != null) {
                c2639b.b(2, mVar);
            }
            e eVar = this.d;
            if (eVar != null) {
                c2639b.b(3, eVar);
            }
            j jVar = this.e;
            if (jVar != null) {
                c2639b.b(4, jVar);
            }
        }

        public c b() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            k kVar = this.b;
            int iA = kVar != null ? C2639b.a(1, kVar) : 0;
            m mVar = this.c;
            if (mVar != null) {
                iA += C2639b.a(2, mVar);
            }
            e eVar = this.d;
            if (eVar != null) {
                iA += C2639b.a(3, eVar);
            }
            j jVar = this.e;
            return jVar != null ? iA + C2639b.a(4, jVar) : iA;
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
                        this.b = new k();
                    }
                    c2614a.a(this.b);
                } else if (iL == 18) {
                    if (this.c == null) {
                        this.c = new m();
                    }
                    c2614a.a(this.c);
                } else if (iL == 26) {
                    if (this.d == null) {
                        this.d = new e();
                    }
                    c2614a.a(this.d);
                } else if (iL != 34) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.e == null) {
                        this.e = new j();
                    }
                    c2614a.a(this.e);
                }
            }
            return this;
        }
    }

    public static final class n extends AbstractC2714e {
        public byte[] b;
        public d c;
        public byte[] d;
        public i e;

        public n() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            if (!Arrays.equals(bArr, bArr2)) {
                c2639b.b(1, this.b);
            }
            d dVar = this.c;
            if (dVar != null) {
                c2639b.b(2, dVar);
            }
            if (!Arrays.equals(this.d, bArr2)) {
                c2639b.b(3, this.d);
            }
            i iVar = this.e;
            if (iVar != null) {
                c2639b.b(4, iVar);
            }
        }

        public n b() {
            byte[] bArr = C2764g.d;
            this.b = bArr;
            this.c = null;
            this.d = bArr;
            this.e = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
            d dVar = this.c;
            if (dVar != null) {
                iA += C2639b.a(2, dVar);
            }
            if (!Arrays.equals(this.d, bArr2)) {
                iA += C2639b.a(3, this.d);
            }
            i iVar = this.e;
            return iVar != null ? iA + C2639b.a(4, iVar) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL == 18) {
                    if (this.c == null) {
                        this.c = new d();
                    }
                    c2614a.a(this.c);
                } else if (iL == 26) {
                    this.d = c2614a.d();
                } else if (iL != 34) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.e == null) {
                        this.e = new i();
                    }
                    c2614a.a(this.e);
                }
            }
            return this;
        }
    }

    public static final class f extends AbstractC2714e {
        public byte[] b;
        public byte[] c;
        public i d;
        public g[] e;
        public int f;

        public f() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            if (!Arrays.equals(bArr, bArr2)) {
                c2639b.b(1, this.b);
            }
            if (!Arrays.equals(this.c, bArr2)) {
                c2639b.b(2, this.c);
            }
            i iVar = this.d;
            if (iVar != null) {
                c2639b.b(3, iVar);
            }
            g[] gVarArr = this.e;
            if (gVarArr != null && gVarArr.length > 0) {
                int i = 0;
                while (true) {
                    g[] gVarArr2 = this.e;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        c2639b.b(4, gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f;
            if (i2 != 0) {
                c2639b.f(5, i2);
            }
        }

        public f b() {
            byte[] bArr = C2764g.d;
            this.b = bArr;
            this.c = bArr;
            this.d = null;
            this.e = g.c();
            this.f = 0;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            int i = 0;
            int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
            if (!Arrays.equals(this.c, bArr2)) {
                iA += C2639b.a(2, this.c);
            }
            i iVar = this.d;
            if (iVar != null) {
                iA += C2639b.a(3, iVar);
            }
            g[] gVarArr = this.e;
            if (gVarArr != null && gVarArr.length > 0) {
                while (true) {
                    g[] gVarArr2 = this.e;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        iA = C2639b.a(4, gVar) + iA;
                    }
                    i++;
                }
            }
            int i2 = this.f;
            return i2 != 0 ? iA + C2639b.c(5, i2) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL == 18) {
                    this.c = c2614a.d();
                } else if (iL == 26) {
                    if (this.d == null) {
                        this.d = new i();
                    }
                    c2614a.a(this.d);
                } else if (iL == 34) {
                    int iA = C2764g.a(c2614a, 34);
                    g[] gVarArr = this.e;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i = iA + length;
                    g[] gVarArr2 = new g[i];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        g gVar = new g();
                        gVarArr2[length] = gVar;
                        c2614a.a(gVar);
                        c2614a.l();
                        length++;
                    }
                    g gVar2 = new g();
                    gVarArr2[length] = gVar2;
                    c2614a.a(gVar2);
                    this.e = gVarArr2;
                } else if (iL != 40) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.f = c2614a.h();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int i2 = this.b;
        int iA = i2 != 0 ? C2639b.a(1, i2) : 0;
        q qVar = this.c;
        if (qVar != null) {
            iA += C2639b.a(2, qVar);
        }
        o oVar = this.d;
        if (oVar != null) {
            iA += C2639b.a(3, oVar);
        }
        p pVar = this.e;
        if (pVar != null) {
            iA += C2639b.a(4, pVar);
        }
        b bVar = this.f;
        if (bVar != null) {
            iA += C2639b.a(5, bVar);
        }
        h hVar = this.g;
        return hVar != null ? iA + C2639b.a(6, hVar) : iA;
    }

    public static final class k extends AbstractC2714e {
        public byte[] b;
        public byte[] c;
        public d d;
        public i e;
        public j f;
        public j g;
        public l[] h;

        public k() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            if (!Arrays.equals(bArr, bArr2)) {
                c2639b.b(1, this.b);
            }
            if (!Arrays.equals(this.c, bArr2)) {
                c2639b.b(2, this.c);
            }
            d dVar = this.d;
            if (dVar != null) {
                c2639b.b(3, dVar);
            }
            i iVar = this.e;
            if (iVar != null) {
                c2639b.b(4, iVar);
            }
            j jVar = this.f;
            if (jVar != null) {
                c2639b.b(5, jVar);
            }
            j jVar2 = this.g;
            if (jVar2 != null) {
                c2639b.b(6, jVar2);
            }
            l[] lVarArr = this.h;
            if (lVarArr == null || lVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                l[] lVarArr2 = this.h;
                if (i >= lVarArr2.length) {
                    return;
                }
                l lVar = lVarArr2[i];
                if (lVar != null) {
                    c2639b.b(7, lVar);
                }
                i++;
            }
        }

        public k b() {
            byte[] bArr = C2764g.d;
            this.b = bArr;
            this.c = bArr;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = l.c();
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            int i = 0;
            int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
            if (!Arrays.equals(this.c, bArr2)) {
                iA += C2639b.a(2, this.c);
            }
            d dVar = this.d;
            if (dVar != null) {
                iA += C2639b.a(3, dVar);
            }
            i iVar = this.e;
            if (iVar != null) {
                iA += C2639b.a(4, iVar);
            }
            j jVar = this.f;
            if (jVar != null) {
                iA += C2639b.a(5, jVar);
            }
            j jVar2 = this.g;
            if (jVar2 != null) {
                iA += C2639b.a(6, jVar2);
            }
            l[] lVarArr = this.h;
            if (lVarArr != null && lVarArr.length > 0) {
                while (true) {
                    l[] lVarArr2 = this.h;
                    if (i >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i];
                    if (lVar != null) {
                        iA = C2639b.a(7, lVar) + iA;
                    }
                    i++;
                }
            }
            return iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL == 18) {
                    this.c = c2614a.d();
                } else if (iL == 26) {
                    if (this.d == null) {
                        this.d = new d();
                    }
                    c2614a.a(this.d);
                } else if (iL == 34) {
                    if (this.e == null) {
                        this.e = new i();
                    }
                    c2614a.a(this.e);
                } else if (iL == 42) {
                    if (this.f == null) {
                        this.f = new j();
                    }
                    c2614a.a(this.f);
                } else if (iL == 50) {
                    if (this.g == null) {
                        this.g = new j();
                    }
                    c2614a.a(this.g);
                } else if (iL != 58) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 58);
                    l[] lVarArr = this.h;
                    int length = lVarArr == null ? 0 : lVarArr.length;
                    int i = iA + length;
                    l[] lVarArr2 = new l[i];
                    if (length != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        l lVar = new l();
                        lVarArr2[length] = lVar;
                        c2614a.a(lVar);
                        c2614a.l();
                        length++;
                    }
                    l lVar2 = new l();
                    lVarArr2[length] = lVar2;
                    c2614a.a(lVar2);
                    this.h = lVarArr2;
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL != 0) {
                if (iL == 8) {
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
                            this.b = iH;
                            break;
                    }
                } else if (iL == 18) {
                    if (this.c == null) {
                        this.c = new q();
                    }
                    c2614a.a(this.c);
                } else if (iL == 26) {
                    if (this.d == null) {
                        this.d = new o();
                    }
                    c2614a.a(this.d);
                } else if (iL == 34) {
                    if (this.e == null) {
                        this.e = new p();
                    }
                    c2614a.a(this.e);
                } else if (iL == 42) {
                    if (this.f == null) {
                        this.f = new b();
                    }
                    c2614a.a(this.f);
                } else if (iL != 50) {
                    if (!c2614a.f(iL)) {
                    }
                } else {
                    if (this.g == null) {
                        this.g = new h();
                    }
                    c2614a.a(this.g);
                }
            }
        }
        return this;
    }
}

package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class MN0 implements InterfaceC0214Cm1 {
    public static final List w = AbstractC8259yu.e(EnumC3548eG0.HTTP_1_1);
    public final Y02 a;
    public final Random b;
    public final long c;
    public C0292Dm1 d;
    public final long e;
    public final String f;
    public DN0 g;
    public KN0 h;
    public C0526Gm1 i;
    public C0604Hm1 j;
    public final C2081a91 k;
    public String l;
    public C2405bs m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public long p;
    public boolean q;
    public int r;
    public String s;
    public boolean t;
    public int u;
    public boolean v;

    public MN0(C2272b91 c2272b91, C6649qR0 c6649qR0, Y02 y02, Random random, long j, long j2) {
        O90.f(c2272b91, "taskRunner");
        this.a = y02;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.k = c2272b91.e();
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.r = -1;
        String str = c6649qR0.b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(AbstractC8235ym.v("Request must be GET: ", str).toString());
        }
        C0674Ik c0674Ik = C0674Ik.d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f = TE.L(bArr).a();
    }

    public final void a(HS0 hs0, C4210hk c4210hk) {
        int i = hs0.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(F91.v(sb, hs0.c, '\''));
        }
        K20 k20 = hs0.f;
        String strB = k20.b("Connection");
        if (strB == null) {
            strB = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strB)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strB + '\'');
        }
        String strB2 = k20.b("Upgrade");
        if (strB2 == null) {
            strB2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strB2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strB2 + '\'');
        }
        String strB3 = k20.b("Sec-WebSocket-Accept");
        String str = strB3 != null ? strB3 : null;
        C0674Ik c0674Ik = C0674Ik.d;
        String strA = TE.D(this.f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").b("SHA-1").a();
        if (O90.a(strA, str)) {
            if (c4210hk == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + str + '\'');
    }

    public final boolean b(int i, String str) {
        String str2;
        synchronized (this) {
            C0674Ik c0674IkD = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    C0674Ik c0674Ik = C0674Ik.d;
                    c0674IkD = TE.D(str);
                    if (c0674IkD.a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.t && !this.q) {
                    this.q = true;
                    this.o.add(new IN0(c0674IkD, i));
                    h();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(Exception exc, HS0 hs0) {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            C2405bs c2405bs = this.m;
            this.m = null;
            C0526Gm1 c0526Gm1 = this.i;
            this.i = null;
            C0604Hm1 c0604Hm1 = this.j;
            this.j = null;
            this.k.f();
            try {
                this.a.f(exc);
            } finally {
                if (c2405bs != null) {
                    AbstractC0199Ch1.d(c2405bs);
                }
                if (c0526Gm1 != null) {
                    AbstractC0199Ch1.d(c0526Gm1);
                }
                if (c0604Hm1 != null) {
                    AbstractC0199Ch1.d(c0604Hm1);
                }
            }
        }
    }

    public final void d(String str, C2405bs c2405bs) {
        O90.f(str, "name");
        C0292Dm1 c0292Dm1 = this.d;
        O90.c(c0292Dm1);
        synchronized (this) {
            try {
                this.l = str;
                this.m = c2405bs;
                this.j = new C0604Hm1((C8161yN0) c2405bs.c, this.b, c0292Dm1.a, c0292Dm1.c, this.e);
                this.h = new KN0(this);
                long j = this.c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.k.c(new LN0(str.concat(" ping"), this, nanos), nanos);
                }
                if (!this.o.isEmpty()) {
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = new C0526Gm1((C8351zN0) c2405bs.b, this, c0292Dm1.a, c0292Dm1.e);
    }

    public final void e() {
        while (this.r == -1) {
            C0526Gm1 c0526Gm1 = this.i;
            O90.c(c0526Gm1);
            c0526Gm1.n();
            if (!c0526Gm1.i) {
                int i = c0526Gm1.f;
                if (i != 1 && i != 2) {
                    byte[] bArr = AbstractC0199Ch1.a;
                    String hexString = Integer.toHexString(i);
                    O90.e(hexString, "toHexString(this)");
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!c0526Gm1.e) {
                    long j = c0526Gm1.g;
                    C6129nj c6129nj = c0526Gm1.l;
                    if (j > 0) {
                        c0526Gm1.a.A(c6129nj, j);
                    }
                    if (c0526Gm1.h) {
                        if (c0526Gm1.j) {
                            C6154nr0 c6154nr0 = c0526Gm1.m;
                            if (c6154nr0 == null) {
                                c6154nr0 = new C6154nr0(c0526Gm1.d, 1);
                                c0526Gm1.m = c6154nr0;
                            }
                            C6129nj c6129nj2 = c6154nr0.c;
                            if (c6129nj2.b != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            Inflater inflater = (Inflater) c6154nr0.d;
                            if (c6154nr0.b) {
                                inflater.reset();
                            }
                            c6129nj2.i(c6129nj);
                            c6129nj2.u0(65535);
                            long bytesRead = inflater.getBytesRead() + c6129nj2.b;
                            do {
                                ((C6019n80) c6154nr0.e).a(c6129nj, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        MN0 mn0 = c0526Gm1.b;
                        Y02 y02 = mn0.a;
                        if (i == 1) {
                            y02.h(c6129nj.e0());
                        } else {
                            C0674Ik c0674IkU = c6129nj.U(c6129nj.b);
                            O90.f(c0674IkU, "bytes");
                            y02.g(mn0, c0674IkU);
                        }
                    } else {
                        while (!c0526Gm1.e) {
                            c0526Gm1.n();
                            if (!c0526Gm1.i) {
                                break;
                            } else {
                                c0526Gm1.m();
                            }
                        }
                        if (c0526Gm1.f != 0) {
                            int i2 = c0526Gm1.f;
                            byte[] bArr2 = AbstractC0199Ch1.a;
                            String hexString2 = Integer.toHexString(i2);
                            O90.e(hexString2, "toHexString(this)");
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    }
                }
                throw new IOException("closed");
            }
            c0526Gm1.m();
        }
    }

    public final void f(int i, String str) throws IOException {
        C2405bs c2405bs;
        C0526Gm1 c0526Gm1;
        C0604Hm1 c0604Hm1;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.r != -1) {
                throw new IllegalStateException("already closed");
            }
            this.r = i;
            this.s = str;
            c2405bs = null;
            if (this.q && this.o.isEmpty()) {
                C2405bs c2405bs2 = this.m;
                this.m = null;
                c0526Gm1 = this.i;
                this.i = null;
                c0604Hm1 = this.j;
                this.j = null;
                this.k.f();
                c2405bs = c2405bs2;
            } else {
                c0526Gm1 = null;
                c0604Hm1 = null;
            }
        }
        try {
            this.a.e(this, i, str);
            if (c2405bs != null) {
                this.a.d(i, str);
            }
        } finally {
            if (c2405bs != null) {
                AbstractC0199Ch1.d(c2405bs);
            }
            if (c0526Gm1 != null) {
                AbstractC0199Ch1.d(c0526Gm1);
            }
            if (c0604Hm1 != null) {
                AbstractC0199Ch1.d(c0604Hm1);
            }
        }
    }

    public final synchronized void g(C0674Ik c0674Ik) {
        try {
            O90.f(c0674Ik, "payload");
            if (!this.t && (!this.q || !this.o.isEmpty())) {
                this.n.add(c0674Ik);
                h();
            }
        } finally {
        }
    }

    public final void h() {
        byte[] bArr = AbstractC0199Ch1.a;
        KN0 kn0 = this.h;
        if (kn0 != null) {
            this.k.c(kn0, 0L);
        }
    }

    public final synchronized boolean i(C0674Ik c0674Ik, int i) {
        if (!this.t && !this.q) {
            if (this.p + c0674Ik.c() > 16777216) {
                b(1001, null);
                return false;
            }
            this.p += c0674Ik.c();
            this.o.add(new JN0(c0674Ik, i));
            h();
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x007a A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:131:0x007a, B:134:0x0089, B:136:0x008d, B:137:0x0099, B:139:0x00a6, B:142:0x00aa, B:143:0x00ab, B:144:0x00ac, B:146:0x00b0, B:176:0x0122, B:178:0x0126, B:187:0x013f, B:188:0x0141, B:164:0x00db, B:168:0x0100, B:169:0x0109, B:165:0x00ef, B:170:0x010a, B:172:0x0114, B:173:0x0117, B:189:0x0142, B:190:0x0147, B:138:0x009a, B:175:0x011f), top: B:200:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0089 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:131:0x007a, B:134:0x0089, B:136:0x008d, B:137:0x0099, B:139:0x00a6, B:142:0x00aa, B:143:0x00ab, B:144:0x00ac, B:146:0x00b0, B:176:0x0122, B:178:0x0126, B:187:0x013f, B:188:0x0141, B:164:0x00db, B:168:0x0100, B:169:0x0109, B:165:0x00ef, B:170:0x010a, B:172:0x0114, B:173:0x0117, B:189:0x0142, B:190:0x0147, B:138:0x009a, B:175:0x011f), top: B:200:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0130 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0135 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x013a A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [Hm1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MN0.j():boolean");
    }
}

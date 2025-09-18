package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class MN0 implements InterfaceC7443Cm1 {

    /* renamed from: w */
    public static final List f7118w = AbstractC7230yu.m26274e(EnumC9219eG0.HTTP_1_1);

    /* renamed from: a */
    public final Y02 f7119a;

    /* renamed from: b */
    public final Random f7120b;

    /* renamed from: c */
    public final long f7121c;

    /* renamed from: d */
    public C7495Dm1 f7122d;

    /* renamed from: e */
    public final long f7123e;

    /* renamed from: f */
    public final String f7124f;

    /* renamed from: g */
    public DN0 f7125g;

    /* renamed from: h */
    public KN0 f7126h;

    /* renamed from: i */
    public C7651Gm1 f7127i;

    /* renamed from: j */
    public C7703Hm1 f7128j;

    /* renamed from: k */
    public final C8689a91 f7129k;

    /* renamed from: l */
    public String f7130l;

    /* renamed from: m */
    public C1812bs f7131m;

    /* renamed from: n */
    public final ArrayDeque f7132n;

    /* renamed from: o */
    public final ArrayDeque f7133o;

    /* renamed from: p */
    public long f7134p;

    /* renamed from: q */
    public boolean f7135q;

    /* renamed from: r */
    public int f7136r;

    /* renamed from: s */
    public String f7137s;

    /* renamed from: t */
    public boolean f7138t;

    /* renamed from: u */
    public int f7139u;

    /* renamed from: v */
    public boolean f7140v;

    public MN0(C8817b91 c8817b91, C10777qR0 c10777qR0, Y02 y02, Random random, long j, long j2) {
        O90.m5968f(c8817b91, "taskRunner");
        this.f7119a = y02;
        this.f7120b = random;
        this.f7121c = j;
        this.f7122d = null;
        this.f7123e = j2;
        this.f7129k = c8817b91.m10429e();
        this.f7132n = new ArrayDeque();
        this.f7133o = new ArrayDeque();
        this.f7136r = -1;
        String str = c10777qR0.f40871b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("Request must be GET: ", str).toString());
        }
        C0551Ik c0551Ik = C0551Ik.f5116d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f7124f = C1210TE.m7636L(bArr).mo3981a();
    }

    /* renamed from: a */
    public final void m5349a(HS0 hs0, C4198hk c4198hk) {
        int i = hs0.f4298d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(F91.m2539v(sb, hs0.f4297c, '\''));
        }
        K20 k20 = hs0.f4300f;
        String strM4524b = k20.m4524b("Connection");
        if (strM4524b == null) {
            strM4524b = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strM4524b)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strM4524b + '\'');
        }
        String strM4524b2 = k20.m4524b("Upgrade");
        if (strM4524b2 == null) {
            strM4524b2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strM4524b2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strM4524b2 + '\'');
        }
        String strM4524b3 = k20.m4524b("Sec-WebSocket-Accept");
        String str = strM4524b3 != null ? strM4524b3 : null;
        C0551Ik c0551Ik = C0551Ik.f5116d;
        String strMo3981a = C1210TE.m7631D(this.f7124f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").mo3982b("SHA-1").mo3981a();
        if (O90.m5963a(strMo3981a, str)) {
            if (c4198hk == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo3981a + "' but was '" + str + '\'');
    }

    /* renamed from: b */
    public final boolean m5350b(int i, String str) {
        String str2;
        synchronized (this) {
            C0551Ik c0551IkM7631D = null;
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
                    C0551Ik c0551Ik = C0551Ik.f5116d;
                    c0551IkM7631D = C1210TE.m7631D(str);
                    if (c0551IkM7631D.f5117a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f7138t && !this.f7135q) {
                    this.f7135q = true;
                    this.f7133o.add(new IN0(c0551IkM7631D, i));
                    m5356h();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    /* renamed from: c */
    public final void m5351c(Exception exc, HS0 hs0) {
        synchronized (this) {
            if (this.f7138t) {
                return;
            }
            this.f7138t = true;
            C1812bs c1812bs = this.f7131m;
            this.f7131m = null;
            C7651Gm1 c7651Gm1 = this.f7127i;
            this.f7127i = null;
            C7703Hm1 c7703Hm1 = this.f7128j;
            this.f7128j = null;
            this.f7129k.m9681f();
            try {
                this.f7119a.mo2417f(exc);
            } finally {
                if (c1812bs != null) {
                    AbstractC7433Ch1.m1275d(c1812bs);
                }
                if (c7651Gm1 != null) {
                    AbstractC7433Ch1.m1275d(c7651Gm1);
                }
                if (c7703Hm1 != null) {
                    AbstractC7433Ch1.m1275d(c7703Hm1);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m5352d(String str, C1812bs c1812bs) {
        O90.m5968f(str, "name");
        C7495Dm1 c7495Dm1 = this.f7122d;
        O90.m5965c(c7495Dm1);
        synchronized (this) {
            try {
                this.f7130l = str;
                this.f7131m = c1812bs;
                this.f7128j = new C7703Hm1((C11790yN0) c1812bs.f17197c, this.f7120b, c7495Dm1.f2236a, c7495Dm1.f2238c, this.f7123e);
                this.f7126h = new KN0(this);
                long j = this.f7121c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.f7129k.m9679c(new LN0(str.concat(" ping"), this, nanos), nanos);
                }
                if (!this.f7133o.isEmpty()) {
                    m5356h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7127i = new C7651Gm1((C11917zN0) c1812bs.f17196b, this, c7495Dm1.f2236a, c7495Dm1.f2240e);
    }

    /* renamed from: e */
    public final void m5353e() {
        while (this.f7136r == -1) {
            C7651Gm1 c7651Gm1 = this.f7127i;
            O90.m5965c(c7651Gm1);
            c7651Gm1.m3154n();
            if (!c7651Gm1.f3883i) {
                int i = c7651Gm1.f3880f;
                if (i != 1 && i != 2) {
                    byte[] bArr = AbstractC7433Ch1.f1577a;
                    String hexString = Integer.toHexString(i);
                    O90.m5967e(hexString, "toHexString(this)");
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!c7651Gm1.f3879e) {
                    long j = c7651Gm1.f3881g;
                    C6507nj c6507nj = c7651Gm1.f3886l;
                    if (j > 0) {
                        c7651Gm1.f3875a.m26379A(c6507nj, j);
                    }
                    if (c7651Gm1.f3882h) {
                        if (c7651Gm1.f3884j) {
                            C10445nr0 c10445nr0 = c7651Gm1.f3887m;
                            if (c10445nr0 == null) {
                                c10445nr0 = new C10445nr0(c7651Gm1.f3878d, 1);
                                c7651Gm1.f3887m = c10445nr0;
                            }
                            C6507nj c6507nj2 = c10445nr0.f38560c;
                            if (c6507nj2.f38488b != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            Inflater inflater = (Inflater) c10445nr0.f38561d;
                            if (c10445nr0.f38559b) {
                                inflater.reset();
                            }
                            c6507nj2.mo4396i(c6507nj);
                            c6507nj2.m23198u0(65535);
                            long bytesRead = inflater.getBytesRead() + c6507nj2.f38488b;
                            do {
                                ((C10355n80) c10445nr0.f38562e).m23093a(c6507nj, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        MN0 mn0 = c7651Gm1.f3876b;
                        Y02 y02 = mn0.f7119a;
                        if (i == 1) {
                            y02.mo2419h(c6507nj.m23183e0());
                        } else {
                            C0551Ik c0551IkM23178U = c6507nj.m23178U(c6507nj.f38488b);
                            O90.m5968f(c0551IkM23178U, "bytes");
                            y02.mo2418g(mn0, c0551IkM23178U);
                        }
                    } else {
                        while (!c7651Gm1.f3879e) {
                            c7651Gm1.m3154n();
                            if (!c7651Gm1.f3883i) {
                                break;
                            } else {
                                c7651Gm1.m3153m();
                            }
                        }
                        if (c7651Gm1.f3880f != 0) {
                            int i2 = c7651Gm1.f3880f;
                            byte[] bArr2 = AbstractC7433Ch1.f1577a;
                            String hexString2 = Integer.toHexString(i2);
                            O90.m5967e(hexString2, "toHexString(this)");
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    }
                }
                throw new IOException("closed");
            }
            c7651Gm1.m3153m();
        }
    }

    /* renamed from: f */
    public final void m5354f(int i, String str) throws IOException {
        C1812bs c1812bs;
        C7651Gm1 c7651Gm1;
        C7703Hm1 c7703Hm1;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.f7136r != -1) {
                throw new IllegalStateException("already closed");
            }
            this.f7136r = i;
            this.f7137s = str;
            c1812bs = null;
            if (this.f7135q && this.f7133o.isEmpty()) {
                C1812bs c1812bs2 = this.f7131m;
                this.f7131m = null;
                c7651Gm1 = this.f7127i;
                this.f7127i = null;
                c7703Hm1 = this.f7128j;
                this.f7128j = null;
                this.f7129k.m9681f();
                c1812bs = c1812bs2;
            } else {
                c7651Gm1 = null;
                c7703Hm1 = null;
            }
        }
        try {
            this.f7119a.mo2416e(this, i, str);
            if (c1812bs != null) {
                this.f7119a.mo2415d(i, str);
            }
        } finally {
            if (c1812bs != null) {
                AbstractC7433Ch1.m1275d(c1812bs);
            }
            if (c7651Gm1 != null) {
                AbstractC7433Ch1.m1275d(c7651Gm1);
            }
            if (c7703Hm1 != null) {
                AbstractC7433Ch1.m1275d(c7703Hm1);
            }
        }
    }

    /* renamed from: g */
    public final synchronized void m5355g(C0551Ik c0551Ik) {
        try {
            O90.m5968f(c0551Ik, "payload");
            if (!this.f7138t && (!this.f7135q || !this.f7133o.isEmpty())) {
                this.f7132n.add(c0551Ik);
                m5356h();
            }
        } finally {
        }
    }

    /* renamed from: h */
    public final void m5356h() {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        KN0 kn0 = this.f7126h;
        if (kn0 != null) {
            this.f7129k.m9679c(kn0, 0L);
        }
    }

    /* renamed from: i */
    public final synchronized boolean m5357i(C0551Ik c0551Ik, int i) {
        if (!this.f7138t && !this.f7135q) {
            if (this.f7134p + c0551Ik.mo3983c() > 16777216) {
                m5350b(1001, null);
                return false;
            }
            this.f7134p += c0551Ik.mo3983c();
            this.f7133o.add(new JN0(c0551Ik, i));
            m5356h();
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
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5358j() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.MN0.m5358j():boolean");
    }
}

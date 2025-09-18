package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: qK */
/* loaded from: classes2.dex */
public final class C6673qK implements Closeable, Flushable {

    /* renamed from: s */
    public static final C8978cQ0 f40771s = new C8978cQ0("[a-z0-9_-]{1,120}");

    /* renamed from: t */
    public static final String f40772t = "CLEAN";

    /* renamed from: u */
    public static final String f40773u = "DIRTY";

    /* renamed from: v */
    public static final String f40774v = "REMOVE";

    /* renamed from: w */
    public static final String f40775w = "READ";

    /* renamed from: a */
    public final File f40776a;

    /* renamed from: b */
    public final long f40777b;

    /* renamed from: c */
    public final File f40778c;

    /* renamed from: d */
    public final File f40779d;

    /* renamed from: e */
    public final File f40780e;

    /* renamed from: f */
    public long f40781f;

    /* renamed from: g */
    public C11790yN0 f40782g;

    /* renamed from: h */
    public final LinkedHashMap f40783h;

    /* renamed from: i */
    public int f40784i;

    /* renamed from: j */
    public boolean f40785j;

    /* renamed from: k */
    public boolean f40786k;

    /* renamed from: l */
    public boolean f40787l;

    /* renamed from: m */
    public boolean f40788m;

    /* renamed from: n */
    public boolean f40789n;

    /* renamed from: o */
    public boolean f40790o;

    /* renamed from: p */
    public long f40791p;

    /* renamed from: q */
    public final C8689a91 f40792q;

    /* renamed from: r */
    public final C6610pK f40793r;

    public C6673qK(File file, long j, C8817b91 c8817b91) {
        O90.m5968f(c8817b91, "taskRunner");
        this.f40776a = file;
        this.f40777b = j;
        this.f40783h = new LinkedHashMap(0, 0.75f, true);
        this.f40792q = c8817b91.m10429e();
        this.f40793r = new C6610pK(this, AbstractC1374Vq.m8593l(new StringBuilder(), AbstractC7433Ch1.f1583g, " Cache"), 0);
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f40778c = new File(file, "journal");
        this.f40779d = new File(file, "journal.tmp");
        this.f40780e = new File(file, "journal.bkp");
    }

    /* renamed from: b0 */
    public static void m23965b0(String str) {
        if (f40771s.m10697b(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* renamed from: A */
    public final C11790yN0 m23966A() {
        C6868t9 c6868t9M4276d;
        File file = this.f40778c;
        O90.m5968f(file, "file");
        try {
            Logger logger = AbstractC11608wx0.f45176a;
            c6868t9M4276d = JI1.m4276d(new FileOutputStream(file, true));
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = AbstractC11608wx0.f45176a;
            c6868t9M4276d = JI1.m4276d(new FileOutputStream(file, true));
        }
        return JI1.m4273a(new C0407GS(c6868t9M4276d, new C7236z(14, this)));
    }

    /* renamed from: D */
    public final void m23967D() throws IOException {
        File file = this.f40779d;
        S20 s20 = S20.f10540c;
        s20.m7161m(file);
        Iterator it = this.f40783h.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            O90.m5967e(next, "i.next()");
            C6419mK c6419mK = (C6419mK) next;
            int i = 0;
            if (c6419mK.f37633g == null) {
                while (i < 2) {
                    this.f40781f += c6419mK.f37628b[i];
                    i++;
                }
            } else {
                c6419mK.f37633g = null;
                while (i < 2) {
                    s20.m7161m((File) c6419mK.f37629c.get(i));
                    s20.m7161m((File) c6419mK.f37630d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: J */
    public final void m23968J() {
        File file = this.f40778c;
        O90.m5968f(file, "file");
        Logger logger = AbstractC11608wx0.f45176a;
        C11917zN0 c11917zN0M4274b = JI1.m4274b(new C6931u9(new FileInputStream(file), C7523Ea1.f2789d));
        try {
            String strM26384W = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
            String strM26384W2 = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
            String strM26384W3 = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
            String strM26384W4 = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
            String strM26384W5 = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strM26384W) || !"1".equals(strM26384W2) || !O90.m5963a(String.valueOf(201105), strM26384W3) || !O90.m5963a(String.valueOf(2), strM26384W4) || strM26384W5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strM26384W + ", " + strM26384W2 + ", " + strM26384W4 + ", " + strM26384W5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m23969S(c11917zN0M4274b.m26384W(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f40784i = i - this.f40783h.size();
                    if (c11917zN0M4274b.m26387m()) {
                        this.f40782g = m23966A();
                    } else {
                        m23970U();
                    }
                    AbstractC8729aT1.m9749a(c11917zN0M4274b, null);
                    return;
                }
            }
        } finally {
        }
    }

    /* renamed from: S */
    public final void m23969S(String str) throws IOException {
        String strSubstring;
        int iM25361z = AbstractC11374v51.m25361z(str, ' ', 0, false, 6);
        if (iM25361z == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iM25361z + 1;
        int iM25361z2 = AbstractC11374v51.m25361z(str, ' ', i, false, 4);
        LinkedHashMap linkedHashMap = this.f40783h;
        if (iM25361z2 == -1) {
            strSubstring = str.substring(i);
            O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f40774v;
            if (iM25361z == str2.length() && D51.m1556o(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM25361z2);
            O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C6419mK c6419mK = (C6419mK) linkedHashMap.get(strSubstring);
        if (c6419mK == null) {
            c6419mK = new C6419mK(this, strSubstring);
            linkedHashMap.put(strSubstring, c6419mK);
        }
        if (iM25361z2 != -1) {
            String str3 = f40772t;
            if (iM25361z == str3.length() && D51.m1556o(str, str3, false)) {
                String strSubstring2 = str.substring(iM25361z2 + 1);
                O90.m5967e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listM25341P = AbstractC11374v51.m25341P(strSubstring2, new char[]{' '});
                c6419mK.f37631e = true;
                c6419mK.f37633g = null;
                int size = listM25341P.size();
                c6419mK.f37636j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listM25341P);
                }
                try {
                    int size2 = listM25341P.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c6419mK.f37628b[i2] = Long.parseLong((String) listM25341P.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listM25341P);
                }
            }
        }
        if (iM25361z2 == -1) {
            String str4 = f40773u;
            if (iM25361z == str4.length() && D51.m1556o(str, str4, false)) {
                c6419mK.f37633g = new C1338VG(this, c6419mK);
                return;
            }
        }
        if (iM25361z2 == -1) {
            String str5 = f40775w;
            if (iM25361z == str5.length() && D51.m1556o(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* renamed from: U */
    public final synchronized void m23970U() {
        C6868t9 c6868t9M4278f;
        try {
            C11790yN0 c11790yN0 = this.f40782g;
            if (c11790yN0 != null) {
                c11790yN0.close();
            }
            File file = this.f40779d;
            O90.m5968f(file, "file");
            try {
                c6868t9M4278f = JI1.m4278f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                c6868t9M4278f = JI1.m4278f(file);
            }
            C11790yN0 c11790yN0M4273a = JI1.m4273a(c6868t9M4278f);
            try {
                c11790yN0M4273a.mo4391L("libcore.io.DiskLruCache");
                c11790yN0M4273a.mo4397k(10);
                c11790yN0M4273a.mo4391L("1");
                c11790yN0M4273a.mo4397k(10);
                c11790yN0M4273a.mo4394f0(201105);
                c11790yN0M4273a.mo4397k(10);
                c11790yN0M4273a.mo4394f0(2);
                c11790yN0M4273a.mo4397k(10);
                c11790yN0M4273a.mo4397k(10);
                Iterator it = this.f40783h.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C6419mK c6419mK = (C6419mK) it.next();
                    if (c6419mK.f37633g != null) {
                        c11790yN0M4273a.mo4391L(f40773u);
                        c11790yN0M4273a.mo4397k(32);
                        c11790yN0M4273a.mo4391L(c6419mK.f37627a);
                        c11790yN0M4273a.mo4397k(10);
                    } else {
                        c11790yN0M4273a.mo4391L(f40772t);
                        c11790yN0M4273a.mo4397k(32);
                        c11790yN0M4273a.mo4391L(c6419mK.f37627a);
                        for (long j : c6419mK.f37628b) {
                            c11790yN0M4273a.mo4397k(32);
                            c11790yN0M4273a.mo4394f0(j);
                        }
                        c11790yN0M4273a.mo4397k(10);
                    }
                }
                AbstractC8729aT1.m9749a(c11790yN0M4273a, null);
                S20 s20 = S20.f10540c;
                if (s20.m7166r(this.f40778c)) {
                    s20.m7167u(this.f40778c, this.f40780e);
                }
                s20.m7167u(this.f40779d, this.f40778c);
                s20.m7161m(this.f40780e);
                this.f40782g = m23966A();
                this.f40785j = false;
                this.f40790o = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: W */
    public final void m23971W(C6419mK c6419mK) throws IOException {
        C11790yN0 c11790yN0;
        O90.m5968f(c6419mK, "entry");
        boolean z = this.f40786k;
        String str = c6419mK.f37627a;
        if (!z) {
            if (c6419mK.f37634h > 0 && (c11790yN0 = this.f40782g) != null) {
                c11790yN0.mo4391L(f40773u);
                c11790yN0.mo4397k(32);
                c11790yN0.mo4391L(str);
                c11790yN0.mo4397k(10);
                c11790yN0.flush();
            }
            if (c6419mK.f37634h > 0 || c6419mK.f37633g != null) {
                c6419mK.f37632f = true;
                return;
            }
        }
        C1338VG c1338vg = c6419mK.f37633g;
        if (c1338vg != null) {
            c1338vg.m8343g();
        }
        for (int i = 0; i < 2; i++) {
            File file = (File) c6419mK.f37629c.get(i);
            O90.m5968f(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException(AbstractC1374Vq.m8588g(file, "failed to delete "));
            }
            long j = this.f40781f;
            long[] jArr = c6419mK.f37628b;
            this.f40781f = j - jArr[i];
            jArr[i] = 0;
        }
        this.f40784i++;
        C11790yN0 c11790yN02 = this.f40782g;
        if (c11790yN02 != null) {
            c11790yN02.mo4391L(f40774v);
            c11790yN02.mo4397k(32);
            c11790yN02.mo4391L(str);
            c11790yN02.mo4397k(10);
        }
        this.f40783h.remove(str);
        if (m23978x()) {
            this.f40792q.m9679c(this.f40793r, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        m23971W(r1);
     */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23972X() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            long r0 = r4.f40781f
            long r2 = r4.f40777b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f40783h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            mK r1 = (p000.C6419mK) r1
            boolean r2 = r1.f37632f
            if (r2 != 0) goto L12
            r4.m23971W(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f40789n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6673qK.m23972X():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f40787l && !this.f40788m) {
                Collection collectionValues = this.f40783h.values();
                O90.m5967e(collectionValues, "lruEntries.values");
                for (C6419mK c6419mK : (C6419mK[]) collectionValues.toArray(new C6419mK[0])) {
                    C1338VG c1338vg = c6419mK.f37633g;
                    if (c1338vg != null) {
                        c1338vg.m8343g();
                    }
                }
                m23972X();
                C11790yN0 c11790yN0 = this.f40782g;
                O90.m5965c(c11790yN0);
                c11790yN0.close();
                this.f40782g = null;
                this.f40788m = true;
                return;
            }
            this.f40788m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f40787l) {
            m23973m();
            m23972X();
            C11790yN0 c11790yN0 = this.f40782g;
            O90.m5965c(c11790yN0);
            c11790yN0.flush();
        }
    }

    /* renamed from: m */
    public final synchronized void m23973m() {
        if (this.f40788m) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: n */
    public final synchronized void m23974n(C1338VG c1338vg, boolean z) {
        O90.m5968f(c1338vg, "editor");
        C6419mK c6419mK = (C6419mK) c1338vg.f12475c;
        if (!O90.m5963a(c6419mK.f37633g, c1338vg)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !c6419mK.f37631e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) c1338vg.f12476d;
                O90.m5965c(zArr);
                if (!zArr[i]) {
                    c1338vg.m8340c();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                File file = (File) c6419mK.f37630d.get(i);
                O90.m5968f(file, "file");
                if (!file.exists()) {
                    c1338vg.m8340c();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file2 = (File) c6419mK.f37630d.get(i2);
            if (!z || c6419mK.f37632f) {
                O90.m5968f(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException("failed to delete " + file2);
                }
            } else {
                S20 s20 = S20.f10540c;
                if (s20.m7166r(file2)) {
                    File file3 = (File) c6419mK.f37629c.get(i2);
                    s20.m7167u(file2, file3);
                    long j = c6419mK.f37628b[i2];
                    long length = file3.length();
                    c6419mK.f37628b[i2] = length;
                    this.f40781f = (this.f40781f - j) + length;
                }
            }
        }
        c6419mK.f37633g = null;
        if (c6419mK.f37632f) {
            m23971W(c6419mK);
            return;
        }
        this.f40784i++;
        C11790yN0 c11790yN0 = this.f40782g;
        O90.m5965c(c11790yN0);
        if (c6419mK.f37631e || z) {
            c6419mK.f37631e = true;
            c11790yN0.mo4391L(f40772t);
            c11790yN0.mo4397k(32);
            c11790yN0.mo4391L(c6419mK.f37627a);
            for (long j2 : c6419mK.f37628b) {
                c11790yN0.mo4397k(32);
                c11790yN0.mo4394f0(j2);
            }
            c11790yN0.mo4397k(10);
            if (z) {
                long j3 = this.f40791p;
                this.f40791p = 1 + j3;
                c6419mK.f37635i = j3;
            }
        } else {
            this.f40783h.remove(c6419mK.f37627a);
            c11790yN0.mo4391L(f40774v);
            c11790yN0.mo4397k(32);
            c11790yN0.mo4391L(c6419mK.f37627a);
            c11790yN0.mo4397k(10);
        }
        c11790yN0.flush();
        if (this.f40781f > this.f40777b || m23978x()) {
            this.f40792q.m9679c(this.f40793r, 0L);
        }
    }

    /* renamed from: o */
    public final synchronized C1338VG m23975o(long j, String str) {
        try {
            O90.m5968f(str, "key");
            m23977w();
            m23973m();
            m23965b0(str);
            C6419mK c6419mK = (C6419mK) this.f40783h.get(str);
            if (j != -1 && (c6419mK == null || c6419mK.f37635i != j)) {
                return null;
            }
            if ((c6419mK != null ? c6419mK.f37633g : null) != null) {
                return null;
            }
            if (c6419mK != null && c6419mK.f37634h != 0) {
                return null;
            }
            if (!this.f40789n && !this.f40790o) {
                C11790yN0 c11790yN0 = this.f40782g;
                O90.m5965c(c11790yN0);
                c11790yN0.mo4391L(f40773u);
                c11790yN0.mo4397k(32);
                c11790yN0.mo4391L(str);
                c11790yN0.mo4397k(10);
                c11790yN0.flush();
                if (this.f40785j) {
                    return null;
                }
                if (c6419mK == null) {
                    c6419mK = new C6419mK(this, str);
                    this.f40783h.put(str, c6419mK);
                }
                C1338VG c1338vg = new C1338VG(this, c6419mK);
                c6419mK.f37633g = c1338vg;
                return c1338vg;
            }
            this.f40792q.m9679c(this.f40793r, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: p */
    public final synchronized C6545oK m23976p(String str) {
        O90.m5968f(str, "key");
        m23977w();
        m23973m();
        m23965b0(str);
        C6419mK c6419mK = (C6419mK) this.f40783h.get(str);
        if (c6419mK == null) {
            return null;
        }
        C6545oK c6545oKM22771a = c6419mK.m22771a();
        if (c6545oKM22771a == null) {
            return null;
        }
        this.f40784i++;
        C11790yN0 c11790yN0 = this.f40782g;
        O90.m5965c(c11790yN0);
        c11790yN0.mo4391L(f40775w);
        c11790yN0.mo4397k(32);
        c11790yN0.mo4391L(str);
        c11790yN0.mo4397k(10);
        if (m23978x()) {
            this.f40792q.m9679c(this.f40793r, 0L);
        }
        return c6545oKM22771a;
    }

    /* renamed from: w */
    public final synchronized void m23977w() {
        C6868t9 c6868t9M4278f;
        boolean z;
        try {
            byte[] bArr = AbstractC7433Ch1.f1577a;
            if (this.f40787l) {
                return;
            }
            S20 s20 = S20.f10540c;
            if (s20.m7166r(this.f40780e)) {
                if (s20.m7166r(this.f40778c)) {
                    s20.m7161m(this.f40780e);
                } else {
                    s20.m7167u(this.f40780e, this.f40778c);
                }
            }
            File file = this.f40780e;
            O90.m5968f(file, "file");
            s20.getClass();
            O90.m5968f(file, "file");
            try {
                c6868t9M4278f = JI1.m4278f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                c6868t9M4278f = JI1.m4278f(file);
            }
            try {
                try {
                    s20.m7161m(file);
                    AbstractC8729aT1.m9749a(c6868t9M4278f, null);
                    z = true;
                } catch (IOException unused2) {
                    AbstractC8729aT1.m9749a(c6868t9M4278f, null);
                    s20.m7161m(file);
                    z = false;
                }
                this.f40786k = z;
                File file2 = this.f40778c;
                O90.m5968f(file2, "file");
                if (file2.exists()) {
                    try {
                        m23968J();
                        m23967D();
                        this.f40787l = true;
                        return;
                    } catch (IOException e) {
                        C10745qB0 c10745qB0 = C10745qB0.f40658a;
                        C10745qB0 c10745qB02 = C10745qB0.f40658a;
                        String str = "DiskLruCache " + this.f40776a + " is corrupt: " + e.getMessage() + ", removing";
                        c10745qB02.getClass();
                        C10745qB0.m23946i(5, str, e);
                        try {
                            close();
                            S20.f10540c.m7162n(this.f40776a);
                            this.f40788m = false;
                        } catch (Throwable th) {
                            this.f40788m = false;
                            throw th;
                        }
                    }
                }
                m23970U();
                this.f40787l = true;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: x */
    public final boolean m23978x() {
        int i = this.f40784i;
        return i >= 2000 && i >= this.f40783h.size();
    }
}

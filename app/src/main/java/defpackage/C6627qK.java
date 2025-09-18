package defpackage;

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
public final class C6627qK implements Closeable, Flushable {
    public static final C2512cQ0 s = new C2512cQ0("[a-z0-9_-]{1,120}");
    public static final String t = "CLEAN";
    public static final String u = "DIRTY";
    public static final String v = "REMOVE";
    public static final String w = "READ";
    public final File a;
    public final long b;
    public final File c;
    public final File d;
    public final File e;
    public long f;
    public C8161yN0 g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public final C2081a91 q;
    public final C6436pK r;

    public C6627qK(File file, long j, C2272b91 c2272b91) {
        O90.f(c2272b91, "taskRunner");
        this.a = file;
        this.b = j;
        this.h = new LinkedHashMap(0, 0.75f, true);
        this.q = c2272b91.e();
        this.r = new C6436pK(this, AbstractC1705Vq.l(new StringBuilder(), AbstractC0199Ch1.g, " Cache"), 0);
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
    }

    public static void b0(String str) {
        if (s.b(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final C8161yN0 A() {
        C7166t9 c7166t9D;
        File file = this.c;
        O90.f(file, "file");
        try {
            Logger logger = AbstractC7889wx0.a;
            c7166t9D = JI1.d(new FileOutputStream(file, true));
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = AbstractC7889wx0.a;
            c7166t9D = JI1.d(new FileOutputStream(file, true));
        }
        return JI1.a(new GS(c7166t9D, new C8277z(14, this)));
    }

    public final void D() throws IOException {
        File file = this.d;
        S20 s20 = S20.c;
        s20.m(file);
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            O90.e(next, "i.next()");
            C5863mK c5863mK = (C5863mK) next;
            int i = 0;
            if (c5863mK.g == null) {
                while (i < 2) {
                    this.f += c5863mK.b[i];
                    i++;
                }
            } else {
                c5863mK.g = null;
                while (i < 2) {
                    s20.m((File) c5863mK.c.get(i));
                    s20.m((File) c5863mK.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void J() {
        File file = this.c;
        O90.f(file, "file");
        Logger logger = AbstractC7889wx0.a;
        C8351zN0 c8351zN0B = JI1.b(new C7357u9(new FileInputStream(file), C0334Ea1.d));
        try {
            String strW = c8351zN0B.W(Long.MAX_VALUE);
            String strW2 = c8351zN0B.W(Long.MAX_VALUE);
            String strW3 = c8351zN0B.W(Long.MAX_VALUE);
            String strW4 = c8351zN0B.W(Long.MAX_VALUE);
            String strW5 = c8351zN0B.W(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strW) || !"1".equals(strW2) || !O90.a(String.valueOf(201105), strW3) || !O90.a(String.valueOf(2), strW4) || strW5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strW + ", " + strW2 + ", " + strW4 + ", " + strW5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    S(c8351zN0B.W(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.i = i - this.h.size();
                    if (c8351zN0B.m()) {
                        this.g = A();
                    } else {
                        U();
                    }
                    AbstractC2141aT1.a(c8351zN0B, null);
                    return;
                }
            }
        } finally {
        }
    }

    public final void S(String str) throws IOException {
        String strSubstring;
        int iZ = AbstractC7538v51.z(str, ' ', 0, false, 6);
        if (iZ == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iZ + 1;
        int iZ2 = AbstractC7538v51.z(str, ' ', i, false, 4);
        LinkedHashMap linkedHashMap = this.h;
        if (iZ2 == -1) {
            strSubstring = str.substring(i);
            O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = v;
            if (iZ == str2.length() && D51.o(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iZ2);
            O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C5863mK c5863mK = (C5863mK) linkedHashMap.get(strSubstring);
        if (c5863mK == null) {
            c5863mK = new C5863mK(this, strSubstring);
            linkedHashMap.put(strSubstring, c5863mK);
        }
        if (iZ2 != -1) {
            String str3 = t;
            if (iZ == str3.length() && D51.o(str, str3, false)) {
                String strSubstring2 = str.substring(iZ2 + 1);
                O90.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listP = AbstractC7538v51.P(strSubstring2, new char[]{' '});
                c5863mK.e = true;
                c5863mK.g = null;
                int size = listP.size();
                c5863mK.j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listP);
                }
                try {
                    int size2 = listP.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c5863mK.b[i2] = Long.parseLong((String) listP.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listP);
                }
            }
        }
        if (iZ2 == -1) {
            String str4 = u;
            if (iZ == str4.length() && D51.o(str, str4, false)) {
                c5863mK.g = new VG(this, c5863mK);
                return;
            }
        }
        if (iZ2 == -1) {
            String str5 = w;
            if (iZ == str5.length() && D51.o(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void U() {
        C7166t9 c7166t9F;
        try {
            C8161yN0 c8161yN0 = this.g;
            if (c8161yN0 != null) {
                c8161yN0.close();
            }
            File file = this.d;
            O90.f(file, "file");
            try {
                c7166t9F = JI1.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                c7166t9F = JI1.f(file);
            }
            C8161yN0 c8161yN0A = JI1.a(c7166t9F);
            try {
                c8161yN0A.L("libcore.io.DiskLruCache");
                c8161yN0A.k(10);
                c8161yN0A.L("1");
                c8161yN0A.k(10);
                c8161yN0A.f0(201105);
                c8161yN0A.k(10);
                c8161yN0A.f0(2);
                c8161yN0A.k(10);
                c8161yN0A.k(10);
                Iterator it = this.h.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5863mK c5863mK = (C5863mK) it.next();
                    if (c5863mK.g != null) {
                        c8161yN0A.L(u);
                        c8161yN0A.k(32);
                        c8161yN0A.L(c5863mK.a);
                        c8161yN0A.k(10);
                    } else {
                        c8161yN0A.L(t);
                        c8161yN0A.k(32);
                        c8161yN0A.L(c5863mK.a);
                        for (long j : c5863mK.b) {
                            c8161yN0A.k(32);
                            c8161yN0A.f0(j);
                        }
                        c8161yN0A.k(10);
                    }
                }
                AbstractC2141aT1.a(c8161yN0A, null);
                S20 s20 = S20.c;
                if (s20.r(this.c)) {
                    s20.u(this.c, this.e);
                }
                s20.u(this.d, this.c);
                s20.m(this.e);
                this.g = A();
                this.j = false;
                this.o = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void W(C5863mK c5863mK) throws IOException {
        C8161yN0 c8161yN0;
        O90.f(c5863mK, "entry");
        boolean z = this.k;
        String str = c5863mK.a;
        if (!z) {
            if (c5863mK.h > 0 && (c8161yN0 = this.g) != null) {
                c8161yN0.L(u);
                c8161yN0.k(32);
                c8161yN0.L(str);
                c8161yN0.k(10);
                c8161yN0.flush();
            }
            if (c5863mK.h > 0 || c5863mK.g != null) {
                c5863mK.f = true;
                return;
            }
        }
        VG vg = c5863mK.g;
        if (vg != null) {
            vg.g();
        }
        for (int i = 0; i < 2; i++) {
            File file = (File) c5863mK.c.get(i);
            O90.f(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException(AbstractC1705Vq.g(file, "failed to delete "));
            }
            long j = this.f;
            long[] jArr = c5863mK.b;
            this.f = j - jArr[i];
            jArr[i] = 0;
        }
        this.i++;
        C8161yN0 c8161yN02 = this.g;
        if (c8161yN02 != null) {
            c8161yN02.L(v);
            c8161yN02.k(32);
            c8161yN02.L(str);
            c8161yN02.k(10);
        }
        this.h.remove(str);
        if (x()) {
            this.q.c(this.r, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        W(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            long r0 = r4.f
            long r2 = r4.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            mK r1 = (defpackage.C5863mK) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.W(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6627qK.X():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l && !this.m) {
                Collection collectionValues = this.h.values();
                O90.e(collectionValues, "lruEntries.values");
                for (C5863mK c5863mK : (C5863mK[]) collectionValues.toArray(new C5863mK[0])) {
                    VG vg = c5863mK.g;
                    if (vg != null) {
                        vg.g();
                    }
                }
                X();
                C8161yN0 c8161yN0 = this.g;
                O90.c(c8161yN0);
                c8161yN0.close();
                this.g = null;
                this.m = true;
                return;
            }
            this.m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.l) {
            m();
            X();
            C8161yN0 c8161yN0 = this.g;
            O90.c(c8161yN0);
            c8161yN0.flush();
        }
    }

    public final synchronized void m() {
        if (this.m) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void n(VG vg, boolean z) {
        O90.f(vg, "editor");
        C5863mK c5863mK = (C5863mK) vg.c;
        if (!O90.a(c5863mK.g, vg)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !c5863mK.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) vg.d;
                O90.c(zArr);
                if (!zArr[i]) {
                    vg.c();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                File file = (File) c5863mK.d.get(i);
                O90.f(file, "file");
                if (!file.exists()) {
                    vg.c();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file2 = (File) c5863mK.d.get(i2);
            if (!z || c5863mK.f) {
                O90.f(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException("failed to delete " + file2);
                }
            } else {
                S20 s20 = S20.c;
                if (s20.r(file2)) {
                    File file3 = (File) c5863mK.c.get(i2);
                    s20.u(file2, file3);
                    long j = c5863mK.b[i2];
                    long length = file3.length();
                    c5863mK.b[i2] = length;
                    this.f = (this.f - j) + length;
                }
            }
        }
        c5863mK.g = null;
        if (c5863mK.f) {
            W(c5863mK);
            return;
        }
        this.i++;
        C8161yN0 c8161yN0 = this.g;
        O90.c(c8161yN0);
        if (c5863mK.e || z) {
            c5863mK.e = true;
            c8161yN0.L(t);
            c8161yN0.k(32);
            c8161yN0.L(c5863mK.a);
            for (long j2 : c5863mK.b) {
                c8161yN0.k(32);
                c8161yN0.f0(j2);
            }
            c8161yN0.k(10);
            if (z) {
                long j3 = this.p;
                this.p = 1 + j3;
                c5863mK.i = j3;
            }
        } else {
            this.h.remove(c5863mK.a);
            c8161yN0.L(v);
            c8161yN0.k(32);
            c8161yN0.L(c5863mK.a);
            c8161yN0.k(10);
        }
        c8161yN0.flush();
        if (this.f > this.b || x()) {
            this.q.c(this.r, 0L);
        }
    }

    public final synchronized VG o(long j, String str) {
        try {
            O90.f(str, "key");
            w();
            m();
            b0(str);
            C5863mK c5863mK = (C5863mK) this.h.get(str);
            if (j != -1 && (c5863mK == null || c5863mK.i != j)) {
                return null;
            }
            if ((c5863mK != null ? c5863mK.g : null) != null) {
                return null;
            }
            if (c5863mK != null && c5863mK.h != 0) {
                return null;
            }
            if (!this.n && !this.o) {
                C8161yN0 c8161yN0 = this.g;
                O90.c(c8161yN0);
                c8161yN0.L(u);
                c8161yN0.k(32);
                c8161yN0.L(str);
                c8161yN0.k(10);
                c8161yN0.flush();
                if (this.j) {
                    return null;
                }
                if (c5863mK == null) {
                    c5863mK = new C5863mK(this, str);
                    this.h.put(str, c5863mK);
                }
                VG vg = new VG(this, c5863mK);
                c5863mK.g = vg;
                return vg;
            }
            this.q.c(this.r, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C6245oK p(String str) {
        O90.f(str, "key");
        w();
        m();
        b0(str);
        C5863mK c5863mK = (C5863mK) this.h.get(str);
        if (c5863mK == null) {
            return null;
        }
        C6245oK c6245oKA = c5863mK.a();
        if (c6245oKA == null) {
            return null;
        }
        this.i++;
        C8161yN0 c8161yN0 = this.g;
        O90.c(c8161yN0);
        c8161yN0.L(w);
        c8161yN0.k(32);
        c8161yN0.L(str);
        c8161yN0.k(10);
        if (x()) {
            this.q.c(this.r, 0L);
        }
        return c6245oKA;
    }

    public final synchronized void w() {
        C7166t9 c7166t9F;
        boolean z;
        try {
            byte[] bArr = AbstractC0199Ch1.a;
            if (this.l) {
                return;
            }
            S20 s20 = S20.c;
            if (s20.r(this.e)) {
                if (s20.r(this.c)) {
                    s20.m(this.e);
                } else {
                    s20.u(this.e, this.c);
                }
            }
            File file = this.e;
            O90.f(file, "file");
            s20.getClass();
            O90.f(file, "file");
            try {
                c7166t9F = JI1.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                c7166t9F = JI1.f(file);
            }
            try {
                try {
                    s20.m(file);
                    AbstractC2141aT1.a(c7166t9F, null);
                    z = true;
                } catch (IOException unused2) {
                    AbstractC2141aT1.a(c7166t9F, null);
                    s20.m(file);
                    z = false;
                }
                this.k = z;
                File file2 = this.c;
                O90.f(file2, "file");
                if (file2.exists()) {
                    try {
                        J();
                        D();
                        this.l = true;
                        return;
                    } catch (IOException e) {
                        C6601qB0 c6601qB0 = C6601qB0.a;
                        C6601qB0 c6601qB02 = C6601qB0.a;
                        String str = "DiskLruCache " + this.a + " is corrupt: " + e.getMessage() + ", removing";
                        c6601qB02.getClass();
                        C6601qB0.i(5, str, e);
                        try {
                            close();
                            S20.c.n(this.a);
                            this.m = false;
                        } catch (Throwable th) {
                            this.m = false;
                            throw th;
                        }
                    }
                }
                U();
                this.l = true;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean x() {
        int i = this.i;
        return i >= 2000 && i >= this.h.size();
    }
}

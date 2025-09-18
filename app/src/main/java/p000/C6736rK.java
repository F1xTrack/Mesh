package p000;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: rK */
/* loaded from: classes.dex */
public final class C6736rK implements Closeable {

    /* renamed from: a */
    public final File f41514a;

    /* renamed from: b */
    public final File f41515b;

    /* renamed from: c */
    public final File f41516c;

    /* renamed from: d */
    public final File f41517d;

    /* renamed from: f */
    public final long f41519f;

    /* renamed from: i */
    public BufferedWriter f41522i;

    /* renamed from: k */
    public int f41524k;

    /* renamed from: h */
    public long f41521h = 0;

    /* renamed from: j */
    public final LinkedHashMap f41523j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f41525l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f41526m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6293kK());

    /* renamed from: n */
    public final CallableC6230jK f41527n = new CallableC6230jK(0, this);

    /* renamed from: e */
    public final int f41518e = 1;

    /* renamed from: g */
    public final int f41520g = 1;

    public C6736rK(File file, long j) {
        this.f41514a = file;
        this.f41515b = new File(file, "journal");
        this.f41516c = new File(file, "journal.tmp");
        this.f41517d = new File(file, "journal.bkp");
        this.f41519f = j;
    }

    /* renamed from: A */
    public static void m24274A(File file, File file2, boolean z) throws IOException {
        if (z) {
            m24277e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static void m24275a(C6736rK c6736rK, C1338VG c1338vg, boolean z) {
        synchronized (c6736rK) {
            C6482nK c6482nK = (C6482nK) c1338vg.f12475c;
            if (c6482nK.f38276f != c1338vg) {
                throw new IllegalStateException();
            }
            if (z && !c6482nK.f38275e) {
                for (int i = 0; i < c6736rK.f41520g; i++) {
                    if (!((boolean[]) c1338vg.f12476d)[i]) {
                        c1338vg.m8340c();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c6482nK.f38274d[i].exists()) {
                        c1338vg.m8340c();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c6736rK.f41520g; i2++) {
                File file = c6482nK.f38274d[i2];
                if (!z) {
                    m24277e(file);
                } else if (file.exists()) {
                    File file2 = c6482nK.f38273c[i2];
                    file.renameTo(file2);
                    long j = c6482nK.f38272b[i2];
                    long length = file2.length();
                    c6482nK.f38272b[i2] = length;
                    c6736rK.f41521h = (c6736rK.f41521h - j) + length;
                }
            }
            c6736rK.f41524k++;
            c6482nK.f38276f = null;
            if (c6482nK.f38275e || z) {
                c6482nK.f38275e = true;
                c6736rK.f41522i.append((CharSequence) "CLEAN");
                c6736rK.f41522i.append(' ');
                c6736rK.f41522i.append((CharSequence) c6482nK.f38271a);
                c6736rK.f41522i.append((CharSequence) c6482nK.m23124a());
                c6736rK.f41522i.append('\n');
                if (z) {
                    c6736rK.f41525l++;
                }
            } else {
                c6736rK.f41523j.remove(c6482nK.f38271a);
                c6736rK.f41522i.append((CharSequence) "REMOVE");
                c6736rK.f41522i.append(' ');
                c6736rK.f41522i.append((CharSequence) c6482nK.f38271a);
                c6736rK.f41522i.append('\n');
            }
            m24278g(c6736rK.f41522i);
            if (c6736rK.f41521h > c6736rK.f41519f || c6736rK.m24283m()) {
                c6736rK.f41526m.submit(c6736rK.f41527n);
            }
        }
    }

    /* renamed from: c */
    public static void m24276c(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: e */
    public static void m24277e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: g */
    public static void m24278g(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: n */
    public static C6736rK m24279n(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m24274A(file2, file3, false);
            }
        }
        C6736rK c6736rK = new C6736rK(file, j);
        if (c6736rK.f41515b.exists()) {
            try {
                c6736rK.m24285p();
                c6736rK.m24284o();
                return c6736rK;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c6736rK.close();
                AbstractC7329Ah1.m290a(c6736rK.f41514a);
            }
        }
        file.mkdirs();
        C6736rK c6736rK2 = new C6736rK(file, j);
        c6736rK2.m24287x();
        return c6736rK2;
    }

    /* renamed from: D */
    public final void m24280D() {
        while (this.f41521h > this.f41519f) {
            String str = (String) ((Map.Entry) this.f41523j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f41522i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C6482nK c6482nK = (C6482nK) this.f41523j.get(str);
                    if (c6482nK != null && c6482nK.f38276f == null) {
                        for (int i = 0; i < this.f41520g; i++) {
                            File file = c6482nK.f38273c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f41521h;
                            long[] jArr = c6482nK.f38272b;
                            this.f41521h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f41524k++;
                        this.f41522i.append((CharSequence) "REMOVE");
                        this.f41522i.append(' ');
                        this.f41522i.append((CharSequence) str);
                        this.f41522i.append('\n');
                        this.f41523j.remove(str);
                        if (m24283m()) {
                            this.f41526m.submit(this.f41527n);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f41522i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f41523j.values()).iterator();
            while (it.hasNext()) {
                C1338VG c1338vg = ((C6482nK) it.next()).f38276f;
                if (c1338vg != null) {
                    c1338vg.m8340c();
                }
            }
            m24280D();
            m24276c(this.f41522i);
            this.f41522i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public final C1338VG m24281f(String str) {
        synchronized (this) {
            try {
                if (this.f41522i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C6482nK c6482nK = (C6482nK) this.f41523j.get(str);
                if (c6482nK == null) {
                    c6482nK = new C6482nK(this, str);
                    this.f41523j.put(str, c6482nK);
                } else if (c6482nK.f38276f != null) {
                    return null;
                }
                C1338VG c1338vg = new C1338VG(this, c6482nK);
                c6482nK.f38276f = c1338vg;
                this.f41522i.append((CharSequence) "DIRTY");
                this.f41522i.append(' ');
                this.f41522i.append((CharSequence) str);
                this.f41522i.append('\n');
                m24278g(this.f41522i);
                return c1338vg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final synchronized C8170Qm0 m24282j(String str) {
        if (this.f41522i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C6482nK c6482nK = (C6482nK) this.f41523j.get(str);
        if (c6482nK == null) {
            return null;
        }
        if (!c6482nK.f38275e) {
            return null;
        }
        for (File file : c6482nK.f38273c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f41524k++;
        this.f41522i.append((CharSequence) "READ");
        this.f41522i.append(' ');
        this.f41522i.append((CharSequence) str);
        this.f41522i.append('\n');
        if (m24283m()) {
            this.f41526m.submit(this.f41527n);
        }
        return new C8170Qm0(14, c6482nK.f38273c);
    }

    /* renamed from: m */
    public final boolean m24283m() {
        int i = this.f41524k;
        return i >= 2000 && i >= this.f41523j.size();
    }

    /* renamed from: o */
    public final void m24284o() throws IOException {
        m24277e(this.f41516c);
        Iterator it = this.f41523j.values().iterator();
        while (it.hasNext()) {
            C6482nK c6482nK = (C6482nK) it.next();
            C1338VG c1338vg = c6482nK.f38276f;
            int i = this.f41520g;
            int i2 = 0;
            if (c1338vg == null) {
                while (i2 < i) {
                    this.f41521h += c6482nK.f38272b[i2];
                    i2++;
                }
            } else {
                c6482nK.f38276f = null;
                while (i2 < i) {
                    m24277e(c6482nK.f38273c[i2]);
                    m24277e(c6482nK.f38274d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: p */
    public final void m24285p() {
        File file = this.f41515b;
        C10734q51 c10734q51 = new C10734q51(new FileInputStream(file), AbstractC7329Ah1.f335a);
        try {
            String strM23930m = c10734q51.m23930m();
            String strM23930m2 = c10734q51.m23930m();
            String strM23930m3 = c10734q51.m23930m();
            String strM23930m4 = c10734q51.m23930m();
            String strM23930m5 = c10734q51.m23930m();
            if (!"libcore.io.DiskLruCache".equals(strM23930m) || !"1".equals(strM23930m2) || !Integer.toString(this.f41518e).equals(strM23930m3) || !Integer.toString(this.f41520g).equals(strM23930m4) || !"".equals(strM23930m5)) {
                throw new IOException("unexpected journal header: [" + strM23930m + ", " + strM23930m2 + ", " + strM23930m4 + ", " + strM23930m5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m24286w(c10734q51.m23930m());
                    i++;
                } catch (EOFException unused) {
                    this.f41524k = i - this.f41523j.size();
                    if (c10734q51.f40600e == -1) {
                        m24287x();
                    } else {
                        this.f41522i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC7329Ah1.f335a));
                    }
                    try {
                        c10734q51.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c10734q51.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: w */
    public final void m24286w(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f41523j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C6482nK c6482nK = (C6482nK) linkedHashMap.get(strSubstring);
        if (c6482nK == null) {
            c6482nK = new C6482nK(this, strSubstring);
            linkedHashMap.put(strSubstring, c6482nK);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c6482nK.f38276f = new C1338VG(this, c6482nK);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c6482nK.f38275e = true;
        c6482nK.f38276f = null;
        if (strArrSplit.length != c6482nK.f38277g.f41520g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c6482nK.f38272b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* renamed from: x */
    public final synchronized void m24287x() {
        try {
            BufferedWriter bufferedWriter = this.f41522i;
            if (bufferedWriter != null) {
                m24276c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41516c), AbstractC7329Ah1.f335a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f41518e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f41520g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C6482nK c6482nK : this.f41523j.values()) {
                    if (c6482nK.f38276f != null) {
                        bufferedWriter2.write("DIRTY " + c6482nK.f38271a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c6482nK.f38271a + c6482nK.m23124a() + '\n');
                    }
                }
                m24276c(bufferedWriter2);
                if (this.f41515b.exists()) {
                    m24274A(this.f41515b, this.f41517d, true);
                }
                m24274A(this.f41516c, this.f41515b, false);
                this.f41517d.delete();
                this.f41522i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41515b, true), AbstractC7329Ah1.f335a));
            } catch (Throwable th) {
                m24276c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

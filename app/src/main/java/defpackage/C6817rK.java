package defpackage;

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

/* renamed from: rK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6817rK implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5481kK());
    public final CallableC5290jK n = new CallableC5290jK(0, this);
    public final int e = 1;
    public final int g = 1;

    public C6817rK(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static void A(File file, File file2, boolean z) throws IOException {
        if (z) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(C6817rK c6817rK, VG vg, boolean z) {
        synchronized (c6817rK) {
            C6054nK c6054nK = (C6054nK) vg.c;
            if (c6054nK.f != vg) {
                throw new IllegalStateException();
            }
            if (z && !c6054nK.e) {
                for (int i = 0; i < c6817rK.g; i++) {
                    if (!((boolean[]) vg.d)[i]) {
                        vg.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c6054nK.d[i].exists()) {
                        vg.c();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c6817rK.g; i2++) {
                File file = c6054nK.d[i2];
                if (!z) {
                    e(file);
                } else if (file.exists()) {
                    File file2 = c6054nK.c[i2];
                    file.renameTo(file2);
                    long j = c6054nK.b[i2];
                    long length = file2.length();
                    c6054nK.b[i2] = length;
                    c6817rK.h = (c6817rK.h - j) + length;
                }
            }
            c6817rK.k++;
            c6054nK.f = null;
            if (c6054nK.e || z) {
                c6054nK.e = true;
                c6817rK.i.append((CharSequence) "CLEAN");
                c6817rK.i.append(' ');
                c6817rK.i.append((CharSequence) c6054nK.a);
                c6817rK.i.append((CharSequence) c6054nK.a());
                c6817rK.i.append('\n');
                if (z) {
                    c6817rK.l++;
                }
            } else {
                c6817rK.j.remove(c6054nK.a);
                c6817rK.i.append((CharSequence) "REMOVE");
                c6817rK.i.append(' ');
                c6817rK.i.append((CharSequence) c6054nK.a);
                c6817rK.i.append('\n');
            }
            g(c6817rK.i);
            if (c6817rK.h > c6817rK.f || c6817rK.m()) {
                c6817rK.m.submit(c6817rK.n);
            }
        }
    }

    public static void c(BufferedWriter bufferedWriter) throws IOException {
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

    public static void e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void g(BufferedWriter bufferedWriter) throws IOException {
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

    public static C6817rK n(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                A(file2, file3, false);
            }
        }
        C6817rK c6817rK = new C6817rK(file, j);
        if (c6817rK.b.exists()) {
            try {
                c6817rK.p();
                c6817rK.o();
                return c6817rK;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c6817rK.close();
                AbstractC0043Ah1.a(c6817rK.a);
            }
        }
        file.mkdirs();
        C6817rK c6817rK2 = new C6817rK(file, j);
        c6817rK2.x();
        return c6817rK2;
    }

    public final void D() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C6054nK c6054nK = (C6054nK) this.j.get(str);
                    if (c6054nK != null && c6054nK.f == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = c6054nK.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = c6054nK.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(' ');
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.j.remove(str);
                        if (m()) {
                            this.m.submit(this.n);
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
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                VG vg = ((C6054nK) it.next()).f;
                if (vg != null) {
                    vg.c();
                }
            }
            D();
            c(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final VG f(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C6054nK c6054nK = (C6054nK) this.j.get(str);
                if (c6054nK == null) {
                    c6054nK = new C6054nK(this, str);
                    this.j.put(str, c6054nK);
                } else if (c6054nK.f != null) {
                    return null;
                }
                VG vg = new VG(this, c6054nK);
                c6054nK.f = vg;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                g(this.i);
                return vg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized C1304Qm0 j(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C6054nK c6054nK = (C6054nK) this.j.get(str);
        if (c6054nK == null) {
            return null;
        }
        if (!c6054nK.e) {
            return null;
        }
        for (File file : c6054nK.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (m()) {
            this.m.submit(this.n);
        }
        return new C1304Qm0(14, c6054nK.c);
    }

    public final boolean m() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public final void o() throws IOException {
        e(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            C6054nK c6054nK = (C6054nK) it.next();
            VG vg = c6054nK.f;
            int i = this.g;
            int i2 = 0;
            if (vg == null) {
                while (i2 < i) {
                    this.h += c6054nK.b[i2];
                    i2++;
                }
            } else {
                c6054nK.f = null;
                while (i2 < i) {
                    e(c6054nK.c[i2]);
                    e(c6054nK.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void p() {
        File file = this.b;
        C6584q51 c6584q51 = new C6584q51(new FileInputStream(file), AbstractC0043Ah1.a);
        try {
            String strM = c6584q51.m();
            String strM2 = c6584q51.m();
            String strM3 = c6584q51.m();
            String strM4 = c6584q51.m();
            String strM5 = c6584q51.m();
            if (!"libcore.io.DiskLruCache".equals(strM) || !"1".equals(strM2) || !Integer.toString(this.e).equals(strM3) || !Integer.toString(this.g).equals(strM4) || !"".equals(strM5)) {
                throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM4 + ", " + strM5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    w(c6584q51.m());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (c6584q51.e == -1) {
                        x();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC0043Ah1.a));
                    }
                    try {
                        c6584q51.close();
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
                c6584q51.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void w(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C6054nK c6054nK = (C6054nK) linkedHashMap.get(strSubstring);
        if (c6054nK == null) {
            c6054nK = new C6054nK(this, strSubstring);
            linkedHashMap.put(strSubstring, c6054nK);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c6054nK.f = new VG(this, c6054nK);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c6054nK.e = true;
        c6054nK.f = null;
        if (strArrSplit.length != c6054nK.g.g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c6054nK.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void x() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), AbstractC0043Ah1.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C6054nK c6054nK : this.j.values()) {
                    if (c6054nK.f != null) {
                        bufferedWriter2.write("DIRTY " + c6054nK.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c6054nK.a + c6054nK.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.b.exists()) {
                    A(this.b, this.d, true);
                }
                A(this.c, this.b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), AbstractC0043Ah1.a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

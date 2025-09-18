package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class N01 {
    public static final HashSet j = new HashSet();
    public final File a;
    public final C5363ji0 b;
    public final C1241Pr0 c;
    public final C3383dO1 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public C1531Tk i;

    public N01(File file, C5363ji0 c5363ji0, C4086h41 c4086h41) {
        boolean zAdd;
        C1241Pr0 c1241Pr0 = new C1241Pr0();
        c1241Pr0.a = new HashMap();
        c1241Pr0.b = new SparseArray();
        c1241Pr0.c = new SparseBooleanArray();
        c1241Pr0.d = new SparseBooleanArray();
        C6860rY0 c6860rY0 = new C6860rY0(c4086h41);
        C4210hk c4210hk = new C4210hk(new File(file, "cached_content_index.exi"));
        c1241Pr0.e = c6860rY0;
        c1241Pr0.f = c4210hk;
        C3383dO1 c3383dO1 = new C3383dO1(1, c4086h41);
        synchronized (N01.class) {
            zAdd = j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException(AbstractC1705Vq.g(file, "Another SimpleCache instance uses the folder: "));
        }
        this.a = file;
        this.b = c5363ji0;
        this.c = c1241Pr0;
        this.d = c3383dO1;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new M01(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(N01 n01) throws NumberFormatException {
        long j2;
        C1241Pr0 c1241Pr0 = n01.c;
        File file = n01.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (C1531Tk e) {
                n01.i = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            AbstractC6789rA1.d(str);
            n01.i = new C1531Tk(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    AbstractC6789rA1.d("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        n01.h = j2;
        if (j2 == -1) {
            try {
                n01.h = f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                AbstractC6789rA1.e(str2, e2);
                n01.i = new C1531Tk(str2, e2);
                return;
            }
        }
        try {
            c1241Pr0.v(n01.h);
            C3383dO1 c3383dO1 = n01.d;
            if (c3383dO1 != null) {
                c3383dO1.A(n01.h);
                HashMap mapZ = c3383dO1.z();
                n01.i(file, true, fileArrListFiles, mapZ);
                c3383dO1.E(mapZ.keySet());
            } else {
                n01.i(file, true, fileArrListFiles, null);
            }
            AbstractC5740lg1 it = V70.u(((HashMap) c1241Pr0.a).keySet()).iterator();
            while (it.hasNext()) {
                c1241Pr0.x((String) it.next());
            }
            try {
                c1241Pr0.C();
            } catch (IOException e3) {
                AbstractC6789rA1.e("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            AbstractC6789rA1.e(str3, e4);
            n01.i = new C1531Tk(str3, e4);
        }
    }

    public static void e(File file) throws C1531Tk {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC6789rA1.d(str);
        throw new C1531Tk(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, AbstractC8235ym.i(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(AbstractC1705Vq.g(file2, "Failed to create UID file: "));
    }

    public final void b(P01 p01) {
        C1241Pr0 c1241Pr0 = this.c;
        String str = p01.a;
        c1241Pr0.s(str).c.add(p01);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C5363ji0) arrayList.get(size)).b(this, p01);
            }
        }
        this.b.b(this, p01);
    }

    public final synchronized void c(String str, C3383dO1 c3383dO1) {
        d();
        C1241Pr0 c1241Pr0 = this.c;
        C5753ll c5753llS = c1241Pr0.s(str);
        YE ye = c5753llS.e;
        YE yeA = ye.a(c3383dO1);
        c5753llS.e = yeA;
        if (!yeA.equals(ye)) {
            ((InterfaceC5944ml) c1241Pr0.e).d(c5753llS);
        }
        try {
            this.c.C();
        } catch (IOException e) {
            throw new C1531Tk(e);
        }
    }

    public final synchronized void d() {
        C1531Tk c1531Tk = this.i;
        if (c1531Tk != null) {
            throw c1531Tk;
        }
    }

    public final synchronized YE g(String str) {
        C5753ll c5753llQ;
        c5753llQ = this.c.q(str);
        return c5753llQ != null ? c5753llQ.e : YE.c;
    }

    public final P01 h(long j2, long j3, String str) throws C6353ou {
        P01 p01;
        long j4;
        C5753ll c5753llQ = this.c.q(str);
        if (c5753llQ == null) {
            return new P01(str, j2, j3, -9223372036854775807L, null);
        }
        while (true) {
            P01 p012 = new P01(c5753llQ.b, j2, -1L, -9223372036854775807L, null);
            TreeSet treeSet = c5753llQ.c;
            p01 = (P01) treeSet.floor(p012);
            if (p01 == null || p01.b + p01.c <= j2) {
                P01 p013 = (P01) treeSet.ceiling(p012);
                if (p013 != null) {
                    long jMin = p013.b - j2;
                    if (j3 != -1) {
                        jMin = Math.min(jMin, j3);
                    }
                    j4 = jMin;
                } else {
                    j4 = j3;
                }
                p01 = new P01(c5753llQ.b, j2, j4, -9223372036854775807L, null);
            }
            if (!p01.d) {
                break;
            }
            File file = p01.e;
            file.getClass();
            if (file.length() == p01.c) {
                break;
            }
            l();
        }
        return p01;
    }

    public final void i(File file, boolean z, File[] fileArr, HashMap map) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                i(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                C3640el c3640el = map != null ? (C3640el) map.remove(name) : null;
                if (c3640el != null) {
                    j3 = c3640el.a;
                    j2 = c3640el.b;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = -1;
                }
                P01 p01B = P01.b(file2, j3, j2, this.c);
                if (p01B != null) {
                    b(p01B);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void j(P01 p01) {
        C5753ll c5753llQ = this.c.q(p01.a);
        c5753llQ.getClass();
        long j2 = p01.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = c5753llQ.d;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((C5562kl) arrayList.get(i)).a == j2) {
                arrayList.remove(i);
                this.c.x(c5753llQ.b);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    public final void k(AbstractC5371jl abstractC5371jl) throws C6353ou {
        String str = abstractC5371jl.a;
        C1241Pr0 c1241Pr0 = this.c;
        C5753ll c5753llQ = c1241Pr0.q(str);
        if (c5753llQ == null || !c5753llQ.c.remove(abstractC5371jl)) {
            return;
        }
        File file = abstractC5371jl.e;
        if (file != null) {
            file.delete();
        }
        C3383dO1 c3383dO1 = this.d;
        if (c3383dO1 != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) c3383dO1.c).getClass();
                try {
                    ((C4086h41) c3383dO1.b).getWritableDatabase().delete((String) c3383dO1.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new C6353ou(e);
                }
            } catch (IOException unused) {
                AbstractC7209tN0.C("Failed to remove file index entry for: ", name);
            }
        }
        c1241Pr0.x(c5753llQ.b);
        ArrayList arrayList = (ArrayList) this.e.get(abstractC5371jl.a);
        long j2 = abstractC5371jl.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C5363ji0 c5363ji0 = (C5363ji0) arrayList.get(size);
                c5363ji0.b.remove(abstractC5371jl);
                c5363ji0.c -= j2;
            }
        }
        C5363ji0 c5363ji02 = this.b;
        c5363ji02.b.remove(abstractC5371jl);
        c5363ji02.c -= j2;
    }

    public final void l() throws C6353ou {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C5753ll) it.next()).c.iterator();
            while (it2.hasNext()) {
                AbstractC5371jl abstractC5371jl = (AbstractC5371jl) it2.next();
                File file = abstractC5371jl.e;
                file.getClass();
                if (file.length() != abstractC5371jl.c) {
                    arrayList.add(abstractC5371jl);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            k((AbstractC5371jl) arrayList.get(i));
        }
    }

    public final synchronized P01 m(long j2, long j3, String str) {
        d();
        P01 p01H = h(j2, j3, str);
        if (p01H.d) {
            return n(str, p01H);
        }
        C5753ll c5753llS = this.c.s(str);
        long j4 = p01H.c;
        int i = 0;
        while (true) {
            ArrayList arrayList = c5753llS.d;
            if (i >= arrayList.size()) {
                arrayList.add(new C5562kl(j2, j4));
                return p01H;
            }
            C5562kl c5562kl = (C5562kl) arrayList.get(i);
            long j5 = c5562kl.a;
            if (j5 <= j2) {
                long j6 = c5562kl.b;
                if (j6 == -1 || j5 + j6 > j2) {
                    break;
                }
                i++;
            } else {
                if (j4 == -1 || j2 + j4 > j5) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    public final P01 n(String str, P01 p01) {
        boolean z;
        File file;
        if (!this.g) {
            return p01;
        }
        File file2 = p01.e;
        file2.getClass();
        String name = file2.getName();
        long j2 = p01.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C3383dO1 c3383dO1 = this.d;
        if (c3383dO1 != null) {
            try {
                c3383dO1.H(j2, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                AbstractC6789rA1.h("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C5753ll c5753llQ = this.c.q(str);
        c5753llQ.getClass();
        TreeSet treeSet = c5753llQ.c;
        YN1.f(treeSet.remove(p01));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = P01.c(parentFile, c5753llQ.a, p01.b, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                AbstractC6789rA1.h("Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        YN1.f(p01.d);
        P01 p012 = new P01(p01.a, p01.b, p01.c, jCurrentTimeMillis, file);
        treeSet.add(p012);
        ArrayList arrayList = (ArrayList) this.e.get(p01.a);
        long j3 = p01.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C5363ji0 c5363ji0 = (C5363ji0) arrayList.get(size);
                c5363ji0.b.remove(p01);
                c5363ji0.c -= j3;
                c5363ji0.b(this, p012);
            }
        }
        C5363ji0 c5363ji02 = this.b;
        c5363ji02.b.remove(p01);
        c5363ji02.c -= j3;
        c5363ji02.b(this, p012);
        return p012;
    }
}

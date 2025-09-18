package p000;

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

    /* renamed from: j */
    public static final HashSet f7452j = new HashSet();

    /* renamed from: a */
    public final File f7453a;

    /* renamed from: b */
    public final C9915ji0 f7454b;

    /* renamed from: c */
    public final C8128Pr0 f7455c;

    /* renamed from: d */
    public final C9108dO1 f7456d;

    /* renamed from: e */
    public final HashMap f7457e;

    /* renamed from: f */
    public final Random f7458f;

    /* renamed from: g */
    public final boolean f7459g;

    /* renamed from: h */
    public long f7460h;

    /* renamed from: i */
    public C1242Tk f7461i;

    public N01(File file, C9915ji0 c9915ji0, C9580h41 c9580h41) {
        boolean zAdd;
        C8128Pr0 c8128Pr0 = new C8128Pr0();
        c8128Pr0.f9303a = new HashMap();
        c8128Pr0.f9304b = new SparseArray();
        c8128Pr0.f9305c = new SparseBooleanArray();
        c8128Pr0.f9306d = new SparseBooleanArray();
        C10919rY0 c10919rY0 = new C10919rY0(c9580h41);
        C4198hk c4198hk = new C4198hk(new File(file, "cached_content_index.exi"));
        c8128Pr0.f9307e = c10919rY0;
        c8128Pr0.f9308f = c4198hk;
        C9108dO1 c9108dO1 = new C9108dO1(1, c9580h41);
        synchronized (N01.class) {
            zAdd = f7452j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException(AbstractC1374Vq.m8588g(file, "Another SimpleCache instance uses the folder: "));
        }
        this.f7453a = file;
        this.f7454b = c9915ji0;
        this.f7455c = c8128Pr0;
        this.f7456d = c9108dO1;
        this.f7457e = new HashMap();
        this.f7458f = new Random();
        this.f7459g = true;
        this.f7460h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new M01(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* renamed from: a */
    public static void m5492a(N01 n01) throws NumberFormatException {
        long j;
        C8128Pr0 c8128Pr0 = n01.f7455c;
        File file = n01.f7453a;
        if (!file.exists()) {
            try {
                m5493e(file);
            } catch (C1242Tk e) {
                n01.f7461i = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            AbstractC10872rA1.m24171d(str);
            n01.f7461i = new C1242Tk(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    AbstractC10872rA1.m24171d("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        n01.f7460h = j;
        if (j == -1) {
            try {
                n01.f7460h = m5494f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                AbstractC10872rA1.m24172e(str2, e2);
                n01.f7461i = new C1242Tk(str2, e2);
                return;
            }
        }
        try {
            c8128Pr0.m6457v(n01.f7460h);
            C9108dO1 c9108dO1 = n01.f7456d;
            if (c9108dO1 != null) {
                c9108dO1.m17561A(n01.f7460h);
                HashMap mapM17581z = c9108dO1.m17581z();
                n01.m5500i(file, true, fileArrListFiles, mapM17581z);
                c9108dO1.m17565E(mapM17581z.keySet());
            } else {
                n01.m5500i(file, true, fileArrListFiles, null);
            }
            AbstractC10168lg1 it = V70.m8308u(((HashMap) c8128Pr0.f9303a).keySet()).iterator();
            while (it.hasNext()) {
                c8128Pr0.m6458x((String) it.next());
            }
            try {
                c8128Pr0.m6446C();
            } catch (IOException e3) {
                AbstractC10872rA1.m24172e("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            AbstractC10872rA1.m24172e(str3, e4);
            n01.f7461i = new C1242Tk(str3, e4);
        }
    }

    /* renamed from: e */
    public static void m5493e(File file) throws C1242Tk {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC10872rA1.m24171d(str);
        throw new C1242Tk(str);
    }

    /* renamed from: f */
    public static long m5494f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, AbstractC7222ym.m26232i(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(AbstractC1374Vq.m8588g(file2, "Failed to create UID file: "));
    }

    /* renamed from: b */
    public final void m5495b(P01 p01) {
        C8128Pr0 c8128Pr0 = this.f7455c;
        String str = p01.f35353a;
        c8128Pr0.m6455s(str).f37280c.add(p01);
        ArrayList arrayList = (ArrayList) this.f7457e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C9915ji0) arrayList.get(size)).m22094b(this, p01);
            }
        }
        this.f7454b.m22094b(this, p01);
    }

    /* renamed from: c */
    public final synchronized void m5496c(String str, C9108dO1 c9108dO1) {
        m5497d();
        C8128Pr0 c8128Pr0 = this.f7455c;
        C6383ll c6383llM6455s = c8128Pr0.m6455s(str);
        C1525YE c1525ye = c6383llM6455s.f37282e;
        C1525YE c1525yeM9241a = c1525ye.m9241a(c9108dO1);
        c6383llM6455s.f37282e = c1525yeM9241a;
        if (!c1525yeM9241a.equals(c1525ye)) {
            ((InterfaceC6446ml) c8128Pr0.f9307e).mo18856d(c6383llM6455s);
        }
        try {
            this.f7455c.m6446C();
        } catch (IOException e) {
            throw new C1242Tk(e);
        }
    }

    /* renamed from: d */
    public final synchronized void m5497d() {
        C1242Tk c1242Tk = this.f7461i;
        if (c1242Tk != null) {
            throw c1242Tk;
        }
    }

    /* renamed from: g */
    public final synchronized C1525YE m5498g(String str) {
        C6383ll c6383llM6453q;
        c6383llM6453q = this.f7455c.m6453q(str);
        return c6383llM6453q != null ? c6383llM6453q.f37282e : C1525YE.f14204c;
    }

    /* renamed from: h */
    public final P01 m5499h(long j, long j2, String str) throws C6583ou {
        P01 p01;
        long j3;
        C6383ll c6383llM6453q = this.f7455c.m6453q(str);
        if (c6383llM6453q == null) {
            return new P01(str, j, j2, -9223372036854775807L, null);
        }
        while (true) {
            P01 p012 = new P01(c6383llM6453q.f37279b, j, -1L, -9223372036854775807L, null);
            TreeSet treeSet = c6383llM6453q.f37280c;
            p01 = (P01) treeSet.floor(p012);
            if (p01 == null || p01.f35354b + p01.f35355c <= j) {
                P01 p013 = (P01) treeSet.ceiling(p012);
                if (p013 != null) {
                    long jMin = p013.f35354b - j;
                    if (j2 != -1) {
                        jMin = Math.min(jMin, j2);
                    }
                    j3 = jMin;
                } else {
                    j3 = j2;
                }
                p01 = new P01(c6383llM6453q.f37279b, j, j3, -9223372036854775807L, null);
            }
            if (!p01.f35356d) {
                break;
            }
            File file = p01.f35357e;
            file.getClass();
            if (file.length() == p01.f35355c) {
                break;
            }
            m5503l();
        }
        return p01;
    }

    /* renamed from: i */
    public final void m5500i(File file, boolean z, File[] fileArr, HashMap map) {
        long j;
        long j2;
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
                m5500i(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                C4010el c4010el = map != null ? (C4010el) map.remove(name) : null;
                if (c4010el != null) {
                    j2 = c4010el.f26820a;
                    j = c4010el.f26821b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                P01 p01M6194b = P01.m6194b(file2, j2, j, this.f7455c);
                if (p01M6194b != null) {
                    m5495b(p01M6194b);
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: j */
    public final synchronized void m5501j(P01 p01) {
        C6383ll c6383llM6453q = this.f7455c.m6453q(p01.f35353a);
        c6383llM6453q.getClass();
        long j = p01.f35354b;
        int i = 0;
        while (true) {
            ArrayList arrayList = c6383llM6453q.f37281d;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((C6320kl) arrayList.get(i)).f36657a == j) {
                arrayList.remove(i);
                this.f7455c.m6458x(c6383llM6453q.f37279b);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    /* renamed from: k */
    public final void m5502k(AbstractC6257jl abstractC6257jl) throws C6583ou {
        String str = abstractC6257jl.f35353a;
        C8128Pr0 c8128Pr0 = this.f7455c;
        C6383ll c6383llM6453q = c8128Pr0.m6453q(str);
        if (c6383llM6453q == null || !c6383llM6453q.f37280c.remove(abstractC6257jl)) {
            return;
        }
        File file = abstractC6257jl.f35357e;
        if (file != null) {
            file.delete();
        }
        C9108dO1 c9108dO1 = this.f7456d;
        if (c9108dO1 != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) c9108dO1.f26013c).getClass();
                try {
                    ((C9580h41) c9108dO1.f26012b).getWritableDatabase().delete((String) c9108dO1.f26013c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new C6583ou(e);
                }
            } catch (IOException unused) {
                AbstractC11153tN0.m24885C("Failed to remove file index entry for: ", name);
            }
        }
        c8128Pr0.m6458x(c6383llM6453q.f37279b);
        ArrayList arrayList = (ArrayList) this.f7457e.get(abstractC6257jl.f35353a);
        long j = abstractC6257jl.f35355c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C9915ji0 c9915ji0 = (C9915ji0) arrayList.get(size);
                c9915ji0.f35341b.remove(abstractC6257jl);
                c9915ji0.f35342c -= j;
            }
        }
        C9915ji0 c9915ji02 = this.f7454b;
        c9915ji02.f35341b.remove(abstractC6257jl);
        c9915ji02.f35342c -= j;
    }

    /* renamed from: l */
    public final void m5503l() throws C6583ou {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.f7455c.f9303a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C6383ll) it.next()).f37280c.iterator();
            while (it2.hasNext()) {
                AbstractC6257jl abstractC6257jl = (AbstractC6257jl) it2.next();
                File file = abstractC6257jl.f35357e;
                file.getClass();
                if (file.length() != abstractC6257jl.f35355c) {
                    arrayList.add(abstractC6257jl);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m5502k((AbstractC6257jl) arrayList.get(i));
        }
    }

    /* renamed from: m */
    public final synchronized P01 m5504m(long j, long j2, String str) {
        m5497d();
        P01 p01M5499h = m5499h(j, j2, str);
        if (p01M5499h.f35356d) {
            return m5505n(str, p01M5499h);
        }
        C6383ll c6383llM6455s = this.f7455c.m6455s(str);
        long j3 = p01M5499h.f35355c;
        int i = 0;
        while (true) {
            ArrayList arrayList = c6383llM6455s.f37281d;
            if (i >= arrayList.size()) {
                arrayList.add(new C6320kl(j, j3));
                return p01M5499h;
            }
            C6320kl c6320kl = (C6320kl) arrayList.get(i);
            long j4 = c6320kl.f36657a;
            if (j4 <= j) {
                long j5 = c6320kl.f36658b;
                if (j5 == -1 || j4 + j5 > j) {
                    break;
                }
                i++;
            } else {
                if (j3 == -1 || j + j3 > j4) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final P01 m5505n(String str, P01 p01) {
        boolean z;
        File file;
        if (!this.f7459g) {
            return p01;
        }
        File file2 = p01.f35357e;
        file2.getClass();
        String name = file2.getName();
        long j = p01.f35355c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C9108dO1 c9108dO1 = this.f7456d;
        if (c9108dO1 != null) {
            try {
                c9108dO1.m17567H(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                AbstractC10872rA1.m24175h("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C6383ll c6383llM6453q = this.f7455c.m6453q(str);
        c6383llM6453q.getClass();
        TreeSet treeSet = c6383llM6453q.f37280c;
        YN1.m9281f(treeSet.remove(p01));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileM6195c = P01.m6195c(parentFile, c6383llM6453q.f37278a, p01.f35354b, jCurrentTimeMillis);
            if (file2.renameTo(fileM6195c)) {
                file = fileM6195c;
            } else {
                AbstractC10872rA1.m24175h("Failed to rename " + file2 + " to " + fileM6195c);
                file = file2;
            }
        } else {
            file = file2;
        }
        YN1.m9281f(p01.f35356d);
        P01 p012 = new P01(p01.f35353a, p01.f35354b, p01.f35355c, jCurrentTimeMillis, file);
        treeSet.add(p012);
        ArrayList arrayList = (ArrayList) this.f7457e.get(p01.f35353a);
        long j2 = p01.f35355c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C9915ji0 c9915ji0 = (C9915ji0) arrayList.get(size);
                c9915ji0.f35341b.remove(p01);
                c9915ji0.f35342c -= j2;
                c9915ji0.m22094b(this, p012);
            }
        }
        C9915ji0 c9915ji02 = this.f7454b;
        c9915ji02.f35341b.remove(p01);
        c9915ji02.f35342c -= j2;
        c9915ji02.m22094b(this, p012);
        return p012;
    }
}

package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Qa {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Qa x;
    private final Map<String, C3176w8> a = new HashMap();
    private final Map<String, InterfaceC3251z8> b = new HashMap();
    private final Map<String, InterfaceC3226y8> c = new HashMap();
    private final C3121u8 d;
    private final Context e;
    private C3176w8 f;
    private C3176w8 g;
    private InterfaceC3226y8 h;
    private InterfaceC3226y8 i;
    private InterfaceC3226y8 j;
    private InterfaceC3226y8 k;
    private InterfaceC3251z8 l;
    private InterfaceC3251z8 m;
    private InterfaceC3251z8 n;
    private InterfaceC3251z8 o;
    private InterfaceC3251z8 p;
    private InterfaceC3251z8 q;
    private B8 r;
    private A8 s;
    private C8 t;
    private InterfaceC3251z8 u;
    private M8 v;
    private final L0 w;

    public Qa(Context context, C3121u8 c3121u8, L0 l0) {
        this.e = context;
        this.d = c3121u8;
        this.w = l0;
    }

    public static Qa a(Context context) {
        if (x == null) {
            synchronized (Qa.class) {
                try {
                    if (x == null) {
                        x = new Qa(context.getApplicationContext(), O8.a(), new L0());
                    }
                } finally {
                }
            }
        }
        return x;
    }

    private InterfaceC3226y8 k() {
        C3176w8 c3176w8;
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.g = a("metrica_aip.db", this.d.a());
                    }
                    c3176w8 = this.g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j = new Oa(new N8(c3176w8), "binary_data");
        }
        return this.j;
    }

    private InterfaceC3251z8 l() {
        M8 m8;
        if (this.p == null) {
            synchronized (this) {
                try {
                    if (this.v == null) {
                        String strA = a("metrica_client_data.db");
                        Context context = this.e;
                        this.v = new M8(context, strA, new C2663bn(context, "metrica_client_data.db"), this.d.b());
                    }
                    m8 = this.v;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.p = new Ra("preferences", m8);
        }
        return this.p;
    }

    private InterfaceC3226y8 m() {
        if (this.h == null) {
            this.h = new Oa(new N8(r()), "binary_data");
        }
        return this.h;
    }

    public synchronized InterfaceC3251z8 b(C2669c4 c2669c4) {
        InterfaceC3251z8 ra;
        String string = c2669c4.toString();
        ra = this.b.get(string);
        if (ra == null) {
            ra = new Ra(c(c2669c4), "preferences");
            this.b.put(string, ra);
        }
        return ra;
    }

    public synchronized InterfaceC3251z8 c() {
        try {
            if (this.q == null) {
                this.q = new Sa(this.e, D8.CLIENT, l());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.q;
    }

    public synchronized InterfaceC3251z8 d() {
        return l();
    }

    public synchronized A8 e() {
        try {
            if (this.s == null) {
                this.s = new A8(r());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.s;
    }

    public synchronized B8 f() {
        try {
            if (this.r == null) {
                this.r = new B8(r());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.r;
    }

    public synchronized InterfaceC3251z8 g() {
        try {
            if (this.u == null) {
                String strA = a("metrica_multiprocess_data.db");
                Context context = this.e;
                this.u = new Ra("preferences", new M8(context, strA, new C2663bn(context, "metrica_multiprocess_data.db"), this.d.d()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.u;
    }

    public synchronized C8 h() {
        try {
            if (this.t == null) {
                this.t = new C8(r(), "permissions");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.t;
    }

    public synchronized InterfaceC3251z8 i() {
        try {
            if (this.m == null) {
                Context context = this.e;
                D8 d8 = D8.SERVICE;
                if (this.l == null) {
                    this.l = new Ra(r(), "preferences");
                }
                this.m = new Sa(context, d8, this.l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    public synchronized InterfaceC3251z8 j() {
        try {
            if (this.l == null) {
                this.l = new Ra(r(), "preferences");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public synchronized InterfaceC3226y8 n() {
        try {
            if (this.i == null) {
                this.i = new Pa(this.e, D8.SERVICE, m());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.i;
    }

    public synchronized InterfaceC3226y8 o() {
        return m();
    }

    public synchronized InterfaceC3251z8 p() {
        try {
            if (this.o == null) {
                Context context = this.e;
                D8 d8 = D8.SERVICE;
                if (this.n == null) {
                    this.n = new Ra(r(), "startup");
                }
                this.o = new Sa(context, d8, this.n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.o;
    }

    public synchronized InterfaceC3251z8 q() {
        try {
            if (this.n == null) {
                this.n = new Ra(r(), "startup");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.n;
    }

    public synchronized C3176w8 r() {
        try {
            if (this.f == null) {
                this.f = a("metrica_data.db", this.d.e());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public synchronized C3176w8 c(C2669c4 c2669c4) {
        C3176w8 c3176w8A;
        String str = "db_metrica_" + c2669c4;
        c3176w8A = this.a.get(str);
        if (c3176w8A == null) {
            c3176w8A = a(str, this.d.c());
            this.a.put(str, c3176w8A);
        }
        return c3176w8A;
    }

    public synchronized InterfaceC3226y8 b() {
        return k();
    }

    public synchronized InterfaceC3226y8 a(C2669c4 c2669c4) {
        InterfaceC3226y8 oa;
        String string = c2669c4.toString();
        oa = this.c.get(string);
        if (oa == null) {
            oa = new Oa(new N8(c(c2669c4)), "binary_data");
            this.c.put(string, oa);
        }
        return oa;
    }

    public synchronized InterfaceC3226y8 a() {
        try {
            if (this.k == null) {
                this.k = new Pa(this.e, D8.AUTO_INAPP, k());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.k;
    }

    public C3176w8 a(String str, E8 e8) {
        return new C3176w8(this.e, a(str), e8);
    }

    private String a(String str) {
        if (!U2.a(21)) {
            return str;
        }
        try {
            File noBackupFilesDir = this.e.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                return str;
            }
            this.w.getClass();
            File file = new File(noBackupFilesDir, str);
            if (!file.exists() && a(noBackupFilesDir, str)) {
                a(noBackupFilesDir, str + "-journal");
                a(noBackupFilesDir, str + "-shm");
                a(noBackupFilesDir, str + "-wal");
            }
            return file.getAbsolutePath();
        } catch (Throwable unused) {
            return str;
        }
    }

    private boolean a(File file, String str) {
        File databasePath = this.e.getDatabasePath(str);
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        this.w.getClass();
        return databasePath.renameTo(new File(file, str));
    }
}

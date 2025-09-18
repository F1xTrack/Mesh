package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Qa */
/* loaded from: classes2.dex */
public class C2877Qa {

    /* renamed from: x */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2877Qa f21977x;

    /* renamed from: a */
    private final Map<String, C3696w8> f21978a = new HashMap();

    /* renamed from: b */
    private final Map<String, InterfaceC3774z8> f21979b = new HashMap();

    /* renamed from: c */
    private final Map<String, InterfaceC3748y8> f21980c = new HashMap();

    /* renamed from: d */
    private final C3644u8 f21981d;

    /* renamed from: e */
    private final Context f21982e;

    /* renamed from: f */
    private C3696w8 f21983f;

    /* renamed from: g */
    private C3696w8 f21984g;

    /* renamed from: h */
    private InterfaceC3748y8 f21985h;

    /* renamed from: i */
    private InterfaceC3748y8 f21986i;

    /* renamed from: j */
    private InterfaceC3748y8 f21987j;

    /* renamed from: k */
    private InterfaceC3748y8 f21988k;

    /* renamed from: l */
    private InterfaceC3774z8 f21989l;

    /* renamed from: m */
    private InterfaceC3774z8 f21990m;

    /* renamed from: n */
    private InterfaceC3774z8 f21991n;

    /* renamed from: o */
    private InterfaceC3774z8 f21992o;

    /* renamed from: p */
    private InterfaceC3774z8 f21993p;

    /* renamed from: q */
    private InterfaceC3774z8 f21994q;

    /* renamed from: r */
    private C2500B8 f21995r;

    /* renamed from: s */
    private C2475A8 f21996s;

    /* renamed from: t */
    private C2525C8 f21997t;

    /* renamed from: u */
    private InterfaceC3774z8 f21998u;

    /* renamed from: v */
    private C2775M8 f21999v;

    /* renamed from: w */
    private final C2742L0 f22000w;

    public C2877Qa(Context context, C3644u8 c3644u8, C2742L0 c2742l0) {
        this.f21982e = context;
        this.f21981d = c3644u8;
        this.f22000w = c2742l0;
    }

    /* renamed from: a */
    public static C2877Qa m14815a(Context context) {
        if (f21977x == null) {
            synchronized (C2877Qa.class) {
                try {
                    if (f21977x == null) {
                        f21977x = new C2877Qa(context.getApplicationContext(), C2825O8.m14695a(), new C2742L0());
                    }
                } finally {
                }
            }
        }
        return f21977x;
    }

    /* renamed from: k */
    private InterfaceC3748y8 m14818k() {
        C3696w8 c3696w8;
        if (this.f21987j == null) {
            synchronized (this) {
                try {
                    if (this.f21984g == null) {
                        this.f21984g = m14821a("metrica_aip.db", this.f21981d.m16903a());
                    }
                    c3696w8 = this.f21984g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f21987j = new C2827Oa(new C2800N8(c3696w8), "binary_data");
        }
        return this.f21987j;
    }

    /* renamed from: l */
    private InterfaceC3774z8 m14819l() {
        C2775M8 c2775m8;
        if (this.f21993p == null) {
            synchronized (this) {
                try {
                    if (this.f21999v == null) {
                        String strM14816a = m14816a("metrica_client_data.db");
                        Context context = this.f21982e;
                        this.f21999v = new C2775M8(context, strM14816a, new C3165bn(context, "metrica_client_data.db"), this.f21981d.m16904b());
                    }
                    c2775m8 = this.f21999v;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f21993p = new C2901Ra("preferences", c2775m8);
        }
        return this.f21993p;
    }

    /* renamed from: m */
    private InterfaceC3748y8 m14820m() {
        if (this.f21985h == null) {
            this.f21985h = new C2827Oa(new C2800N8(m14839r()), "binary_data");
        }
        return this.f21985h;
    }

    /* renamed from: b */
    public synchronized InterfaceC3774z8 m14825b(C3172c4 c3172c4) {
        InterfaceC3774z8 c2901Ra;
        String string = c3172c4.toString();
        c2901Ra = this.f21979b.get(string);
        if (c2901Ra == null) {
            c2901Ra = new C2901Ra(m14826c(c3172c4), "preferences");
            this.f21979b.put(string, c2901Ra);
        }
        return c2901Ra;
    }

    /* renamed from: c */
    public synchronized InterfaceC3774z8 m14827c() {
        try {
            if (this.f21994q == null) {
                this.f21994q = new C2926Sa(this.f21982e, EnumC2550D8.CLIENT, m14819l());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21994q;
    }

    /* renamed from: d */
    public synchronized InterfaceC3774z8 m14828d() {
        return m14819l();
    }

    /* renamed from: e */
    public synchronized C2475A8 m14829e() {
        try {
            if (this.f21996s == null) {
                this.f21996s = new C2475A8(m14839r());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21996s;
    }

    /* renamed from: f */
    public synchronized C2500B8 m14830f() {
        try {
            if (this.f21995r == null) {
                this.f21995r = new C2500B8(m14839r());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21995r;
    }

    /* renamed from: g */
    public synchronized InterfaceC3774z8 m14831g() {
        try {
            if (this.f21998u == null) {
                String strM14816a = m14816a("metrica_multiprocess_data.db");
                Context context = this.f21982e;
                this.f21998u = new C2901Ra("preferences", new C2775M8(context, strM14816a, new C3165bn(context, "metrica_multiprocess_data.db"), this.f21981d.m16906d()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21998u;
    }

    /* renamed from: h */
    public synchronized C2525C8 m14832h() {
        try {
            if (this.f21997t == null) {
                this.f21997t = new C2525C8(m14839r(), "permissions");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21997t;
    }

    /* renamed from: i */
    public synchronized InterfaceC3774z8 m14833i() {
        try {
            if (this.f21990m == null) {
                Context context = this.f21982e;
                EnumC2550D8 enumC2550D8 = EnumC2550D8.SERVICE;
                if (this.f21989l == null) {
                    this.f21989l = new C2901Ra(m14839r(), "preferences");
                }
                this.f21990m = new C2926Sa(context, enumC2550D8, this.f21989l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21990m;
    }

    /* renamed from: j */
    public synchronized InterfaceC3774z8 m14834j() {
        try {
            if (this.f21989l == null) {
                this.f21989l = new C2901Ra(m14839r(), "preferences");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21989l;
    }

    /* renamed from: n */
    public synchronized InterfaceC3748y8 m14835n() {
        try {
            if (this.f21986i == null) {
                this.f21986i = new C2852Pa(this.f21982e, EnumC2550D8.SERVICE, m14820m());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21986i;
    }

    /* renamed from: o */
    public synchronized InterfaceC3748y8 m14836o() {
        return m14820m();
    }

    /* renamed from: p */
    public synchronized InterfaceC3774z8 m14837p() {
        try {
            if (this.f21992o == null) {
                Context context = this.f21982e;
                EnumC2550D8 enumC2550D8 = EnumC2550D8.SERVICE;
                if (this.f21991n == null) {
                    this.f21991n = new C2901Ra(m14839r(), "startup");
                }
                this.f21992o = new C2926Sa(context, enumC2550D8, this.f21991n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21992o;
    }

    /* renamed from: q */
    public synchronized InterfaceC3774z8 m14838q() {
        try {
            if (this.f21991n == null) {
                this.f21991n = new C2901Ra(m14839r(), "startup");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21991n;
    }

    /* renamed from: r */
    public synchronized C3696w8 m14839r() {
        try {
            if (this.f21983f == null) {
                this.f21983f = m14821a("metrica_data.db", this.f21981d.m16907e());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21983f;
    }

    /* renamed from: c */
    public synchronized C3696w8 m14826c(C3172c4 c3172c4) {
        C3696w8 c3696w8M14821a;
        String str = "db_metrica_" + c3172c4;
        c3696w8M14821a = this.f21978a.get(str);
        if (c3696w8M14821a == null) {
            c3696w8M14821a = m14821a(str, this.f21981d.m16905c());
            this.f21978a.put(str, c3696w8M14821a);
        }
        return c3696w8M14821a;
    }

    /* renamed from: b */
    public synchronized InterfaceC3748y8 m14824b() {
        return m14818k();
    }

    /* renamed from: a */
    public synchronized InterfaceC3748y8 m14823a(C3172c4 c3172c4) {
        InterfaceC3748y8 c2827Oa;
        String string = c3172c4.toString();
        c2827Oa = this.f21980c.get(string);
        if (c2827Oa == null) {
            c2827Oa = new C2827Oa(new C2800N8(m14826c(c3172c4)), "binary_data");
            this.f21980c.put(string, c2827Oa);
        }
        return c2827Oa;
    }

    /* renamed from: a */
    public synchronized InterfaceC3748y8 m14822a() {
        try {
            if (this.f21988k == null) {
                this.f21988k = new C2852Pa(this.f21982e, EnumC2550D8.AUTO_INAPP, m14818k());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21988k;
    }

    /* renamed from: a */
    public C3696w8 m14821a(String str, C2575E8 c2575e8) {
        return new C3696w8(this.f21982e, m14816a(str), c2575e8);
    }

    /* renamed from: a */
    private String m14816a(String str) {
        if (!C2968U2.m15243a(21)) {
            return str;
        }
        try {
            File noBackupFilesDir = this.f21982e.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                return str;
            }
            this.f22000w.getClass();
            File file = new File(noBackupFilesDir, str);
            if (!file.exists() && m14817a(noBackupFilesDir, str)) {
                m14817a(noBackupFilesDir, str + "-journal");
                m14817a(noBackupFilesDir, str + "-shm");
                m14817a(noBackupFilesDir, str + "-wal");
            }
            return file.getAbsolutePath();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private boolean m14817a(File file, String str) {
        File databasePath = this.f21982e.getDatabasePath(str);
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        this.f22000w.getClass();
        return databasePath.renameTo(new File(file, str));
    }
}

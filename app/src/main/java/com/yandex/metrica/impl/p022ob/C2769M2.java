package com.yandex.metrica.impl.p022ob;

import java.util.HashSet;

/* renamed from: com.yandex.metrica.impl.ob.M2 */
/* loaded from: classes2.dex */
public class C2769M2 {

    /* renamed from: a */
    private final a f21700a;

    /* renamed from: b */
    private Boolean f21701b;

    /* renamed from: c */
    private final HashSet<String> f21702c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f21703d = new HashSet<>();

    /* renamed from: com.yandex.metrica.impl.ob.M2$a */
    public interface a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.M2$b */
    public static class b implements a {

        /* renamed from: a */
        private final C2676I9 f21704a;

        public b(C2676I9 c2676i9) {
            this.f21704a = c2676i9;
        }

        /* renamed from: a */
        public void m14600a(boolean z) {
            this.f21704a.m14317b(z).m14258c();
        }

        /* renamed from: a */
        public Boolean m14599a() {
            return this.f21704a.m14324e();
        }
    }

    public C2769M2(a aVar) {
        this.f21700a = aVar;
        this.f21701b = ((b) aVar).m14599a();
    }

    /* renamed from: b */
    private boolean m14592b() {
        Boolean bool = this.f21701b;
        return bool == null ? !this.f21702c.isEmpty() || this.f21703d.isEmpty() : bool.booleanValue();
    }

    /* renamed from: a */
    public synchronized void m14593a(Boolean bool) {
        try {
            if (C2968U2.m15244a(bool) || this.f21701b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f21701b = Boolean.valueOf(zEquals);
                ((b) this.f21700a).m14600a(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public synchronized boolean m14596c() {
        Boolean bool;
        try {
            bool = this.f21701b;
        } finally {
        }
        return bool == null ? this.f21703d.isEmpty() && this.f21702c.isEmpty() : bool.booleanValue();
    }

    /* renamed from: d */
    public synchronized boolean m14597d() {
        return m14592b();
    }

    /* renamed from: e */
    public synchronized boolean m14598e() {
        return m14592b();
    }

    /* renamed from: a */
    public synchronized void m14594a(String str, Boolean bool) {
        try {
            if (C2968U2.m15244a(bool) || (!this.f21703d.contains(str) && !this.f21702c.contains(str))) {
                Boolean bool2 = Boolean.TRUE;
                if (bool == null) {
                    bool = bool2;
                }
                if (bool.booleanValue()) {
                    this.f21703d.add(str);
                    this.f21702c.remove(str);
                } else {
                    this.f21702c.add(str);
                    this.f21703d.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized boolean m14595a() {
        Boolean bool;
        try {
            bool = this.f21701b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f21703d.isEmpty() : bool.booleanValue();
    }
}

package com.yandex.metrica.impl.ob;

import java.util.HashSet;

/* loaded from: classes2.dex */
public class M2 {
    private final a a;
    private Boolean b;
    private final HashSet<String> c = new HashSet<>();
    private final HashSet<String> d = new HashSet<>();

    public interface a {
    }

    public static class b implements a {
        private final I9 a;

        public b(I9 i9) {
            this.a = i9;
        }

        public void a(boolean z) {
            this.a.b(z).c();
        }

        public Boolean a() {
            return this.a.e();
        }
    }

    public M2(a aVar) {
        this.a = aVar;
        this.b = ((b) aVar).a();
    }

    private boolean b() {
        Boolean bool = this.b;
        return bool == null ? !this.c.isEmpty() || this.d.isEmpty() : bool.booleanValue();
    }

    public synchronized void a(Boolean bool) {
        try {
            if (U2.a(bool) || this.b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.b = Boolean.valueOf(zEquals);
                ((b) this.a).a(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean c() {
        Boolean bool;
        try {
            bool = this.b;
        } finally {
        }
        return bool == null ? this.d.isEmpty() && this.c.isEmpty() : bool.booleanValue();
    }

    public synchronized boolean d() {
        return b();
    }

    public synchronized boolean e() {
        return b();
    }

    public synchronized void a(String str, Boolean bool) {
        try {
            if (U2.a(bool) || (!this.d.contains(str) && !this.c.contains(str))) {
                Boolean bool2 = Boolean.TRUE;
                if (bool == null) {
                    bool = bool2;
                }
                if (bool.booleanValue()) {
                    this.d.add(str);
                    this.c.remove(str);
                } else {
                    this.c.add(str);
                    this.d.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean a() {
        Boolean bool;
        try {
            bool = this.b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.d.isEmpty() : bool.booleanValue();
    }
}

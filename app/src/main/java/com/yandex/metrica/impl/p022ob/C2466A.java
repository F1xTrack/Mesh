package com.yandex.metrica.impl.p022ob;

import android.util.Pair;

/* renamed from: com.yandex.metrica.impl.ob.A */
/* loaded from: classes2.dex */
public class C2466A {

    /* renamed from: a */
    private C2639Gm f20821a;

    /* renamed from: b */
    private long f20822b;

    /* renamed from: c */
    private boolean f20823c;

    /* renamed from: d */
    private final C2765Ln f20824d;

    /* renamed from: com.yandex.metrica.impl.ob.A$a */
    public static final class a {

        /* renamed from: a */
        public final String f20825a;

        /* renamed from: b */
        public final long f20826b;

        public a(String str, long j) {
            this.f20825a = str;
            this.f20826b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f20826b != aVar.f20826b) {
                return false;
            }
            String str = this.f20825a;
            String str2 = aVar.f20825a;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f20825a;
            int iHashCode = str != null ? str.hashCode() : 0;
            long j = this.f20826b;
            return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
        }
    }

    public C2466A(String str, long j, C2689Im c2689Im) {
        this(str, j, new C2765Ln(c2689Im, "[App Environment]"));
    }

    /* renamed from: a */
    public synchronized void m13836a(Pair<String, String> pair) {
        if (this.f20824d.m14557b(this.f20821a, (String) pair.first, (String) pair.second)) {
            this.f20823c = true;
        }
    }

    /* renamed from: b */
    public synchronized void m13837b() {
        this.f20821a = new C2639Gm();
    }

    public synchronized String toString() {
        return "Map size " + this.f20821a.size() + ". Is changed " + this.f20823c + ". Current revision " + this.f20822b;
    }

    public C2466A(String str, long j, C2765Ln c2765Ln) {
        this.f20822b = j;
        try {
            this.f20821a = new C2639Gm(str);
        } catch (Throwable unused) {
            this.f20821a = new C2639Gm();
        }
        this.f20824d = c2765Ln;
    }

    /* renamed from: a */
    public synchronized a m13835a() {
        try {
            if (this.f20823c) {
                this.f20822b++;
                this.f20823c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new a(C3762ym.m17305g(this.f20821a), this.f20822b);
    }
}

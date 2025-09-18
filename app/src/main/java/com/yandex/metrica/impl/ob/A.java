package com.yandex.metrica.impl.ob;

import android.util.Pair;

/* loaded from: classes2.dex */
public class A {
    private Gm a;
    private long b;
    private boolean c;
    private final Ln d;

    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b) {
                return false;
            }
            String str = this.a;
            String str2 = aVar.a;
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
            String str = this.a;
            int iHashCode = str != null ? str.hashCode() : 0;
            long j = this.b;
            return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
        }
    }

    public A(String str, long j, Im im) {
        this(str, j, new Ln(im, "[App Environment]"));
    }

    public synchronized void a(Pair<String, String> pair) {
        if (this.d.b(this.a, (String) pair.first, (String) pair.second)) {
            this.c = true;
        }
    }

    public synchronized void b() {
        this.a = new Gm();
    }

    public synchronized String toString() {
        return "Map size " + this.a.size() + ". Is changed " + this.c + ". Current revision " + this.b;
    }

    public A(String str, long j, Ln ln) {
        this.b = j;
        try {
            this.a = new Gm(str);
        } catch (Throwable unused) {
            this.a = new Gm();
        }
        this.d = ln;
    }

    public synchronized a a() {
        try {
            if (this.c) {
                this.b++;
                this.c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new a(C3240ym.g(this.a), this.b);
    }
}

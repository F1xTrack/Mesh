package com.my.tracker.obfuscated;

import android.os.SystemClock;
import defpackage.RunnableC4054gv1;
import defpackage.RunnableC4245hv1;
import defpackage.RunnableC5212iv1;
import defpackage.RunnableC5338ja;
import defpackage.RunnableC5493kO;
import defpackage.RunnableC7819wa;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j2 {
    final q a;
    final x2 b;
    protected b3 h = b3.j;
    final a c = b();
    final k0 d = new k0();
    final c e = new c();
    final y f = new y();
    final i g = new i();

    public final class a {
        final int[] a = {0};
        final int[] b = {0};

        public a() {
        }

        private boolean d(int i) {
            for (int i2 : this.b) {
                if (i == i2) {
                    y2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        private boolean e(int i) {
            for (int i2 : this.a) {
                if (i == i2) {
                    y2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        public boolean a(int i) {
            StringBuilder sb;
            String str;
            if (e(i)) {
                return false;
            }
            if (j2.this.e.b(i)) {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!j2.this.d.b(i) && !j2.this.f.a(i)) {
                    return true;
                }
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            y2.c(sb.toString());
            return false;
        }

        public boolean b(int i) {
            StringBuilder sb;
            String str;
            if (e(i)) {
                return false;
            }
            if (j2.this.d.b(i)) {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!j2.this.e.b(i) && !j2.this.f.a(i)) {
                    return true;
                }
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            y2.c(sb.toString());
            return false;
        }

        public boolean c(int i) {
            if (d(i)) {
                return false;
            }
            if (!j2.this.d.b(i) && !j2.this.e.b(i)) {
                return true;
            }
            y2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have another type timespent with this id)");
            return false;
        }
    }

    public j2(long j, q qVar) {
        this.a = qVar;
        this.b = x2.a(j, new RunnableC4054gv1(this, 0));
        y2.a("TimeSpentCore: created");
    }

    public synchronized r2 a(long j, long j2) {
        r2 r2Var;
        y2.a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j2);
        boolean zC = this.g.c();
        ArrayList arrayListA = this.f.a();
        ArrayList arrayListA2 = this.e.a(j, zC);
        ArrayList arrayListA3 = this.d.a(j, zC);
        f2 f2VarA = this.g.a(j);
        ArrayList arrayList = new ArrayList(arrayListA2.size() + arrayListA3.size());
        arrayList.addAll(arrayListA2);
        arrayList.addAll(arrayListA3);
        r2Var = new r2(j2, f2VarA, (f2[]) arrayList.toArray(new f2[0]), (w[]) arrayListA.toArray(new w[0]));
        if (y2.a()) {
            y2.a("TimeSpentCore: collected DTO data:\n" + r2Var);
        }
        return r2Var;
    }

    public a b() {
        return new a();
    }

    public synchronized void c() {
        y2.a("TimeSpentCore: ***** start generating zero tick *****");
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f.b(0);
        b(jUptimeMillis, jCurrentTimeMillis, this.h);
        y2.a("TimeSpentCore: ***** zero tick generated *****");
    }

    /* renamed from: d */
    public synchronized void h(long j, int i) {
        try {
            this.d.b(i, j, this.g.c());
        } catch (Exception unused) {
        }
    }

    public void a() {
        m.c(new RunnableC4054gv1(this, 1));
    }

    /* renamed from: b */
    public synchronized void c(int i) {
        if (this.c.c(i)) {
            this.f.b(i);
            if (this.b.b()) {
                y2.a("TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)");
                this.b.e();
            }
        }
    }

    /* renamed from: c */
    public synchronized void g(long j, int i) {
        try {
            this.e.b(i, j, this.g.c());
            if (this.g.b() && this.e.b() == 0) {
                this.g.g(j);
                y2.a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");
            }
        } catch (Exception unused) {
        }
    }

    public void e() {
        m.c(new RunnableC5212iv1(this, SystemClock.uptimeMillis(), 1));
    }

    public void f() {
        m.c(new RunnableC5493kO(this, SystemClock.uptimeMillis(), System.currentTimeMillis(), 1));
    }

    public void a(int i) {
        m.c(new RunnableC5338ja(this, i, 16));
    }

    /* renamed from: b */
    public synchronized void d(long j) {
        y2.a("TimeSpentCore: ***** app is going to foreground *****");
        if (this.g.c()) {
            y2.a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");
            return;
        }
        this.d.e(j);
        this.e.e(j);
        this.g.e(j);
        this.g.d();
        this.d.c(j);
        this.e.c(j);
        this.g.c(j);
        if (this.b.b()) {
            y2.a("TimeSpentCore: starting ticker... (reason: app going to foreground)");
            this.b.e();
        }
        y2.a("TimeSpentCore: ***** app is on foreground *****");
    }

    public void d() {
        m.c(new RunnableC5212iv1(this, SystemClock.uptimeMillis(), 0));
    }

    /* renamed from: a */
    public synchronized void c(long j) {
        y2.a("TimeSpentCore: ***** app is going to background *****");
        if (this.g.b()) {
            y2.a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");
            return;
        }
        this.d.d(j);
        this.e.d(j);
        this.g.d(j);
        this.g.a(this.e.b());
        this.d.b(j);
        this.e.b(j);
        this.g.b(j);
        y2.a("TimeSpentCore: ***** app is on background *****");
    }

    public synchronized void b(long j, long j2, b3 b3Var) {
        try {
            y2.a("TimeSpentCore: ***** onTick started ***** timestamp = " + j2);
            if (this.g.b() && this.e.b() == 0 && this.b.a()) {
                y2.a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");
                this.b.f();
            }
            r2 r2VarA = a(j, j2);
            y2.a("TimeSpentCore: ***** onTick finished *****");
            this.a.a(r2VarA, b3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(long j, long j2, b3 b3Var) {
        this.b.d();
        b(j, j2, b3Var);
    }

    /* renamed from: b */
    public synchronized void f(long j, int i) {
        if (this.c.b(i)) {
            this.d.a(i, j, this.g.c());
        }
    }

    public /* synthetic */ void b(long j, long j2) {
        b(j, j2, this.h);
    }

    /* renamed from: a */
    public synchronized void e(long j, int i) {
        if (this.c.a(i)) {
            this.e.a(i, j, this.g.c());
            if (this.g.b() && this.e.b() == 1) {
                this.g.h(j);
                y2.a("TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background");
                this.b.e();
                y2.a("TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)");
            }
        }
    }

    public /* synthetic */ void a(b3 b3Var, long j, long j2) {
        if (l.a(this.h.g, b3Var.g) != 0) {
            a(j, j2, this.h);
        }
        this.h = b3Var;
    }

    public void b(b3 b3Var) {
        this.h = b3Var;
    }

    public void a(b3 b3Var) {
        m.c(new RunnableC7819wa(this, b3Var, SystemClock.uptimeMillis(), System.currentTimeMillis(), 2));
    }

    public void b(int i, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        m.c(z ? new RunnableC4245hv1(this, jUptimeMillis, i, 3) : new RunnableC4245hv1(this, jUptimeMillis, i, 0));
    }

    public void a(int i, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        m.c(z ? new RunnableC4245hv1(this, jUptimeMillis, i, 1) : new RunnableC4245hv1(this, jUptimeMillis, i, 2));
    }
}

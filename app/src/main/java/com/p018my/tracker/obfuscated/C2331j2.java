package com.p018my.tracker.obfuscated;

import android.os.SystemClock;
import java.util.ArrayList;
import p000.RunnableC6246ja;
import p000.RunnableC6297kO;
import p000.RunnableC7084wa;
import p000.RunnableC9558gv1;
import p000.RunnableC9686hv1;
import p000.RunnableC9814iv1;

/* renamed from: com.my.tracker.obfuscated.j2 */
/* loaded from: classes2.dex */
public final class C2331j2 {

    /* renamed from: a */
    final InterfaceC2356q f19995a;

    /* renamed from: b */
    final C2387x2 f19996b;

    /* renamed from: h */
    protected C2298b3 f20002h = C2298b3.f19772j;

    /* renamed from: c */
    final a f19997c = m13244b();

    /* renamed from: d */
    final C2333k0 f19998d = new C2333k0();

    /* renamed from: e */
    final C2299c f19999e = new C2299c();

    /* renamed from: f */
    final C2388y f20000f = new C2388y();

    /* renamed from: g */
    final C2324i f20001g = new C2324i();

    /* renamed from: com.my.tracker.obfuscated.j2$a */
    public final class a {

        /* renamed from: a */
        final int[] f20003a = {0};

        /* renamed from: b */
        final int[] f20004b = {0};

        public a() {
        }

        /* renamed from: d */
        private boolean m13257d(int i) {
            for (int i2 : this.f20004b) {
                if (i == i2) {
                    AbstractC2391y2.m13574c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        private boolean m13258e(int i) {
            for (int i2 : this.f20003a) {
                if (i == i2) {
                    AbstractC2391y2.m13574c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean m13259a(int i) {
            StringBuilder sb;
            String str;
            if (m13258e(i)) {
                return false;
            }
            if (C2331j2.this.f19999e.m13191b(i)) {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!C2331j2.this.f19998d.m13191b(i) && !C2331j2.this.f20000f.m13558a(i)) {
                    return true;
                }
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            AbstractC2391y2.m13574c(sb.toString());
            return false;
        }

        /* renamed from: b */
        public boolean m13260b(int i) {
            StringBuilder sb;
            String str;
            if (m13258e(i)) {
                return false;
            }
            if (C2331j2.this.f19998d.m13191b(i)) {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!C2331j2.this.f19999e.m13191b(i) && !C2331j2.this.f20000f.m13558a(i)) {
                    return true;
                }
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            AbstractC2391y2.m13574c(sb.toString());
            return false;
        }

        /* renamed from: c */
        public boolean m13261c(int i) {
            if (m13257d(i)) {
                return false;
            }
            if (!C2331j2.this.f19998d.m13191b(i) && !C2331j2.this.f19999e.m13191b(i)) {
                return true;
            }
            AbstractC2391y2.m13574c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have another type timespent with this id)");
            return false;
        }
    }

    public C2331j2(long j, InterfaceC2356q interfaceC2356q) {
        this.f19995a = interfaceC2356q;
        this.f19996b = C2387x2.m13547a(j, new RunnableC9558gv1(this, 0));
        AbstractC2391y2.m13568a("TimeSpentCore: created");
    }

    /* renamed from: a */
    public synchronized C2363r2 m13236a(long j, long j2) {
        C2363r2 c2363r2;
        AbstractC2391y2.m13568a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j2);
        boolean zM13199c = this.f20001g.m13199c();
        ArrayList arrayListM13557a = this.f20000f.m13557a();
        ArrayList arrayListM12796a = this.f19999e.m12796a(j, zM13199c);
        ArrayList arrayListM13265a = this.f19998d.m13265a(j, zM13199c);
        InterfaceC2315f2 interfaceC2315f2M13194a = this.f20001g.m13194a(j);
        ArrayList arrayList = new ArrayList(arrayListM12796a.size() + arrayListM13265a.size());
        arrayList.addAll(arrayListM12796a);
        arrayList.addAll(arrayListM13265a);
        c2363r2 = new C2363r2(j2, interfaceC2315f2M13194a, (InterfaceC2315f2[]) arrayList.toArray(new InterfaceC2315f2[0]), (InterfaceC2380w[]) arrayListM13557a.toArray(new InterfaceC2380w[0]));
        if (AbstractC2391y2.m13571a()) {
            AbstractC2391y2.m13568a("TimeSpentCore: collected DTO data:\n" + c2363r2);
        }
        return c2363r2;
    }

    /* renamed from: b */
    public a m13244b() {
        return new a();
    }

    /* renamed from: c */
    public synchronized void m13251c() {
        AbstractC2391y2.m13568a("TimeSpentCore: ***** start generating zero tick *****");
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f20000f.m13559b(0);
        m13249b(jUptimeMillis, jCurrentTimeMillis, this.f20002h);
        AbstractC2391y2.m13568a("TimeSpentCore: ***** zero tick generated *****");
    }

    /* renamed from: d */
    public synchronized void m13233h(long j, int i) {
        try {
            this.f19998d.m13268b(i, j, this.f20001g.m13199c());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m13237a() {
        AbstractC2340m.m13292c(new RunnableC9558gv1(this, 1));
    }

    /* renamed from: b */
    public synchronized void m13222c(int i) {
        if (this.f19997c.m13261c(i)) {
            this.f20000f.m13559b(i);
            if (this.f19996b.m13552b()) {
                AbstractC2391y2.m13568a("TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)");
                this.f19996b.m13554e();
            }
        }
    }

    /* renamed from: c */
    public synchronized void m13231g(long j, int i) {
        try {
            this.f19999e.m12799b(i, j, this.f20001g.m13199c());
            if (this.f20001g.m13197b() && this.f19999e.m13190b() == 0) {
                this.f20001g.m13204g(j);
                AbstractC2391y2.m13568a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public void m13255e() {
        AbstractC2340m.m13292c(new RunnableC9814iv1(this, SystemClock.uptimeMillis(), 1));
    }

    /* renamed from: f */
    public void m13256f() {
        AbstractC2340m.m13292c(new RunnableC6297kO(this, SystemClock.uptimeMillis(), System.currentTimeMillis(), 1));
    }

    /* renamed from: a */
    public void m13238a(int i) {
        AbstractC2340m.m13292c(new RunnableC6246ja(this, i, 16));
    }

    /* renamed from: b */
    public synchronized void m13225d(long j) {
        AbstractC2391y2.m13568a("TimeSpentCore: ***** app is going to foreground *****");
        if (this.f20001g.m13199c()) {
            AbstractC2391y2.m13568a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");
            return;
        }
        this.f19998d.m13272e(j);
        this.f19999e.m12804e(j);
        this.f20001g.m13202e(j);
        this.f20001g.m13200d();
        this.f19998d.m13270c(j);
        this.f19999e.m12802c(j);
        this.f20001g.m13198c(j);
        if (this.f19996b.m13552b()) {
            AbstractC2391y2.m13568a("TimeSpentCore: starting ticker... (reason: app going to foreground)");
            this.f19996b.m13554e();
        }
        AbstractC2391y2.m13568a("TimeSpentCore: ***** app is on foreground *****");
    }

    /* renamed from: d */
    public void m13253d() {
        AbstractC2340m.m13292c(new RunnableC9814iv1(this, SystemClock.uptimeMillis(), 0));
    }

    /* renamed from: a */
    public synchronized void m13223c(long j) {
        AbstractC2391y2.m13568a("TimeSpentCore: ***** app is going to background *****");
        if (this.f20001g.m13197b()) {
            AbstractC2391y2.m13568a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");
            return;
        }
        this.f19998d.m13271d(j);
        this.f19999e.m12803d(j);
        this.f20001g.m13201d(j);
        this.f20001g.m13195a(this.f19999e.m13190b());
        this.f19998d.m13269b(j);
        this.f19999e.m12800b(j);
        this.f20001g.m13196b(j);
        AbstractC2391y2.m13568a("TimeSpentCore: ***** app is on background *****");
    }

    /* renamed from: b */
    public synchronized void m13249b(long j, long j2, C2298b3 c2298b3) {
        try {
            AbstractC2391y2.m13568a("TimeSpentCore: ***** onTick started ***** timestamp = " + j2);
            if (this.f20001g.m13197b() && this.f19999e.m13190b() == 0 && this.f19996b.m13551a()) {
                AbstractC2391y2.m13568a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");
                this.f19996b.m13555f();
            }
            C2363r2 c2363r2M13236a = m13236a(j, j2);
            AbstractC2391y2.m13568a("TimeSpentCore: ***** onTick finished *****");
            this.f19995a.mo3168a(c2363r2M13236a, c2298b3);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void m13242a(long j, long j2, C2298b3 c2298b3) {
        this.f19996b.m13553d();
        m13249b(j, j2, c2298b3);
    }

    /* renamed from: b */
    public synchronized void m13229f(long j, int i) {
        if (this.f19997c.m13260b(i)) {
            this.f19998d.m13266a(i, j, this.f20001g.m13199c());
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m13220b(long j, long j2) {
        m13249b(j, j2, this.f20002h);
    }

    /* renamed from: a */
    public synchronized void m13227e(long j, int i) {
        if (this.f19997c.m13259a(i)) {
            this.f19999e.m12797a(i, j, this.f20001g.m13199c());
            if (this.f20001g.m13197b() && this.f19999e.m13190b() == 1) {
                this.f20001g.m13205h(j);
                AbstractC2391y2.m13568a("TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background");
                this.f19996b.m13554e();
                AbstractC2391y2.m13568a("TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)");
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m13218a(C2298b3 c2298b3, long j, long j2) {
        if (AbstractC2336l.m13285a(this.f20002h.f19779g, c2298b3.f19779g) != 0) {
            m13242a(j, j2, this.f20002h);
        }
        this.f20002h = c2298b3;
    }

    /* renamed from: b */
    public void m13250b(C2298b3 c2298b3) {
        this.f20002h = c2298b3;
    }

    /* renamed from: a */
    public void m13243a(C2298b3 c2298b3) {
        AbstractC2340m.m13292c(new RunnableC7084wa(this, c2298b3, SystemClock.uptimeMillis(), System.currentTimeMillis(), 2));
    }

    /* renamed from: b */
    public void m13246b(int i, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AbstractC2340m.m13292c(z ? new RunnableC9686hv1(this, jUptimeMillis, i, 3) : new RunnableC9686hv1(this, jUptimeMillis, i, 0));
    }

    /* renamed from: a */
    public void m13239a(int i, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AbstractC2340m.m13292c(z ? new RunnableC9686hv1(this, jUptimeMillis, i, 1) : new RunnableC9686hv1(this, jUptimeMillis, i, 2));
    }
}

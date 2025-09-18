package defpackage;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644Ia {
    public final ExecutorC5715lY0 a;
    public final C8036xj d;
    public final J01 e;
    public final long f;
    public boolean i;
    public ExecutorC5715lY0 j;
    public C0999Mo1 k;
    public C6257oO l;
    public C3383dO1 m;
    public C0566Ha n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public final int v;
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public int g = 1;
    public EnumC7465uj h = EnumC7465uj.b;
    public long u = 0;

    public C0644Ia(C7062sc c7062sc, ExecutorC5715lY0 executorC5715lY0, Context context) throws C0722Ja {
        ExecutorC5715lY0 executorC5715lY02 = new ExecutorC5715lY0(executorC5715lY0);
        this.a = executorC5715lY02;
        this.f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            C8036xj c8036xj = new C8036xj(new C1033Na(c7062sc, context), c7062sc);
            this.d = c8036xj;
            C1016Mu0 c1016Mu0 = new C1016Mu0(4, this);
            AbstractC3377dM1.i(!c8036xj.a.get(), "AudioStream can not be started when setCallback.");
            c8036xj.a();
            c8036xj.d.execute(new RunnableC1557Ts1(c8036xj, c1016Mu0, executorC5715lY02, 6));
            this.e = new J01(c7062sc);
            this.v = c7062sc.d;
        } catch (C0800Ka | IllegalArgumentException e) {
            throw new C0722Ja("Unable to create AudioStream", e);
        }
    }

    public final void a() {
        ExecutorC5715lY0 executorC5715lY0 = this.j;
        C0999Mo1 c0999Mo1 = this.k;
        if (executorC5715lY0 == null || c0999Mo1 == null) {
            return;
        }
        boolean z = this.r || this.o || this.q;
        if (Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executorC5715lY0.execute(new RunnableC8389za(c0999Mo1, z, 1));
    }

    public final void b(C6257oO c6257oO) {
        C6257oO c6257oO2 = this.l;
        EnumC7465uj enumC7465uj = null;
        if (c6257oO2 != null) {
            C0566Ha c0566Ha = this.n;
            Objects.requireNonNull(c0566Ha);
            c6257oO2.l(c0566Ha);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = EnumC7465uj.b;
            e();
        }
        if (c6257oO != null) {
            this.l = c6257oO;
            this.n = new C0566Ha(this, c6257oO);
            this.m = new C3383dO1(this, 5, c6257oO);
            try {
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0G = c6257oO.g();
                if (((C0599Hl) interfaceFutureC0750Jj0G).b.isDone()) {
                    enumC7465uj = (EnumC7465uj) ((C0599Hl) interfaceFutureC0750Jj0G).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (enumC7465uj != null) {
                this.h = enumC7465uj;
                e();
            }
            this.l.a(this.a, this.n);
        }
    }

    public final void c() {
        C6257oO c6257oO = this.l;
        Objects.requireNonNull(c6257oO);
        C0599Hl c0599HlB = AbstractC8171yQ1.b(new C5684lO(c6257oO, 1));
        C3383dO1 c3383dO1 = this.m;
        Objects.requireNonNull(c3383dO1);
        AbstractC1500Sz1.a(c0599HlB, c3383dO1, this.a);
    }

    public final void d() {
        if (this.i) {
            this.i = false;
            AbstractC0759Jm0.f("AudioSource");
            C8036xj c8036xj = this.d;
            c8036xj.a();
            if (c8036xj.a.getAndSet(false)) {
                c8036xj.d.execute(new RunnableC7656vj(c8036xj, 0));
            }
        }
    }

    public final void e() {
        if (this.g != 2) {
            d();
            return;
        }
        boolean z = this.h == EnumC7465uj.a;
        boolean z2 = !z;
        ExecutorC5715lY0 executorC5715lY0 = this.j;
        C0999Mo1 c0999Mo1 = this.k;
        if (executorC5715lY0 != null && c0999Mo1 != null && this.c.getAndSet(z2) != z2) {
            executorC5715lY0.execute(new G4(c0999Mo1, z2));
        }
        if (!z) {
            d();
            return;
        }
        if (this.i) {
            return;
        }
        try {
            AbstractC0759Jm0.f("AudioSource");
            this.d.c();
            this.o = false;
        } catch (C0800Ka unused) {
            AbstractC0759Jm0.f("AudioSource");
            this.o = true;
            J01 j01 = this.e;
            j01.a();
            if (!j01.a.getAndSet(true)) {
                j01.f = System.nanoTime();
            }
            this.p = System.nanoTime();
            a();
        }
        this.i = true;
        c();
    }
}

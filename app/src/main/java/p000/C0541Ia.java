package p000;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Ia */
/* loaded from: classes.dex */
public final class C0541Ia {

    /* renamed from: a */
    public final ExecutorC10151lY0 f4993a;

    /* renamed from: d */
    public final C7156xj f4996d;

    /* renamed from: e */
    public final J01 f4997e;

    /* renamed from: f */
    public final long f4998f;

    /* renamed from: i */
    public boolean f5001i;

    /* renamed from: j */
    public ExecutorC10151lY0 f5002j;

    /* renamed from: k */
    public C7967Mo1 f5003k;

    /* renamed from: l */
    public C6549oO f5004l;

    /* renamed from: m */
    public C9108dO1 f5005m;

    /* renamed from: n */
    public C0478Ha f5006n;

    /* renamed from: o */
    public boolean f5007o;

    /* renamed from: p */
    public long f5008p;

    /* renamed from: q */
    public boolean f5009q;

    /* renamed from: r */
    public boolean f5010r;

    /* renamed from: s */
    public byte[] f5011s;

    /* renamed from: t */
    public double f5012t;

    /* renamed from: v */
    public final int f5014v;

    /* renamed from: b */
    public final AtomicReference f4994b = new AtomicReference(null);

    /* renamed from: c */
    public final AtomicBoolean f4995c = new AtomicBoolean(false);

    /* renamed from: g */
    public int f4999g = 1;

    /* renamed from: h */
    public EnumC6967uj f5000h = EnumC6967uj.f43810b;

    /* renamed from: u */
    public long f5013u = 0;

    public C0541Ia(C6834sc c6834sc, ExecutorC10151lY0 executorC10151lY0, Context context) throws C0604Ja {
        ExecutorC10151lY0 executorC10151lY02 = new ExecutorC10151lY0(executorC10151lY0);
        this.f4993a = executorC10151lY02;
        this.f4998f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            C7156xj c7156xj = new C7156xj(new C0855Na(c6834sc, context), c6834sc);
            this.f4996d = c7156xj;
            C7978Mu0 c7978Mu0 = new C7978Mu0(4, this);
            AbstractC9104dM1.m17550i(!c7156xj.f45746a.get(), "AudioStream can not be started when setCallback.");
            c7156xj.m25929a();
            c7156xj.f45749d.execute(new RunnableC8339Ts1(c7156xj, c7978Mu0, executorC10151lY02, 6));
            this.f4997e = new J01(c6834sc);
            this.f5014v = c6834sc.f42499d;
        } catch (C0667Ka | IllegalArgumentException e) {
            throw new C0604Ja("Unable to create AudioStream", e);
        }
    }

    /* renamed from: a */
    public final void m3938a() {
        ExecutorC10151lY0 executorC10151lY0 = this.f5002j;
        C7967Mo1 c7967Mo1 = this.f5003k;
        if (executorC10151lY0 == null || c7967Mo1 == null) {
            return;
        }
        boolean z = this.f5010r || this.f5007o || this.f5009q;
        if (Objects.equals(this.f4994b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executorC10151lY0.execute(new RunnableC7273za(c7967Mo1, z, 1));
    }

    /* renamed from: b */
    public final void m3939b(C6549oO c6549oO) {
        C6549oO c6549oO2 = this.f5004l;
        EnumC6967uj enumC6967uj = null;
        if (c6549oO2 != null) {
            C0478Ha c0478Ha = this.f5006n;
            Objects.requireNonNull(c0478Ha);
            c6549oO2.mo1481l(c0478Ha);
            this.f5004l = null;
            this.f5006n = null;
            this.f5005m = null;
            this.f5000h = EnumC6967uj.f43810b;
            m3942e();
        }
        if (c6549oO != null) {
            this.f5004l = c6549oO;
            this.f5006n = new C0478Ha(this, c6549oO);
            this.f5005m = new C9108dO1(this, 5, c6549oO);
            try {
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0Mo1480g = c6549oO.mo1480g();
                if (((C0489Hl) interfaceFutureC7800Jj0Mo1480g).f4484b.isDone()) {
                    enumC6967uj = (EnumC6967uj) ((C0489Hl) interfaceFutureC7800Jj0Mo1480g).f4484b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (enumC6967uj != null) {
                this.f5000h = enumC6967uj;
                m3942e();
            }
            this.f5004l.mo1479a(this.f4993a, this.f5006n);
        }
    }

    /* renamed from: c */
    public final void m3940c() {
        C6549oO c6549oO = this.f5004l;
        Objects.requireNonNull(c6549oO);
        C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new C6360lO(c6549oO, 1));
        C9108dO1 c9108dO1 = this.f5005m;
        Objects.requireNonNull(c9108dO1);
        AbstractC8301Sz1.m7478a(c0489HlM26149b, c9108dO1, this.f4993a);
    }

    /* renamed from: d */
    public final void m3941d() {
        if (this.f5001i) {
            this.f5001i = false;
            AbstractC7806Jm0.m4412f("AudioSource");
            C7156xj c7156xj = this.f4996d;
            c7156xj.m25929a();
            if (c7156xj.f45746a.getAndSet(false)) {
                c7156xj.f45749d.execute(new RunnableC7030vj(c7156xj, 0));
            }
        }
    }

    /* renamed from: e */
    public final void m3942e() {
        if (this.f4999g != 2) {
            m3941d();
            return;
        }
        boolean z = this.f5000h == EnumC6967uj.f43809a;
        boolean z2 = !z;
        ExecutorC10151lY0 executorC10151lY0 = this.f5002j;
        C7967Mo1 c7967Mo1 = this.f5003k;
        if (executorC10151lY0 != null && c7967Mo1 != null && this.f4995c.getAndSet(z2) != z2) {
            executorC10151lY0.execute(new RunnableC0383G4(c7967Mo1, z2));
        }
        if (!z) {
            m3941d();
            return;
        }
        if (this.f5001i) {
            return;
        }
        try {
            AbstractC7806Jm0.m4412f("AudioSource");
            this.f4996d.m25931c();
            this.f5007o = false;
        } catch (C0667Ka unused) {
            AbstractC7806Jm0.m4412f("AudioSource");
            this.f5007o = true;
            J01 j01 = this.f4997e;
            j01.m4104a();
            if (!j01.f5252a.getAndSet(true)) {
                j01.f5257f = System.nanoTime();
            }
            this.f5008p = System.nanoTime();
            m3938a();
        }
        this.f5001i = true;
        m3940c();
    }
}

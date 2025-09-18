package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xj */
/* loaded from: classes.dex */
public final class C7156xj implements InterfaceC0729La {

    /* renamed from: a */
    public final AtomicBoolean f45746a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f45747b = new AtomicBoolean(false);

    /* renamed from: c */
    public final ConcurrentLinkedQueue f45748c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final ExecutorC10151lY0 f45749d;

    /* renamed from: e */
    public final Object f45750e;

    /* renamed from: f */
    public C7093wj f45751f;

    /* renamed from: g */
    public final C0855Na f45752g;

    /* renamed from: h */
    public final int f45753h;

    /* renamed from: i */
    public final int f45754i;

    /* renamed from: j */
    public final int f45755j;

    /* renamed from: k */
    public final AtomicBoolean f45756k;

    /* renamed from: l */
    public int f45757l;

    public C7156xj(C0855Na c0855Na, C6834sc c6834sc) {
        ExecutorC4251ia executorC4251ia;
        if (ExecutorC4251ia.f29323c != null) {
            executorC4251ia = ExecutorC4251ia.f29323c;
        } else {
            synchronized (ExecutorC4251ia.class) {
                try {
                    if (ExecutorC4251ia.f29323c == null) {
                        ExecutorC4251ia.f29323c = new ExecutorC4251ia();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            executorC4251ia = ExecutorC4251ia.f29323c;
        }
        this.f45749d = new ExecutorC10151lY0(executorC4251ia);
        this.f45750e = new Object();
        this.f45751f = null;
        this.f45756k = new AtomicBoolean(false);
        this.f45752g = c0855Na;
        int iM24749a = c6834sc.m24749a();
        this.f45753h = iM24749a;
        int i = c6834sc.f42497b;
        this.f45754i = i;
        AbstractC9104dM1.m17545d("mBytesPerFrame must be greater than 0.", ((long) iM24749a) > 0);
        AbstractC9104dM1.m17545d("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.f45755j = 500;
        this.f45757l = iM24749a * 1024;
    }

    /* renamed from: a */
    public final void m25929a() {
        AbstractC9104dM1.m17550i(!this.f45747b.get(), "AudioStream has been released.");
    }

    /* renamed from: b */
    public final void m25930b() {
        if (this.f45756k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f45757l);
            C7093wj c7093wj = new C7093wj(byteBufferAllocateDirect, this.f45752g.read(byteBufferAllocateDirect), this.f45753h, this.f45754i);
            int i = this.f45755j;
            synchronized (this.f45750e) {
                try {
                    this.f45748c.offer(c7093wj);
                    while (this.f45748c.size() > i) {
                        this.f45748c.poll();
                        AbstractC7806Jm0.m4412f("BufferedAudioStream");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f45756k.get()) {
                this.f45749d.execute(new RunnableC7030vj(this, 2));
            }
        }
    }

    /* renamed from: c */
    public final void m25931c() {
        m25929a();
        AtomicBoolean atomicBoolean = this.f45746a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new RunnableC7030vj(this, 1), null);
        this.f45749d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new C0667Ka(e);
        }
    }

    @Override // p000.InterfaceC0729La
    public final C7023vc read(ByteBuffer byteBuffer) throws InterruptedException {
        boolean z;
        m25929a();
        AbstractC9104dM1.m17550i(this.f45746a.get(), "AudioStream has not been started.");
        this.f45749d.execute(new RunnableC6246ja(this, byteBuffer.remaining(), 1));
        C7023vc c7023vc = new C7023vc(0, 0L);
        do {
            synchronized (this.f45750e) {
                try {
                    C7093wj c7093wj = this.f45751f;
                    this.f45751f = null;
                    if (c7093wj == null) {
                        c7093wj = (C7093wj) this.f45748c.poll();
                    }
                    if (c7093wj != null) {
                        c7023vc = c7093wj.m25674a(byteBuffer);
                        if (c7093wj.f45044c.remaining() > 0) {
                            this.f45751f = c7093wj;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = c7023vc.f44446a <= 0 && this.f45746a.get() && !this.f45747b.get();
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    AbstractC7806Jm0.m4412f("BufferedAudioStream");
                }
            }
        } while (z);
        return c7023vc;
    }
}

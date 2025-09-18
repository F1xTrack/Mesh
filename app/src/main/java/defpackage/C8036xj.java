package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xj */
/* loaded from: classes.dex */
public final class C8036xj implements InterfaceC0878La {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final ExecutorC5715lY0 d;
    public final Object e;
    public C7846wj f;
    public final C1033Na g;
    public final int h;
    public final int i;
    public final int j;
    public final AtomicBoolean k;
    public int l;

    public C8036xj(C1033Na c1033Na, C7062sc c7062sc) {
        ExecutorC4371ia executorC4371ia;
        if (ExecutorC4371ia.c != null) {
            executorC4371ia = ExecutorC4371ia.c;
        } else {
            synchronized (ExecutorC4371ia.class) {
                try {
                    if (ExecutorC4371ia.c == null) {
                        ExecutorC4371ia.c = new ExecutorC4371ia();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            executorC4371ia = ExecutorC4371ia.c;
        }
        this.d = new ExecutorC5715lY0(executorC4371ia);
        this.e = new Object();
        this.f = null;
        this.k = new AtomicBoolean(false);
        this.g = c1033Na;
        int iA = c7062sc.a();
        this.h = iA;
        int i = c7062sc.b;
        this.i = i;
        AbstractC3377dM1.d("mBytesPerFrame must be greater than 0.", ((long) iA) > 0);
        AbstractC3377dM1.d("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.j = 500;
        this.l = iA * 1024;
    }

    public final void a() {
        AbstractC3377dM1.i(!this.b.get(), "AudioStream has been released.");
    }

    public final void b() {
        if (this.k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.l);
            C7846wj c7846wj = new C7846wj(byteBufferAllocateDirect, this.g.read(byteBufferAllocateDirect), this.h, this.i);
            int i = this.j;
            synchronized (this.e) {
                try {
                    this.c.offer(c7846wj);
                    while (this.c.size() > i) {
                        this.c.poll();
                        AbstractC0759Jm0.f("BufferedAudioStream");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.get()) {
                this.d.execute(new RunnableC7656vj(this, 2));
            }
        }
    }

    public final void c() {
        a();
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new RunnableC7656vj(this, 1), null);
        this.d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new C0800Ka(e);
        }
    }

    @Override // defpackage.InterfaceC0878La
    public final C7635vc read(ByteBuffer byteBuffer) throws InterruptedException {
        boolean z;
        a();
        AbstractC3377dM1.i(this.a.get(), "AudioStream has not been started.");
        this.d.execute(new RunnableC5338ja(this, byteBuffer.remaining(), 1));
        C7635vc c7635vc = new C7635vc(0, 0L);
        do {
            synchronized (this.e) {
                try {
                    C7846wj c7846wj = this.f;
                    this.f = null;
                    if (c7846wj == null) {
                        c7846wj = (C7846wj) this.c.poll();
                    }
                    if (c7846wj != null) {
                        c7635vc = c7846wj.a(byteBuffer);
                        if (c7846wj.c.remaining() > 0) {
                            this.f = c7846wj;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = c7635vc.a <= 0 && this.a.get() && !this.b.get();
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    AbstractC0759Jm0.f("BufferedAudioStream");
                }
            }
        } while (z);
        return c7635vc;
    }
}

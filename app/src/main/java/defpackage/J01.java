package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class J01 implements InterfaceC0878La {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final int c;
    public final int d;
    public byte[] e;
    public long f;

    public J01(C7062sc c7062sc) {
        this.c = c7062sc.a();
        this.d = c7062sc.b;
    }

    public final void a() {
        AbstractC3377dM1.i(!this.b.get(), "AudioStream has been released.");
    }

    @Override // defpackage.InterfaceC0878La
    public final C7635vc read(ByteBuffer byteBuffer) throws InterruptedException {
        a();
        AbstractC3377dM1.i(this.a.get(), "AudioStream has not been started.");
        long jRemaining = byteBuffer.remaining();
        int i = this.c;
        long jC = AbstractC4146hO1.c(i, jRemaining);
        long j = i;
        AbstractC3377dM1.d("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * jC);
        if (i2 <= 0) {
            return new C7635vc(0, this.f);
        }
        long jB = this.f + AbstractC4146hO1.b(this.d, jC);
        long jNanoTime = jB - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException unused) {
                AbstractC0759Jm0.f("SilentAudioStream");
            }
        }
        AbstractC3377dM1.i(i2 <= byteBuffer.remaining(), null);
        byte[] bArr = this.e;
        if (bArr == null || bArr.length < i2) {
            this.e = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.e, 0, i2).limit(iPosition + i2).position(iPosition);
        C7635vc c7635vc = new C7635vc(i2, this.f);
        this.f = jB;
        return c7635vc;
    }
}

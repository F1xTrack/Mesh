package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class J01 implements InterfaceC0729La {

    /* renamed from: a */
    public final AtomicBoolean f5252a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f5253b = new AtomicBoolean(false);

    /* renamed from: c */
    public final int f5254c;

    /* renamed from: d */
    public final int f5255d;

    /* renamed from: e */
    public byte[] f5256e;

    /* renamed from: f */
    public long f5257f;

    public J01(C6834sc c6834sc) {
        this.f5254c = c6834sc.m24749a();
        this.f5255d = c6834sc.f42497b;
    }

    /* renamed from: a */
    public final void m4104a() {
        AbstractC9104dM1.m17550i(!this.f5253b.get(), "AudioStream has been released.");
    }

    @Override // p000.InterfaceC0729La
    public final C7023vc read(ByteBuffer byteBuffer) throws InterruptedException {
        m4104a();
        AbstractC9104dM1.m17550i(this.f5252a.get(), "AudioStream has not been started.");
        long jRemaining = byteBuffer.remaining();
        int i = this.f5254c;
        long jM18815c = AbstractC9620hO1.m18815c(i, jRemaining);
        long j = i;
        AbstractC9104dM1.m17545d("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * jM18815c);
        if (i2 <= 0) {
            return new C7023vc(0, this.f5257f);
        }
        long jM18814b = this.f5257f + AbstractC9620hO1.m18814b(this.f5255d, jM18815c);
        long jNanoTime = jM18814b - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException unused) {
                AbstractC7806Jm0.m4412f("SilentAudioStream");
            }
        }
        AbstractC9104dM1.m17550i(i2 <= byteBuffer.remaining(), null);
        byte[] bArr = this.f5256e;
        if (bArr == null || bArr.length < i2) {
            this.f5256e = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f5256e, 0, i2).limit(iPosition + i2).position(iPosition);
        C7023vc c7023vc = new C7023vc(i2, this.f5257f);
        this.f5257f = jM18814b;
        return c7023vc;
    }
}

package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class A9 implements InterfaceC0921Lo0 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public F3 c;
    public final AtomicReference d;
    public final FC e;
    public boolean f;

    public A9(MediaCodec mediaCodec, HandlerThread handlerThread) {
        FC fc = new FC();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = fc;
        this.d = new AtomicReference();
    }

    public static C8308z9 d() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C8308z9();
                }
                return (C8308z9) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(C8308z9 c8308z9) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(c8308z9);
        }
    }

    @Override // defpackage.InterfaceC0921Lo0
    public final void a(Bundle bundle) {
        i();
        F3 f3 = this.c;
        int i = AbstractC0277Dh1.a;
        f3.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.InterfaceC0921Lo0
    public final void b(int i, C6218oB c6218oB, long j, int i2) {
        i();
        C8308z9 c8308z9D = d();
        c8308z9D.a = i;
        c8308z9D.b = 0;
        c8308z9D.d = j;
        c8308z9D.e = i2;
        int i3 = c6218oB.f;
        MediaCodec.CryptoInfo cryptoInfo = c8308z9D.c;
        cryptoInfo.numSubSamples = i3;
        int[] iArr = c6218oB.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c6218oB.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c6218oB.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c6218oB.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c6218oB.c;
        if (AbstractC0277Dh1.a >= 24) {
            AbstractC3876g.q();
            cryptoInfo.setPattern(AbstractC3876g.h(c6218oB.g, c6218oB.h));
        }
        this.c.obtainMessage(2, c8308z9D).sendToTarget();
    }

    @Override // defpackage.InterfaceC0921Lo0
    public final void c(int i, int i2, int i3, long j) {
        i();
        C8308z9 c8308z9D = d();
        c8308z9D.a = i;
        c8308z9D.b = i2;
        c8308z9D.d = j;
        c8308z9D.e = i3;
        F3 f3 = this.c;
        int i4 = AbstractC0277Dh1.a;
        f3.obtainMessage(1, c8308z9D).sendToTarget();
    }

    @Override // defpackage.InterfaceC0921Lo0
    public final void flush() {
        if (this.f) {
            try {
                F3 f3 = this.c;
                f3.getClass();
                f3.removeCallbacksAndMessages(null);
                FC fc = this.e;
                fc.d();
                F3 f32 = this.c;
                f32.getClass();
                f32.obtainMessage(3).sendToTarget();
                synchronized (fc) {
                    while (!fc.a) {
                        fc.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.InterfaceC0921Lo0
    public final void i() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.InterfaceC0921Lo0
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.InterfaceC0921Lo0
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new F3(this, handlerThread.getLooper(), 1);
        this.f = true;
    }
}

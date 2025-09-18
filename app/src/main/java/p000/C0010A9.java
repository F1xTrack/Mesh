package p000;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: A9 */
/* loaded from: classes.dex */
public final class C0010A9 implements InterfaceC7914Lo0 {

    /* renamed from: g */
    public static final ArrayDeque f83g = new ArrayDeque();

    /* renamed from: h */
    public static final Object f84h = new Object();

    /* renamed from: a */
    public final MediaCodec f85a;

    /* renamed from: b */
    public final HandlerThread f86b;

    /* renamed from: c */
    public HandlerC0319F3 f87c;

    /* renamed from: d */
    public final AtomicReference f88d;

    /* renamed from: e */
    public final C0328FC f89e;

    /* renamed from: f */
    public boolean f90f;

    public C0010A9(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0328FC c0328fc = new C0328FC();
        this.f85a = mediaCodec;
        this.f86b = handlerThread;
        this.f89e = c0328fc;
        this.f88d = new AtomicReference();
    }

    /* renamed from: d */
    public static C7246z9 m85d() {
        ArrayDeque arrayDeque = f83g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C7246z9();
                }
                return (C7246z9) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public static void m86e(C7246z9 c7246z9) {
        ArrayDeque arrayDeque = f83g;
        synchronized (arrayDeque) {
            arrayDeque.add(c7246z9);
        }
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: a */
    public final void mo87a(Bundle bundle) {
        mo90i();
        HandlerC0319F3 handlerC0319F3 = this.f87c;
        int i = AbstractC7485Dh1.f2166a;
        handlerC0319F3.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: b */
    public final void mo88b(int i, C6536oB c6536oB, long j, int i2) {
        mo90i();
        C7246z9 c7246z9M85d = m85d();
        c7246z9M85d.f46661a = i;
        c7246z9M85d.f46662b = 0;
        c7246z9M85d.f46664d = j;
        c7246z9M85d.f46665e = i2;
        int i3 = c6536oB.f38858f;
        MediaCodec.CryptoInfo cryptoInfo = c7246z9M85d.f46663c;
        cryptoInfo.numSubSamples = i3;
        int[] iArr = c6536oB.f38856d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c6536oB.f38857e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c6536oB.f38854b;
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
        byte[] bArr2 = c6536oB.f38853a;
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
        cryptoInfo.mode = c6536oB.f38855c;
        if (AbstractC7485Dh1.f2166a >= 24) {
            AbstractC4088g.m18364q();
            cryptoInfo.setPattern(AbstractC4088g.m18355h(c6536oB.f38859g, c6536oB.f38860h));
        }
        this.f87c.obtainMessage(2, c7246z9M85d).sendToTarget();
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: c */
    public final void mo89c(int i, int i2, int i3, long j) {
        mo90i();
        C7246z9 c7246z9M85d = m85d();
        c7246z9M85d.f46661a = i;
        c7246z9M85d.f46662b = i2;
        c7246z9M85d.f46664d = j;
        c7246z9M85d.f46665e = i3;
        HandlerC0319F3 handlerC0319F3 = this.f87c;
        int i4 = AbstractC7485Dh1.f2166a;
        handlerC0319F3.obtainMessage(1, c7246z9M85d).sendToTarget();
    }

    @Override // p000.InterfaceC7914Lo0
    public final void flush() {
        if (this.f90f) {
            try {
                HandlerC0319F3 handlerC0319F3 = this.f87c;
                handlerC0319F3.getClass();
                handlerC0319F3.removeCallbacksAndMessages(null);
                C0328FC c0328fc = this.f89e;
                c0328fc.m2549d();
                HandlerC0319F3 handlerC0319F32 = this.f87c;
                handlerC0319F32.getClass();
                handlerC0319F32.obtainMessage(3).sendToTarget();
                synchronized (c0328fc) {
                    while (!c0328fc.f3086a) {
                        c0328fc.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p000.InterfaceC7914Lo0
    /* renamed from: i */
    public final void mo90i() {
        RuntimeException runtimeException = (RuntimeException) this.f88d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p000.InterfaceC7914Lo0
    public final void shutdown() {
        if (this.f90f) {
            flush();
            this.f86b.quit();
        }
        this.f90f = false;
    }

    @Override // p000.InterfaceC7914Lo0
    public final void start() {
        if (this.f90f) {
            return;
        }
        HandlerThread handlerThread = this.f86b;
        handlerThread.start();
        this.f87c = new HandlerC0319F3(this, handlerThread.getLooper(), 1);
        this.f90f = true;
    }
}

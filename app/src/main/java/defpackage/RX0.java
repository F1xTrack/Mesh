package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class RX0 {
    public static final JX0 a = new JX0(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(JX0 jx0) {
        O90.f(jx0, "segment");
        if (jx0.f != null || jx0.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (jx0.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        JX0 jx02 = a;
        JX0 jx03 = (JX0) atomicReference.getAndSet(jx02);
        if (jx03 == jx02) {
            return;
        }
        int i = jx03 != null ? jx03.c : 0;
        if (i >= 65536) {
            atomicReference.set(jx03);
            return;
        }
        jx0.f = jx03;
        jx0.b = 0;
        jx0.c = i + 8192;
        atomicReference.set(jx0);
    }

    public static final JX0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        JX0 jx0 = a;
        JX0 jx02 = (JX0) atomicReference.getAndSet(jx0);
        if (jx02 == jx0) {
            return new JX0();
        }
        if (jx02 == null) {
            atomicReference.set(null);
            return new JX0();
        }
        atomicReference.set(jx02.f);
        jx02.f = null;
        jx02.c = 0;
        return jx02;
    }
}

package p000;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class RX0 {

    /* renamed from: a */
    public static final JX0 f10261a = new JX0(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f10262b;

    /* renamed from: c */
    public static final AtomicReference[] f10263c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10262b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f10263c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m7031a(JX0 jx0) {
        O90.m5968f(jx0, "segment");
        if (jx0.f5584f != null || jx0.f5585g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (jx0.f5582d) {
            return;
        }
        AtomicReference atomicReference = f10263c[(int) (Thread.currentThread().getId() & (f10262b - 1))];
        JX0 jx02 = f10261a;
        JX0 jx03 = (JX0) atomicReference.getAndSet(jx02);
        if (jx03 == jx02) {
            return;
        }
        int i = jx03 != null ? jx03.f5581c : 0;
        if (i >= 65536) {
            atomicReference.set(jx03);
            return;
        }
        jx0.f5584f = jx03;
        jx0.f5580b = 0;
        jx0.f5581c = i + 8192;
        atomicReference.set(jx0);
    }

    /* renamed from: b */
    public static final JX0 m7032b() {
        AtomicReference atomicReference = f10263c[(int) (Thread.currentThread().getId() & (f10262b - 1))];
        JX0 jx0 = f10261a;
        JX0 jx02 = (JX0) atomicReference.getAndSet(jx0);
        if (jx02 == jx0) {
            return new JX0();
        }
        if (jx02 == null) {
            atomicReference.set(null);
            return new JX0();
        }
        atomicReference.set(jx02.f5584f);
        jx02.f5584f = null;
        jx02.f5581c = 0;
        return jx02;
    }
}

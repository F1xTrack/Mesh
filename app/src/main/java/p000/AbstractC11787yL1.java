package p000;

import java.nio.ByteBuffer;

/* renamed from: yL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11787yL1 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f46220a = {1, 2, 3, 4, 5, 6, 7};

    /* renamed from: a */
    public static final InterfaceC9979kC0 m26139a(C0197D7 c0197d7) {
        O90.m5968f(c0197d7, "poolFactory");
        int i = ((C9083dC0) c0197d7.f1847b).f25859c.f26593d;
        C10107lC0 c10107lC0 = new C10107lC0(i);
        for (int i2 = 0; i2 < i; i2++) {
            C6809sD c6809sD = C0644KD.f5944a;
            c10107lC0.mo4580d(ByteBuffer.allocate(16384));
        }
        return c10107lC0;
    }
}

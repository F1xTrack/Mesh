package defpackage;

import java.nio.ByteBuffer;

/* renamed from: yL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8156yL1 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};

    public static final InterfaceC5458kC0 a(D7 d7) {
        O90.f(d7, "poolFactory");
        int i = ((C3346dC0) d7.b).c.d;
        C5649lC0 c5649lC0 = new C5649lC0(i);
        for (int i2 = 0; i2 < i; i2++) {
            C6987sD c6987sD = KD.a;
            c5649lC0.d(ByteBuffer.allocate(16384));
        }
        return c5649lC0;
    }
}

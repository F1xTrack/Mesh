package p000;

import java.util.Arrays;

/* renamed from: mM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10256mM1 {
    /* renamed from: a */
    public static final C7664Gt0 m22812a(MC0... mc0Arr) {
        C7664Gt0 c7664Gt0 = new C7664Gt0(false);
        MC0[] mc0Arr2 = (MC0[]) Arrays.copyOf(mc0Arr, mc0Arr.length);
        O90.m5968f(mc0Arr2, "pairs");
        if (c7664Gt0.f3945b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        if (mc0Arr2.length <= 0) {
            return c7664Gt0;
        }
        MC0 mc0 = mc0Arr2[0];
        throw null;
    }
}

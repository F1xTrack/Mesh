package defpackage;

import java.util.Arrays;

/* renamed from: mM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5871mM1 {
    public static final C0546Gt0 a(MC0... mc0Arr) {
        C0546Gt0 c0546Gt0 = new C0546Gt0(false);
        MC0[] mc0Arr2 = (MC0[]) Arrays.copyOf(mc0Arr, mc0Arr.length);
        O90.f(mc0Arr2, "pairs");
        if (c0546Gt0.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        if (mc0Arr2.length <= 0) {
            return c0546Gt0;
        }
        MC0 mc0 = mc0Arr2[0];
        throw null;
    }
}

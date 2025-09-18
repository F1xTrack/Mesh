package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: rF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6802rF implements InterfaceC6396p61 {
    public static final long a = TimeUnit.MINUTES.toMillis(5);

    @Override // defpackage.InterfaceC6396p61
    public final Object get() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
        return new C6342oq0(i, Integer.MAX_VALUE, a, i, i / 8);
    }
}

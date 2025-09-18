package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: rF */
/* loaded from: classes.dex */
public final class C6731rF implements InterfaceC10608p61 {

    /* renamed from: a */
    public static final long f41396a = TimeUnit.MINUTES.toMillis(5);

    @Override // p000.InterfaceC10608p61
    public final Object get() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
        return new C10571oq0(i, Integer.MAX_VALUE, f41396a, i, i / 8);
    }
}

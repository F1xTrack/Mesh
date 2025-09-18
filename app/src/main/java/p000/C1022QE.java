package p000;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* renamed from: QE */
/* loaded from: classes.dex */
public final class C1022QE implements InterfaceC10608p61 {

    /* renamed from: b */
    public static final long f9538b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a */
    public final ActivityManager f9539a;

    public C1022QE(ActivityManager activityManager) {
        this.f9539a = activityManager;
    }

    @Override // p000.InterfaceC10608p61
    public final Object get() {
        int iMin = Math.min(this.f9539a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new C10571oq0(iMin < 33554432 ? 4194304 : iMin < 67108864 ? 6291456 : iMin / 4, 256, f9538b, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}

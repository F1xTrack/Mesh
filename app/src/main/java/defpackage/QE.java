package defpackage;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class QE implements InterfaceC6396p61 {
    public static final long b = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager a;

    public QE(ActivityManager activityManager) {
        this.a = activityManager;
    }

    @Override // defpackage.InterfaceC6396p61
    public final Object get() {
        int iMin = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new C6342oq0(iMin < 33554432 ? 4194304 : iMin < 67108864 ? 6291456 : iMin / 4, 256, b, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}

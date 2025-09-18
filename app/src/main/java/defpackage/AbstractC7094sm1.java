package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: sm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7094sm1 {
    public static final /* synthetic */ int a = 0;

    static {
        O90.e(TE.M("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        O90.f(context, "context");
        O90.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        O90.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (C7285tm1.a) {
        }
        O90.e(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}

package p000;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: sm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11076sm1 {

    /* renamed from: a */
    public static final /* synthetic */ int f42593a = 0;

    static {
        O90.m5967e(C1210TE.m7637M("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    /* renamed from: a */
    public static final PowerManager.WakeLock m24777a(Context context, String str) {
        O90.m5968f(context, "context");
        O90.m5968f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (C11204tm1.f43249a) {
        }
        O90.m5967e(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}

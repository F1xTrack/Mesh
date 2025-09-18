package p000;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: My */
/* loaded from: classes.dex */
public abstract class AbstractC0816My {
    /* renamed from: a */
    public static Intent m5487a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC3982eJ.m17902d(context), handler);
    }

    /* renamed from: b */
    public static ComponentName m5488b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}

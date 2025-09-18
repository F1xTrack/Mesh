package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import p000.C1210TE;
import p000.C7863Ko1;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        C1210TE.m7637M("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1210TE c1210teM7634G = C1210TE.m7634G();
        Objects.toString(intent);
        c1210teM7634G.getClass();
        try {
            C7863Ko1 c7863Ko1M4736d = C7863Ko1.m4736d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (C7863Ko1.f6313m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c7863Ko1M4736d.f6322i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c7863Ko1M4736d.f6322i = pendingResultGoAsync;
                    if (c7863Ko1M4736d.f6321h) {
                        pendingResultGoAsync.finish();
                        c7863Ko1M4736d.f6322i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
            C1210TE.m7634G().getClass();
        }
    }
}

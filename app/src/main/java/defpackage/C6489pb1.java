package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: pb1 */
/* loaded from: classes.dex */
public final class C6489pb1 extends BroadcastReceiver {
    public RunnableC6680qb1 a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        RunnableC6680qb1 runnableC6680qb1 = this.a;
        if (runnableC6680qb1 == null) {
            return;
        }
        if (runnableC6680qb1.c()) {
            RunnableC6680qb1 runnableC6680qb12 = this.a;
            ((C6298ob1) runnableC6680qb12.f).f.schedule(runnableC6680qb12, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}

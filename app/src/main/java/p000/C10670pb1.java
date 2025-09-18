package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: pb1 */
/* loaded from: classes.dex */
public final class C10670pb1 extends BroadcastReceiver {

    /* renamed from: a */
    public RunnableC10798qb1 f40230a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        RunnableC10798qb1 runnableC10798qb1 = this.f40230a;
        if (runnableC10798qb1 == null) {
            return;
        }
        if (runnableC10798qb1.m24027c()) {
            RunnableC10798qb1 runnableC10798qb12 = this.f40230a;
            ((C10542ob1) runnableC10798qb12.f41055f).f39119f.schedule(runnableC10798qb12, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f40230a = null;
        }
    }
}

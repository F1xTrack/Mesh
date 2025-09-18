package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.C1210TE;
import p000.C7863Ko1;
import p000.RunnableC1192Sx;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f16584a = 0;

    static {
        C1210TE.m7637M("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            C7863Ko1.m4736d(context).f6317d.m9154x(new RunnableC1192Sx(intent, context, goAsync(), 0));
        } else {
            C1210TE.m7634G().getClass();
        }
    }
}

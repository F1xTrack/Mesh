package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* renamed from: Rx */
/* loaded from: classes.dex */
public abstract class AbstractC1129Rx extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f10492a = 0;

    static {
        C1210TE.m7637M("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1210TE c1210teM7634G = C1210TE.m7634G();
        Objects.toString(intent);
        c1210teM7634G.getClass();
        int i = C0875Nu.f8119e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}

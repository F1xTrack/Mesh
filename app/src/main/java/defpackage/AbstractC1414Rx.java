package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* renamed from: Rx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1414Rx extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    static {
        TE.M("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        TE teG = TE.G();
        Objects.toString(intent);
        teG.getClass();
        int i = C1093Nu.e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}

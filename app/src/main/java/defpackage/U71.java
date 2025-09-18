package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class U71 {
    public final ComponentName a;

    static {
        TE.M("SystemJobInfoConverter");
    }

    public U71(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}

package p000;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class U71 {

    /* renamed from: a */
    public final ComponentName f11658a;

    static {
        C1210TE.m7637M("SystemJobInfoConverter");
    }

    public U71(Context context) {
        this.f11658a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}

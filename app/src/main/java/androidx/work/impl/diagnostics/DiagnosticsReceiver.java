package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p000.C10075ky0;
import p000.C10203ly0;
import p000.C1210TE;
import p000.C7863Ko1;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        C1210TE.m7637M("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C1210TE.m7634G().getClass();
        try {
            C7863Ko1.m4736d(context).m4021a((C10203ly0) new C10075ky0(DiagnosticsWorker.class).m18675b());
        } catch (IllegalStateException unused) {
            C1210TE.m7634G().getClass();
        }
    }
}

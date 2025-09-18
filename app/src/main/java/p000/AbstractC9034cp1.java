package p000;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: cp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9034cp1 {

    /* renamed from: a */
    public static final /* synthetic */ int f25673a = 0;

    static {
        C1210TE.m7637M("WorkerFactory");
    }

    /* renamed from: a */
    public final AbstractC8060Oj0 m17421a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        AbstractC8060Oj0 abstractC8060Oj0 = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(AbstractC8060Oj0.class);
        } catch (Throwable unused) {
            C1210TE.m7634G().getClass();
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                abstractC8060Oj0 = (AbstractC8060Oj0) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable unused2) {
                C1210TE.m7634G().getClass();
            }
        }
        if (abstractC8060Oj0 == null || !abstractC8060Oj0.isUsed()) {
            return abstractC8060Oj0;
        }
        throw new IllegalStateException(AbstractC11153tN0.m24912x("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}

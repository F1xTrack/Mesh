package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: cp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3273cp1 {
    public static final /* synthetic */ int a = 0;

    static {
        TE.M("WorkerFactory");
    }

    public final AbstractC1139Oj0 a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        AbstractC1139Oj0 abstractC1139Oj0 = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(AbstractC1139Oj0.class);
        } catch (Throwable unused) {
            TE.G().getClass();
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                abstractC1139Oj0 = (AbstractC1139Oj0) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable unused2) {
                TE.G().getClass();
            }
        }
        if (abstractC1139Oj0 == null || !abstractC1139Oj0.isUsed()) {
            return abstractC1139Oj0;
        }
        throw new IllegalStateException(AbstractC7209tN0.x("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}

package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* renamed from: kB0 */
/* loaded from: classes.dex */
public final class C9977kB0 implements InterfaceC10608p61 {

    /* renamed from: a */
    public final Context f36346a;

    /* renamed from: b */
    public final Z60 f36347b;

    /* renamed from: c */
    public final C10919rY0 f36348c;

    public C9977kB0(Context context) {
        C6479nH c6479nH;
        C8940c70 c8940c70 = C8940c70.f17308t;
        ML1.m5337d(c8940c70, "ImagePipelineFactory was not initialized!");
        this.f36346a = context;
        Z60 z60M10592e = c8940c70.m10592e();
        this.f36347b = z60M10592e;
        C10919rY0 c10919rY0 = new C10919rY0(11, false);
        this.f36348c = c10919rY0;
        Resources resources = context.getResources();
        synchronized (C6479nH.class) {
            try {
                if (C6479nH.f38226f == null) {
                    C6479nH.f38226f = new C6479nH();
                }
                c6479nH = C6479nH.f38226f;
            } catch (Throwable th) {
                throw th;
            }
        }
        c8940c70.m10588a();
        if (ScheduledExecutorServiceC7689Hf1.f4396b == null) {
            ScheduledExecutorServiceC7689Hf1.f4396b = new ScheduledExecutorServiceC7689Hf1(new Handler(Looper.getMainLooper()));
        }
        ScheduledExecutorServiceC7689Hf1 scheduledExecutorServiceC7689Hf1 = ScheduledExecutorServiceC7689Hf1.f4396b;
        CC0 cc0 = z60M10592e.f14729e;
        c10919rY0.f41728b = resources;
        c10919rY0.f41729c = c6479nH;
        c10919rY0.f41730d = scheduledExecutorServiceC7689Hf1;
        c10919rY0.f41731e = cc0;
    }

    @Override // p000.InterfaceC10608p61
    /* renamed from: a */
    public final C9849jB0 get() {
        return new C9849jB0(this.f36346a, this.f36348c, this.f36347b);
    }
}

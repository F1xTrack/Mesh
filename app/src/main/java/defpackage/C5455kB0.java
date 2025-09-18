package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* renamed from: kB0 */
/* loaded from: classes.dex */
public final class C5455kB0 implements InterfaceC6396p61 {
    public final Context a;
    public final Z60 b;
    public final C6860rY0 c;

    public C5455kB0(Context context) {
        C6045nH c6045nH;
        C2455c70 c2455c70 = C2455c70.t;
        ML1.d(c2455c70, "ImagePipelineFactory was not initialized!");
        this.a = context;
        Z60 z60E = c2455c70.e();
        this.b = z60E;
        C6860rY0 c6860rY0 = new C6860rY0(11, false);
        this.c = c6860rY0;
        Resources resources = context.getResources();
        synchronized (C6045nH.class) {
            try {
                if (C6045nH.f == null) {
                    C6045nH.f = new C6045nH();
                }
                c6045nH = C6045nH.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        c2455c70.a();
        if (ScheduledExecutorServiceC0583Hf1.b == null) {
            ScheduledExecutorServiceC0583Hf1.b = new ScheduledExecutorServiceC0583Hf1(new Handler(Looper.getMainLooper()));
        }
        ScheduledExecutorServiceC0583Hf1 scheduledExecutorServiceC0583Hf1 = ScheduledExecutorServiceC0583Hf1.b;
        CC0 cc0 = z60E.e;
        c6860rY0.b = resources;
        c6860rY0.c = c6045nH;
        c6860rY0.d = scheduledExecutorServiceC0583Hf1;
        c6860rY0.e = cc0;
    }

    @Override // defpackage.InterfaceC6396p61
    /* renamed from: a */
    public final C5264jB0 get() {
        return new C5264jB0(this.a, this.c, this.b);
    }
}

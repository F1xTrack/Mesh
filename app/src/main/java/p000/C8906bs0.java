package p000;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;

/* renamed from: bs0 */
/* loaded from: classes.dex */
public final class C8906bs0 {

    /* renamed from: b */
    public static final Object f17199b = new Object();

    /* renamed from: c */
    public static C8906bs0 f17200c;

    /* renamed from: a */
    public C1002Pv f17201a;

    /* renamed from: c */
    public static C8906bs0 m10530c() {
        C8906bs0 c8906bs0;
        synchronized (f17199b) {
            Preconditions.checkState(f17200c != null, "MlKitContext has not been initialized");
            c8906bs0 = (C8906bs0) Preconditions.checkNotNull(f17200c);
        }
        return c8906bs0;
    }

    /* renamed from: d */
    public static C8906bs0 m10531d(Context context, ExecutorC0862Nh executorC0862Nh) {
        C8906bs0 c8906bs0;
        synchronized (f17199b) {
            Preconditions.checkState(f17200c == null, "MlKitContext is already initialized");
            C8906bs0 c8906bs02 = new C8906bs0();
            f17200c = c8906bs02;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListM1029M0 = new CC0(context, 9, new C7391Bm1(9, MlKitComponentDiscoveryService.class)).m1029M0();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C4262il c4262il = InterfaceC0813Mv.f7394n0;
            arrayList.addAll(arrayListM1029M0);
            arrayList2.add(C6853sv.m24811c(context, Context.class, new Class[0]));
            arrayList2.add(C6853sv.m24811c(c8906bs02, C8906bs0.class, new Class[0]));
            C1002Pv c1002Pv = new C1002Pv(executorC0862Nh, arrayList, arrayList2, c4262il);
            c8906bs02.f17201a = c1002Pv;
            c1002Pv.m6483s(true);
            c8906bs0 = f17200c;
        }
        return c8906bs0;
    }

    /* renamed from: a */
    public final Object m10532a(Class cls) {
        Preconditions.checkState(f17200c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f17201a);
        return this.f17201a.mo4066a(cls);
    }

    /* renamed from: b */
    public final Context m10533b() {
        return (Context) m10532a(Context.class);
    }
}

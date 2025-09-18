package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;

/* renamed from: bs0 */
/* loaded from: classes.dex */
public final class C2406bs0 {
    public static final Object b = new Object();
    public static C2406bs0 c;
    public C1252Pv a;

    public static C2406bs0 c() {
        C2406bs0 c2406bs0;
        synchronized (b) {
            Preconditions.checkState(c != null, "MlKitContext has not been initialized");
            c2406bs0 = (C2406bs0) Preconditions.checkNotNull(c);
        }
        return c2406bs0;
    }

    public static C2406bs0 d(Context context, ExecutorC1054Nh executorC1054Nh) {
        C2406bs0 c2406bs0;
        synchronized (b) {
            Preconditions.checkState(c == null, "MlKitContext is already initialized");
            C2406bs0 c2406bs02 = new C2406bs0();
            c = c2406bs02;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListM0 = new CC0(context, 9, new C0136Bm1(9, MlKitComponentDiscoveryService.class)).M0();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C4403il c4403il = InterfaceC1018Mv.n0;
            arrayList.addAll(arrayListM0);
            arrayList2.add(C7119sv.c(context, Context.class, new Class[0]));
            arrayList2.add(C7119sv.c(c2406bs02, C2406bs0.class, new Class[0]));
            C1252Pv c1252Pv = new C1252Pv(executorC1054Nh, arrayList, arrayList2, c4403il);
            c2406bs02.a = c1252Pv;
            c1252Pv.s(true);
            c2406bs0 = c;
        }
        return c2406bs0;
    }

    public final Object a(Class cls) {
        Preconditions.checkState(c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}

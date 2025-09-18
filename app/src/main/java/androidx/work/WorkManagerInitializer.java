package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p000.C1210TE;
import p000.C4049fN;
import p000.C6790rv;
import p000.C7863Ko1;
import p000.C8539Xo1;
import p000.InterfaceC10867r80;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC10867r80 {
    static {
        C1210TE.m7637M("WrkMgrInitializer");
    }

    @Override // p000.InterfaceC10867r80
    public final Object create(Context context) {
        C1210TE.m7634G().getClass();
        C6790rv c6790rv = new C6790rv(new C4049fN(10));
        synchronized (C7863Ko1.f6313m) {
            try {
                C7863Ko1 c7863Ko1 = C7863Ko1.f6311k;
                if (c7863Ko1 != null && C7863Ko1.f6312l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c7863Ko1 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (C7863Ko1.f6312l == null) {
                        C7863Ko1.f6312l = new C7863Ko1(applicationContext, c6790rv, new C8539Xo1((ExecutorService) c6790rv.f42154d));
                    }
                    C7863Ko1.f6311k = C7863Ko1.f6312l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C7863Ko1.m4736d(context);
    }

    @Override // p000.InterfaceC10867r80
    public final List dependencies() {
        return Collections.emptyList();
    }
}

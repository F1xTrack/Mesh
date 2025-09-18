package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC7694Hi0;
import p000.C0779MN;
import p000.C10189lr0;
import p000.C7642Gi0;
import p000.EnumC7382Bi0;
import p000.GD0;
import p000.InterfaceC10867r80;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m22267d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lr80;", "LLi0;", "<init>", "()V", "lifecycle-process_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC10867r80 {
    @Override // p000.InterfaceC10867r80
    public final Object create(Context context) {
        O90.m5968f(context, "context");
        C10189lr0 c10189lr0M22542P = C10189lr0.m22542P(context);
        O90.m5967e(c10189lr0M22542P, "getInstance(context)");
        if (!((HashSet) c10189lr0M22542P.f37324c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC7694Hi0.f4443a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            O90.m5966d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C7642Gi0());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f16292i;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f16297e = new Handler();
        processLifecycleOwner.f16298f.m10126e(EnumC7382Bi0.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        O90.m5966d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new GD0(processLifecycleOwner));
        return processLifecycleOwner;
    }

    @Override // p000.InterfaceC10867r80
    public final List dependencies() {
        return C0779MN.f7117a;
    }
}

package ru.ok.tracer.disk.usage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import defpackage.AbstractC8069xu;
import defpackage.C0299Dp;
import defpackage.C0844Ko1;
import defpackage.C1623Uo1;
import defpackage.C4061gy;
import defpackage.C5602ky0;
import defpackage.C5793ly0;
import defpackage.NA0;
import defpackage.O90;
import defpackage.SN;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.tracer.CoreTracerConfiguration;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsage;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "LTf1;", "initialize$tracer_disk_usage_release", "(Landroid/content/Context;)V", "initialize", "runNow", "context", "Landroid/content/Context;", "", "WORKER_NAME", "Ljava/lang/String;", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class DiskUsage {
    public static final DiskUsage INSTANCE = new DiskUsage();
    private static final String WORKER_NAME = "tracer.disk.usage.worker";
    private static Context context;

    private DiskUsage() {
    }

    public final void initialize$tracer_disk_usage_release(Context applicationContext) {
        boolean z;
        boolean z2;
        int i;
        O90.f(applicationContext, "applicationContext");
        context = applicationContext;
        if (!DiskUsageConfiguration.INSTANCE.get$tracer_disk_usage_release().getEnabled()) {
            Context context2 = context;
            if (context2 == null) {
                O90.o("context");
                throw null;
            }
            C0844Ko1 c0844Ko1D = C0844Ko1.d(context2);
            c0844Ko1D.d.x(new C0299Dp(c0844Ko1D, WORKER_NAME, true));
            return;
        }
        CoreTracerConfiguration.Companion companion = CoreTracerConfiguration.INSTANCE;
        if (companion.get().getDebugUpload()) {
            Context context3 = context;
            if (context3 != null) {
                C0844Ko1.d(context3).a((C5793ly0) new C5602ky0(DiskUsageWorker.class).b());
                return;
            } else {
                O90.o("context");
                throw null;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (companion.get().getDebugUpload()) {
            z = false;
            z2 = false;
            i = 1;
        } else {
            i = 3;
            z = true;
            z2 = true;
        }
        C4061gy c4061gy = new C4061gy(i, false, z, z2, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC8069xu.g0(linkedHashSet) : SN.a);
        C5602ky0 c5602ky0 = new C5602ky0(DiskUsageWorker.class, 1L, TimeUnit.DAYS);
        ((C1623Uo1) c5602ky0.c).j = c4061gy;
        NA0 na0 = (NA0) c5602ky0.b();
        Context context4 = context;
        if (context4 != null) {
            C0844Ko1.d(context4).b(WORKER_NAME, 2, na0);
        } else {
            O90.o("context");
            throw null;
        }
    }

    public final void runNow() {
        Context context2 = context;
        if (context2 != null) {
            C0844Ko1.d(context2).a((C5793ly0) new C5602ky0(DiskUsageWorker.class).b());
        } else {
            O90.o("context");
            throw null;
        }
    }

    public final void runNow(Context context2) {
        O90.f(context2, "context");
        if (O90.a(context2.getApplicationContext(), context2)) {
            runNow();
            return;
        }
        throw new IllegalArgumentException("Different context provided");
    }
}

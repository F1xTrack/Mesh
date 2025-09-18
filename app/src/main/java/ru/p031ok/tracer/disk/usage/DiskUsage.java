package ru.p031ok.tracer.disk.usage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p000.AbstractC7167xu;
import p000.C0241Dp;
import p000.C10075ky0;
import p000.C10203ly0;
import p000.C1156SN;
import p000.C4149gy;
import p000.C7863Ko1;
import p000.C8383Uo1;
import p000.NA0;
import p000.O90;
import ru.p031ok.tracer.CoreTracerConfiguration;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m22267d2 = {"Lru/ok/tracer/disk/usage/DiskUsage;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "LTf1;", "initialize$tracer_disk_usage_release", "(Landroid/content/Context;)V", "initialize", "runNow", "context", "Landroid/content/Context;", "", "WORKER_NAME", "Ljava/lang/String;", "tracer-disk-usage_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
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
        O90.m5968f(applicationContext, "applicationContext");
        context = applicationContext;
        if (!DiskUsageConfiguration.INSTANCE.get$tracer_disk_usage_release().getEnabled()) {
            Context context2 = context;
            if (context2 == null) {
                O90.m5977o("context");
                throw null;
            }
            C7863Ko1 c7863Ko1M4736d = C7863Ko1.m4736d(context2);
            c7863Ko1M4736d.f6317d.m9154x(new C0241Dp(c7863Ko1M4736d, WORKER_NAME, true));
            return;
        }
        CoreTracerConfiguration.Companion companion = CoreTracerConfiguration.INSTANCE;
        if (companion.get().getDebugUpload()) {
            Context context3 = context;
            if (context3 != null) {
                C7863Ko1.m4736d(context3).m4021a((C10203ly0) new C10075ky0(DiskUsageWorker.class).m18675b());
                return;
            } else {
                O90.m5977o("context");
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
        C4149gy c4149gy = new C4149gy(i, false, z, z2, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC7167xu.m25987g0(linkedHashSet) : C1156SN.f10705a);
        C10075ky0 c10075ky0 = new C10075ky0(DiskUsageWorker.class, 1L, TimeUnit.DAYS);
        ((C8383Uo1) c10075ky0.f28106c).f12143j = c4149gy;
        NA0 na0 = (NA0) c10075ky0.m18675b();
        Context context4 = context;
        if (context4 != null) {
            C7863Ko1.m4736d(context4).mo4022b(WORKER_NAME, 2, na0);
        } else {
            O90.m5977o("context");
            throw null;
        }
    }

    public final void runNow() {
        Context context2 = context;
        if (context2 != null) {
            C7863Ko1.m4736d(context2).m4021a((C10203ly0) new C10075ky0(DiskUsageWorker.class).m18675b());
        } else {
            O90.m5977o("context");
            throw null;
        }
    }

    public final void runNow(Context context2) {
        O90.m5968f(context2, "context");
        if (O90.m5963a(context2.getApplicationContext(), context2)) {
            runNow();
            return;
        }
        throw new IllegalArgumentException("Different context provided");
    }
}

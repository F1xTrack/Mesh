package ru.mes.dnevnik;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Process;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC0246Du;
import p000.AbstractC7222ym;
import p000.AbstractC7230yu;
import p000.C0786MU;
import p000.C4042fG;
import p000.C4049fN;
import p000.C6617pR;
import p000.C6730rE;
import p000.C7650Gm0;
import p000.C7978Mu0;
import p000.C8090Oy0;
import p000.CK0;
import p000.DK0;
import p000.EN1;
import p000.F71;
import p000.IJ0;
import p000.InterfaceC11866yz0;
import p000.O90;
import p000.QL0;
import p000.S02;
import p000.UN1;
import ru.p031ok.tracer.CoreTracerConfiguration;
import ru.p031ok.tracer.HasTracerConfiguration;
import ru.p031ok.tracer.crash.report.CrashFreeConfiguration;
import ru.p031ok.tracer.crash.report.CrashReportConfiguration;
import ru.p031ok.tracer.disk.usage.DiskUsageConfiguration;
import ru.p031ok.tracer.heap.dumps.HeapDumpConfiguration;
import ru.p031ok.tracer.profiler.sampling.SamplingProfilerConfiguration;
import ru.p031ok.tracer.profiler.systrace.SystraceProfilerConfiguration;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m22267d2 = {"Lru/mes/dnevnik/MainApplication;", "Landroid/app/Application;", "LIJ0;", "Lru/ok/tracer/HasTracerConfiguration;", "<init>", "()V", "app_moscowRelease"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MainApplication extends Application implements IJ0, HasTracerConfiguration {

    /* renamed from: a */
    public final QL0 f41951a = new QL0(this, new C7650Gm0(this));

    /* renamed from: a */
    public final CK0 m24492a() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Context applicationContext = getApplicationContext();
        O90.m5967e(applicationContext, "getApplicationContext(...)");
        QL0 ql0 = this.f41951a;
        O90.m5968f(ql0, "reactNativeHost");
        boolean zMo3152d = ql0.mo3152d();
        C7978Mu0 c7978Mu0 = new C7978Mu0(new WeakReference(applicationContext), ql0);
        C6730rE c6730rE = new C6730rE(23);
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.f17903a.register(componentFactory);
        ArrayList arrayList = ql0.f9591d;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
        try {
            Class cls = Boolean.TYPE;
            objNewInstance = ReactHostImpl.class.getConstructor(Context.class, DK0.class, ComponentFactory.class, cls, cls).newInstance(applicationContext, c7978Mu0, componentFactory, Boolean.TRUE, Boolean.valueOf(zMo3152d));
            O90.m5967e(objNewInstance, "newInstance(...)");
        } catch (NoSuchMethodException unused) {
            Class cls2 = Boolean.TYPE;
            objNewInstance = ReactHostImpl.class.getConstructor(Context.class, DK0.class, ComponentFactory.class, cls2, ReactJsExceptionHandler.class, cls2).newInstance(applicationContext, c7978Mu0, componentFactory, Boolean.TRUE, c6730rE, Boolean.valueOf(zMo3152d));
            O90.m5967e(objNewInstance, "newInstance(...)");
        }
        ql0.getJSEngineResolutionAlgorithm();
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw null;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        }
        UN1.m7999c(null);
        throw null;
    }

    @Override // ru.p031ok.tracer.HasTracerConfiguration
    public final List getTracerConfiguration() {
        CoreTracerConfiguration.Companion companion = CoreTracerConfiguration.INSTANCE;
        CoreTracerConfiguration coreTracerConfigurationBuild = new CoreTracerConfiguration.Builder().build();
        CrashReportConfiguration.Companion companion2 = CrashReportConfiguration.INSTANCE;
        CrashReportConfiguration crashReportConfigurationBuild = new CrashReportConfiguration.Builder().build();
        CrashFreeConfiguration.Companion companion3 = CrashFreeConfiguration.INSTANCE;
        CrashFreeConfiguration crashFreeConfigurationBuild = new CrashFreeConfiguration.Builder().build();
        HeapDumpConfiguration.Companion companion4 = HeapDumpConfiguration.INSTANCE;
        HeapDumpConfiguration heapDumpConfigurationBuild = new HeapDumpConfiguration.Builder().build();
        DiskUsageConfiguration.Companion companion5 = DiskUsageConfiguration.INSTANCE;
        DiskUsageConfiguration diskUsageConfigurationBuild = new DiskUsageConfiguration.Builder().build();
        SystraceProfilerConfiguration.Companion companion6 = SystraceProfilerConfiguration.INSTANCE;
        SystraceProfilerConfiguration systraceProfilerConfigurationBuild = new SystraceProfilerConfiguration.Builder().build();
        SamplingProfilerConfiguration.Companion companion7 = SamplingProfilerConfiguration.INSTANCE;
        return AbstractC7230yu.m26275f(coreTracerConfigurationBuild, crashReportConfigurationBuild, crashFreeConfigurationBuild, heapDumpConfigurationBuild, diskUsageConfigurationBuild, systraceProfilerConfigurationBuild, new SamplingProfilerConfiguration.Builder().build());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        O90.m5968f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        ArrayList arrayList = EN1.f2677a;
        if (arrayList == null) {
            F71 f71 = C6617pR.f40074b;
            List listM7145a = S02.m7145a();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listM7145a.iterator();
            while (it.hasNext()) {
                List listMo18084b = ((InterfaceC11866yz0) it.next()).mo18084b();
                O90.m5967e(listMo18084b, "createApplicationLifecycleListeners(...)");
                AbstractC0246Du.m1920m(arrayList2, listMo18084b);
            }
            EN1.f2677a = arrayList2;
            arrayList = arrayList2;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            throw AbstractC7222ym.m26227d(it2);
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        String str;
        super.onCreate();
        String string = getString(R.string.RustorePushProjectId);
        O90.m5967e(string, "getString(...)");
        C4049fN.m18224n(this, string, new C4042fG("RuStorePushClient"), null, null, false, null, null);
        C0786MU.m5378i(this);
        int iMyPid = Process.myPid();
        Object systemService = getSystemService("activity");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        O90.m5966d(runningAppProcesses, "null cannot be cast to non-null type kotlin.collections.List<android.app.ActivityManager.RunningAppProcessInfo>");
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == iMyPid) {
                str = next.processName;
                break;
            }
        }
        if (str == null ? true : getPackageName().equals(str)) {
            try {
                try {
                    SoLoader.m11071e(this, 0);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException unused) {
                Object systemService2 = getSystemService("activity");
                O90.m5966d(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
                ((ActivityManager) systemService2).clearApplicationUserData();
            }
            if (C8090Oy0.f8762c == null) {
                C8090Oy0.f8762c = new C8090Oy0();
            }
            registerActivityLifecycleCallbacks(C8090Oy0.f8762c);
            ArrayList arrayList = EN1.f2677a;
            if (arrayList == null) {
                F71 f71 = C6617pR.f40074b;
                List listM7145a = S02.m7145a();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listM7145a.iterator();
                while (it2.hasNext()) {
                    List listMo18084b = ((InterfaceC11866yz0) it2.next()).mo18084b();
                    O90.m5967e(listMo18084b, "createApplicationLifecycleListeners(...)");
                    AbstractC0246Du.m1920m(arrayList2, listMo18084b);
                }
                EN1.f2677a = arrayList2;
                arrayList = arrayList2;
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                throw AbstractC7222ym.m26227d(it3);
            }
        }
    }
}

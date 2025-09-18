package com.p018my.tracker.obfuscated;

import android.app.Application;
import com.p018my.tracker.plugins.MyTrackerPlugin;
import com.p018my.tracker.plugins.MyTrackerPluginConfig;
import com.p018my.tracker.plugins.PluginEventTracker;
import io.sentry.cache.RunnableC5994f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.o1 */
/* loaded from: classes2.dex */
public final class C2350o1 {

    /* renamed from: a */
    private final List f20075a = new ArrayList();

    /* renamed from: b */
    private final AtomicBoolean f20076b = new AtomicBoolean();

    /* renamed from: c */
    private final PluginEventTracker f20077c;

    /* renamed from: d */
    private final Application f20078d;

    private C2350o1(PluginEventTracker pluginEventTracker, Application application) {
        this.f20077c = pluginEventTracker;
        this.f20078d = application;
    }

    /* renamed from: b */
    public /* synthetic */ void m13368b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            AbstractC2391y2.m13574c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.f20077c, this.f20078d);
                this.f20075a.add(myTrackerPlugin);
                AbstractC2391y2.m13574c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    /* renamed from: a */
    public void m13369a(List list) {
        if (this.f20076b.compareAndSet(false, true)) {
            AbstractC2340m.m13290a(new RunnableC5994f(this, 9, list));
        } else {
            AbstractC2391y2.m13568a("PluginHandler: instance has already been initialized");
        }
    }

    /* renamed from: a */
    public static C2350o1 m13366a(C2313f0 c2313f0, Application application) {
        return new C2350o1(PluginEventTracker.newTracker(c2313f0), application);
    }
}

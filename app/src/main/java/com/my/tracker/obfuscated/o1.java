package com.my.tracker.obfuscated;

import android.app.Application;
import com.my.tracker.plugins.MyTrackerPlugin;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import com.my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class o1 {
    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean();
    private final PluginEventTracker c;
    private final Application d;

    private o1(PluginEventTracker pluginEventTracker, Application application) {
        this.c = pluginEventTracker;
        this.d = application;
    }

    public /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            y2.c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.c, this.d);
                this.a.add(myTrackerPlugin);
                y2.c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                y2.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    public void a(List list) {
        if (this.b.compareAndSet(false, true)) {
            m.a(new io.sentry.cache.f(this, 9, list));
        } else {
            y2.a("PluginHandler: instance has already been initialized");
        }
    }

    public static o1 a(f0 f0Var, Application application) {
        return new o1(PluginEventTracker.newTracker(f0Var), application);
    }
}

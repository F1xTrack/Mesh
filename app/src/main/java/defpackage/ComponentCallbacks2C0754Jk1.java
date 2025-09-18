package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: Jk1 */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0754Jk1 implements ComponentCallbacks2 {
    public final HashMap a;

    public ComponentCallbacks2C0754Jk1(InterfaceC0832Kk1 interfaceC0832Kk1) {
        this.a = new HashMap();
    }

    public final synchronized ViewManager a(String str) {
        ViewManager viewManager = (ViewManager) this.a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        ViewManager viewManager2 = (ViewManager) this.a.get("RCT" + str);
        if (viewManager2 != null) {
            return viewManager2;
        }
        throw new C2262b60("No ViewManager found for class " + str);
    }

    public final ViewManager b(String str) {
        throw null;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a.values());
        }
        BG bg = new BG(arrayList, 1);
        if (UiThreadUtil.isOnUiThread()) {
            bg.run();
        } else {
            UiThreadUtil.runOnUiThread(bg);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(0);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a.values());
        }
        RunnableC6133nk0 runnableC6133nk0 = new RunnableC6133nk0(13, arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            runnableC6133nk0.run();
        } else {
            UiThreadUtil.runOnUiThread(runnableC6133nk0);
        }
    }

    public ComponentCallbacks2C0754Jk1(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            map.put(viewManager.getName(), viewManager);
        }
        this.a = map;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

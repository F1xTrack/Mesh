package p000;

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
public final class ComponentCallbacks2C7803Jk1 implements ComponentCallbacks2 {

    /* renamed from: a */
    public final HashMap f5681a;

    public ComponentCallbacks2C7803Jk1(InterfaceC7855Kk1 interfaceC7855Kk1) {
        this.f5681a = new HashMap();
    }

    /* renamed from: a */
    public final synchronized ViewManager m4401a(String str) {
        ViewManager viewManager = (ViewManager) this.f5681a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        ViewManager viewManager2 = (ViewManager) this.f5681a.get("RCT" + str);
        if (viewManager2 != null) {
            return viewManager2;
        }
        throw new C8810b60("No ViewManager found for class " + str);
    }

    /* renamed from: b */
    public final ViewManager m4402b(String str) {
        throw null;
    }

    /* renamed from: c */
    public final void m4403c() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f5681a.values());
        }
        RunnableC0080BG runnableC0080BG = new RunnableC0080BG(arrayList, 1);
        if (UiThreadUtil.isOnUiThread()) {
            runnableC0080BG.run();
        } else {
            UiThreadUtil.runOnUiThread(runnableC0080BG);
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
            arrayList = new ArrayList(this.f5681a.values());
        }
        RunnableC10431nk0 runnableC10431nk0 = new RunnableC10431nk0(13, arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            runnableC10431nk0.run();
        } else {
            UiThreadUtil.runOnUiThread(runnableC10431nk0);
        }
    }

    public ComponentCallbacks2C7803Jk1(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            map.put(viewManager.getName(), viewManager);
        }
        this.f5681a = map;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

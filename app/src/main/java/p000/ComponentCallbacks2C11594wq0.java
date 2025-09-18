package p000;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: wq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C11594wq0 implements ComponentCallbacks2 {

    /* renamed from: a */
    public final CopyOnWriteArrayList f45133a = new CopyOnWriteArrayList();

    public ComponentCallbacks2C11594wq0(Application application) {
        application.getApplicationContext().registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Iterator it = this.f45133a.iterator();
        while (it.hasNext()) {
            ((MemoryPressureListener) it.next()).handleMemoryPressure(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

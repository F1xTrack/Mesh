package defpackage;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class UA0 implements D90 {
    public final ReactApplicationContext a;

    public UA0(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "context");
        this.a = reactApplicationContext;
        new LinkedList();
    }

    @Override // defpackage.D90
    public final List a() {
        return AbstractC8259yu.e(UA0.class);
    }

    @Override // defpackage.D90
    public final void b(C0777Js0 c0777Js0) {
        O90.f(c0777Js0, "moduleRegistry");
        HashMap map = c0777Js0.a;
        if (((C3815ff1) map.get(C3815ff1.class)) == null) {
            throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
        }
        C3815ff1 c3815ff1 = (C3815ff1) map.get(C3815ff1.class);
        c3815ff1.getClass();
        WeakReference weakReference = new WeakReference(this);
        WeakHashMap weakHashMap = c3815ff1.b;
        weakHashMap.put(this, new C6821rL0(1, weakReference));
        c3815ff1.a.addLifecycleEventListener((LifecycleEventListener) weakHashMap.get(this));
        O90.e(this.a.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0), "getSharedPreferences(...)");
    }

    @Override // defpackage.D90
    public final /* synthetic */ void onDestroy() {
    }
}

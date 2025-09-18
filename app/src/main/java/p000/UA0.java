package p000;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class UA0 implements D90 {

    /* renamed from: a */
    public final ReactApplicationContext f11671a;

    public UA0(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "context");
        this.f11671a = reactApplicationContext;
        new LinkedList();
    }

    @Override // p000.D90
    /* renamed from: a */
    public final List mo174a() {
        return AbstractC7230yu.m26274e(UA0.class);
    }

    @Override // p000.D90
    /* renamed from: b */
    public final void mo175b(C7818Js0 c7818Js0) {
        O90.m5968f(c7818Js0, "moduleRegistry");
        HashMap map = c7818Js0.f5762a;
        if (((C9398ff1) map.get(C9398ff1.class)) == null) {
            throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
        }
        C9398ff1 c9398ff1 = (C9398ff1) map.get(C9398ff1.class);
        c9398ff1.getClass();
        WeakReference weakReference = new WeakReference(this);
        WeakHashMap weakHashMap = c9398ff1.f27312b;
        weakHashMap.put(this, new C10893rL0(1, weakReference));
        c9398ff1.f27311a.addLifecycleEventListener((LifecycleEventListener) weakHashMap.get(this));
        O90.m5967e(this.f11671a.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0), "getSharedPreferences(...)");
    }

    @Override // p000.D90
    public final /* synthetic */ void onDestroy() {
    }
}

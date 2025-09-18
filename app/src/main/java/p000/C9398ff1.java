package p000;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ff1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9398ff1 implements D90 {

    /* renamed from: a */
    public ReactContext f27311a;

    /* renamed from: b */
    public WeakHashMap f27312b;

    @Override // p000.D90
    /* renamed from: a */
    public final List mo174a() {
        return Arrays.asList(C9398ff1.class, C9398ff1.class, C9398ff1.class);
    }

    @Override // p000.D90
    /* renamed from: b */
    public final /* synthetic */ void mo175b(C7818Js0 c7818Js0) {
    }

    @Override // p000.D90
    public final void onDestroy() {
        WeakHashMap weakHashMap = this.f27312b;
        Iterator it = new ArrayList(weakHashMap.values()).iterator();
        while (it.hasNext()) {
            ((LifecycleEventListener) it.next()).onHostDestroy();
        }
        Iterator it2 = weakHashMap.values().iterator();
        while (it2.hasNext()) {
            this.f27311a.removeLifecycleEventListener((LifecycleEventListener) it2.next());
        }
        weakHashMap.clear();
    }
}

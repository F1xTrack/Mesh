package defpackage;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ff1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3815ff1 implements D90 {
    public ReactContext a;
    public WeakHashMap b;

    @Override // defpackage.D90
    public final List a() {
        return Arrays.asList(C3815ff1.class, C3815ff1.class, C3815ff1.class);
    }

    @Override // defpackage.D90
    public final /* synthetic */ void b(C0777Js0 c0777Js0) {
    }

    @Override // defpackage.D90
    public final void onDestroy() {
        WeakHashMap weakHashMap = this.b;
        Iterator it = new ArrayList(weakHashMap.values()).iterator();
        while (it.hasNext()) {
            ((LifecycleEventListener) it.next()).onHostDestroy();
        }
        Iterator it2 = weakHashMap.values().iterator();
        while (it2.hasNext()) {
            this.a.removeLifecycleEventListener((LifecycleEventListener) it2.next());
        }
        weakHashMap.clear();
    }
}

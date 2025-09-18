package p000;

import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class M80 implements InterfaceC7516Dx0, LifecycleEventListener {

    /* renamed from: d */
    public static boolean f7003d;

    /* renamed from: a */
    public static final M80 f7000a = new M80();

    /* renamed from: b */
    public static final ArrayList f7001b = new ArrayList();

    /* renamed from: c */
    public static WeakReference f7002c = new WeakReference(null);

    /* renamed from: e */
    public static final boolean f7004e = true;

    /* renamed from: a */
    public final void m5275a(View view) {
        if (!f7003d || f7002c.get() == null) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18626u(view, this);
            f7002c = new WeakReference(view);
            f7003d = true;
        }
    }

    @Override // p000.InterfaceC7516Dx0
    /* renamed from: k */
    public final C8433Vn1 mo1953k(View view, C8433Vn1 c8433Vn1) {
        O90.m5968f(view, "v");
        C8433Vn1 c8433Vn1M24477i = f7004e ? AbstractC10944rk1.m24477i(view, c8433Vn1) : c8433Vn1;
        O90.m5965c(c8433Vn1M24477i);
        Iterator it = f7001b.iterator();
        while (it.hasNext()) {
            c8433Vn1M24477i = ((InterfaceC7516Dx0) it.next()).mo1953k(view, c8433Vn1);
            O90.m5967e(c8433Vn1M24477i, "onApplyWindowInsets(...)");
        }
        return c8433Vn1M24477i;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        View view = (View) f7002c.get();
        if (!f7003d || view == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9536gk1.m18626u(view, null);
        f7003d = false;
        f7002c.clear();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }
}

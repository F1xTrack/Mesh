package defpackage;

import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class M80 implements InterfaceC0324Dx0, LifecycleEventListener {
    public static boolean d;
    public static final M80 a = new M80();
    public static final ArrayList b = new ArrayList();
    public static WeakReference c = new WeakReference(null);
    public static final boolean e = true;

    public final void a(View view) {
        if (!d || c.get() == null) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            AbstractC4021gk1.u(view, this);
            c = new WeakReference(view);
            d = true;
        }
    }

    @Override // defpackage.InterfaceC0324Dx0
    public final C1698Vn1 k(View view, C1698Vn1 c1698Vn1) {
        O90.f(view, "v");
        C1698Vn1 c1698Vn1I = e ? AbstractC6897rk1.i(view, c1698Vn1) : c1698Vn1;
        O90.c(c1698Vn1I);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            c1698Vn1I = ((InterfaceC0324Dx0) it.next()).k(view, c1698Vn1);
            O90.e(c1698Vn1I, "onApplyWindowInsets(...)");
        }
        return c1698Vn1I;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        View view = (View) c.get();
        if (!d || view == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        AbstractC4021gk1.u(view, null);
        d = false;
        c.clear();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }
}

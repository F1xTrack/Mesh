package p000;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public abstract class ER1 {
    /* renamed from: a */
    public static int m2270a(KO0 ko0, C8142Py0 c8142Py0, View view, View view2, AbstractC11919zO0 abstractC11919zO0, boolean z) {
        if (abstractC11919zO0.m26426v() == 0 || ko0.m4625b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC11919zO0.m26400H(view) - AbstractC11919zO0.m26400H(view2)) + 1;
        }
        return Math.min(c8142Py0.m6502k(), c8142Py0.m6493b(view2) - c8142Py0.m6496e(view));
    }

    /* renamed from: b */
    public static int m2271b(KO0 ko0, C8142Py0 c8142Py0, View view, View view2, AbstractC11919zO0 abstractC11919zO0, boolean z, boolean z2) {
        if (abstractC11919zO0.m26426v() == 0 || ko0.m4625b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (ko0.m4625b() - Math.max(AbstractC11919zO0.m26400H(view), AbstractC11919zO0.m26400H(view2))) - 1) : Math.max(0, Math.min(AbstractC11919zO0.m26400H(view), AbstractC11919zO0.m26400H(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(c8142Py0.m6493b(view2) - c8142Py0.m6496e(view)) / (Math.abs(AbstractC11919zO0.m26400H(view) - AbstractC11919zO0.m26400H(view2)) + 1))) + (c8142Py0.m6501j() - c8142Py0.m6496e(view)));
        }
        return iMax;
    }

    /* renamed from: c */
    public static int m2272c(KO0 ko0, C8142Py0 c8142Py0, View view, View view2, AbstractC11919zO0 abstractC11919zO0, boolean z) {
        if (abstractC11919zO0.m26426v() == 0 || ko0.m4625b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return ko0.m4625b();
        }
        return (int) (((c8142Py0.m6493b(view2) - c8142Py0.m6496e(view)) / (Math.abs(AbstractC11919zO0.m26400H(view) - AbstractC11919zO0.m26400H(view2)) + 1)) * ko0.m4625b());
    }

    /* renamed from: d */
    public static final WritableMap m2273d(Throwable th) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", th.getMessage());
        writableMapCreateMap.putString("stacktrace", I02.m3691e(th));
        Throwable cause = th.getCause();
        if (cause != null) {
            writableMapCreateMap.putMap("cause", m2273d(cause));
        }
        return writableMapCreateMap;
    }

    /* renamed from: e */
    public static final void m2274e(C4140gp c4140gp, AbstractC6550oP abstractC6550oP) {
        Context context = c4140gp.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, c4140gp.getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(abstractC6550oP);
        }
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public abstract class ER1 {
    public static int a(KO0 ko0, C1262Py0 c1262Py0, View view, View view2, AbstractC8354zO0 abstractC8354zO0, boolean z) {
        if (abstractC8354zO0.v() == 0 || ko0.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC8354zO0.H(view) - AbstractC8354zO0.H(view2)) + 1;
        }
        return Math.min(c1262Py0.k(), c1262Py0.b(view2) - c1262Py0.e(view));
    }

    public static int b(KO0 ko0, C1262Py0 c1262Py0, View view, View view2, AbstractC8354zO0 abstractC8354zO0, boolean z, boolean z2) {
        if (abstractC8354zO0.v() == 0 || ko0.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (ko0.b() - Math.max(AbstractC8354zO0.H(view), AbstractC8354zO0.H(view2))) - 1) : Math.max(0, Math.min(AbstractC8354zO0.H(view), AbstractC8354zO0.H(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(c1262Py0.b(view2) - c1262Py0.e(view)) / (Math.abs(AbstractC8354zO0.H(view) - AbstractC8354zO0.H(view2)) + 1))) + (c1262Py0.j() - c1262Py0.e(view)));
        }
        return iMax;
    }

    public static int c(KO0 ko0, C1262Py0 c1262Py0, View view, View view2, AbstractC8354zO0 abstractC8354zO0, boolean z) {
        if (abstractC8354zO0.v() == 0 || ko0.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return ko0.b();
        }
        return (int) (((c1262Py0.b(view2) - c1262Py0.e(view)) / (Math.abs(AbstractC8354zO0.H(view) - AbstractC8354zO0.H(view2)) + 1)) * ko0.b());
    }

    public static final WritableMap d(Throwable th) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", th.getMessage());
        writableMapCreateMap.putString("stacktrace", I02.e(th));
        Throwable cause = th.getCause();
        if (cause != null) {
            writableMapCreateMap.putMap("cause", d(cause));
        }
        return writableMapCreateMap;
    }

    public static final void e(C4034gp c4034gp, AbstractC6260oP abstractC6260oP) {
        Context context = c4034gp.getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, c4034gp.getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(abstractC6260oP);
        }
    }
}

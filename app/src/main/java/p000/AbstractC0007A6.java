package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: A6 */
/* loaded from: classes.dex */
public abstract class AbstractC0007A6 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m50a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m51b(Object obj, LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6) {
        Objects.requireNonNull(layoutInflaterFactory2C0448H6);
        C7243z6 c7243z6 = new C7243z6(0, layoutInflaterFactory2C0448H6);
        AbstractC0632K1.m4503p(obj).registerOnBackInvokedCallback(1000000, c7243z6);
        return c7243z6;
    }

    /* renamed from: c */
    public static void m52c(Object obj, Object obj2) {
        AbstractC0632K1.m4503p(obj).unregisterOnBackInvokedCallback(AbstractC0632K1.m4500m(obj2));
    }
}

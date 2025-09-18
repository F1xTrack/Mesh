package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: fk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3830fk1 implements View.OnApplyWindowInsetsListener {
    public C1698Vn1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ InterfaceC0324Dx0 c;

    public ViewOnApplyWindowInsetsListenerC3830fk1(View view, InterfaceC0324Dx0 interfaceC0324Dx0) {
        this.b = view;
        this.c = interfaceC0324Dx0;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1698Vn1 c1698Vn1H = C1698Vn1.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0324Dx0 interfaceC0324Dx0 = this.c;
        if (i < 30) {
            AbstractC4021gk1.a(windowInsets, this.b);
            if (c1698Vn1H.equals(this.a)) {
                return interfaceC0324Dx0.k(view, c1698Vn1H).g();
            }
        }
        this.a = c1698Vn1H;
        C1698Vn1 c1698Vn1K = interfaceC0324Dx0.k(view, c1698Vn1H);
        if (i >= 30) {
            return c1698Vn1K.g();
        }
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        AbstractC3639ek1.c(view);
        return c1698Vn1K.g();
    }
}

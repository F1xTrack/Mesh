package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: fk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC9408fk1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C8433Vn1 f27365a = null;

    /* renamed from: b */
    public final /* synthetic */ View f27366b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7516Dx0 f27367c;

    public ViewOnApplyWindowInsetsListenerC9408fk1(View view, InterfaceC7516Dx0 interfaceC7516Dx0) {
        this.f27366b = view;
        this.f27367c = interfaceC7516Dx0;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC7516Dx0 interfaceC7516Dx0 = this.f27367c;
        if (i < 30) {
            AbstractC9536gk1.m18606a(windowInsets, this.f27366b);
            if (c8433Vn1M8551h.equals(this.f27365a)) {
                return interfaceC7516Dx0.mo1953k(view, c8433Vn1M8551h).m8557g();
            }
        }
        this.f27365a = c8433Vn1M8551h;
        C8433Vn1 c8433Vn1Mo1953k = interfaceC7516Dx0.mo1953k(view, c8433Vn1M8551h);
        if (i >= 30) {
            return c8433Vn1Mo1953k.m8557g();
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9280ek1.m18029c(view);
        return c8433Vn1Mo1953k.m8557g();
    }
}

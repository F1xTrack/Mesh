package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.swmansion.reanimated.keyboard.WindowsInsetsManager;

/* renamed from: cN */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1843cN implements InterfaceC7516Dx0 {

    /* renamed from: a */
    public final /* synthetic */ int f17452a;

    /* renamed from: b */
    public final /* synthetic */ Object f17453b;

    public /* synthetic */ C1843cN(int i, Object obj) {
        this.f17452a = i;
        this.f17453b = obj;
    }

    @Override // p000.InterfaceC7516Dx0
    /* renamed from: k */
    public final C8433Vn1 mo1953k(View view, C8433Vn1 c8433Vn1) {
        switch (this.f17452a) {
            case 0:
                C3924dN c3924dN = (C3924dN) this.f17453b;
                O90.m5968f(c3924dN, "this$0");
                O90.m5968f(view, "v");
                ViewGroup viewGroupM25184b = AbstractC11284uO1.m25184b(c3924dN.f25984a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                boolean z = c3924dN.f25989f;
                boolean z2 = true;
                boolean z3 = !z || c3924dN.f25985b;
                if (z && !c3924dN.f25986c) {
                    z2 = false;
                }
                C8277Sn1 c8277Sn1 = c8433Vn1.f12756a;
                J80 j80Mo5837f = c8277Sn1.mo5837f(2);
                O90.m5967e(j80Mo5837f, "getInsets(...)");
                J80 j80Mo5837f2 = c8277Sn1.mo5837f(7);
                O90.m5967e(j80Mo5837f2, "getInsets(...)");
                layoutParams.setMargins(j80Mo5837f.f5352a, z3 ? 0 : j80Mo5837f2.f5353b, j80Mo5837f.f5354c, z2 ? 0 : j80Mo5837f.f5355d);
                if (viewGroupM25184b != null) {
                    viewGroupM25184b.setLayoutParams(layoutParams);
                }
                C8433Vn1 c8433Vn1M24477i = AbstractC10944rk1.m24477i(view, c8433Vn1);
                O90.m5967e(c8433Vn1M24477i, "onApplyWindowInsets(...)");
                return c8433Vn1M24477i.m8556f(c8433Vn1M24477i.m8553b(), c3924dN.f25985b ? 0 : c8433Vn1M24477i.m8555d(), c8433Vn1M24477i.m8554c(), c8433Vn1M24477i.m8552a());
            default:
                return ((WindowsInsetsManager) this.f17453b).onApplyWindowInsetsListener(view, c8433Vn1);
        }
    }
}

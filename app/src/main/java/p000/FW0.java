package p000;

import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public final class FW0 implements InterfaceC7516Dx0 {
    @Override // p000.InterfaceC7516Dx0
    /* renamed from: k */
    public final C8433Vn1 mo1953k(View view, C8433Vn1 c8433Vn1) {
        O90.m5968f(view, "v");
        C8433Vn1 c8433Vn1M24477i = AbstractC10944rk1.m24477i(view, c8433Vn1);
        O90.m5967e(c8433Vn1M24477i, "onApplyWindowInsets(...)");
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            C8433Vn1 c8433Vn1M8556f = c8433Vn1M24477i.m8556f(c8433Vn1M24477i.m8553b(), 0, c8433Vn1M24477i.m8554c(), c8433Vn1M24477i.m8552a());
            O90.m5967e(c8433Vn1M8556f, "replaceSystemWindowInsets(...)");
            return c8433Vn1M8556f;
        }
        J80 j80Mo5837f = c8433Vn1M24477i.f12756a.mo5837f(1);
        O90.m5967e(j80Mo5837f, "getInsets(...)");
        AbstractC7965Mn1 c7913Ln1 = i >= 30 ? new C7913Ln1() : i >= 29 ? new C7861Kn1() : new C7809Jn1();
        c7913Ln1.mo5106c(1, J80.m4201b(j80Mo5837f.f5352a, 0, j80Mo5837f.f5354c, j80Mo5837f.f5355d));
        C8433Vn1 c8433Vn1Mo4414b = c7913Ln1.mo4414b();
        O90.m5967e(c8433Vn1Mo4414b, "build(...)");
        return c8433Vn1Mo4414b;
    }
}

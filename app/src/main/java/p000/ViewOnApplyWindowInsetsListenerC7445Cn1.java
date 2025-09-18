package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: Cn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC7445Cn1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final AbstractC7341An1 f1657a;

    /* renamed from: b */
    public C8433Vn1 f1658b;

    public ViewOnApplyWindowInsetsListenerC7445Cn1(View view, AbstractC7341An1 abstractC7341An1) {
        C8433Vn1 c8433Vn1Mo4414b;
        this.f1657a = abstractC7341An1;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        C8433Vn1 c8433Vn1M18871a = AbstractC9664hk1.m18871a(view);
        if (c8433Vn1M18871a != null) {
            int i = Build.VERSION.SDK_INT;
            c8433Vn1Mo4414b = (i >= 30 ? new C7913Ln1(c8433Vn1M18871a) : i >= 29 ? new C7861Kn1(c8433Vn1M18871a) : new C7809Jn1(c8433Vn1M18871a)).mo4414b();
        } else {
            c8433Vn1Mo4414b = null;
        }
        this.f1658b = c8433Vn1Mo4414b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C8277Sn1 c8277Sn1;
        if (!view.isLaidOut()) {
            this.f1658b = C8433Vn1.m8551h(view, windowInsets);
            return C7497Dn1.m1896i(view, windowInsets);
        }
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(view, windowInsets);
        if (this.f1658b == null) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            this.f1658b = AbstractC9664hk1.m18871a(view);
        }
        if (this.f1658b == null) {
            this.f1658b = c8433Vn1M8551h;
            return C7497Dn1.m1896i(view, windowInsets);
        }
        AbstractC7341An1 abstractC7341An1M1897j = C7497Dn1.m1897j(view);
        if (abstractC7341An1M1897j != null && Objects.equals(abstractC7341An1M1897j.mDispachedInsets, windowInsets)) {
            return C7497Dn1.m1896i(view, windowInsets);
        }
        C8433Vn1 c8433Vn1 = this.f1658b;
        int i = 1;
        int i2 = 0;
        while (true) {
            c8277Sn1 = c8433Vn1M8551h.f12756a;
            if (i > 256) {
                break;
            }
            if (!c8277Sn1.mo5837f(i).equals(c8433Vn1.f12756a.mo5837f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return C7497Dn1.m1896i(view, windowInsets);
        }
        C8433Vn1 c8433Vn12 = this.f1658b;
        C7705Hn1 c7705Hn1 = new C7705Hn1(i2, (i2 & 8) != 0 ? c8277Sn1.mo5837f(8).f5355d > c8433Vn12.f12756a.mo5837f(8).f5355d ? C7497Dn1.f2252e : C7497Dn1.f2253f : C7497Dn1.f2254g, 160L);
        c7705Hn1.f4508a.mo2781d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c7705Hn1.f4508a.mo2778a());
        J80 j80Mo5837f = c8277Sn1.mo5837f(i2);
        J80 j80Mo5837f2 = c8433Vn12.f12756a.mo5837f(i2);
        int iMin = Math.min(j80Mo5837f.f5352a, j80Mo5837f2.f5352a);
        int i3 = j80Mo5837f.f5353b;
        int i4 = j80Mo5837f2.f5353b;
        int iMin2 = Math.min(i3, i4);
        int i5 = j80Mo5837f.f5354c;
        int i6 = j80Mo5837f2.f5354c;
        int iMin3 = Math.min(i5, i6);
        int i7 = j80Mo5837f.f5355d;
        int i8 = i2;
        int i9 = j80Mo5837f2.f5355d;
        C11970zn1 c11970zn1 = new C11970zn1(J80.m4201b(iMin, iMin2, iMin3, Math.min(i7, i9)), J80.m4201b(Math.max(j80Mo5837f.f5352a, j80Mo5837f2.f5352a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C7497Dn1.m1893f(view, c7705Hn1, windowInsets, false);
        duration.addUpdateListener(new C7393Bn1(c7705Hn1, c8433Vn1M8551h, c8433Vn12, i8, view));
        duration.addListener(new C7423Cc1(c7705Hn1, view, 2));
        ViewTreeObserverOnPreDrawListenerC9947jy0.m22130a(view, new RunnableC6704qp(view, c7705Hn1, c11970zn1, duration, 4));
        this.f1658b = c8433Vn1M8551h;
        return C7497Dn1.m1896i(view, windowInsets);
    }
}

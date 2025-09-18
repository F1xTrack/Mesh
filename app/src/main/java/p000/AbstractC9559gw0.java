package p000;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedHashSet;
import java.util.UUID;

/* renamed from: gw0 */
/* loaded from: classes.dex */
public abstract class AbstractC9559gw0 {

    /* renamed from: a */
    public boolean f28104a;

    /* renamed from: b */
    public Object f28105b;

    /* renamed from: c */
    public Object f28106c;

    /* renamed from: d */
    public Object f28107d;

    public AbstractC9559gw0(FrameLayout frameLayout, C9725iD0 c9725iD0) {
        this.f28104a = false;
        this.f28106c = frameLayout;
        this.f28107d = c9725iD0;
    }

    /* renamed from: a */
    public abstract void mo17436a(C8071Oo1 c8071Oo1);

    /* renamed from: b */
    public AbstractC8227Ro1 m18675b() {
        AbstractC8227Ro1 abstractC8227Ro1Mo18676c = mo18676c();
        C4149gy c4149gy = ((C8383Uo1) this.f28106c).f12143j;
        boolean z = (Build.VERSION.SDK_INT >= 24 && !c4149gy.f28123h.isEmpty()) || c4149gy.f28119d || c4149gy.f28117b || c4149gy.f28118c;
        C8383Uo1 c8383Uo1 = (C8383Uo1) this.f28106c;
        if (c8383Uo1.f12150q) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c8383Uo1.f12140g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        O90.m5967e(uuidRandomUUID, "randomUUID()");
        this.f28105b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        O90.m5967e(string, "id.toString()");
        C8383Uo1 c8383Uo12 = (C8383Uo1) this.f28106c;
        O90.m5968f(c8383Uo12, "other");
        int i = c8383Uo12.f12135b;
        String str = c8383Uo12.f12137d;
        C7249zC c7249zC = new C7249zC(c8383Uo12.f12138e);
        C7249zC c7249zC2 = new C7249zC(c8383Uo12.f12139f);
        long j = c8383Uo12.f12140g;
        long j2 = c8383Uo12.f12141h;
        long j3 = c8383Uo12.f12142i;
        C4149gy c4149gy2 = c8383Uo12.f12143j;
        O90.m5968f(c4149gy2, "other");
        this.f28106c = new C8383Uo1(string, i, c8383Uo12.f12136c, str, c7249zC, c7249zC2, j, j2, j3, new C4149gy(c4149gy2.f28116a, c4149gy2.f28117b, c4149gy2.f28118c, c4149gy2.f28119d, c4149gy2.f28120e, c4149gy2.f28121f, c4149gy2.f28122g, c4149gy2.f28123h), c8383Uo12.f12144k, c8383Uo12.f12145l, c8383Uo12.f12146m, c8383Uo12.f12147n, c8383Uo12.f12148o, c8383Uo12.f12149p, c8383Uo12.f12150q, c8383Uo12.f12151r, c8383Uo12.f12152s, 524288, 0);
        return abstractC8227Ro1Mo18676c;
    }

    /* renamed from: c */
    public abstract AbstractC8227Ro1 mo18676c();

    /* renamed from: d */
    public abstract String mo17437d();

    /* renamed from: e */
    public abstract View mo6588e();

    /* renamed from: f */
    public abstract Bitmap mo6589f();

    /* renamed from: g */
    public abstract void mo6590g();

    /* renamed from: h */
    public abstract void mo6591h();

    /* renamed from: i */
    public abstract void mo6592i(Z61 z61, C4224i9 c4224i9);

    /* renamed from: j */
    public void m18677j() {
        View viewMo6588e = mo6588e();
        if (viewMo6588e == null || !this.f28104a) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f28106c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C9725iD0 c9725iD0 = (C9725iD0) this.f28107d;
        c9725iD0.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            AbstractC7806Jm0.m4412f("PreviewTransform");
            return;
        }
        if (c9725iD0.m18986f()) {
            if (viewMo6588e instanceof TextureView) {
                ((TextureView) viewMo6588e).setTransform(c9725iD0.m18984d());
            } else {
                Display display = viewMo6588e.getDisplay();
                boolean z = false;
                boolean z2 = (!c9725iD0.f28966g || display == null || display.getRotation() == c9725iD0.f28964e) ? false : true;
                boolean z3 = c9725iD0.f28966g;
                if (!z3) {
                    if ((!z3 ? c9725iD0.f28962c : -AbstractC9754iR1.m19040d(c9725iD0.f28964e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    AbstractC7806Jm0.m4412f("PreviewTransform");
                }
            }
            RectF rectFM18985e = c9725iD0.m18985e(size, layoutDirection);
            viewMo6588e.setPivotX(0.0f);
            viewMo6588e.setPivotY(0.0f);
            viewMo6588e.setScaleX(rectFM18985e.width() / c9725iD0.f28960a.getWidth());
            viewMo6588e.setScaleY(rectFM18985e.height() / c9725iD0.f28960a.getHeight());
            viewMo6588e.setTranslationX(rectFM18985e.left - viewMo6588e.getLeft());
            viewMo6588e.setTranslationY(rectFM18985e.top - viewMo6588e.getTop());
        }
    }

    /* renamed from: k */
    public abstract InterfaceFutureC7800Jj0 mo6593k();

    public AbstractC9559gw0(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        O90.m5967e(uuidRandomUUID, "randomUUID()");
        this.f28105b = uuidRandomUUID;
        String string = ((UUID) this.f28105b).toString();
        O90.m5967e(string, "id.toString()");
        this.f28106c = new C8383Uo1(string, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC11205tn0.m24983b(1));
        AbstractC0576J8.m4171B(strArr, linkedHashSet);
        this.f28107d = linkedHashSet;
    }

    public AbstractC9559gw0() {
        this.f28104a = false;
    }
}

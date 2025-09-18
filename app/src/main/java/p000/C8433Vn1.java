package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: Vn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8433Vn1 {

    /* renamed from: b */
    public static final C8433Vn1 f12755b;

    /* renamed from: a */
    public final C8277Sn1 f12756a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f12755b = C8225Rn1.f10423q;
        } else {
            f12755b = C8277Sn1.f10980b;
        }
    }

    public C8433Vn1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f12756a = new C8225Rn1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f12756a = new C8173Qn1(this, windowInsets);
        } else if (i >= 28) {
            this.f12756a = new C8121Pn1(this, windowInsets);
        } else {
            this.f12756a = new C8069On1(this, windowInsets);
        }
    }

    /* renamed from: e */
    public static J80 m8550e(J80 j80, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, j80.f5352a - i);
        int iMax2 = Math.max(0, j80.f5353b - i2);
        int iMax3 = Math.max(0, j80.f5354c - i3);
        int iMax4 = Math.max(0, j80.f5355d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? j80 : J80.m4201b(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: h */
    public static C8433Vn1 m8551h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C8433Vn1 c8433Vn1 = new C8433Vn1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            C8433Vn1 c8433Vn1M18871a = AbstractC9664hk1.m18871a(view);
            C8277Sn1 c8277Sn1 = c8433Vn1.f12756a;
            c8277Sn1.mo5843q(c8433Vn1M18871a);
            c8277Sn1.mo5836d(view.getRootView());
        }
        return c8433Vn1;
    }

    /* renamed from: a */
    public final int m8552a() {
        return this.f12756a.mo5838j().f5355d;
    }

    /* renamed from: b */
    public final int m8553b() {
        return this.f12756a.mo5838j().f5352a;
    }

    /* renamed from: c */
    public final int m8554c() {
        return this.f12756a.mo5838j().f5354c;
    }

    /* renamed from: d */
    public final int m8555d() {
        return this.f12756a.mo5838j().f5353b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8433Vn1)) {
            return false;
        }
        return Objects.equals(this.f12756a, ((C8433Vn1) obj).f12756a);
    }

    /* renamed from: f */
    public final C8433Vn1 m8556f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        AbstractC7965Mn1 c7913Ln1 = i5 >= 30 ? new C7913Ln1(this) : i5 >= 29 ? new C7861Kn1(this) : new C7809Jn1(this);
        c7913Ln1.mo4416g(J80.m4201b(i, i2, i3, i4));
        return c7913Ln1.mo4414b();
    }

    /* renamed from: g */
    public final WindowInsets m8557g() {
        C8277Sn1 c8277Sn1 = this.f12756a;
        if (c8277Sn1 instanceof AbstractC8017Nn1) {
            return ((AbstractC8017Nn1) c8277Sn1).f8002c;
        }
        return null;
    }

    public final int hashCode() {
        C8277Sn1 c8277Sn1 = this.f12756a;
        if (c8277Sn1 == null) {
            return 0;
        }
        return c8277Sn1.hashCode();
    }

    public C8433Vn1() {
        this.f12756a = new C8277Sn1(this);
    }
}

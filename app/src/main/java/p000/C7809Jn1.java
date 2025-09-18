package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: Jn1 */
/* loaded from: classes.dex */
public final class C7809Jn1 extends AbstractC7965Mn1 {

    /* renamed from: e */
    public static Field f5697e = null;

    /* renamed from: f */
    public static boolean f5698f = false;

    /* renamed from: g */
    public static Constructor f5699g = null;

    /* renamed from: h */
    public static boolean f5700h = false;

    /* renamed from: c */
    public WindowInsets f5701c;

    /* renamed from: d */
    public J80 f5702d;

    public C7809Jn1() {
        this.f5701c = m4413i();
    }

    /* renamed from: i */
    private static WindowInsets m4413i() {
        if (!f5698f) {
            try {
                f5697e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f5698f = true;
        }
        Field field = f5697e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f5700h) {
            try {
                f5699g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f5700h = true;
        }
        Constructor constructor = f5699g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: b */
    public C8433Vn1 mo4414b() {
        m5436a();
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(null, this.f5701c);
        J80[] j80Arr = this.f7349b;
        C8277Sn1 c8277Sn1 = c8433Vn1M8551h.f12756a;
        c8277Sn1.mo5842p(j80Arr);
        c8277Sn1.mo6143r(this.f5702d);
        return c8433Vn1M8551h;
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: e */
    public void mo4415e(J80 j80) {
        this.f5702d = j80;
    }

    @Override // p000.AbstractC7965Mn1
    /* renamed from: g */
    public void mo4416g(J80 j80) {
        WindowInsets windowInsets = this.f5701c;
        if (windowInsets != null) {
            this.f5701c = windowInsets.replaceSystemWindowInsets(j80.f5352a, j80.f5353b, j80.f5354c, j80.f5355d);
        }
    }

    public C7809Jn1(C8433Vn1 c8433Vn1) {
        super(c8433Vn1);
        this.f5701c = c8433Vn1.m8557g();
    }
}

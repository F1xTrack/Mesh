package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: jp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9930jp1 {

    /* renamed from: a */
    public static final ColorDrawable f35416a = new ColorDrawable(0);

    /* renamed from: a */
    public static Drawable m22109a(Drawable drawable, NT0 nt0, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            nt0.getClass();
            ET0 et0 = new ET0(resources, bitmap, paint);
            m22110b(et0, nt0);
            return et0;
        }
        if (drawable instanceof NinePatchDrawable) {
            MT0 mt0 = new MT0((NinePatchDrawable) drawable);
            m22110b(mt0, nt0);
            return mt0;
        }
        if (!(drawable instanceof ColorDrawable)) {
            AbstractC3929dS.m17684q("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        FT0 ft0 = new FT0(((ColorDrawable) drawable).getColor());
        m22110b(ft0, nt0);
        return ft0;
    }

    /* renamed from: b */
    public static void m22110b(DT0 dt0, NT0 nt0) {
        nt0.getClass();
        dt0.mo1699i();
        dt0.mo1702s(nt0.f7800b);
        dt0.mo1697d(nt0.f7802d, nt0.f7803e);
        dt0.mo1695a();
        dt0.mo1701q();
        dt0.mo1698f(nt0.f7804f);
        dt0.mo1700l();
    }

    /* renamed from: c */
    public static Drawable m22111c(Drawable drawable, NT0 nt0, Resources resources) {
        try {
            AbstractC4250iZ.m19063b();
            if (drawable != null && nt0 != null && nt0.f7799a == 2) {
                if (!(drawable instanceof C7081wX)) {
                    return m22109a(drawable, nt0, resources);
                }
                InterfaceC6231jL interfaceC6231jL = (C7081wX) drawable;
                while (true) {
                    Object objMo22024p = interfaceC6231jL.mo22024p();
                    if (objMo22024p == interfaceC6231jL || !(objMo22024p instanceof InterfaceC6231jL)) {
                        break;
                    }
                    interfaceC6231jL = (InterfaceC6231jL) objMo22024p;
                }
                interfaceC6231jL.mo22023k(m22109a(interfaceC6231jL.mo22023k(f35416a), nt0, resources));
                return drawable;
            }
            return drawable;
        } finally {
            AbstractC4250iZ.m19063b();
        }
    }

    /* renamed from: d */
    public static Drawable m22112d(Drawable drawable, NT0 nt0) {
        try {
            AbstractC4250iZ.m19063b();
            if (drawable != null && nt0 != null && nt0.f7799a == 1) {
                JT0 jt0 = new JT0(drawable);
                m22110b(jt0, nt0);
                jt0.f5535k = nt0.f7801c;
                jt0.invalidateSelf();
                return jt0;
            }
            return drawable;
        } finally {
            AbstractC4250iZ.m19063b();
        }
    }

    /* renamed from: e */
    public static Drawable m22113e(Drawable drawable, AbstractC10522oR1 abstractC10522oR1) {
        AbstractC4250iZ.m19063b();
        if (drawable == null || abstractC10522oR1 == null) {
            AbstractC4250iZ.m19063b();
            return drawable;
        }
        C10913rV0 c10913rV0 = new C10913rV0(drawable);
        c10913rV0.f41688e = null;
        c10913rV0.f41689f = 0;
        c10913rV0.f41690g = 0;
        c10913rV0.f41692i = new Matrix();
        c10913rV0.f41687d = abstractC10522oR1;
        AbstractC4250iZ.m19063b();
        return c10913rV0;
    }
}

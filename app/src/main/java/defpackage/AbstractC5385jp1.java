package defpackage;

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
public abstract class AbstractC5385jp1 {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, NT0 nt0, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            nt0.getClass();
            ET0 et0 = new ET0(resources, bitmap, paint);
            b(et0, nt0);
            return et0;
        }
        if (drawable instanceof NinePatchDrawable) {
            MT0 mt0 = new MT0((NinePatchDrawable) drawable);
            b(mt0, nt0);
            return mt0;
        }
        if (!(drawable instanceof ColorDrawable)) {
            AbstractC3393dS.q("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        FT0 ft0 = new FT0(((ColorDrawable) drawable).getColor());
        b(ft0, nt0);
        return ft0;
    }

    public static void b(DT0 dt0, NT0 nt0) {
        nt0.getClass();
        dt0.i();
        dt0.s(nt0.b);
        dt0.d(nt0.d, nt0.e);
        dt0.a();
        dt0.q();
        dt0.f(nt0.f);
        dt0.l();
    }

    public static Drawable c(Drawable drawable, NT0 nt0, Resources resources) {
        try {
            AbstractC4368iZ.b();
            if (drawable != null && nt0 != null && nt0.a == 2) {
                if (!(drawable instanceof C7810wX)) {
                    return a(drawable, nt0, resources);
                }
                InterfaceC5293jL interfaceC5293jL = (C7810wX) drawable;
                while (true) {
                    Object objP = interfaceC5293jL.p();
                    if (objP == interfaceC5293jL || !(objP instanceof InterfaceC5293jL)) {
                        break;
                    }
                    interfaceC5293jL = (InterfaceC5293jL) objP;
                }
                interfaceC5293jL.k(a(interfaceC5293jL.k(a), nt0, resources));
                return drawable;
            }
            return drawable;
        } finally {
            AbstractC4368iZ.b();
        }
    }

    public static Drawable d(Drawable drawable, NT0 nt0) {
        try {
            AbstractC4368iZ.b();
            if (drawable != null && nt0 != null && nt0.a == 1) {
                JT0 jt0 = new JT0(drawable);
                b(jt0, nt0);
                jt0.k = nt0.c;
                jt0.invalidateSelf();
                return jt0;
            }
            return drawable;
        } finally {
            AbstractC4368iZ.b();
        }
    }

    public static Drawable e(Drawable drawable, AbstractC6268oR1 abstractC6268oR1) {
        AbstractC4368iZ.b();
        if (drawable == null || abstractC6268oR1 == null) {
            AbstractC4368iZ.b();
            return drawable;
        }
        C6851rV0 c6851rV0 = new C6851rV0(drawable);
        c6851rV0.e = null;
        c6851rV0.f = 0;
        c6851rV0.g = 0;
        c6851rV0.i = new Matrix();
        c6851rV0.d = abstractC6268oR1;
        AbstractC4368iZ.b();
        return c6851rV0;
    }
}

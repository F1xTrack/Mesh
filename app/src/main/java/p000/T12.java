package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class T12 {
    /* renamed from: a */
    public static void m7520a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC4173hL.m18806h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC4173hL.m18806h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC4173hL.m18807i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static ImageView.ScaleType m7521b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: c */
    public static void m7522c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        AbstractC4173hL.m18806h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* renamed from: d */
    public static void m7523d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    /* renamed from: e */
    public static int m7524e(byte[] bArr, int i, C0303Eo c0303Eo) {
        int iM7530k = m7530k(bArr, i, c0303Eo);
        int i2 = c0303Eo.f2907a;
        if (i2 < 0) {
            throw C10114lF1.m22373b();
        }
        if (i2 > bArr.length - iM7530k) {
            throw C10114lF1.m22375d();
        }
        if (i2 == 0) {
            c0303Eo.f2909c = C11769yC1.f46138c;
            return iM7530k;
        }
        c0303Eo.f2909c = C11769yC1.m26094k(bArr, iM7530k, i2);
        return iM7530k + i2;
    }

    /* renamed from: f */
    public static int m7525f(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* renamed from: g */
    public static int m7526g(PH1 ph1, byte[] bArr, int i, int i2, int i3, C0303Eo c0303Eo) {
        EE1 ee1Zze = ph1.zze();
        int iM7534o = m7534o(ee1Zze, ph1, bArr, i, i2, i3, c0303Eo);
        ph1.mo6286a(ee1Zze);
        c0303Eo.f2909c = ee1Zze;
        return iM7534o;
    }

    /* renamed from: h */
    public static int m7527h(PH1 ph1, int i, byte[] bArr, int i2, int i3, YE1 ye1, C0303Eo c0303Eo) {
        EE1 ee1Zze = ph1.zze();
        int iM7535p = m7535p(ee1Zze, ph1, bArr, i2, i3, c0303Eo);
        ph1.mo6286a(ee1Zze);
        c0303Eo.f2909c = ee1Zze;
        ye1.add(ee1Zze);
        while (iM7535p < i3) {
            int iM7530k = m7530k(bArr, iM7535p, c0303Eo);
            if (i != c0303Eo.f2907a) {
                break;
            }
            EE1 ee1Zze2 = ph1.zze();
            int iM7535p2 = m7535p(ee1Zze2, ph1, bArr, iM7530k, i3, c0303Eo);
            ph1.mo6286a(ee1Zze2);
            c0303Eo.f2909c = ee1Zze2;
            ye1.add(ee1Zze2);
            iM7535p = iM7535p2;
        }
        return iM7535p;
    }

    /* renamed from: i */
    public static int m7528i(byte[] bArr, int i, YE1 ye1, C0303Eo c0303Eo) {
        IE1 ie1 = (IE1) ye1;
        int iM7530k = m7530k(bArr, i, c0303Eo);
        int i2 = c0303Eo.f2907a + iM7530k;
        while (iM7530k < i2) {
            iM7530k = m7530k(bArr, iM7530k, c0303Eo);
            ie1.m3789d(c0303Eo.f2907a);
        }
        if (iM7530k == i2) {
            return iM7530k;
        }
        throw C10114lF1.m22375d();
    }

    /* renamed from: j */
    public static int m7529j(int i, byte[] bArr, int i2, int i3, MI1 mi1, C0303Eo c0303Eo) {
        if ((i >>> 3) == 0) {
            throw new C10114lF1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM7533n = m7533n(bArr, i2, c0303Eo);
            mi1.m5299c(i, Long.valueOf(c0303Eo.f2908b));
            return iM7533n;
        }
        if (i4 == 1) {
            mi1.m5299c(i, Long.valueOf(m7536q(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM7530k = m7530k(bArr, i2, c0303Eo);
            int i5 = c0303Eo.f2907a;
            if (i5 < 0) {
                throw C10114lF1.m22373b();
            }
            if (i5 > bArr.length - iM7530k) {
                throw C10114lF1.m22375d();
            }
            if (i5 == 0) {
                mi1.m5299c(i, C11769yC1.f46138c);
            } else {
                mi1.m5299c(i, C11769yC1.m26094k(bArr, iM7530k, i5));
            }
            return iM7530k + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new C10114lF1("Protocol message contained an invalid tag (zero).");
            }
            mi1.m5299c(i, Integer.valueOf(m7525f(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        MI1 mi1M5297b = MI1.m5297b();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM7530k2 = m7530k(bArr, i2, c0303Eo);
            int i8 = c0303Eo.f2907a;
            i7 = i8;
            if (i8 == i6) {
                i2 = iM7530k2;
                break;
            }
            int iM7529j = m7529j(i7, bArr, iM7530k2, i3, mi1M5297b, c0303Eo);
            i7 = i8;
            i2 = iM7529j;
        }
        if (i2 > i3 || i7 != i6) {
            throw C10114lF1.m22374c();
        }
        mi1.m5299c(i, mi1M5297b);
        return i2;
    }

    /* renamed from: k */
    public static int m7530k(byte[] bArr, int i, C0303Eo c0303Eo) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m7531l(b, bArr, i2, c0303Eo);
        }
        c0303Eo.f2907a = b;
        return i2;
    }

    /* renamed from: l */
    public static int m7531l(int i, byte[] bArr, int i2, C0303Eo c0303Eo) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c0303Eo.f2907a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c0303Eo.f2907a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0303Eo.f2907a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0303Eo.f2907a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0303Eo.f2907a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: m */
    public static int m7532m(int i, byte[] bArr, int i2, int i3, YE1 ye1, C0303Eo c0303Eo) {
        IE1 ie1 = (IE1) ye1;
        int iM7530k = m7530k(bArr, i2, c0303Eo);
        ie1.m3789d(c0303Eo.f2907a);
        while (iM7530k < i3) {
            int iM7530k2 = m7530k(bArr, iM7530k, c0303Eo);
            if (i != c0303Eo.f2907a) {
                break;
            }
            iM7530k = m7530k(bArr, iM7530k2, c0303Eo);
            ie1.m3789d(c0303Eo.f2907a);
        }
        return iM7530k;
    }

    /* renamed from: n */
    public static int m7533n(byte[] bArr, int i, C0303Eo c0303Eo) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c0303Eo.f2908b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c0303Eo.f2908b = j2;
        return i3;
    }

    /* renamed from: o */
    public static int m7534o(Object obj, PH1 ph1, byte[] bArr, int i, int i2, int i3, C0303Eo c0303Eo) {
        int iM23717s = ((C10630pH1) ph1).m23717s(obj, bArr, i, i2, i3, c0303Eo);
        c0303Eo.f2909c = obj;
        return iM23717s;
    }

    /* renamed from: p */
    public static int m7535p(Object obj, PH1 ph1, byte[] bArr, int i, int i2, C0303Eo c0303Eo) {
        int iM7531l = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM7531l = m7531l(i3, bArr, iM7531l, c0303Eo);
            i3 = c0303Eo.f2907a;
        }
        int i4 = iM7531l;
        if (i3 < 0 || i3 > i2 - i4) {
            throw C10114lF1.m22375d();
        }
        int i5 = i3 + i4;
        ph1.mo6292g(obj, bArr, i4, i5, c0303Eo);
        c0303Eo.f2909c = obj;
        return i5;
    }

    /* renamed from: q */
    public static long m7536q(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}

package defpackage;

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
    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC4135hL.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC4135hL.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC4135hL.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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
        AbstractC4135hL.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static int e(byte[] bArr, int i, C0374Eo c0374Eo) {
        int iK = k(bArr, i, c0374Eo);
        int i2 = c0374Eo.a;
        if (i2 < 0) {
            throw C5659lF1.b();
        }
        if (i2 > bArr.length - iK) {
            throw C5659lF1.d();
        }
        if (i2 == 0) {
            c0374Eo.c = C8129yC1.c;
            return iK;
        }
        c0374Eo.c = C8129yC1.k(bArr, iK, i2);
        return iK + i2;
    }

    public static int f(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int g(PH1 ph1, byte[] bArr, int i, int i2, int i3, C0374Eo c0374Eo) {
        EE1 ee1Zze = ph1.zze();
        int iO = o(ee1Zze, ph1, bArr, i, i2, i3, c0374Eo);
        ph1.a(ee1Zze);
        c0374Eo.c = ee1Zze;
        return iO;
    }

    public static int h(PH1 ph1, int i, byte[] bArr, int i2, int i3, YE1 ye1, C0374Eo c0374Eo) {
        EE1 ee1Zze = ph1.zze();
        int iP = p(ee1Zze, ph1, bArr, i2, i3, c0374Eo);
        ph1.a(ee1Zze);
        c0374Eo.c = ee1Zze;
        ye1.add(ee1Zze);
        while (iP < i3) {
            int iK = k(bArr, iP, c0374Eo);
            if (i != c0374Eo.a) {
                break;
            }
            EE1 ee1Zze2 = ph1.zze();
            int iP2 = p(ee1Zze2, ph1, bArr, iK, i3, c0374Eo);
            ph1.a(ee1Zze2);
            c0374Eo.c = ee1Zze2;
            ye1.add(ee1Zze2);
            iP = iP2;
        }
        return iP;
    }

    public static int i(byte[] bArr, int i, YE1 ye1, C0374Eo c0374Eo) {
        IE1 ie1 = (IE1) ye1;
        int iK = k(bArr, i, c0374Eo);
        int i2 = c0374Eo.a + iK;
        while (iK < i2) {
            iK = k(bArr, iK, c0374Eo);
            ie1.d(c0374Eo.a);
        }
        if (iK == i2) {
            return iK;
        }
        throw C5659lF1.d();
    }

    public static int j(int i, byte[] bArr, int i2, int i3, MI1 mi1, C0374Eo c0374Eo) {
        if ((i >>> 3) == 0) {
            throw new C5659lF1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iN = n(bArr, i2, c0374Eo);
            mi1.c(i, Long.valueOf(c0374Eo.b));
            return iN;
        }
        if (i4 == 1) {
            mi1.c(i, Long.valueOf(q(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iK = k(bArr, i2, c0374Eo);
            int i5 = c0374Eo.a;
            if (i5 < 0) {
                throw C5659lF1.b();
            }
            if (i5 > bArr.length - iK) {
                throw C5659lF1.d();
            }
            if (i5 == 0) {
                mi1.c(i, C8129yC1.c);
            } else {
                mi1.c(i, C8129yC1.k(bArr, iK, i5));
            }
            return iK + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new C5659lF1("Protocol message contained an invalid tag (zero).");
            }
            mi1.c(i, Integer.valueOf(f(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        MI1 mi1B = MI1.b();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iK2 = k(bArr, i2, c0374Eo);
            int i8 = c0374Eo.a;
            i7 = i8;
            if (i8 == i6) {
                i2 = iK2;
                break;
            }
            int iJ = j(i7, bArr, iK2, i3, mi1B, c0374Eo);
            i7 = i8;
            i2 = iJ;
        }
        if (i2 > i3 || i7 != i6) {
            throw C5659lF1.c();
        }
        mi1.c(i, mi1B);
        return i2;
    }

    public static int k(byte[] bArr, int i, C0374Eo c0374Eo) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return l(b, bArr, i2, c0374Eo);
        }
        c0374Eo.a = b;
        return i2;
    }

    public static int l(int i, byte[] bArr, int i2, C0374Eo c0374Eo) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c0374Eo.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c0374Eo.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0374Eo.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0374Eo.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0374Eo.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int m(int i, byte[] bArr, int i2, int i3, YE1 ye1, C0374Eo c0374Eo) {
        IE1 ie1 = (IE1) ye1;
        int iK = k(bArr, i2, c0374Eo);
        ie1.d(c0374Eo.a);
        while (iK < i3) {
            int iK2 = k(bArr, iK, c0374Eo);
            if (i != c0374Eo.a) {
                break;
            }
            iK = k(bArr, iK2, c0374Eo);
            ie1.d(c0374Eo.a);
        }
        return iK;
    }

    public static int n(byte[] bArr, int i, C0374Eo c0374Eo) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c0374Eo.b = j;
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
        c0374Eo.b = j2;
        return i3;
    }

    public static int o(Object obj, PH1 ph1, byte[] bArr, int i, int i2, int i3, C0374Eo c0374Eo) {
        int iS = ((C6429pH1) ph1).s(obj, bArr, i, i2, i3, c0374Eo);
        c0374Eo.c = obj;
        return iS;
    }

    public static int p(Object obj, PH1 ph1, byte[] bArr, int i, int i2, C0374Eo c0374Eo) {
        int iL = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iL = l(i3, bArr, iL, c0374Eo);
            i3 = c0374Eo.a;
        }
        int i4 = iL;
        if (i3 < 0 || i3 > i2 - i4) {
            throw C5659lF1.d();
        }
        int i5 = i3 + i4;
        ph1.g(obj, bArr, i4, i5, c0374Eo);
        c0374Eo.c = obj;
        return i5;
    }

    public static long q(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}

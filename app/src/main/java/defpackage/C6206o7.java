package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: o7 */
/* loaded from: classes.dex */
public final class C6206o7 {
    public final TextView a;
    public C6553px b;
    public C6553px c;
    public C6553px d;
    public C6553px e;
    public C6553px f;
    public C6553px g;
    public C6553px h;
    public final C7922x7 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public C6206o7(TextView textView) {
        this.a = textView;
        this.i = new C7922x7(textView);
    }

    public static C6553px c(Context context, J6 j6, int i) {
        ColorStateList colorStateListI;
        synchronized (j6) {
            colorStateListI = j6.a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        C6553px c6553px = new C6553px();
        c6553px.b = true;
        c6553px.c = colorStateListI;
        return c6553px;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC1495Sy.c(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC1495Sy.c(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            AbstractC5543ke1.j(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC5543ke1.j(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC5543ke1.j(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        AbstractC5543ke1.j(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public final void a(Drawable drawable, C6553px c6553px) {
        if (drawable == null || c6553px == null) {
            return;
        }
        J6.e(drawable, c6553px, this.a.getDrawableState());
    }

    public final void b() {
        C6553px c6553px = this.b;
        TextView textView = this.a;
        if (c6553px != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        C6553px c6553px = this.h;
        if (c6553px != null) {
            return (ColorStateList) c6553px.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C6553px c6553px = this.h;
        if (c6553px != null) {
            return (PorterDuff.Mode) c6553px.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        boolean z3;
        C7922x7 c7922x7;
        int i2;
        int i3;
        int i4;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        TextView textView = this.a;
        Context context = textView.getContext();
        J6 j6A = J6.a();
        int[] iArr = AbstractC2104aH0.h;
        C1857Xo1 c1857Xo1J = C1857Xo1.J(context, attributeSet, iArr, i);
        AbstractC6897rk1.m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c1857Xo1J.c, i, 0);
        TypedArray typedArray = (TypedArray) c1857Xo1J.c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, j6A, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, j6A, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, j6A, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, j6A, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, j6A, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, j6A, typedArray.getResourceId(6, 0));
        }
        c1857Xo1J.M();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC2104aH0.x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C1857Xo1 c1857Xo1 = new C1857Xo1(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            n(context, c1857Xo1);
            int i7 = Build.VERSION.SDK_INT;
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i6 = 26;
            } else {
                i6 = 26;
                string2 = null;
            }
            string = (i7 < i6 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c1857Xo1.M();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C1857Xo1 c1857Xo12 = new C1857Xo1(context, typedArrayObtainStyledAttributes2);
        if (z4 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z3 = z;
        } else {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i8 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i8 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c1857Xo12);
        c1857Xo12.M();
        if (!z4 && z2) {
            textView.setAllCaps(z3);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC5824m7.d(textView, string);
        }
        if (str != null) {
            if (i8 >= 24) {
                AbstractC5633l7.b(textView, AbstractC5633l7.a(str));
            } else {
                textView.setTextLocale(AbstractC5442k7.a(str.split(StringUtils.COMMA)[0]));
            }
        }
        int[] iArr3 = AbstractC2104aH0.i;
        C7922x7 c7922x72 = this.i;
        Context context2 = c7922x72.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c7922x72.i;
        AbstractC6897rk1.m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c7922x7 = c7922x72;
            c7922x7.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        } else {
            c7922x7 = c7922x72;
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i9 = 0; i9 < length; i9++) {
                    iArr4[i9] = typedArrayObtainTypedArray.getDimensionPixelSize(i9, -1);
                }
                c7922x7.f = C7922x7.b(iArr4);
                c7922x7.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c7922x7.j()) {
            c7922x7.a = 0;
        } else if (c7922x7.a == 1) {
            if (!c7922x7.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c7922x7.k(dimension2, f, dimension);
            }
            c7922x7.h();
        }
        if (AbstractC0055Al1.c && c7922x7.a != 0) {
            int[] iArr5 = c7922x7.f;
            if (iArr5.length > 0) {
                if (AbstractC5824m7.a(textView) != -1.0f) {
                    AbstractC5824m7.b(textView, Math.round(c7922x7.d), Math.round(c7922x7.e), Math.round(c7922x7.c), 0);
                } else {
                    AbstractC5824m7.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? j6A.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? j6A.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? j6A.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? j6A.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? j6A.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? j6A.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC3556eJ.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            i2 = 24;
            if (Build.VERSION.SDK_INT >= 24) {
                H91.f(textView, colorStateList);
            } else if (textView instanceof InterfaceC1035Na1) {
                ((InterfaceC1035Na1) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        } else {
            i2 = 24;
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeC = AbstractC6820rL.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= i2) {
                H91.g(textView, modeC);
            } else if (textView instanceof InterfaceC1035Na1) {
                ((InterfaceC1035Na1) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i3 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i4 = -1;
            } else {
                int i10 = typedValuePeekValue.data;
                int i11 = i10 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i10);
                i4 = i11;
                i3 = -1;
            }
        } else {
            i3 = -1;
            i4 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i3) {
            AbstractC8183yU1.c(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            AbstractC8183yU1.d(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i4 == i3) {
                AbstractC8183yU1.e(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                K91.a(textView, i4, dimensionPixelSize);
            } else {
                AbstractC8183yU1.e(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2104aH0.x);
        C1857Xo1 c1857Xo1 = new C1857Xo1(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c1857Xo1);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC5824m7.d(textView, string);
        }
        c1857Xo1.M();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        C7922x7 c7922x7 = this.i;
        if (c7922x7.j()) {
            DisplayMetrics displayMetrics = c7922x7.j.getResources().getDisplayMetrics();
            c7922x7.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c7922x7.h()) {
                c7922x7.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C7922x7 c7922x7 = this.i;
        if (c7922x7.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c7922x7.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c7922x7.f = C7922x7.b(iArrCopyOf);
                if (!c7922x7.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c7922x7.g = false;
            }
            if (c7922x7.h()) {
                c7922x7.a();
            }
        }
    }

    public final void k(int i) {
        C7922x7 c7922x7 = this.i;
        if (c7922x7.j()) {
            if (i == 0) {
                c7922x7.a = 0;
                c7922x7.d = -1.0f;
                c7922x7.e = -1.0f;
                c7922x7.c = -1.0f;
                c7922x7.f = new int[0];
                c7922x7.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c7922x7.j.getResources().getDisplayMetrics();
            c7922x7.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c7922x7.h()) {
                c7922x7.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new C6553px();
        }
        C6553px c6553px = this.h;
        c6553px.c = colorStateList;
        c6553px.b = colorStateList != null;
        this.b = c6553px;
        this.c = c6553px;
        this.d = c6553px;
        this.e = c6553px;
        this.f = c6553px;
        this.g = c6553px;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new C6553px();
        }
        C6553px c6553px = this.h;
        c6553px.d = mode;
        c6553px.a = mode != null;
        this.b = c6553px;
        this.c = c6553px;
        this.d = c6553px;
        this.e = c6553px;
        this.f = c6553px;
        this.g = c6553px;
    }

    public final void n(Context context, C1857Xo1 c1857Xo1) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) c1857Xo1.c;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceE = c1857Xo1.E(i5, this.j, new C4284i7(this, i6, i7, new WeakReference(this.a)));
                if (typefaceE != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceE;
                    } else {
                        this.l = AbstractC6015n7.a(Typeface.create(typefaceE, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = AbstractC6015n7.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}

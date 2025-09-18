package p000;

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
public final class C6532o7 {

    /* renamed from: a */
    public final TextView f38805a;

    /* renamed from: b */
    public C6649px f38806b;

    /* renamed from: c */
    public C6649px f38807c;

    /* renamed from: d */
    public C6649px f38808d;

    /* renamed from: e */
    public C6649px f38809e;

    /* renamed from: f */
    public C6649px f38810f;

    /* renamed from: g */
    public C6649px f38811g;

    /* renamed from: h */
    public C6649px f38812h;

    /* renamed from: i */
    public final C7118x7 f38813i;

    /* renamed from: j */
    public int f38814j = 0;

    /* renamed from: k */
    public int f38815k = -1;

    /* renamed from: l */
    public Typeface f38816l;

    /* renamed from: m */
    public boolean f38817m;

    public C6532o7(TextView textView) {
        this.f38805a = textView;
        this.f38813i = new C7118x7(textView);
    }

    /* renamed from: c */
    public static C6649px m23341c(Context context, C0574J6 c0574j6, int i) {
        ColorStateList colorStateListM25627i;
        synchronized (c0574j6) {
            colorStateListM25627i = c0574j6.f5338a.m25627i(context, i);
        }
        if (colorStateListM25627i == null) {
            return null;
        }
        C6649px c6649px = new C6649px();
        c6649px.f40446b = true;
        c6649px.f40447c = colorStateListM25627i;
        return c6649px;
    }

    /* renamed from: h */
    public static void m23342h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC1193Sy.m7477c(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC1193Sy.m7477c(editorInfo, text);
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
            AbstractC10036ke1.m22235j(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC10036ke1.m22235j(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC10036ke1.m22235j(editorInfo, text, i4, i2);
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
        AbstractC10036ke1.m22235j(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* renamed from: a */
    public final void m23343a(Drawable drawable, C6649px c6649px) {
        if (drawable == null || c6649px == null) {
            return;
        }
        C0574J6.m4157e(drawable, c6649px, this.f38805a.getDrawableState());
    }

    /* renamed from: b */
    public final void m23344b() {
        C6649px c6649px = this.f38806b;
        TextView textView = this.f38805a;
        if (c6649px != null || this.f38807c != null || this.f38808d != null || this.f38809e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m23343a(compoundDrawables[0], this.f38806b);
            m23343a(compoundDrawables[1], this.f38807c);
            m23343a(compoundDrawables[2], this.f38808d);
            m23343a(compoundDrawables[3], this.f38809e);
        }
        if (this.f38810f == null && this.f38811g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m23343a(compoundDrawablesRelative[0], this.f38810f);
        m23343a(compoundDrawablesRelative[2], this.f38811g);
    }

    /* renamed from: d */
    public final ColorStateList m23345d() {
        C6649px c6649px = this.f38812h;
        if (c6649px != null) {
            return (ColorStateList) c6649px.f40447c;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode m23346e() {
        C6649px c6649px = this.f38812h;
        if (c6649px != null) {
            return (PorterDuff.Mode) c6649px.f40448d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m23347f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        boolean z3;
        C7118x7 c7118x7;
        int i2;
        int i3;
        int i4;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        TextView textView = this.f38805a;
        Context context = textView.getContext();
        C0574J6 c0574j6M4154a = C0574J6.m4154a();
        int[] iArr = AbstractC8704aH0.f15430h;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, attributeSet, iArr, i);
        AbstractC10944rk1.m24481m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, i, 0);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f38806b = m23341c(context, c0574j6M4154a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f38807c = m23341c(context, c0574j6M4154a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f38808d = m23341c(context, c0574j6M4154a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f38809e = m23341c(context, c0574j6M4154a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f38810f = m23341c(context, c0574j6M4154a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f38811g = m23341c(context, c0574j6M4154a, typedArray.getResourceId(6, 0));
        }
        c8539Xo1M9117J.m9130M();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC8704aH0.f15446x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C8539Xo1 c8539Xo1 = new C8539Xo1(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m23354n(context, c8539Xo1);
            int i7 = Build.VERSION.SDK_INT;
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i6 = 26;
            } else {
                i6 = 26;
                string2 = null;
            }
            string = (i7 < i6 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c8539Xo1.m9130M();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C8539Xo1 c8539Xo12 = new C8539Xo1(context, typedArrayObtainStyledAttributes2);
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
        m23354n(context, c8539Xo12);
        c8539Xo12.m9130M();
        if (!z4 && z2) {
            textView.setAllCaps(z3);
        }
        Typeface typeface = this.f38816l;
        if (typeface != null) {
            if (this.f38815k == -1) {
                textView.setTypeface(typeface, this.f38814j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC6406m7.m22677d(textView, string);
        }
        if (str != null) {
            if (i8 >= 24) {
                AbstractC6343l7.m22365b(textView, AbstractC6343l7.m22364a(str));
            } else {
                textView.setTextLocale(AbstractC6280k7.m22158a(str.split(StringUtils.COMMA)[0]));
            }
        }
        int[] iArr3 = AbstractC8704aH0.f15431i;
        C7118x7 c7118x72 = this.f38813i;
        Context context2 = c7118x72.f45409j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c7118x72.f45408i;
        AbstractC10944rk1.m24481m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c7118x7 = c7118x72;
            c7118x7.f45400a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        } else {
            c7118x7 = c7118x72;
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
                c7118x7.f45405f = C7118x7.m25762b(iArr4);
                c7118x7.m25770i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c7118x7.m25771j()) {
            c7118x7.f45400a = 0;
        } else if (c7118x7.f45400a == 1) {
            if (!c7118x7.f45406g) {
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
                c7118x7.m25772k(dimension2, f, dimension);
            }
            c7118x7.m25769h();
        }
        if (AbstractC7337Al1.f356c && c7118x7.f45400a != 0) {
            int[] iArr5 = c7118x7.f45405f;
            if (iArr5.length > 0) {
                if (AbstractC6406m7.m22674a(textView) != -1.0f) {
                    AbstractC6406m7.m22675b(textView, Math.round(c7118x7.f45403d), Math.round(c7118x7.f45404e), Math.round(c7118x7.f45402c), 0);
                } else {
                    AbstractC6406m7.m22676c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM4158b = resourceId4 != -1 ? c0574j6M4154a.m4158b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM4158b2 = resourceId5 != -1 ? c0574j6M4154a.m4158b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM4158b3 = resourceId6 != -1 ? c0574j6M4154a.m4158b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM4158b4 = resourceId7 != -1 ? c0574j6M4154a.m4158b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM4158b5 = resourceId8 != -1 ? c0574j6M4154a.m4158b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM4158b6 = resourceId9 != -1 ? c0574j6M4154a.m4158b(context, resourceId9) : null;
        if (drawableM4158b5 != null || drawableM4158b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM4158b5 == null) {
                drawableM4158b5 = compoundDrawablesRelative[0];
            }
            if (drawableM4158b2 == null) {
                drawableM4158b2 = compoundDrawablesRelative[1];
            }
            if (drawableM4158b6 == null) {
                drawableM4158b6 = compoundDrawablesRelative[2];
            }
            if (drawableM4158b4 == null) {
                drawableM4158b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM4158b5, drawableM4158b2, drawableM4158b6, drawableM4158b4);
        } else if (drawableM4158b != null || drawableM4158b2 != null || drawableM4158b3 != null || drawableM4158b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM4158b == null) {
                    drawableM4158b = compoundDrawables[0];
                }
                if (drawableM4158b2 == null) {
                    drawableM4158b2 = compoundDrawables[1];
                }
                if (drawableM4158b3 == null) {
                    drawableM4158b3 = compoundDrawables[2];
                }
                if (drawableM4158b4 == null) {
                    drawableM4158b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM4158b, drawableM4158b2, drawableM4158b3, drawableM4158b4);
            } else {
                if (drawableM4158b2 == null) {
                    drawableM4158b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM4158b4 == null) {
                    drawableM4158b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM4158b2, compoundDrawablesRelative2[2], drawableM4158b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC3982eJ.m17900b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            i2 = 24;
            if (Build.VERSION.SDK_INT >= 24) {
                H91.m3326f(textView, colorStateList);
            } else if (textView instanceof InterfaceC7991Na1) {
                ((InterfaceC7991Na1) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        } else {
            i2 = 24;
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeM24317c = AbstractC6737rL.m24317c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= i2) {
                H91.m3327g(textView, modeM24317c);
            } else if (textView instanceof InterfaceC7991Na1) {
                ((InterfaceC7991Na1) textView).setSupportCompoundDrawablesTintMode(modeM24317c);
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
            AbstractC11805yU1.m26155c(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            AbstractC11805yU1.m26156d(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i4 == i3) {
                AbstractC11805yU1.m26157e(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                K91.m4575a(textView, i4, dimensionPixelSize);
            } else {
                AbstractC11805yU1.m26157e(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* renamed from: g */
    public final void m23348g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC8704aH0.f15446x);
        C8539Xo1 c8539Xo1 = new C8539Xo1(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f38805a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m23354n(context, c8539Xo1);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC6406m7.m22677d(textView, string);
        }
        c8539Xo1.m9130M();
        Typeface typeface = this.f38816l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f38814j);
        }
    }

    /* renamed from: i */
    public final void m23349i(int i, int i2, int i3, int i4) {
        C7118x7 c7118x7 = this.f38813i;
        if (c7118x7.m25771j()) {
            DisplayMetrics displayMetrics = c7118x7.f45409j.getResources().getDisplayMetrics();
            c7118x7.m25772k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c7118x7.m25769h()) {
                c7118x7.m25765a();
            }
        }
    }

    /* renamed from: j */
    public final void m23350j(int[] iArr, int i) {
        C7118x7 c7118x7 = this.f38813i;
        if (c7118x7.m25771j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c7118x7.f45409j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c7118x7.f45405f = C7118x7.m25762b(iArrCopyOf);
                if (!c7118x7.m25770i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c7118x7.f45406g = false;
            }
            if (c7118x7.m25769h()) {
                c7118x7.m25765a();
            }
        }
    }

    /* renamed from: k */
    public final void m23351k(int i) {
        C7118x7 c7118x7 = this.f38813i;
        if (c7118x7.m25771j()) {
            if (i == 0) {
                c7118x7.f45400a = 0;
                c7118x7.f45403d = -1.0f;
                c7118x7.f45404e = -1.0f;
                c7118x7.f45402c = -1.0f;
                c7118x7.f45405f = new int[0];
                c7118x7.f45401b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c7118x7.f45409j.getResources().getDisplayMetrics();
            c7118x7.m25772k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c7118x7.m25769h()) {
                c7118x7.m25765a();
            }
        }
    }

    /* renamed from: l */
    public final void m23352l(ColorStateList colorStateList) {
        if (this.f38812h == null) {
            this.f38812h = new C6649px();
        }
        C6649px c6649px = this.f38812h;
        c6649px.f40447c = colorStateList;
        c6649px.f40446b = colorStateList != null;
        this.f38806b = c6649px;
        this.f38807c = c6649px;
        this.f38808d = c6649px;
        this.f38809e = c6649px;
        this.f38810f = c6649px;
        this.f38811g = c6649px;
    }

    /* renamed from: m */
    public final void m23353m(PorterDuff.Mode mode) {
        if (this.f38812h == null) {
            this.f38812h = new C6649px();
        }
        C6649px c6649px = this.f38812h;
        c6649px.f40448d = mode;
        c6649px.f40445a = mode != null;
        this.f38806b = c6649px;
        this.f38807c = c6649px;
        this.f38808d = c6649px;
        this.f38809e = c6649px;
        this.f38810f = c6649px;
        this.f38811g = c6649px;
    }

    /* renamed from: n */
    public final void m23354n(Context context, C8539Xo1 c8539Xo1) {
        String string;
        int i = this.f38814j;
        TypedArray typedArray = (TypedArray) c8539Xo1.f13982c;
        this.f38814j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f38815k = i3;
            if (i3 != -1) {
                this.f38814j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f38817m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f38816l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f38816l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f38816l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f38816l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f38815k;
        int i7 = this.f38814j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM9123E = c8539Xo1.m9123E(i5, this.f38814j, new C4222i7(this, i6, i7, new WeakReference(this.f38805a)));
                if (typefaceM9123E != null) {
                    if (i2 < 28 || this.f38815k == -1) {
                        this.f38816l = typefaceM9123E;
                    } else {
                        this.f38816l = AbstractC6469n7.m23079a(Typeface.create(typefaceM9123E, 0), this.f38815k, (this.f38814j & 2) != 0);
                    }
                }
                this.f38817m = this.f38816l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f38816l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f38815k == -1) {
            this.f38816l = Typeface.create(string, this.f38814j);
        } else {
            this.f38816l = AbstractC6469n7.m23079a(Typeface.create(string, 0), this.f38815k, (this.f38814j & 2) != 0);
        }
    }
}

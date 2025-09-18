package p000;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.EmojiCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* renamed from: v71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11378v71 extends CompoundButton {

    /* renamed from: R */
    public static final C4016er f44162R = new C4016er("thumbPos", 5, Float.class);

    /* renamed from: S */
    public static final int[] f44163S = {R.attr.state_checked};

    /* renamed from: A */
    public int f44164A;

    /* renamed from: B */
    public int f44165B;

    /* renamed from: C */
    public int f44166C;

    /* renamed from: D */
    public int f44167D;

    /* renamed from: E */
    public int f44168E;

    /* renamed from: F */
    public int f44169F;

    /* renamed from: G */
    public int f44170G;

    /* renamed from: H */
    public boolean f44171H;

    /* renamed from: I */
    public final TextPaint f44172I;

    /* renamed from: J */
    public final ColorStateList f44173J;

    /* renamed from: K */
    public StaticLayout f44174K;

    /* renamed from: L */
    public StaticLayout f44175L;

    /* renamed from: M */
    public final C0759M3 f44176M;

    /* renamed from: N */
    public ObjectAnimator f44177N;

    /* renamed from: O */
    public C0762M6 f44178O;

    /* renamed from: P */
    public C11250u71 f44179P;

    /* renamed from: Q */
    public final Rect f44180Q;

    /* renamed from: a */
    public Drawable f44181a;

    /* renamed from: b */
    public ColorStateList f44182b;

    /* renamed from: c */
    public PorterDuff.Mode f44183c;

    /* renamed from: d */
    public boolean f44184d;

    /* renamed from: e */
    public boolean f44185e;

    /* renamed from: f */
    public Drawable f44186f;

    /* renamed from: g */
    public ColorStateList f44187g;

    /* renamed from: h */
    public PorterDuff.Mode f44188h;

    /* renamed from: i */
    public boolean f44189i;

    /* renamed from: j */
    public boolean f44190j;

    /* renamed from: k */
    public int f44191k;

    /* renamed from: l */
    public int f44192l;

    /* renamed from: m */
    public int f44193m;

    /* renamed from: n */
    public boolean f44194n;

    /* renamed from: o */
    public CharSequence f44195o;

    /* renamed from: p */
    public CharSequence f44196p;

    /* renamed from: q */
    public CharSequence f44197q;

    /* renamed from: r */
    public CharSequence f44198r;

    /* renamed from: s */
    public boolean f44199s;

    /* renamed from: t */
    public int f44200t;

    /* renamed from: u */
    public final int f44201u;

    /* renamed from: v */
    public float f44202v;

    /* renamed from: w */
    public float f44203w;

    /* renamed from: x */
    public final VelocityTracker f44204x;

    /* renamed from: y */
    public final int f44205y;

    /* renamed from: z */
    public float f44206z;

    public AbstractC11378v71(Context context) throws Resources.NotFoundException {
        int resourceId;
        super(context, null, ru.mes.dnevnik.R.attr.switchStyle);
        this.f44182b = null;
        this.f44183c = null;
        this.f44184d = false;
        this.f44185e = false;
        this.f44187g = null;
        this.f44188h = null;
        this.f44189i = false;
        this.f44190j = false;
        this.f44204x = VelocityTracker.obtain();
        this.f44171H = true;
        this.f44180Q = new Rect();
        R91.m6917a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f44172I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC8704aH0.f15445w;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, null, iArr, ru.mes.dnevnik.R.attr.switchStyle);
        AbstractC10944rk1.m24481m(this, context, iArr, null, (TypedArray) c8539Xo1M9117J.f13982c, ru.mes.dnevnik.R.attr.switchStyle, 0);
        Drawable drawableM9121C = c8539Xo1M9117J.m9121C(2);
        this.f44181a = drawableM9121C;
        if (drawableM9121C != null) {
            drawableM9121C.setCallback(this);
        }
        Drawable drawableM9121C2 = c8539Xo1M9117J.m9121C(11);
        this.f44186f = drawableM9121C2;
        if (drawableM9121C2 != null) {
            drawableM9121C2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f44199s = typedArray.getBoolean(3, true);
        this.f44191k = typedArray.getDimensionPixelSize(8, 0);
        this.f44192l = typedArray.getDimensionPixelSize(5, 0);
        this.f44193m = typedArray.getDimensionPixelSize(6, 0);
        this.f44194n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM9120B = c8539Xo1M9117J.m9120B(9);
        if (colorStateListM9120B != null) {
            this.f44182b = colorStateListM9120B;
            this.f44184d = true;
        }
        PorterDuff.Mode modeM24317c = AbstractC6737rL.m24317c(typedArray.getInt(10, -1), null);
        if (this.f44183c != modeM24317c) {
            this.f44183c = modeM24317c;
            this.f44185e = true;
        }
        if (this.f44184d || this.f44185e) {
            m25365a();
        }
        ColorStateList colorStateListM9120B2 = c8539Xo1M9117J.m9120B(12);
        if (colorStateListM9120B2 != null) {
            this.f44187g = colorStateListM9120B2;
            this.f44189i = true;
        }
        PorterDuff.Mode modeM24317c2 = AbstractC6737rL.m24317c(typedArray.getInt(13, -1), null);
        if (this.f44188h != modeM24317c2) {
            this.f44188h = modeM24317c2;
            this.f44190j = true;
        }
        if (this.f44189i || this.f44190j) {
            m25366b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC8704aH0.f15446x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC3982eJ.m17900b(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f44173J = colorStateList;
            } else {
                this.f44173J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0759M3 c0759m3 = new C0759M3();
                c0759m3.f6977a = context2.getResources().getConfiguration().locale;
                this.f44176M = c0759m3;
            } else {
                this.f44176M = null;
            }
            setTextOnInternal(this.f44195o);
            setTextOffInternal(this.f44197q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C6532o7(this).m23347f(null, ru.mes.dnevnik.R.attr.switchStyle);
        c8539Xo1M9117J.m9130M();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f44201u = viewConfiguration.getScaledTouchSlop();
        this.f44205y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m5262b(null, ru.mes.dnevnik.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0762M6 getEmojiTextViewHelper() {
        if (this.f44178O == null) {
            this.f44178O = new C0762M6(this);
        }
        return this.f44178O;
    }

    private boolean getTargetCheckedState() {
        return this.f44206z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = AbstractC7337Al1.f354a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f44206z : this.f44206z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f44186f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f44180Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f44181a;
        Rect rectM24316b = drawable2 != null ? AbstractC6737rL.m24316b(drawable2) : AbstractC6737rL.f41603c;
        return ((((this.f44164A - this.f44166C) - rect.left) - rect.right) - rectM24316b.left) - rectM24316b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f44197q = charSequence;
        C0762M6 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo170e = ((AbstractC11489w02) emojiTextViewHelper.f6991b.f26532b).mo170e(this.f44176M);
        if (transformationMethodMo170e != null) {
            charSequence = transformationMethodMo170e.getTransformation(charSequence, this);
        }
        this.f44198r = charSequence;
        this.f44175L = null;
        if (this.f44199s) {
            m25368d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f44195o = charSequence;
        C0762M6 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo170e = ((AbstractC11489w02) emojiTextViewHelper.f6991b.f26532b).mo170e(this.f44176M);
        if (transformationMethodMo170e != null) {
            charSequence = transformationMethodMo170e.getTransformation(charSequence, this);
        }
        this.f44196p = charSequence;
        this.f44174K = null;
        if (this.f44199s) {
            m25368d();
        }
    }

    /* renamed from: a */
    public final void m25365a() {
        Drawable drawable = this.f44181a;
        if (drawable != null) {
            if (this.f44184d || this.f44185e) {
                Drawable drawableMutate = drawable.mutate();
                this.f44181a = drawableMutate;
                if (this.f44184d) {
                    AbstractC4173hL.m18806h(drawableMutate, this.f44182b);
                }
                if (this.f44185e) {
                    AbstractC4173hL.m18807i(this.f44181a, this.f44183c);
                }
                if (this.f44181a.isStateful()) {
                    this.f44181a.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m25366b() {
        Drawable drawable = this.f44186f;
        if (drawable != null) {
            if (this.f44189i || this.f44190j) {
                Drawable drawableMutate = drawable.mutate();
                this.f44186f = drawableMutate;
                if (this.f44189i) {
                    AbstractC4173hL.m18806h(drawableMutate, this.f44187g);
                }
                if (this.f44190j) {
                    AbstractC4173hL.m18807i(this.f44186f, this.f44188h);
                }
                if (this.f44186f.isStateful()) {
                    this.f44186f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m25367c() {
        setTextOnInternal(this.f44195o);
        setTextOffInternal(this.f44197q);
        requestLayout();
    }

    /* renamed from: d */
    public final void m25368d() {
        if (this.f44179P == null && ((AbstractC11489w02) this.f44178O.f6991b.f26532b).mo167b() && EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                C11250u71 c11250u71 = new C11250u71(this);
                this.f44179P = c11250u71;
                emojiCompat.registerInitCallback(c11250u71);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f44167D;
        int i4 = this.f44168E;
        int i5 = this.f44169F;
        int i6 = this.f44170G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f44181a;
        Rect rectM24316b = drawable != null ? AbstractC6737rL.m24316b(drawable) : AbstractC6737rL.f41603c;
        Drawable drawable2 = this.f44186f;
        Rect rect = this.f44180Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM24316b != null) {
                int i8 = rectM24316b.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM24316b.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM24316b.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM24316b.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f44186f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f44186f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f44181a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f44166C + rect.right;
            this.f44181a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC4173hL.m18804f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f44181a;
        if (drawable != null) {
            AbstractC4173hL.m18803e(drawable, f, f2);
        }
        Drawable drawable2 = this.f44186f;
        if (drawable2 != null) {
            AbstractC4173hL.m18803e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f44181a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f44186f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = AbstractC7337Al1.f354a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f44164A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f44193m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = AbstractC7337Al1.f354a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f44164A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f44193m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11805yU1.m26158f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f44199s;
    }

    public boolean getSplitTrack() {
        return this.f44194n;
    }

    public int getSwitchMinWidth() {
        return this.f44192l;
    }

    public int getSwitchPadding() {
        return this.f44193m;
    }

    public CharSequence getTextOff() {
        return this.f44197q;
    }

    public CharSequence getTextOn() {
        return this.f44195o;
    }

    public Drawable getThumbDrawable() {
        return this.f44181a;
    }

    public final float getThumbPosition() {
        return this.f44206z;
    }

    public int getThumbTextPadding() {
        return this.f44191k;
    }

    public ColorStateList getThumbTintList() {
        return this.f44182b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f44183c;
    }

    public Drawable getTrackDrawable() {
        return this.f44186f;
    }

    public ColorStateList getTrackTintList() {
        return this.f44187g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f44188h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f44181a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f44186f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f44177N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f44177N.end();
        this.f44177N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f44163S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f44186f;
        Rect rect = this.f44180Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f44168E;
        int i2 = this.f44170G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f44181a;
        if (drawable != null) {
            if (!this.f44194n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM24316b = AbstractC6737rL.m24316b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM24316b.left;
                rect.right -= rectM24316b.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f44174K : this.f44175L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f44173J;
            TextPaint textPaint = this.f44172I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f44195o : this.f44197q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f44181a != null) {
            Drawable drawable = this.f44186f;
            Rect rect = this.f44180Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM24316b = AbstractC6737rL.m24316b(this.f44181a);
            iMax = Math.max(0, rectM24316b.left - rect.left);
            iMax2 = Math.max(0, rectM24316b.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = AbstractC7337Al1.f354a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f44164A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f44164A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f44165B;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f44165B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f44165B;
        }
        this.f44167D = paddingLeft;
        this.f44168E = paddingTop;
        this.f44170G = height;
        this.f44169F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f44199s) {
            StaticLayout staticLayout = this.f44174K;
            TextPaint textPaint = this.f44172I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f44196p;
                this.f44174K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f44175L == null) {
                CharSequence charSequence2 = this.f44198r;
                this.f44175L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f44181a;
        Rect rect = this.f44180Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f44181a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f44181a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f44166C = Math.max(this.f44199s ? (this.f44191k * 2) + Math.max(this.f44174K.getWidth(), this.f44175L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f44186f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f44186f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f44181a;
        if (drawable3 != null) {
            Rect rectM24316b = AbstractC6737rL.m24316b(drawable3);
            iMax = Math.max(iMax, rectM24316b.left);
            iMax2 = Math.max(iMax2, rectM24316b.right);
        }
        int iMax3 = this.f44171H ? Math.max(this.f44192l, (this.f44166C * 2) + iMax + iMax2) : this.f44192l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f44164A = iMax3;
        this.f44165B = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f44195o : this.f44197q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11378v71.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m5263c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f44195o;
                if (string == null) {
                    string = getResources().getString(ru.mes.dnevnik.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                new C9019ck1(ru.mes.dnevnik.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m9817e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f44197q;
            if (string2 == null) {
                string2 = getResources().getString(ru.mes.dnevnik.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            new C9019ck1(ru.mes.dnevnik.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m9817e(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f44177N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f44162R, zIsChecked ? 1.0f : 0.0f);
        this.f44177N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f44177N.setAutoCancel(true);
        this.f44177N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11805yU1.m26160h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m5264d(z);
        setTextOnInternal(this.f44195o);
        setTextOffInternal(this.f44197q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f44171H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m5261a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f44199s != z) {
            this.f44199s = z;
            requestLayout();
            if (z) {
                m25368d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f44194n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f44192l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f44193m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f44172I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f44197q;
        if (string == null) {
            string = getResources().getString(ru.mes.dnevnik.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        new C9019ck1(ru.mes.dnevnik.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m9817e(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f44195o;
        if (string == null) {
            string = getResources().getString(ru.mes.dnevnik.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        new C9019ck1(ru.mes.dnevnik.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m9817e(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f44181a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f44181a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f44206z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f44191k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f44182b = colorStateList;
        this.f44184d = true;
        m25365a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f44183c = mode;
        this.f44185e = true;
        m25365a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f44186f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f44186f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f44187g = colorStateList;
        this.f44189i = true;
        m25366b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f44188h = mode;
        this.f44190j = true;
        m25366b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f44181a || drawable == this.f44186f;
    }
}

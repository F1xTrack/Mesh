package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: d5 */
/* loaded from: classes.dex */
public final class C3906d5 extends AbstractC10172li1 implements Animatable {

    /* renamed from: g */
    public static final /* synthetic */ int f25802g = 0;

    /* renamed from: c */
    public final Context f25804c;

    /* renamed from: d */
    public C3903d2 f25805d = null;

    /* renamed from: e */
    public ArrayList f25806e = null;

    /* renamed from: f */
    public final C1642a5 f25807f = new C1642a5(this);

    /* renamed from: b */
    public final C1763b5 f25803b = new C1763b5();

    public C3906d5(Context context) {
        this.f25804c = context;
    }

    @Override // p000.AbstractC10172li1, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            AbstractC4173hL.m18799a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            return AbstractC4173hL.m18800b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1763b5 c1763b5 = this.f25803b;
        c1763b5.f16737a.draw(canvas);
        if (c1763b5.f16738b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getAlpha() : this.f25803b.f16737a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f25803b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f37260a;
        return drawable != null ? AbstractC4173hL.m18801c(drawable) : this.f25803b.f16737a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f37260a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1825c5(0, this.f37260a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f25803b.f16737a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f25803b.f16737a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getOpacity() : this.f25803b.f16737a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0171, code lost:
    
        if (r8.f16738b != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0173, code lost:
    
        r8.f16738b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x017a, code lost:
    
        r8.f16738b.playTogether(r8.f16739c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0181, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3906d5.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.isAutoMirrored() : this.f25803b.f16737a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f37260a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f25803b.f16738b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.isStateful() : this.f25803b.f16737a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f25803b.f16737a.setBounds(rect);
        }
    }

    @Override // p000.AbstractC10172li1, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.setLevel(i) : this.f25803b.f16737a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.setState(iArr) : this.f25803b.f16737a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f25803b.f16737a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f25803b.f16737a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f25803b.f16737a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            C10682ph1.m23835c(drawable, i);
        } else {
            this.f25803b.f16737a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            AbstractC4173hL.m18806h(drawable, colorStateList);
        } else {
            this.f25803b.f16737a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            AbstractC4173hL.m18807i(drawable, mode);
        } else {
            this.f25803b.f16737a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f25803b.f16737a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1763b5 c1763b5 = this.f25803b;
        if (c1763b5.f16738b.isStarted()) {
            return;
        }
        c1763b5.f16738b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f25803b.f16738b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

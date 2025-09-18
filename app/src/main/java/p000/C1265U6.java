package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.mes.dnevnik.R;

/* renamed from: U6 */
/* loaded from: classes.dex */
public class C1265U6 extends SeekBar {

    /* renamed from: a */
    public final C1328V6 f11652a;

    public C1265U6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        R91.m6917a(this, getContext());
        C1328V6 c1328v6 = new C1328V6(this);
        this.f11652a = c1328v6;
        c1328v6.mo1061c1(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1328V6 c1328v6 = this.f11652a;
        Drawable drawable = c1328v6.f12349i;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1265U6 c1265u6 = c1328v6.f12348h;
        if (drawable.setState(c1265u6.getDrawableState())) {
            c1265u6.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11652a.f12349i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11652a.m8296q1(canvas);
    }
}

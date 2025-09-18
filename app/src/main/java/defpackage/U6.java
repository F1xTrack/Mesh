package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class U6 extends SeekBar {
    public final V6 a;

    public U6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        R91.a(this, getContext());
        V6 v6 = new V6(this);
        this.a = v6;
        v6.c1(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        V6 v6 = this.a;
        Drawable drawable = v6.i;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        U6 u6 = v6.h;
        if (drawable.setState(u6.getDrawableState())) {
            u6.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.q1(canvas);
    }
}

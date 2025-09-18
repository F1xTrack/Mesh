package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import ru.mes.dnevnik.R;

/* renamed from: S6 */
/* loaded from: classes.dex */
public final class C1139S6 extends RatingBar {

    /* renamed from: a */
    public final CC0 f10581a;

    public C1139S6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        R91.m6917a(this, getContext());
        CC0 cc0 = new CC0(this);
        this.f10581a = cc0;
        cc0.mo1061c1(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f10581a.f1251c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}

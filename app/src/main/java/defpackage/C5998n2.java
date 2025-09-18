package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ru.mes.dnevnik.R;

/* renamed from: n2 */
/* loaded from: classes.dex */
public final class C5998n2 extends O6 implements InterfaceC6380p2 {
    public final /* synthetic */ C6189o2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5998n2(C6189o2 c6189o2, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = c6189o2;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        KY1.b(this, getContentDescription());
        setOnTouchListener(new C5234j2(this, this));
    }

    @Override // defpackage.InterfaceC6380p2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.InterfaceC6380p2
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC4135hL.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}

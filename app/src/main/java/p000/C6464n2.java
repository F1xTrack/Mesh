package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ru.mes.dnevnik.R;

/* renamed from: n2 */
/* loaded from: classes.dex */
public final class C6464n2 extends C0888O6 implements InterfaceC6592p2 {

    /* renamed from: d */
    public final /* synthetic */ C6527o2 f38047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6464n2(C6527o2 c6527o2, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f38047d = c6527o2;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        KY1.m4672b(this, getContentDescription());
        setOnTouchListener(new C6212j2(this, this));
    }

    @Override // p000.InterfaceC6592p2
    /* renamed from: a */
    public final boolean mo9824a() {
        return false;
    }

    @Override // p000.InterfaceC6592p2
    /* renamed from: b */
    public final boolean mo9825b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f38047d.m23313l();
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
            AbstractC4173hL.m18804f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}

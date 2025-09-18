package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: F6 */
/* loaded from: classes.dex */
public final class C0322F6 extends ContentFrameLayout {

    /* renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C0448H6 f3067i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0322F6(LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6, C1130Ry c1130Ry) {
        super(c1130Ry, null);
        this.f3067i = layoutInflaterFactory2C0448H6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f3067i.m3292u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = this.f3067i;
                layoutInflaterFactory2C0448H6.m3291s(layoutInflaterFactory2C0448H6.m3269A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }
}

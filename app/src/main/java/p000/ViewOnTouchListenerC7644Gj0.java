package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: Gj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC7644Gj0 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ int f3862a;

    /* renamed from: b */
    public final /* synthetic */ Object f3863b;

    public /* synthetic */ ViewOnTouchListenerC7644Gj0(int i, Object obj) {
        this.f3862a = i;
        this.f3863b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1014Q6 c1014q6;
        switch (this.f3862a) {
            case 0:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                C7696Hj0 c7696Hj0 = (C7696Hj0) this.f3863b;
                if (action == 0 && (c1014q6 = c7696Hj0.f4480z) != null && c1014q6.isShowing() && x >= 0 && x < c7696Hj0.f4480z.getWidth() && y >= 0 && y < c7696Hj0.f4480z.getHeight()) {
                    c7696Hj0.f4476v.postDelayed(c7696Hj0.f4472r, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                c7696Hj0.f4476v.removeCallbacks(c7696Hj0.f4472r);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f3863b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}

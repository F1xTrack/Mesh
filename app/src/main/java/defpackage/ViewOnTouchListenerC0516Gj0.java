package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: Gj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0516Gj0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnTouchListenerC0516Gj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Q6 q6;
        switch (this.a) {
            case 0:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                C0594Hj0 c0594Hj0 = (C0594Hj0) this.b;
                if (action == 0 && (q6 = c0594Hj0.z) != null && q6.isShowing() && x >= 0 && x < c0594Hj0.z.getWidth() && y >= 0 && y < c0594Hj0.z.getHeight()) {
                    c0594Hj0.v.postDelayed(c0594Hj0.r, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                c0594Hj0.v.removeCallbacks(c0594Hj0.r);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}

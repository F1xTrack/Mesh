package p000;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: bp */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC1809bp implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ int f17172a;

    /* renamed from: b */
    public final /* synthetic */ Object f17173b;

    public /* synthetic */ ViewOnTouchListenerC1809bp(int i, Object obj) {
        this.f17172a = i;
        this.f17173b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f17172a) {
            case 0:
                ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) this.f17173b;
                O90.m5968f(scaleGestureDetector, "$scaleGestureDetector");
                return scaleGestureDetector.onTouchEvent(motionEvent);
            default:
                C4237iM c4237iM = (C4237iM) this.f17173b;
                c4237iM.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c4237iM.f29106o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c4237iM.f29104m = false;
                    }
                    c4237iM.m19006u();
                    c4237iM.f29104m = true;
                    c4237iM.f29106o = System.currentTimeMillis();
                }
                return false;
        }
    }
}

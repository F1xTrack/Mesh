package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: bp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC2396bp implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnTouchListenerC2396bp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) this.b;
                O90.f(scaleGestureDetector, "$scaleGestureDetector");
                return scaleGestureDetector.onTouchEvent(motionEvent);
            default:
                C4329iM c4329iM = (C4329iM) this.b;
                c4329iM.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c4329iM.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c4329iM.m = false;
                    }
                    c4329iM.u();
                    c4329iM.m = true;
                    c4329iM.o = System.currentTimeMillis();
                }
                return false;
        }
    }
}

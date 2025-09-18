package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalantis.ucrop.view.GestureCropImageView;

/* loaded from: classes2.dex */
public final class N00 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ N00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.b;
                float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                    doubleTapTargetScale = gestureCropImageView.getMaxScale();
                }
                float currentScale = gestureCropImageView.getCurrentScale();
                RunnableC5263jB runnableC5263jB = new RunnableC5263jB(gestureCropImageView, currentScale, doubleTapTargetScale - currentScale, x, y);
                gestureCropImageView.y = runnableC5263jB;
                gestureCropImageView.post(runnableC5263jB);
                break;
            case 1:
                float x2 = motionEvent.getX();
                C6661qV0 c6661qV0 = (C6661qV0) this.b;
                c6661qV0.m = x2;
                c6661qV0.n = motionEvent.getY();
                c6661qV0.o = 1;
                break;
            default:
                O90.f(motionEvent, "e");
                motionEvent.getX();
                ((OJ1) this.b).getClass();
                motionEvent.getY();
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 0:
                ((GestureCropImageView) this.b).d(-f, -f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }
}

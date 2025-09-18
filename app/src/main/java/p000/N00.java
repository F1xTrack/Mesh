package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalantis.ucrop.view.GestureCropImageView;

/* loaded from: classes2.dex */
public final class N00 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ int f7450a;

    /* renamed from: b */
    public final /* synthetic */ Object f7451b;

    public /* synthetic */ N00(int i, Object obj) {
        this.f7450a = i;
        this.f7451b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f7450a) {
            case 0:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.f7451b;
                float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                    doubleTapTargetScale = gestureCropImageView.getMaxScale();
                }
                float currentScale = gestureCropImageView.getCurrentScale();
                RunnableC6221jB runnableC6221jB = new RunnableC6221jB(gestureCropImageView, currentScale, doubleTapTargetScale - currentScale, x, y);
                gestureCropImageView.f36344y = runnableC6221jB;
                gestureCropImageView.post(runnableC6221jB);
                break;
            case 1:
                float x2 = motionEvent.getX();
                C10785qV0 c10785qV0 = (C10785qV0) this.f7451b;
                c10785qV0.f40908m = x2;
                c10785qV0.f40909n = motionEvent.getY();
                c10785qV0.f40910o = 1;
                break;
            default:
                O90.m5968f(motionEvent, "e");
                motionEvent.getX();
                ((OJ1) this.f7451b).getClass();
                motionEvent.getY();
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f7450a) {
            case 0:
                ((GestureCropImageView) this.f7451b).m24433d(-f, -f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }
}

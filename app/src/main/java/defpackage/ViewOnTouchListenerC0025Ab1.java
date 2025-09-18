package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: Ab1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0025Ab1 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC1340Qy0 {
    public final C5622l31 c;
    public final GestureDetector e;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final float d = 25.0f;
    public volatile float f = 3.1415927f;

    public ViewOnTouchListenerC0025Ab1(Context context, C5622l31 c5622l31) {
        this.c = c5622l31;
        this.e = new GestureDetector(context, this);
    }

    @Override // defpackage.InterfaceC1340Qy0
    public final void a(float f, float[] fArr) {
        this.f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.a.x) / this.d;
        float y = motionEvent2.getY();
        PointF pointF = this.a;
        float f3 = (y - pointF.y) / this.d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        C5622l31 c5622l31 = this.c;
        PointF pointF3 = this.b;
        synchronized (c5622l31) {
            float f5 = pointF3.y;
            c5622l31.g = f5;
            Matrix.setRotateM(c5622l31.e, 0, -f5, (float) Math.cos(c5622l31.h), (float) Math.sin(c5622l31.h), 0.0f);
            Matrix.setRotateM(c5622l31.f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}

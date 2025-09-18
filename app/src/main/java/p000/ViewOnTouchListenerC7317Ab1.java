package p000;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: Ab1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC7317Ab1 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC8194Qy0 {

    /* renamed from: c */
    public final C10089l31 f274c;

    /* renamed from: e */
    public final GestureDetector f276e;

    /* renamed from: a */
    public final PointF f272a = new PointF();

    /* renamed from: b */
    public final PointF f273b = new PointF();

    /* renamed from: d */
    public final float f275d = 25.0f;

    /* renamed from: f */
    public volatile float f277f = 3.1415927f;

    public ViewOnTouchListenerC7317Ab1(Context context, C10089l31 c10089l31) {
        this.f274c = c10089l31;
        this.f276e = new GestureDetector(context, this);
    }

    @Override // p000.InterfaceC8194Qy0
    /* renamed from: a */
    public final void mo244a(float f, float[] fArr) {
        this.f277f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f272a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f272a.x) / this.f275d;
        float y = motionEvent2.getY();
        PointF pointF = this.f272a;
        float f3 = (y - pointF.y) / this.f275d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f277f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f273b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        C10089l31 c10089l31 = this.f274c;
        PointF pointF3 = this.f273b;
        synchronized (c10089l31) {
            float f5 = pointF3.y;
            c10089l31.f36852g = f5;
            Matrix.setRotateM(c10089l31.f36850e, 0, -f5, (float) Math.cos(c10089l31.f36853h), (float) Math.sin(c10089l31.f36853h), 0.0f);
            Matrix.setRotateM(c10089l31.f36851f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f274c.f36856k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f276e.onTouchEvent(motionEvent);
    }
}

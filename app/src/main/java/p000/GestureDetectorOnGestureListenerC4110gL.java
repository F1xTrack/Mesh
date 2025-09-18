package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.OverScroller;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.legere.pdfiumandroid.PdfDocument;

/* renamed from: gL */
/* loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC4110gL implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    public C11891zA0 f27678a;

    /* renamed from: b */
    public C6404m5 f27679b;

    /* renamed from: c */
    public GestureDetector f27680c;

    /* renamed from: d */
    public ScaleGestureDetector f27681d;

    /* renamed from: e */
    public boolean f27682e;

    /* renamed from: f */
    public boolean f27683f;

    /* renamed from: g */
    public boolean f27684g;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C11891zA0 c11891zA0 = this.f27678a;
        if (!c11891zA0.f45959z) {
            return false;
        }
        if (c11891zA0.getZoom() < c11891zA0.getMidZoom()) {
            c11891zA0.f45938e.m22664h(motionEvent.getX(), motionEvent.getY(), c11891zA0.f45944k, c11891zA0.getMidZoom());
            return true;
        }
        if (c11891zA0.getZoom() < c11891zA0.getMaxZoom()) {
            c11891zA0.f45938e.m22664h(motionEvent.getX(), motionEvent.getY(), c11891zA0.f45944k, c11891zA0.getMaxZoom());
            return true;
        }
        c11891zA0.f45938e.m22664h(c11891zA0.getWidth() / 2, c11891zA0.getHeight() / 2, c11891zA0.f45944k, c11891zA0.f45934a);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C6404m5 c6404m5 = this.f27679b;
        c6404m5.f37466a = false;
        ((OverScroller) c6404m5.f37470e).forceFinished(true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onFling(android.view.MotionEvent r21, android.view.MotionEvent r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.GestureDetectorOnGestureListenerC4110gL.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f27678a.f45950q.getClass();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        C11891zA0 c11891zA0 = this.f27678a;
        float zoom = c11891zA0.getZoom() * scaleFactor;
        float fMin = Math.min(TT1.f11393b, c11891zA0.getMinZoom());
        float fMin2 = Math.min(TT1.f11392a, c11891zA0.getMaxZoom());
        if (zoom < fMin) {
            scaleFactor = fMin / c11891zA0.getZoom();
        } else if (zoom > fMin2) {
            scaleFactor = fMin2 / c11891zA0.getZoom();
        }
        c11891zA0.m26028u(c11891zA0.f45944k * scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f27683f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f27678a.m26022o();
        this.f27678a.getScrollHandle();
        this.f27683f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f27682e = true;
        C11891zA0 c11891zA0 = this.f27678a;
        if (c11891zA0.f45944k != c11891zA0.f45934a || c11891zA0.f45958y) {
            c11891zA0.m26023p(c11891zA0.f45942i + (-f), c11891zA0.f45943j + (-f2));
        }
        if (!this.f27683f) {
            c11891zA0.m26021n();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean z;
        int iM26058i;
        int iM26055f;
        boolean z2;
        C11891zA0 c11891zA0 = this.f27678a;
        C11891zA0 c11891zA02 = (C11891zA0) c11891zA0.f45950q.f4314f;
        if (c11891zA02 != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("message", "pageSingleTap|" + c11891zA02.f46695N + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + motionEvent.getX() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + motionEvent.getY());
            InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) c11891zA02.getContext(), c11891zA02.getId());
            C4004ef c4004ef = new C4004ef(OZ1.m6094e(c11891zA02), c11891zA02.getId(), writableMapCreateMap, 7);
            if (interfaceC6947uPM6091b != null) {
                interfaceC6947uPM6091b.mo11046g(c4004ef);
            }
            z = true;
        } else {
            z = false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C11764yA0 c11764yA0 = c11891zA0.f45940g;
        if (c11764yA0 == null) {
            z2 = false;
        } else {
            float f = (-c11891zA0.getCurrentXOffset()) + x;
            float f2 = (-c11891zA0.getCurrentYOffset()) + y;
            int iM26053d = c11764yA0.m26053d(c11891zA0.f45957x ? f2 : f, c11891zA0.getZoom());
            SizeF sizeFM26057h = c11764yA0.m26057h(c11891zA0.getZoom(), iM26053d);
            if (c11891zA0.f45957x) {
                iM26055f = (int) c11764yA0.m26058i(c11891zA0.getZoom(), iM26053d);
                iM26058i = (int) c11764yA0.m26055f(c11891zA0.getZoom(), iM26053d);
            } else {
                iM26058i = (int) c11764yA0.m26058i(c11891zA0.getZoom(), iM26053d);
                iM26055f = (int) c11764yA0.m26055f(c11891zA0.getZoom(), iM26053d);
            }
            for (PdfDocument.Link link : c11764yA0.f46110b.getPageLinks(c11764yA0.f46109a, c11764yA0.m26050a(iM26053d))) {
                RectF rectF = new RectF(c11764yA0.f46109a.openPage(c11764yA0.m26050a(iM26053d)).mapRectToDevice(iM26055f, iM26058i, (int) sizeFM26057h.getWidth(), (int) sizeFM26057h.getHeight(), 0, link.getBounds()));
                rectF.sort();
                if (rectF.contains(f, f2)) {
                    C0471HT c0471ht = c11891zA0.f45950q;
                    C9405fj0 c9405fj0 = new C9405fj0();
                    c9405fj0.f27354a = link;
                    InterfaceC9277ej0 interfaceC9277ej0 = (InterfaceC9277ej0) c0471ht.f4315g;
                    if (interfaceC9277ej0 != null) {
                        interfaceC9277ej0.mo9684a(c9405fj0);
                    }
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (!z && !z2) {
            c11891zA0.getScrollHandle();
        }
        c11891zA0.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f27684g) {
            return false;
        }
        boolean z = this.f27680c.onTouchEvent(motionEvent) || this.f27681d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f27682e) {
            this.f27682e = false;
            C11891zA0 c11891zA0 = this.f27678a;
            c11891zA0.m26022o();
            this.f27678a.getScrollHandle();
            C6404m5 c6404m5 = this.f27679b;
            if (!c6404m5.f37466a && !c6404m5.f37467b) {
                c11891zA0.m26024q();
            }
        }
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

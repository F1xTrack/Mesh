package defpackage;

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

/* renamed from: gL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC3944gL implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public C8312zA0 a;
    public C5818m5 b;
    public GestureDetector c;
    public ScaleGestureDetector d;
    public boolean e;
    public boolean f;
    public boolean g;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C8312zA0 c8312zA0 = this.a;
        if (!c8312zA0.z) {
            return false;
        }
        if (c8312zA0.getZoom() < c8312zA0.getMidZoom()) {
            c8312zA0.e.h(motionEvent.getX(), motionEvent.getY(), c8312zA0.k, c8312zA0.getMidZoom());
            return true;
        }
        if (c8312zA0.getZoom() < c8312zA0.getMaxZoom()) {
            c8312zA0.e.h(motionEvent.getX(), motionEvent.getY(), c8312zA0.k, c8312zA0.getMaxZoom());
            return true;
        }
        c8312zA0.e.h(c8312zA0.getWidth() / 2, c8312zA0.getHeight() / 2, c8312zA0.k, c8312zA0.a);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C5818m5 c5818m5 = this.b;
        c5818m5.a = false;
        ((OverScroller) c5818m5.e).forceFinished(true);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GestureDetectorOnGestureListenerC3944gL.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a.q.getClass();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        C8312zA0 c8312zA0 = this.a;
        float zoom = c8312zA0.getZoom() * scaleFactor;
        float fMin = Math.min(TT1.b, c8312zA0.getMinZoom());
        float fMin2 = Math.min(TT1.a, c8312zA0.getMaxZoom());
        if (zoom < fMin) {
            scaleFactor = fMin / c8312zA0.getZoom();
        } else if (zoom > fMin2) {
            scaleFactor = fMin2 / c8312zA0.getZoom();
        }
        c8312zA0.u(c8312zA0.k * scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.a.o();
        this.a.getScrollHandle();
        this.f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.e = true;
        C8312zA0 c8312zA0 = this.a;
        if (c8312zA0.k != c8312zA0.a || c8312zA0.y) {
            c8312zA0.p(c8312zA0.i + (-f), c8312zA0.j + (-f2));
        }
        if (!this.f) {
            c8312zA0.n();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean z;
        int i;
        int iF;
        boolean z2;
        C8312zA0 c8312zA0 = this.a;
        C8312zA0 c8312zA02 = (C8312zA0) c8312zA0.q.f;
        if (c8312zA02 != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("message", "pageSingleTap|" + c8312zA02.N + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + motionEvent.getX() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + motionEvent.getY());
            InterfaceC7405uP interfaceC7405uPB = OZ1.b((S91) c8312zA02.getContext(), c8312zA02.getId());
            C3622ef c3622ef = new C3622ef(OZ1.e(c8312zA02), c8312zA02.getId(), writableMapCreateMap, 7);
            if (interfaceC7405uPB != null) {
                interfaceC7405uPB.g(c3622ef);
            }
            z = true;
        } else {
            z = false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C8122yA0 c8122yA0 = c8312zA0.g;
        if (c8122yA0 == null) {
            z2 = false;
        } else {
            float f = (-c8312zA0.getCurrentXOffset()) + x;
            float f2 = (-c8312zA0.getCurrentYOffset()) + y;
            int iD = c8122yA0.d(c8312zA0.x ? f2 : f, c8312zA0.getZoom());
            SizeF sizeFH = c8122yA0.h(c8312zA0.getZoom(), iD);
            if (c8312zA0.x) {
                iF = (int) c8122yA0.i(c8312zA0.getZoom(), iD);
                i = (int) c8122yA0.f(c8312zA0.getZoom(), iD);
            } else {
                i = (int) c8122yA0.i(c8312zA0.getZoom(), iD);
                iF = (int) c8122yA0.f(c8312zA0.getZoom(), iD);
            }
            for (PdfDocument.Link link : c8122yA0.b.getPageLinks(c8122yA0.a, c8122yA0.a(iD))) {
                RectF rectF = new RectF(c8122yA0.a.openPage(c8122yA0.a(iD)).mapRectToDevice(iF, i, (int) sizeFH.getWidth(), (int) sizeFH.getHeight(), 0, link.getBounds()));
                rectF.sort();
                if (rectF.contains(f, f2)) {
                    HT ht = c8312zA0.q;
                    C3826fj0 c3826fj0 = new C3826fj0();
                    c3826fj0.a = link;
                    InterfaceC3635ej0 interfaceC3635ej0 = (InterfaceC3635ej0) ht.g;
                    if (interfaceC3635ej0 != null) {
                        interfaceC3635ej0.a(c3826fj0);
                    }
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (!z && !z2) {
            c8312zA0.getScrollHandle();
        }
        c8312zA0.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.g) {
            return false;
        }
        boolean z = this.c.onTouchEvent(motionEvent) || this.d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.e) {
            this.e = false;
            C8312zA0 c8312zA0 = this.a;
            c8312zA0.o();
            this.a.getScrollHandle();
            C5818m5 c5818m5 = this.b;
            if (!c5818m5.a && !c5818m5.b) {
                c8312zA0.q();
            }
        }
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: iW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4359iW extends R00 {
    public static final double U = Math.cos(Math.toRadians(30.0d / 2.0d));
    public static final double V = Math.cos(Math.toRadians(60.0d / 2.0d));
    public Handler Q;
    public int R;
    public VelocityTracker T;
    public int M = 1;
    public int N = 1;
    public final long O = 800;
    public final long P = 2000;
    public final DE S = new DE(15, this);

    public static final boolean J(C4359iW c4359iW, C5555ki1 c5555ki1, int i, double d) {
        C5555ki1 c5555ki12;
        if ((c4359iW.N & i) == i) {
            C5555ki1 c5555ki13 = C5555ki1.d;
            switch (i) {
                case 1:
                    c5555ki12 = C5555ki1.e;
                    break;
                case 2:
                    c5555ki12 = C5555ki1.d;
                    break;
                case 3:
                case 7:
                default:
                    c5555ki12 = C5555ki1.l;
                    break;
                case 4:
                    c5555ki12 = C5555ki1.f;
                    break;
                case 5:
                    c5555ki12 = C5555ki1.h;
                    break;
                case 6:
                    c5555ki12 = C5555ki1.j;
                    break;
                case 8:
                    c5555ki12 = C5555ki1.g;
                    break;
                case 9:
                    c5555ki12 = C5555ki1.i;
                    break;
                case 10:
                    c5555ki12 = C5555ki1.k;
                    break;
            }
            O90.f(c5555ki12, "vector");
            if ((c5555ki1.b * c5555ki12.b) + (c5555ki1.a * c5555ki12.a) > d) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        VelocityTracker velocityTracker = this.T;
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        O90.c(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
        C5555ki1 c5555ki1 = C5555ki1.d;
        VelocityTracker velocityTracker2 = this.T;
        O90.c(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        C5555ki1 c5555ki12 = new C5555ki1(velocityTracker2.getXVelocity(), velocityTracker2.getYVelocity());
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(Boolean.valueOf(J(this, c5555ki12, numArr[i].intValue(), U)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList2.add(Boolean.valueOf(J(this, c5555ki12, numArr2[i2].intValue(), V)));
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (arrayList2.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = z2 | z;
        boolean z4 = c5555ki12.c > ((double) this.P);
        if (this.R != this.M || !z3 || !z4) {
            return false;
        }
        Handler handler = this.Q;
        O90.c(handler);
        handler.removeCallbacksAndMessages(null);
        a(false);
        return true;
    }

    @Override // defpackage.R00
    public final void a(boolean z) {
        super.a(z);
        k();
    }

    @Override // defpackage.R00
    public final void t() {
        Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.R00
    public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        if (C(motionEvent2)) {
            int i = this.f;
            if (i == 0) {
                this.T = VelocityTracker.obtain();
                d();
                this.R = 1;
                Handler handler = this.Q;
                if (handler == null) {
                    this.Q = new Handler(Looper.getMainLooper());
                } else {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = this.Q;
                O90.c(handler2);
                handler2.postDelayed(this.S, this.O);
            }
            if (i == 2) {
                I(motionEvent2);
                if (motionEvent2.getPointerCount() > this.R) {
                    this.R = motionEvent2.getPointerCount();
                }
                if (motionEvent2.getActionMasked() != 1 || I(motionEvent2)) {
                    return;
                }
                m();
            }
        }
    }

    @Override // defpackage.R00
    public final void x() {
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.T = null;
        Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.R00
    public final void z() {
        super.z();
        this.M = 1;
        this.N = 1;
    }
}

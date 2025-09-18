package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: iW */
/* loaded from: classes2.dex */
public final class C4247iW extends R00 {

    /* renamed from: U */
    public static final double f29280U = Math.cos(Math.toRadians(30.0d / 2.0d));

    /* renamed from: V */
    public static final double f29281V = Math.cos(Math.toRadians(60.0d / 2.0d));

    /* renamed from: Q */
    public Handler f29286Q;

    /* renamed from: R */
    public int f29287R;

    /* renamed from: T */
    public VelocityTracker f29289T;

    /* renamed from: M */
    public int f29282M = 1;

    /* renamed from: N */
    public int f29283N = 1;

    /* renamed from: O */
    public final long f29284O = 800;

    /* renamed from: P */
    public final long f29285P = 2000;

    /* renamed from: S */
    public final RunnableC0204DE f29288S = new RunnableC0204DE(15, this);

    /* renamed from: J */
    public static final boolean m19052J(C4247iW c4247iW, C10044ki1 c10044ki1, int i, double d) {
        C10044ki1 c10044ki12;
        if ((c4247iW.f29283N & i) == i) {
            C10044ki1 c10044ki13 = C10044ki1.f36620d;
            switch (i) {
                case 1:
                    c10044ki12 = C10044ki1.f36621e;
                    break;
                case 2:
                    c10044ki12 = C10044ki1.f36620d;
                    break;
                case 3:
                case 7:
                default:
                    c10044ki12 = C10044ki1.f36628l;
                    break;
                case 4:
                    c10044ki12 = C10044ki1.f36622f;
                    break;
                case 5:
                    c10044ki12 = C10044ki1.f36624h;
                    break;
                case 6:
                    c10044ki12 = C10044ki1.f36626j;
                    break;
                case 8:
                    c10044ki12 = C10044ki1.f36623g;
                    break;
                case 9:
                    c10044ki12 = C10044ki1.f36625i;
                    break;
                case 10:
                    c10044ki12 = C10044ki1.f36627k;
                    break;
            }
            O90.m5968f(c10044ki12, "vector");
            if ((c10044ki1.f36630b * c10044ki12.f36630b) + (c10044ki1.f36629a * c10044ki12.f36629a) > d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final boolean m19053I(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        VelocityTracker velocityTracker = this.f29289T;
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        O90.m5965c(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
        C10044ki1 c10044ki1 = C10044ki1.f36620d;
        VelocityTracker velocityTracker2 = this.f29289T;
        O90.m5965c(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        C10044ki1 c10044ki12 = new C10044ki1(velocityTracker2.getXVelocity(), velocityTracker2.getYVelocity());
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(Boolean.valueOf(m19052J(this, c10044ki12, numArr[i].intValue(), f29280U)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList2.add(Boolean.valueOf(m19052J(this, c10044ki12, numArr2[i2].intValue(), f29281V)));
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
        boolean z4 = c10044ki12.f36631c > ((double) this.f29285P);
        if (this.f29287R != this.f29282M || !z3 || !z4) {
            return false;
        }
        Handler handler = this.f29286Q;
        O90.m5965c(handler);
        handler.removeCallbacksAndMessages(null);
        mo721a(false);
        return true;
    }

    @Override // p000.R00
    /* renamed from: a */
    public final void mo721a(boolean z) {
        super.mo721a(z);
        m6862k();
    }

    @Override // p000.R00
    /* renamed from: t */
    public final void mo5614t() {
        Handler handler = this.f29286Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p000.R00
    /* renamed from: u */
    public final void mo722u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        if (m6851C(motionEvent2)) {
            int i = this.f9905f;
            if (i == 0) {
                this.f29289T = VelocityTracker.obtain();
                m6856d();
                this.f29287R = 1;
                Handler handler = this.f29286Q;
                if (handler == null) {
                    this.f29286Q = new Handler(Looper.getMainLooper());
                } else {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = this.f29286Q;
                O90.m5965c(handler2);
                handler2.postDelayed(this.f29288S, this.f29284O);
            }
            if (i == 2) {
                m19053I(motionEvent2);
                if (motionEvent2.getPointerCount() > this.f29287R) {
                    this.f29287R = motionEvent2.getPointerCount();
                }
                if (motionEvent2.getActionMasked() != 1 || m19053I(motionEvent2)) {
                    return;
                }
                m6864m();
            }
        }
    }

    @Override // p000.R00
    /* renamed from: x */
    public final void mo723x() {
        VelocityTracker velocityTracker = this.f29289T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f29289T = null;
        Handler handler = this.f29286Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p000.R00
    /* renamed from: z */
    public final void mo6872z() {
        super.mo6872z();
        this.f29282M = 1;
        this.f29283N = 1;
    }
}

package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import kotlin.KotlinVersion;

/* renamed from: wi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11579wi1 {

    /* renamed from: a */
    public VelocityTracker f45039a;

    /* renamed from: b */
    public float f45040b;

    /* renamed from: c */
    public float f45041c;

    /* renamed from: a */
    public final void m25673a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (this.f45039a == null) {
            this.f45039a = VelocityTracker.obtain();
        }
        this.f45039a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f45039a.computeCurrentVelocity(1);
            this.f45040b = this.f45039a.getXVelocity();
            this.f45041c = this.f45039a.getYVelocity();
            VelocityTracker velocityTracker = this.f45039a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f45039a = null;
            }
        }
    }
}

package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import kotlin.KotlinVersion;

/* renamed from: wi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7845wi1 {
    public VelocityTracker a;
    public float b;
    public float c;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (this.a == null) {
            this.a = VelocityTracker.obtain();
        }
        this.a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.a.computeCurrentVelocity(1);
            this.b = this.a.getXVelocity();
            this.c = this.a.getYVelocity();
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.a = null;
            }
        }
    }
}

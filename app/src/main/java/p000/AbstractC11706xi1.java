package p000;

import android.view.VelocityTracker;

/* renamed from: xi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11706xi1 {
    /* renamed from: a */
    public static float m25926a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* renamed from: b */
    public static float m25927b(VelocityTracker velocityTracker, int i, int i2) {
        return velocityTracker.getAxisVelocity(i, i2);
    }

    /* renamed from: c */
    public static boolean m25928c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }
}

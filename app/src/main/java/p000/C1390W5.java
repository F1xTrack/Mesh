package p000;

import android.window.BackEvent;

/* renamed from: W5 */
/* loaded from: classes.dex */
public final class C1390W5 {

    /* renamed from: a */
    public static final C1390W5 f12991a = new C1390W5();

    /* renamed from: a */
    public final BackEvent m8665a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    /* renamed from: b */
    public final float m8666b(BackEvent backEvent) {
        O90.m5968f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m8667c(BackEvent backEvent) {
        O90.m5968f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m8668d(BackEvent backEvent) {
        O90.m5968f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m8669e(BackEvent backEvent) {
        O90.m5968f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}

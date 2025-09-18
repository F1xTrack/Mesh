package p000;

import android.view.Surface;

/* renamed from: Aj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7333Aj1 {
    /* renamed from: a */
    public static void m309a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC10872rA1.m24172e("Failed to call Surface.setFrameRate", e);
        }
    }
}

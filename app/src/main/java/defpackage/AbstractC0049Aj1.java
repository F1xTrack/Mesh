package defpackage;

import android.view.Surface;

/* renamed from: Aj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0049Aj1 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC6789rA1.e("Failed to call Surface.setFrameRate", e);
        }
    }
}

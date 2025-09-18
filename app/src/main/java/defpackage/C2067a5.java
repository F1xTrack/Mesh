package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2067a5 implements Drawable.Callback {
    public final /* synthetic */ int a = 1;
    public Object b;

    public /* synthetic */ C2067a5() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((C3324d5) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((C3324d5) this.b).scheduleSelf(runnable, j);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((C3324d5) this.b).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public C2067a5(C3324d5 c3324d5) {
        this.b = c3324d5;
    }

    private final void a(Drawable drawable) {
    }
}

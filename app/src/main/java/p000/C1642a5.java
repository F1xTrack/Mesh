package p000;

import android.graphics.drawable.Drawable;

/* renamed from: a5 */
/* loaded from: classes.dex */
public final class C1642a5 implements Drawable.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f15303a = 1;

    /* renamed from: b */
    public Object f15304b;

    public /* synthetic */ C1642a5() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f15303a) {
            case 0:
                ((C3906d5) this.f15304b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f15303a) {
            case 0:
                ((C3906d5) this.f15304b).scheduleSelf(runnable, j);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f15304b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f15303a) {
            case 0:
                ((C3906d5) this.f15304b).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f15304b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public C1642a5(C3906d5 c3906d5) {
        this.f15304b = c3906d5;
    }

    /* renamed from: a */
    private final void m9671a(Drawable drawable) {
    }
}

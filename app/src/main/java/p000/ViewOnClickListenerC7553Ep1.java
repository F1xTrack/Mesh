package p000;

import android.view.View;

/* renamed from: Ep1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC7553Ep1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2914a;

    /* renamed from: b */
    public final /* synthetic */ C7657Gp1 f2915b;

    public ViewOnClickListenerC7553Ep1(C7657Gp1 c7657Gp1, int i) {
        this.f2915b = c7657Gp1;
        this.f2914a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7657Gp1 c7657Gp1 = this.f2915b;
        C8286Ss0 c8286Ss0M7456b = C8286Ss0.m7456b(this.f2914a, c7657Gp1.f3914d.f17163e.f11017b);
        C8898bo0 c8898bo0 = c7657Gp1.f3914d;
        C6763rl c6763rl = c8898bo0.f17162d;
        C8286Ss0 c8286Ss0 = c6763rl.f41848a;
        if (c8286Ss0M7456b.compareTo(c8286Ss0) < 0) {
            c8286Ss0M7456b = c8286Ss0;
        } else {
            C8286Ss0 c8286Ss02 = c6763rl.f41849b;
            if (c8286Ss0M7456b.compareTo(c8286Ss02) > 0) {
                c8286Ss0M7456b = c8286Ss02;
            }
        }
        c8898bo0.m10522s(c8286Ss0M7456b);
        c8898bo0.m10523t(1);
    }
}

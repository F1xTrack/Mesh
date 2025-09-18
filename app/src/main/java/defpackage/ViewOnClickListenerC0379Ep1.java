package defpackage;

import android.view.View;

/* renamed from: Ep1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0379Ep1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0535Gp1 b;

    public ViewOnClickListenerC0379Ep1(C0535Gp1 c0535Gp1, int i) {
        this.b = c0535Gp1;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0535Gp1 c0535Gp1 = this.b;
        C1478Ss0 c1478Ss0B = C1478Ss0.b(this.a, c0535Gp1.d.e.b);
        C2394bo0 c2394bo0 = c0535Gp1.d;
        C6898rl c6898rl = c2394bo0.d;
        C1478Ss0 c1478Ss0 = c6898rl.a;
        if (c1478Ss0B.compareTo(c1478Ss0) < 0) {
            c1478Ss0B = c1478Ss0;
        } else {
            C1478Ss0 c1478Ss02 = c6898rl.b;
            if (c1478Ss0B.compareTo(c1478Ss02) > 0) {
                c1478Ss0B = c1478Ss02;
            }
        }
        c2394bo0.s(c1478Ss0B);
        c2394bo0.t(1);
    }
}

package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class V4 extends AbstractC2123aN1 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ V4(Animatable animatable, int i) {
        this.a = i;
        this.b = animatable;
    }

    @Override // defpackage.AbstractC2123aN1
    public final void g() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((C3324d5) this.b).start();
                break;
        }
    }

    @Override // defpackage.AbstractC2123aN1
    public final void h() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((C3324d5) this.b).stop();
                break;
        }
    }
}

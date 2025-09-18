package p000;

import android.graphics.drawable.Animatable;

/* renamed from: V4 */
/* loaded from: classes.dex */
public final class C1326V4 extends AbstractC8717aN1 {

    /* renamed from: a */
    public final /* synthetic */ int f12343a;

    /* renamed from: b */
    public final Animatable f12344b;

    public /* synthetic */ C1326V4(Animatable animatable, int i) {
        this.f12343a = i;
        this.f12344b = animatable;
    }

    @Override // p000.AbstractC8717aN1
    /* renamed from: g */
    public final void mo8290g() {
        switch (this.f12343a) {
            case 0:
                this.f12344b.start();
                break;
            default:
                ((C3906d5) this.f12344b).start();
                break;
        }
    }

    @Override // p000.AbstractC8717aN1
    /* renamed from: h */
    public final void mo8291h() {
        switch (this.f12343a) {
            case 0:
                this.f12344b.stop();
                break;
            default:
                ((C3906d5) this.f12344b).stop();
                break;
        }
    }
}

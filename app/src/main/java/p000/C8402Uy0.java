package p000;

import android.view.OrientationEventListener;

/* renamed from: Uy0 */
/* loaded from: classes2.dex */
public final class C8402Uy0 extends OrientationEventListener {

    /* renamed from: a */
    public final /* synthetic */ C7196yM f12268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8402Uy0(C7196yM c7196yM, S91 s91) {
        super(s91);
        this.f12268a = c7196yM;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        C7196yM c7196yM = this.f12268a;
        c7196yM.getClass();
        c7196yM.f46222b = (45 > i || i >= 136) ? (135 > i || i >= 226) ? (225 > i || i >= 316) ? 0 : 1 : 2 : 3;
        C7196yM.m26140a(c7196yM);
    }
}

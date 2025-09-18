package defpackage;

import android.view.OrientationEventListener;

/* renamed from: Uy0 */
/* loaded from: classes2.dex */
public final class C1652Uy0 extends OrientationEventListener {
    public final /* synthetic */ C8157yM a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1652Uy0(C8157yM c8157yM, S91 s91) {
        super(s91);
        this.a = c8157yM;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        C8157yM c8157yM = this.a;
        c8157yM.getClass();
        c8157yM.b = (45 > i || i >= 136) ? (135 > i || i >= 226) ? (225 > i || i >= 316) ? 0 : 1 : 2 : 3;
        C8157yM.a(c8157yM);
    }
}

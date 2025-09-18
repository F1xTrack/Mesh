package p000;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: dV */
/* loaded from: classes.dex */
public final /* synthetic */ class C3932dV implements InterfaceC9307ey0 {

    /* renamed from: a */
    public final /* synthetic */ int f26124a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseMessaging f26125b;

    public /* synthetic */ C3932dV(FirebaseMessaging firebaseMessaging, int i) {
        this.f26124a = i;
        this.f26125b = firebaseMessaging;
    }

    @Override // p000.InterfaceC9307ey0
    public final void onSuccess(Object obj) throws NumberFormatException {
        FirebaseMessaging firebaseMessaging = this.f26125b;
        switch (this.f26124a) {
            case 0:
                C10542ob1 c10542ob1 = (C10542ob1) obj;
                if (firebaseMessaging.f18472e.m18864m()) {
                    c10542ob1.m23512h();
                    break;
                }
                break;
            default:
                C0308Et c0308Et = (C0308Et) obj;
                LL0 ll0 = FirebaseMessaging.f18465l;
                firebaseMessaging.getClass();
                if (c0308Et != null) {
                    TA1.m7614d(c0308Et.f2938a);
                    firebaseMessaging.m11312g();
                    break;
                }
                break;
        }
    }
}

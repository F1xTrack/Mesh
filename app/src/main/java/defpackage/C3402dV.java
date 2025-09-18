package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: dV */
/* loaded from: classes.dex */
public final /* synthetic */ class C3402dV implements InterfaceC3680ey0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ C3402dV(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // defpackage.InterfaceC3680ey0
    public final void onSuccess(Object obj) throws NumberFormatException {
        FirebaseMessaging firebaseMessaging = this.b;
        switch (this.a) {
            case 0:
                C6298ob1 c6298ob1 = (C6298ob1) obj;
                if (firebaseMessaging.e.m()) {
                    c6298ob1.h();
                    break;
                }
                break;
            default:
                C0389Et c0389Et = (C0389Et) obj;
                LL0 ll0 = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                if (c0389Et != null) {
                    TA1.d(c0389Et.a);
                    firebaseMessaging.g();
                    break;
                }
                break;
        }
    }
}

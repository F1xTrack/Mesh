package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: aV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2145aV implements InterfaceC5441k61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ C2145aV(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.InterfaceC5441k61
    public final Task then(Object obj) {
        String str = this.b;
        C6298ob1 c6298ob1 = (C6298ob1) obj;
        switch (this.a) {
            case 0:
                LL0 ll0 = FirebaseMessaging.l;
                c6298ob1.getClass();
                C3892g32 c3892g32F = c6298ob1.f(new C5725lb1("S", str));
                c6298ob1.h();
                return c3892g32F;
            default:
                LL0 ll02 = FirebaseMessaging.l;
                c6298ob1.getClass();
                C3892g32 c3892g32F2 = c6298ob1.f(new C5725lb1("U", str));
                c6298ob1.h();
                return c3892g32F2;
        }
    }
}

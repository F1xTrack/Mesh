package p000;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: aV */
/* loaded from: classes.dex */
public final /* synthetic */ class C1668aV implements InterfaceC9968k61 {

    /* renamed from: a */
    public final /* synthetic */ int f15534a;

    /* renamed from: b */
    public final /* synthetic */ String f15535b;

    public /* synthetic */ C1668aV(String str, int i) {
        this.f15534a = i;
        this.f15535b = str;
    }

    @Override // p000.InterfaceC9968k61
    public final Task then(Object obj) {
        String str = this.f15535b;
        C10542ob1 c10542ob1 = (C10542ob1) obj;
        switch (this.f15534a) {
            case 0:
                LL0 ll0 = FirebaseMessaging.f18465l;
                c10542ob1.getClass();
                C9450g32 c9450g32M23510f = c10542ob1.m23510f(new C10158lb1("S", str));
                c10542ob1.m23512h();
                return c9450g32M23510f;
            default:
                LL0 ll02 = FirebaseMessaging.f18465l;
                c10542ob1.getClass();
                C9450g32 c9450g32M23510f2 = c10542ob1.m23510f(new C10158lb1("U", str));
                c10542ob1.m23512h();
                return c9450g32M23510f2;
        }
    }
}

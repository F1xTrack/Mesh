package p000;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* renamed from: zF */
/* loaded from: classes.dex */
public final /* synthetic */ class C7252zF implements InterfaceC0750Lv {

    /* renamed from: a */
    public final /* synthetic */ int f46743a;

    /* renamed from: b */
    public final /* synthetic */ C11011sG0 f46744b;

    public /* synthetic */ C7252zF(C11011sG0 c11011sG0, int i) {
        this.f46743a = i;
        this.f46744b = c11011sG0;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public final Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f46743a) {
            case 0:
                return new C0079BF((Context) c8128Pr0.mo4066a(Context.class), ((C0786MU) c8128Pr0.mo4066a(C0786MU.class)).m5381f(), c8128Pr0.m6460z(S20.class), c8128Pr0.mo4068c(C3980eH.class), (Executor) c8128Pr0.mo4071h(this.f46744b));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f46744b, c8128Pr0);
            case 2:
                return FirebasePerfRegistrar.lambda$getComponents$0(this.f46744b, c8128Pr0);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f46744b, c8128Pr0);
        }
    }
}

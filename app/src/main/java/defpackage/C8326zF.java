package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* renamed from: zF */
/* loaded from: classes.dex */
public final /* synthetic */ class C8326zF implements InterfaceC0940Lv {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6997sG0 b;

    public /* synthetic */ C8326zF(C6997sG0 c6997sG0, int i) {
        this.a = i;
        this.b = c6997sG0;
    }

    @Override // defpackage.InterfaceC0940Lv
    public final Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 0:
                return new BF((Context) c1241Pr0.a(Context.class), ((MU) c1241Pr0.a(MU.class)).f(), c1241Pr0.z(S20.class), c1241Pr0.c(C3550eH.class), (Executor) c1241Pr0.h(this.b));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, c1241Pr0);
            case 2:
                return FirebasePerfRegistrar.lambda$getComponents$0(this.b, c1241Pr0);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.b, c1241Pr0);
        }
    }
}

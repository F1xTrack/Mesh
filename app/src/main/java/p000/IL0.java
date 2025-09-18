package p000;

import com.google.firebase.messaging.FirebaseMessaging;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class IL0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f4903a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseMessaging f4904b;

    public /* synthetic */ IL0(FirebaseMessaging firebaseMessaging, int i) {
        this.f4903a = i;
        this.f4904b = firebaseMessaging;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4903a) {
            case 0:
                return ReactNativeFirebaseMessagingModule.lambda$deleteToken$4(this.f4904b);
            default:
                return ReactNativeFirebaseMessagingModule.lambda$getToken$2(this.f4904b);
        }
    }
}

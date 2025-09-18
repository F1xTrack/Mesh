package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class IL0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ IL0(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return ReactNativeFirebaseMessagingModule.lambda$deleteToken$4(this.b);
            default:
                return ReactNativeFirebaseMessagingModule.lambda$getToken$2(this.b);
        }
    }
}

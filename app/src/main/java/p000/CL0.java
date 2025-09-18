package p000;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.config.ReactNativeFirebaseConfigModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class CL0 implements InterfaceC8036Nx0 {

    /* renamed from: a */
    public final /* synthetic */ int f1324a;

    /* renamed from: b */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f1325b;

    /* renamed from: c */
    public final /* synthetic */ Promise f1326c;

    public /* synthetic */ CL0(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, int i) {
        this.f1324a = i;
        this.f1325b = reactNativeFirebaseConfigModule;
        this.f1326c = promise;
    }

    @Override // p000.InterfaceC8036Nx0
    public final void onComplete(Task task) {
        switch (this.f1324a) {
            case 0:
                this.f1325b.lambda$reset$3(this.f1326c, task);
                break;
            case 1:
                this.f1325b.lambda$activate$0(this.f1326c, task);
                break;
            case 2:
                this.f1325b.lambda$setConfigSettings$4(this.f1326c, task);
                break;
            case 3:
                this.f1325b.lambda$fetchAndActivate$2(this.f1326c, task);
                break;
            case 4:
                this.f1325b.lambda$fetch$1(this.f1326c, task);
                break;
            case 5:
                this.f1325b.lambda$setDefaults$5(this.f1326c, task);
                break;
            case 6:
                this.f1325b.lambda$ensureInitialized$7(this.f1326c, task);
                break;
            case 7:
                this.f1325b.lambda$setDefaultsFromResource$6(this.f1326c, task);
                break;
            default:
                this.f1325b.lambda$setCustomSignals$8(this.f1326c, task);
                break;
        }
    }
}

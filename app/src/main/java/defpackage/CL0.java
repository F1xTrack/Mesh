package defpackage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.config.ReactNativeFirebaseConfigModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class CL0 implements InterfaceC1103Nx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactNativeFirebaseConfigModule b;
    public final /* synthetic */ Promise c;

    public /* synthetic */ CL0(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, int i) {
        this.a = i;
        this.b = reactNativeFirebaseConfigModule;
        this.c = promise;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public final void onComplete(Task task) {
        switch (this.a) {
            case 0:
                this.b.lambda$reset$3(this.c, task);
                break;
            case 1:
                this.b.lambda$activate$0(this.c, task);
                break;
            case 2:
                this.b.lambda$setConfigSettings$4(this.c, task);
                break;
            case 3:
                this.b.lambda$fetchAndActivate$2(this.c, task);
                break;
            case 4:
                this.b.lambda$fetch$1(this.c, task);
                break;
            case 5:
                this.b.lambda$setDefaults$5(this.c, task);
                break;
            case 6:
                this.b.lambda$ensureInitialized$7(this.c, task);
                break;
            case 7:
                this.b.lambda$setDefaultsFromResource$6(this.c, task);
                break;
            default:
                this.b.lambda$setCustomSignals$8(this.c, task);
                break;
        }
    }
}

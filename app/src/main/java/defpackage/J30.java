package defpackage;

import com.facebook.react.bridge.Promise;
import com.huawei.hms.rn.push.remote.HmsPushProfile;

/* loaded from: classes.dex */
public final /* synthetic */ class J30 implements InterfaceC3299cy0, InterfaceC1415Rx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HmsPushProfile b;
    public final /* synthetic */ Promise c;

    public /* synthetic */ J30(HmsPushProfile hmsPushProfile, Promise promise, int i) {
        this.a = i;
        this.b = hmsPushProfile;
        this.c = promise;
    }

    @Override // defpackage.InterfaceC1415Rx0
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 1:
                this.b.lambda$deleteProfile$5(this.c, exc);
                break;
            case 2:
            case 4:
            default:
                this.b.lambda$addProfileWithSubjectId$3(this.c, exc);
                break;
            case 3:
                this.b.lambda$addProfile$1(this.c, exc);
                break;
            case 5:
                this.b.lambda$deleteProfileWithSubjectId$7(this.c, exc);
                break;
        }
    }

    @Override // defpackage.InterfaceC3299cy0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteProfile$4(this.c, (Void) obj);
                break;
            case 1:
            case 3:
            default:
                this.b.lambda$addProfileWithSubjectId$2(this.c, (Void) obj);
                break;
            case 2:
                this.b.lambda$addProfile$0(this.c, (Void) obj);
                break;
            case 4:
                this.b.lambda$deleteProfileWithSubjectId$6(this.c, (Void) obj);
                break;
        }
    }
}

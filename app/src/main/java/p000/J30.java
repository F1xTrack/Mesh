package p000;

import com.facebook.react.bridge.Promise;

/* loaded from: classes.dex */
public final /* synthetic */ class J30 implements InterfaceC9051cy0, InterfaceC8244Rx0 {

    /* renamed from: a */
    public final /* synthetic */ int f5293a;

    /* renamed from: b */
    public final /* synthetic */ HmsPushProfile f5294b;

    /* renamed from: c */
    public final /* synthetic */ Promise f5295c;

    public /* synthetic */ J30(HmsPushProfile hmsPushProfile, Promise promise, int i) {
        this.f5293a = i;
        this.f5294b = hmsPushProfile;
        this.f5295c = promise;
    }

    @Override // p000.InterfaceC8244Rx0
    public void onFailure(Exception exc) {
        switch (this.f5293a) {
            case 1:
                this.f5294b.lambda$deleteProfile$5(this.f5295c, exc);
                break;
            case 2:
            case 4:
            default:
                this.f5294b.lambda$addProfileWithSubjectId$3(this.f5295c, exc);
                break;
            case 3:
                this.f5294b.lambda$addProfile$1(this.f5295c, exc);
                break;
            case 5:
                this.f5294b.lambda$deleteProfileWithSubjectId$7(this.f5295c, exc);
                break;
        }
    }

    @Override // p000.InterfaceC9051cy0
    public void onSuccess(Object obj) {
        switch (this.f5293a) {
            case 0:
                this.f5294b.lambda$deleteProfile$4(this.f5295c, (Void) obj);
                break;
            case 1:
            case 3:
            default:
                this.f5294b.lambda$addProfileWithSubjectId$2(this.f5295c, (Void) obj);
                break;
            case 2:
                this.f5294b.lambda$addProfile$0(this.f5295c, (Void) obj);
                break;
            case 4:
                this.f5294b.lambda$deleteProfileWithSubjectId$6(this.f5295c, (Void) obj);
                break;
        }
    }
}

package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes.dex */
public final /* synthetic */ class EQ0 implements InterfaceC3680ey0, InterfaceC1571Tx0 {
    public final /* synthetic */ RemoteConfigManager a;

    public /* synthetic */ EQ0(RemoteConfigManager remoteConfigManager) {
        this.a = remoteConfigManager;
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        this.a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) {
        this.a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}

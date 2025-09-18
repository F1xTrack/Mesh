package p000;

import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes.dex */
public final /* synthetic */ class EQ0 implements InterfaceC9307ey0, InterfaceC8348Tx0 {

    /* renamed from: a */
    public final /* synthetic */ RemoteConfigManager f2697a;

    public /* synthetic */ EQ0(RemoteConfigManager remoteConfigManager) {
        this.f2697a = remoteConfigManager;
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        this.f2697a.m11327xc904e814(exc);
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) {
        this.f2697a.m11326xc904e813((Boolean) obj);
    }
}

package p000;

import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes.dex */
public final class PK0 implements ReactInstanceManagerInspectorTarget.TargetDelegate {

    /* renamed from: a */
    public final /* synthetic */ QK0 f8997a;

    public PK0(QK0 qk0) {
        this.f8997a = qk0;
    }

    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final void onReload() {
        UiThreadUtil.runOnUiThread(new RunnableC8352Tz0(13, this));
    }

    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final void onSetPausedInDebuggerMessage(String str) {
        QK0 qk0 = this.f8997a;
        if (str == null) {
            qk0.f9573i.getClass();
        } else {
            qk0.f9573i.getClass();
        }
    }
}

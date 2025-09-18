package defpackage;

import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes.dex */
public final class PK0 implements ReactInstanceManagerInspectorTarget.TargetDelegate {
    public final /* synthetic */ QK0 a;

    public PK0(QK0 qk0) {
        this.a = qk0;
    }

    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final void onReload() {
        UiThreadUtil.runOnUiThread(new RunnableC1577Tz0(13, this));
    }

    @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
    public final void onSetPausedInDebuggerMessage(String str) {
        QK0 qk0 = this.a;
        if (str == null) {
            qk0.i.getClass();
        } else {
            qk0.i.getClass();
        }
    }
}

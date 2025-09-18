package androidx.camera.extensions;

import androidx.camera.extensions.impl.InitializerImpl;
import p000.C0300El;

/* loaded from: classes.dex */
class ExtensionsManager$2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
    final /* synthetic */ C1691a this$0;
    final /* synthetic */ C0300El val$completer;

    public ExtensionsManager$2(C1691a c1691a, C0300El c0300El) {
        this.this$0 = c1691a;
        this.val$completer = c0300El;
    }

    public void onFailure(int i) {
        this.val$completer.m2377d(new Exception("Failed to deinitialize extensions."));
    }

    public void onSuccess() {
        this.val$completer.m2375b(null);
    }
}

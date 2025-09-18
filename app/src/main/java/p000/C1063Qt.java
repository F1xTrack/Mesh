package p000;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.microsoft.codepush.react.CodePushDialog;

/* renamed from: Qt */
/* loaded from: classes2.dex */
public final class C1063Qt implements LifecycleEventListener {

    /* renamed from: a */
    public final /* synthetic */ String f9833a;

    /* renamed from: b */
    public final /* synthetic */ String f9834b;

    /* renamed from: c */
    public final /* synthetic */ String f9835c;

    /* renamed from: d */
    public final /* synthetic */ String f9836d;

    /* renamed from: e */
    public final /* synthetic */ Callback f9837e;

    /* renamed from: f */
    public final /* synthetic */ CodePushDialog f9838f;

    public C1063Qt(CodePushDialog codePushDialog, String str, String str2, String str3, String str4, Callback callback) {
        this.f9838f = codePushDialog;
        this.f9833a = str;
        this.f9834b = str2;
        this.f9835c = str3;
        this.f9836d = str4;
        this.f9837e = callback;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        CodePushDialog codePushDialog = this.f9838f;
        Activity currentActivity = codePushDialog.getCurrentActivity();
        if (currentActivity != null) {
            codePushDialog.getReactApplicationContext().removeLifecycleEventListener(this);
            this.f9838f.showDialogInternal(this.f9833a, this.f9834b, this.f9835c, this.f9836d, this.f9837e, currentActivity);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }
}

package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.microsoft.codepush.react.CodePushDialog;

/* renamed from: Qt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1324Qt implements LifecycleEventListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Callback e;
    public final /* synthetic */ CodePushDialog f;

    public C1324Qt(CodePushDialog codePushDialog, String str, String str2, String str3, String str4, Callback callback) {
        this.f = codePushDialog;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = callback;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        CodePushDialog codePushDialog = this.f;
        Activity currentActivity = codePushDialog.getCurrentActivity();
        if (currentActivity != null) {
            codePushDialog.getReactApplicationContext().removeLifecycleEventListener(this);
            this.f.showDialogInternal(this.a, this.b, this.c, this.d, this.e, currentActivity);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }
}

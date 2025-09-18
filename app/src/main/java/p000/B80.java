package p000;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* loaded from: classes.dex */
public final class B80 extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0267EE f585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B80(InputConnection inputConnection, C0267EE c0267ee) {
        super(inputConnection, false);
        this.f585a = c0267ee;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        byte b;
        ResultReceiver resultReceiver;
        C0267EE c0267ee = this.f585a;
        boolean zM2070b = false;
        zM2070b = false;
        zM2070b = false;
        zM2070b = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i = bundle.getInt(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        C7621Fx1 c7621Fx1 = new C7621Fx1();
                        if (Build.VERSION.SDK_INT >= 25) {
                            c7621Fx1.f3494a = new C80(uri, clipDescription, uri2);
                        } else {
                            c7621Fx1.f3494a = new C10189lr0(uri, clipDescription, uri2, 16);
                        }
                        zM2070b = c0267ee.m2070b(c7621Fx1, i, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(zM2070b ? 1 : 0, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if (zM2070b) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}

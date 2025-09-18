package defpackage;

import android.content.DialogInterface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.rn.push.constants.NotificationConstants;

/* loaded from: classes2.dex */
public final class XH0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C2226aw a;

    public XH0(C2226aw c2226aw) {
        this.a = c2226aw;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        O90.f(dialogInterface, "dialog");
        C2226aw c2226aw = this.a;
        if (c2226aw.c || !((ReactApplicationContext) c2226aw.e).hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dismissedAction");
        ((Promise) c2226aw.d).resolve(writableNativeMap);
        c2226aw.c = true;
    }
}

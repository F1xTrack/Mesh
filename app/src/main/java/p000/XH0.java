package p000;

import android.content.DialogInterface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;

/* loaded from: classes2.dex */
public final class XH0 implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C1753aw f13663a;

    public XH0(C1753aw c1753aw) {
        this.f13663a = c1753aw;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        O90.m5968f(dialogInterface, "dialog");
        C1753aw c1753aw = this.f13663a;
        if (c1753aw.f16683c || !((ReactApplicationContext) c1753aw.f16685e).hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dismissedAction");
        ((Promise) c1753aw.f16684d).resolve(writableNativeMap);
        c1753aw.f16683c = true;
    }
}

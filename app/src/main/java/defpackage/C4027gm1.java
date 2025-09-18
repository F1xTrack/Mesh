package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.List;

/* renamed from: gm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4027gm1 implements InterfaceC8404zf {
    @Override // defpackage.InterfaceC8404zf
    public final void a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", reactApplicationContext.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        reactApplicationContext.sendBroadcast(intent);
    }

    @Override // defpackage.InterfaceC8404zf
    public final List b() {
        return Arrays.asList("com.vivo.launcher");
    }
}

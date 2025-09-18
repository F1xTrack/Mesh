package p000;

import android.content.ComponentName;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.List;

/* renamed from: gm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9540gm1 implements InterfaceC7278zf {
    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", reactApplicationContext.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        reactApplicationContext.sendBroadcast(intent);
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Arrays.asList("com.vivo.launcher");
    }
}

package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;

/* renamed from: Xp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1860Xp1 implements InterfaceC8404zf {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // defpackage.InterfaceC8404zf
    public final void a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        reactApplicationContext.getContentResolver().call(this.a, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // defpackage.InterfaceC8404zf
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}

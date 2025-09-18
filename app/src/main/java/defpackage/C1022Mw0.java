package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;

/* renamed from: Mw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1022Mw0 implements InterfaceC8404zf {
    public int a;

    @Override // defpackage.InterfaceC8404zf
    public final void a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        reactApplicationContext.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // defpackage.InterfaceC8404zf
    public final List b() {
        return Collections.singletonList("com.oppo.launcher");
    }
}

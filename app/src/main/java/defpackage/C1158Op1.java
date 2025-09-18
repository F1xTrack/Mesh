package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Op1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1158Op1 implements InterfaceC8404zf {
    @Override // defpackage.InterfaceC8404zf
    public final void a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        reactApplicationContext.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
    }

    @Override // defpackage.InterfaceC8404zf
    public final List b() {
        return new ArrayList(0);
    }
}

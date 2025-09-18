package p000;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Op1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8073Op1 implements InterfaceC7278zf {
    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        reactApplicationContext.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return new ArrayList(0);
    }
}

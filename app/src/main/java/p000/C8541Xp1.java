package p000;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;

/* renamed from: Xp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8541Xp1 implements InterfaceC7278zf {

    /* renamed from: a */
    public final Uri f13991a = Uri.parse("content://com.android.badge/badge");

    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        reactApplicationContext.getContentResolver().call(this.f13991a, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Collections.singletonList("com.zui.launcher");
    }
}

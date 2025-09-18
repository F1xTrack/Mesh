package defpackage;

import android.content.pm.PackageManager;
import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.io.IOException;

/* renamed from: sU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7039sU0 extends R11 {
    public ReactApplicationContext f;

    @Override // defpackage.AbstractC2038Zx
    public final String b() {
        return null;
    }

    @Override // defpackage.AbstractC2038Zx
    public final String d() {
        return Telephony.Sms.getDefaultSmsPackage(this.f);
    }

    @Override // defpackage.AbstractC2038Zx
    public final String e() {
        return "market://details?id=com.android.mms";
    }

    @Override // defpackage.R11, defpackage.AbstractC2038Zx
    public final void g(ReadableMap readableMap) throws PackageManager.NameNotFoundException, IOException {
        super.g(readableMap);
        l(null);
    }
}

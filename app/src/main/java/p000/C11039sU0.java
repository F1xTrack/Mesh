package p000;

import android.content.pm.PackageManager;
import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.io.IOException;

/* renamed from: sU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11039sU0 extends R11 {

    /* renamed from: f */
    public ReactApplicationContext f42457f;

    @Override // p000.AbstractC1633Zx
    /* renamed from: b */
    public final String mo8965b() {
        return null;
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: d */
    public final String mo8966d() {
        return Telephony.Sms.getDefaultSmsPackage(this.f42457f);
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: e */
    public final String mo8967e() {
        return "market://details?id=com.android.mms";
    }

    @Override // p000.R11, p000.AbstractC1633Zx
    /* renamed from: g */
    public final void mo4103g(ReadableMap readableMap) throws PackageManager.NameNotFoundException, IOException {
        super.mo4103g(readableMap);
        m6878l(null);
    }
}

package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C3138v0;
import com.yandex.metrica.impl.ob.T1;
import com.yandex.metrica.impl.ob.W4;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class V4 extends X1<C2931mh, C3138v0.a> {
    private final Y4 o;
    private final C2864k0 p;
    private final Z4 q;
    private final W4.b r;
    private final Om s;
    private C3165vm t;
    private final String u;
    private final I8 v;
    private X4 w;

    public V4(Y4 y4, C2864k0 c2864k0, Z4 z4, I8 i8) {
        this(y4, c2864k0, z4, i8, new W4.b(), new Nm(), new C3165vm(), new C2931mh(), new C3088t0());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean A() {
        return super.A() & (!m());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        C2931mh c2931mh = (C2931mh) this.j;
        X4 x4 = this.w;
        c2931mh.getClass();
        builder.appendPath("diagnostic");
        builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, x4.g());
        builder.appendQueryParameter(CommonUrlParts.UUID, x4.x());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, "5.0.0");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, "45001354");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, x4.k());
        if (x4.k().contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION, x4.f());
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, x4.b());
        builder.appendQueryParameter(CommonUrlParts.MODEL, x4.n());
        builder.appendQueryParameter("manufacturer", x4.m());
        builder.appendQueryParameter("os_version", x4.p());
        builder.appendQueryParameter(CommonUrlParts.OS_API_LEVEL, String.valueOf(x4.o()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(x4.v()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(x4.u()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(x4.t()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(x4.s()));
        builder.appendQueryParameter(CommonUrlParts.LOCALE, x4.l());
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, x4.j());
        builder.appendQueryParameter("app_id", x4.q());
        builder.appendQueryParameter("api_key_128", x4.C());
        builder.appendQueryParameter("app_debuggable", x4.A());
        builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, x4.i());
        builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, x4.c());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean o() throws UnsupportedEncodingException {
        byte[] bArrB;
        X4 x4A = this.o.a();
        this.w = x4A;
        boolean zY = x4A.y();
        boolean zB = U2.b(this.w.D());
        if (!zY || zB) {
            return false;
        }
        a(this.w.D());
        W4.b bVar = this.r;
        C2864k0 c2864k0 = this.p;
        X4 x4 = this.w;
        Z4 z4 = this.q;
        I8 i8 = this.v;
        bVar.getClass();
        byte[] bArrA = new W4(c2864k0, x4, z4, new C2819i4(i8), new Mn(1024, "diagnostic event name", AbstractC3265zm.a()), new Mn(204800, "diagnostic event value", AbstractC3265zm.a()), new Nm()).a();
        try {
            this.t.getClass();
            bArrB = V0.b(bArrA);
        } catch (Throwable unused) {
            bArrB = null;
        }
        if (!U2.a(bArrB)) {
            a("Content-Encoding", "gzip");
            bArrA = bArrB;
        }
        a(bArrA);
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean p() {
        boolean zP = super.p();
        a(this.s.a());
        return zP;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean r() {
        C3138v0.a aVarB = B();
        return aVarB != null && "accepted".equals(aVarB.a);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
    }

    public V4(Y4 y4, C2864k0 c2864k0, Z4 z4, I8 i8, W4.b bVar, Om om, C3165vm c3165vm, C2931mh c2931mh, C3088t0 c3088t0) {
        super(c3088t0, c2931mh);
        this.o = y4;
        this.p = c2864k0;
        this.q = z4;
        this.v = i8;
        this.r = bVar;
        this.s = om;
        this.t = c3165vm;
        this.u = V4.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.DIAGNOSTIC;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public String a() {
        return this.u;
    }
}

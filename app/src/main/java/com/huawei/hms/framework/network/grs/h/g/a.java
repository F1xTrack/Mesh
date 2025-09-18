package com.huawei.hms.framework.network.grs.h.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import defpackage.C5981mx0;
import defpackage.C6094nX0;
import defpackage.C8001xX0;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class a {
    private static final HostnameVerifier a = new C5981mx0(1);

    public static HostnameVerifier a() {
        return a;
    }

    public static SSLSocketFactory a(Context context) {
        try {
            return new C6094nX0(new C8001xX0(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks")));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}

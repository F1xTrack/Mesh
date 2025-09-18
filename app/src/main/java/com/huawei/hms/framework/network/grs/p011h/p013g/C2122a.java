package com.huawei.hms.framework.network.grs.p011h.p013g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p000.C10329mx0;
import p000.C10405nX0;
import p000.C11683xX0;

/* renamed from: com.huawei.hms.framework.network.grs.h.g.a */
/* loaded from: classes.dex */
public class C2122a {

    /* renamed from: a */
    private static final HostnameVerifier f19119a = new C10329mx0(1);

    /* renamed from: a */
    public static HostnameVerifier m11874a() {
        return f19119a;
    }

    /* renamed from: a */
    public static SSLSocketFactory m11875a(Context context) {
        try {
            return new C10405nX0(new C11683xX0(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks")));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}

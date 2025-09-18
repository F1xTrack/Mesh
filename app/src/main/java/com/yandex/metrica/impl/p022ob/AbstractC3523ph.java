package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import com.yandex.metrica.impl.p022ob.C3211dh;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.ph */
/* loaded from: classes2.dex */
public abstract class AbstractC3523ph<T extends C3211dh> implements InterfaceC3471nh<T> {

    /* renamed from: a */
    private C3321hn f24509a;

    /* renamed from: a */
    public void m16588a(Uri.Builder builder) {
        if (this.f24509a != null) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }

    /* renamed from: a */
    public void m16589a(C3321hn c3321hn) {
        this.f24509a = c3321hn;
    }
}

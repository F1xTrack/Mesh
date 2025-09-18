package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.yandex.metrica.impl.ob.C2707dh;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.ph, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3006ph<T extends C2707dh> implements InterfaceC2956nh<T> {
    private C2813hn a;

    public void a(Uri.Builder builder) {
        if (this.a != null) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }

    public void a(C2813hn c2813hn) {
        this.a = c2813hn;
    }
}

package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.hb */
/* loaded from: classes2.dex */
public final class C5170hb implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5095eb apply(File file) throws IOException {
        String strM19437a = AbstractC4515Ga.m19437a(file);
        if (!TextUtils.isEmpty(strM19437a)) {
            try {
                return new C5095eb(strM19437a);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}

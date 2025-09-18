package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.hb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4597hb implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4525eb apply(File file) throws IOException {
        String strA = Ga.a(file);
        if (!TextUtils.isEmpty(strA)) {
            try {
                return new C4525eb(strA);
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

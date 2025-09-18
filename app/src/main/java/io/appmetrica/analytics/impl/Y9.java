package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC5702lU;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* loaded from: classes2.dex */
public final class Y9 implements xn {
    public final Context a;
    public final String b;

    public Y9(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, this.b);
            if (fileFromSdkStorage != null) {
                fileFromSdkStorage.exists();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.a, this.b);
                if (fileFromAppStorage != null) {
                    FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
                return AbstractC5702lU.f(fileFromSdkStorage);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final void a(String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, this.b);
            if (fileFromSdkStorage != null) {
                AbstractC5702lU.h(fileFromSdkStorage, str);
            }
        } catch (Throwable unused) {
        }
    }
}

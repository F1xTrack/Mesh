package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.D51;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class Sd {
    public final Context a;
    public final kn b;
    public final ln c;

    public Sd(Context context) {
        this(context, new kn(), new ln());
    }

    public final String a(String str) {
        try {
            this.c.getClass();
            if (!ln.a(str)) {
                this.b.getClass();
                str = D51.m(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Ga.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Sd(Context context, kn knVar, ln lnVar) {
        this.a = context;
        this.b = knVar;
        this.c = lnVar;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}

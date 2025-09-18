package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import p000.D51;

/* renamed from: io.appmetrica.analytics.impl.Sd */
/* loaded from: classes2.dex */
public final class C4805Sd {

    /* renamed from: a */
    public final Context f30734a;

    /* renamed from: b */
    public final C5257kn f30735b;

    /* renamed from: c */
    public final C5282ln f30736c;

    public C4805Sd(Context context) {
        this(context, new C5257kn(), new C5282ln());
    }

    /* renamed from: a */
    public final String m19810a(String str) {
        try {
            this.f30736c.getClass();
            if (!C5282ln.m20694a(str)) {
                this.f30735b.getClass();
                str = D51.m1554m(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f30734a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC4515Ga.m19438a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C4805Sd(Context context, C5257kn c5257kn, C5282ln c5282ln) {
        this.f30734a = context;
        this.f30735b = c5257kn;
        this.f30736c = c5282ln;
    }

    /* renamed from: a */
    public final void m19811a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f30734a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f30734a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}

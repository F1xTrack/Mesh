package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import java.io.File;
import p000.AbstractC6366lU;

/* renamed from: io.appmetrica.analytics.impl.Y9 */
/* loaded from: classes2.dex */
public final class C4945Y9 implements InterfaceC5582xn {

    /* renamed from: a */
    public final Context f31102a;

    /* renamed from: b */
    public final String f31103b;

    public C4945Y9(Context context, String str) {
        this.f31102a = context;
        this.f31103b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final String mo20031a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f31102a, this.f31103b);
            if (fileFromSdkStorage != null) {
                fileFromSdkStorage.exists();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f31102a, this.f31103b);
                if (fileFromAppStorage != null) {
                    FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
                return AbstractC6366lU.m22436f(fileFromSdkStorage);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final void mo20032a(String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f31102a, this.f31103b);
            if (fileFromSdkStorage != null) {
                AbstractC6366lU.m22438h(fileFromSdkStorage, str);
            }
        } catch (Throwable unused) {
        }
    }
}

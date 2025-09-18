package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.metrica.C2460e;

/* renamed from: io.sentry.android.core.H */
/* loaded from: classes2.dex */
public abstract class AbstractC5836H extends ContentProvider {

    /* renamed from: a */
    public final C2460e f33540a = new C2460e(5, false);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        this.f33540a.m13830w(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.f33540a.m13830w(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f33540a.m13830w(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f33540a.m13830w(this);
        return 0;
    }
}

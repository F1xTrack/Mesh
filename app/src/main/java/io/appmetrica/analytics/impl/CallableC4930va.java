package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC4930va implements Callable {
    public final /* synthetic */ C4954wa a;

    public CallableC4930va(C4954wa c4954wa) {
        this.a = c4954wa;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.a.a.getContentResolver();
        C4954wa c4954wa = this.a;
        c4954wa.b = contentResolver.query(uri, null, null, new String[]{c4954wa.a.getPackageName()}, null);
        Cursor cursor = this.a.b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.a.b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new Ef(string, this.a.b.getLong(1), this.a.b.getLong(2), Df.d);
            }
        }
        return null;
    }
}

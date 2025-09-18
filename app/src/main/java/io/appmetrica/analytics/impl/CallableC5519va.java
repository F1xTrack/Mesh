package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.va */
/* loaded from: classes2.dex */
public final class CallableC5519va implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C5544wa f32725a;

    public CallableC5519va(C5544wa c5544wa) {
        this.f32725a = c5544wa;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f32725a.f32763a.getContentResolver();
        C5544wa c5544wa = this.f32725a;
        c5544wa.f32764b = contentResolver.query(uri, null, null, new String[]{c5544wa.f32763a.getPackageName()}, null);
        Cursor cursor = this.f32725a.f32764b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f32725a.f32764b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C4472Ef(string, this.f32725a.f32764b.getLong(1), this.f32725a.f32764b.getLong(2), EnumC4447Df.f30021d);
            }
        }
        return null;
    }
}

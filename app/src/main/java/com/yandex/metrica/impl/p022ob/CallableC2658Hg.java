package com.yandex.metrica.impl.p022ob;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2608Fg;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.Hg */
/* loaded from: classes2.dex */
class CallableC2658Hg implements Callable<C2608Fg> {

    /* renamed from: a */
    final /* synthetic */ C2683Ig f21363a;

    public CallableC2658Hg(C2683Ig c2683Ig) {
        this.f21363a = c2683Ig;
    }

    @Override // java.util.concurrent.Callable
    public C2608Fg call() throws Exception {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f21363a.f21433a.getContentResolver();
        C2683Ig c2683Ig = this.f21363a;
        c2683Ig.f21434b = contentResolver.query(uri, null, null, new String[]{c2683Ig.f21433a.getPackageName()}, null);
        if (this.f21363a.f21434b != null && this.f21363a.f21434b.moveToFirst()) {
            String string = this.f21363a.f21434b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C2608Fg(string, this.f21363a.f21434b.getLong(1), this.f21363a.f21434b.getLong(2), C2608Fg.a.HMS);
            }
        }
        return null;
    }
}

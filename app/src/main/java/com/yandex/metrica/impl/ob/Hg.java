package com.yandex.metrica.impl.ob;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Fg;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
class Hg implements Callable<Fg> {
    final /* synthetic */ Ig a;

    public Hg(Ig ig) {
        this.a = ig;
    }

    @Override // java.util.concurrent.Callable
    public Fg call() throws Exception {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.a.a.getContentResolver();
        Ig ig = this.a;
        ig.b = contentResolver.query(uri, null, null, new String[]{ig.a.getPackageName()}, null);
        if (this.a.b != null && this.a.b.moveToFirst()) {
            String string = this.a.b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new Fg(string, this.a.b.getLong(1), this.a.b.getLong(2), Fg.a.HMS);
            }
        }
        return null;
    }
}

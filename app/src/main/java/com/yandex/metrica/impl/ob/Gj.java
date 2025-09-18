package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
class Gj {
    private final Context a;
    private final L0 b;
    private final Rm c;

    public Gj(Context context, L0 l0, Rm rm) {
        this.a = context;
        this.b = l0;
        this.c = rm;
    }

    public String a() {
        return V0.a(this.b.a(this.a, "uuid.dat"));
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.c.a();
            }
            File fileA = this.b.a(this.a, "uuid.dat");
            if (fileA != null) {
                V0.a(str, "uuid.dat", new FileOutputStream(fileA));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.Gj */
/* loaded from: classes2.dex */
class C2636Gj {

    /* renamed from: a */
    private final Context f21320a;

    /* renamed from: b */
    private final C2742L0 f21321b;

    /* renamed from: c */
    private final C2913Rm f21322c;

    public C2636Gj(Context context, C2742L0 c2742l0, C2913Rm c2913Rm) {
        this.f21320a = context;
        this.f21321b = c2742l0;
        this.f21322c = c2913Rm;
    }

    /* renamed from: a */
    public String m14204a() {
        return C2991V0.m15292a(this.f21321b.m14500a(this.f21320a, "uuid.dat"));
    }

    /* renamed from: a */
    public String m14205a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f21322c.m15088a();
            }
            File fileM14500a = this.f21321b.m14500a(this.f21320a, "uuid.dat");
            if (fileM14500a != null) {
                C2991V0.m15295a(str, "uuid.dat", new FileOutputStream(fileM14500a));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}

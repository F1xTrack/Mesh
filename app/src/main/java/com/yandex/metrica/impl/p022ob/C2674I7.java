package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.I7 */
/* loaded from: classes2.dex */
public class C2674I7 implements InterfaceC3013Vm<File, C2649H7>, InterfaceC2988Um<File> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
    /* renamed from: a */
    public C2649H7 mo13948a(File file) throws IOException {
        String strM15292a = C2991V0.m15292a(file);
        if (!TextUtils.isEmpty(strM15292a)) {
            try {
                return new C2649H7(strM15292a);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
    /* renamed from: b */
    public void mo13904b(File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}

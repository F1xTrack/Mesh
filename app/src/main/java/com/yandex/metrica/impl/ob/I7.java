package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class I7 implements Vm<File, H7>, Um<File> {
    @Override // com.yandex.metrica.impl.ob.Vm
    public H7 a(File file) throws IOException {
        String strA = V0.a(file);
        if (!TextUtils.isEmpty(strA)) {
            try {
                return new H7(strA);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.Um
    public void b(File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}

package com.yandex.metrica.impl.p022ob;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.yandex.metrica.impl.ob.U7 */
/* loaded from: classes2.dex */
class C2973U7 implements FilenameFilter {
    public C2973U7(C2998V7 c2998v7) {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}

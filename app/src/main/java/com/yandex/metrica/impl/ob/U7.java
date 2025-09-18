package com.yandex.metrica.impl.ob;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
class U7 implements FilenameFilter {
    public U7(V7 v7) {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}

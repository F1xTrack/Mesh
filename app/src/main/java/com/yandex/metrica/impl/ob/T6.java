package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes2.dex */
public class T6 extends FileObserver {
    private final Um<File> a;
    private final File b;
    private final L0 c;

    public T6(File file, Um<File> um) {
        this(file, um, new L0());
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Um<File> um = this.a;
        L0 l0 = this.c;
        File file = this.b;
        l0.getClass();
        um.b(new File(file, str));
    }

    public T6(File file, Um<File> um, L0 l0) {
        super(file.getAbsolutePath(), 8);
        this.a = um;
        this.b = file;
        this.c = l0;
    }
}

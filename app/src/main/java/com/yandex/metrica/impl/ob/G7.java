package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import java.io.File;

/* loaded from: classes2.dex */
public class G7 {
    private final FileObserver a;
    private final File b;
    private final U6 c;

    public G7(File file, Um<File> um) {
        this(new T6(file, um), file, new U6());
    }

    public void a() {
        this.c.a(this.b);
        this.a.startWatching();
    }

    public G7(FileObserver fileObserver, File file, U6 u6) {
        this.a = fileObserver;
        this.b = file;
        this.c = u6;
    }
}

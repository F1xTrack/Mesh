package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class FileObserverC4616i6 extends FileObserver {
    public final Consumer a;
    public final File b;
    public final X9 c;

    public FileObserverC4616i6(File file, A1 a1, X9 x9) {
        super(file.getAbsolutePath(), 4095);
        this.a = a1;
        this.b = file;
        this.c = x9;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.a;
        X9 x9 = this.c;
        File file = this.b;
        x9.getClass();
        consumer.consume(new File(file, str));
    }
}

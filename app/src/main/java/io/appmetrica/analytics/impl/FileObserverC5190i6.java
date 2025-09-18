package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.i6 */
/* loaded from: classes2.dex */
public final class FileObserverC5190i6 extends FileObserver {

    /* renamed from: a */
    public final Consumer f31903a;

    /* renamed from: b */
    public final File f31904b;

    /* renamed from: c */
    public final C4921X9 f31905c;

    public FileObserverC5190i6(File file, C4358A1 c4358a1, C4921X9 c4921x9) {
        super(file.getAbsolutePath(), 4095);
        this.f31903a = c4358a1;
        this.f31904b = file;
        this.f31905c = c4921x9;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f31903a;
        C4921X9 c4921x9 = this.f31905c;
        File file = this.f31904b;
        c4921x9.getClass();
        consumer.consume(new File(file, str));
    }
}

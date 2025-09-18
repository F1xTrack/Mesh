package com.yandex.metrica.impl.p022ob;

import android.os.FileObserver;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.G7 */
/* loaded from: classes2.dex */
public class C2624G7 {

    /* renamed from: a */
    private final FileObserver f21285a;

    /* renamed from: b */
    private final File f21286b;

    /* renamed from: c */
    private final C2972U6 f21287c;

    public C2624G7(File file, InterfaceC2988Um<File> interfaceC2988Um) {
        this(new FileObserverC2947T6(file, interfaceC2988Um), file, new C2972U6());
    }

    /* renamed from: a */
    public void m14161a() {
        this.f21287c.m15269a(this.f21286b);
        this.f21285a.startWatching();
    }

    public C2624G7(FileObserver fileObserver, File file, C2972U6 c2972u6) {
        this.f21285a = fileObserver;
        this.f21286b = file;
        this.f21287c = c2972u6;
    }
}

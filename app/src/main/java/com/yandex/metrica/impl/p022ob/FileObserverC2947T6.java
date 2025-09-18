package com.yandex.metrica.impl.p022ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.T6 */
/* loaded from: classes2.dex */
public class FileObserverC2947T6 extends FileObserver {

    /* renamed from: a */
    private final InterfaceC2988Um<File> f22372a;

    /* renamed from: b */
    private final File f22373b;

    /* renamed from: c */
    private final C2742L0 f22374c;

    public FileObserverC2947T6(File file, InterfaceC2988Um<File> interfaceC2988Um) {
        this(file, interfaceC2988Um, new C2742L0());
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        InterfaceC2988Um<File> interfaceC2988Um = this.f22372a;
        C2742L0 c2742l0 = this.f22374c;
        File file = this.f22373b;
        c2742l0.getClass();
        interfaceC2988Um.mo13904b(new File(file, str));
    }

    public FileObserverC2947T6(File file, InterfaceC2988Um<File> interfaceC2988Um, C2742L0 c2742l0) {
        super(file.getAbsolutePath(), 8);
        this.f22372a = interfaceC2988Um;
        this.f22373b = file;
        this.f22374c = c2742l0;
    }
}

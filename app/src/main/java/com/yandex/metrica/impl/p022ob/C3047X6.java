package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X6 */
/* loaded from: classes2.dex */
public class C3047X6 implements InterfaceC3022W6 {

    /* renamed from: a */
    private final List<InterfaceC2988Um<String>> f22773a;

    /* renamed from: b */
    private final C3228e8 f22774b;

    /* renamed from: c */
    private final InterfaceC2988Um<String> f22775c;

    /* renamed from: com.yandex.metrica.impl.ob.X6$a */
    public class a implements InterfaceC2988Um<String> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(String str) {
            C3047X6.m15422a(C3047X6.this, str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3047X6(Context context) {
        String str;
        String strM16063a = C3323i.m16063a(context);
        File noBackupFilesDir = C2968U2.m15243a(21) ? context.getNoBackupFilesDir() : context.getFilesDir();
        if (noBackupFilesDir == null) {
            str = null;
        } else {
            str = noBackupFilesDir.getAbsolutePath() + "/appmetrica_native_crashes";
        }
        this(new C3228e8(strM16063a, str));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3022W6
    /* renamed from: a */
    public synchronized void mo15384a(InterfaceC2988Um<String> interfaceC2988Um) {
        this.f22773a.add(interfaceC2988Um);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3022W6
    /* renamed from: b */
    public synchronized void mo15385b(InterfaceC2988Um<String> interfaceC2988Um) {
        this.f22773a.remove(interfaceC2988Um);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: a */
    public void mo14019a() {
        this.f22774b.m15827a(this.f22775c);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: b */
    public void mo14021b() {
        this.f22774b.m15828b(this.f22775c);
    }

    /* renamed from: a */
    public static void m15422a(C3047X6 c3047x6, String str) {
        ArrayList arrayList;
        synchronized (c3047x6) {
            arrayList = new ArrayList(c3047x6.f22773a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC2988Um) it.next()).mo13904b(str);
        }
    }

    public C3047X6(C3228e8 c3228e8) {
        this.f22773a = new ArrayList();
        this.f22775c = new a();
        this.f22774b = c3228e8;
    }
}

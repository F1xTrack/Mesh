package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.V7 */
/* loaded from: classes2.dex */
public class C2998V7 implements InterfaceC2774M7<File> {

    /* renamed from: a */
    private final Context f22521a;

    /* renamed from: b */
    private final File f22522b;

    /* renamed from: c */
    private final C2626G9 f22523c;

    /* renamed from: d */
    private final C2742L0 f22524d;

    /* renamed from: e */
    private final C2874Q7 f22525e;

    /* renamed from: f */
    private final InterfaceC2799N7<String> f22526f;

    /* renamed from: g */
    private final InterfaceExecutorC3607sn f22527g;

    /* renamed from: com.yandex.metrica.impl.ob.V7$a */
    public static class a implements InterfaceC2988Um<File> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(File file) {
            file.delete();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.V7$b */
    public static class b implements InterfaceC2988Um<String> {

        /* renamed from: a */
        private final InterfaceC2799N7<String> f22528a;

        public b(InterfaceC2799N7<String> interfaceC2799N7) {
            this.f22528a = interfaceC2799N7;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f22528a.mo14642b(str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.V7$c */
    public static class c implements InterfaceC2988Um<String> {

        /* renamed from: a */
        private final InterfaceC2799N7<String> f22529a;

        public c(InterfaceC2799N7<String> interfaceC2799N7) {
            this.f22529a = interfaceC2799N7;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f22529a.mo14641a(str2);
        }
    }

    public C2998V7(Context context, C2742L0 c2742l0, C2874Q7 c2874q7, InterfaceC2799N7<String> interfaceC2799N7, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2626G9 c2626g9) {
        this.f22521a = context;
        this.f22524d = c2742l0;
        this.f22522b = c2742l0.m14502b(context);
        this.f22525e = c2874q7;
        this.f22526f = interfaceC2799N7;
        this.f22527g = interfaceExecutorC3607sn;
        this.f22523c = c2626g9;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2774M7
    /* renamed from: a */
    public void mo14605a(File file) {
        b bVar = new b(this.f22526f);
        ((C3581rn) this.f22527g).execute(new RunnableC3149b7(file, this.f22525e, new a(), bVar));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(File file) {
        File[] fileArrListFiles;
        if (file != null && file.exists()) {
            fileArrListFiles = file.listFiles(new C2973U7(this));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        } else {
            fileArrListFiles = new File[0];
        }
        for (File file2 : fileArrListFiles) {
            ((C3581rn) this.f22527g).execute(new RunnableC3149b7(file2, this.f22525e, new a(), new c(this.f22526f)));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2774M7
    /* renamed from: a */
    public synchronized void mo14604a() {
        File fileM14503b;
        if (C2968U2.m15243a(21) && (fileM14503b = this.f22524d.m14503b(this.f22521a.getFilesDir(), "YandexMetricaNativeCrashes")) != null) {
            if (this.f22523c.m14184n()) {
                if (fileM14503b.exists()) {
                    try {
                        fileM14503b.delete();
                    } catch (Throwable unused) {
                    }
                }
            } else {
                a2(fileM14503b);
                this.f22523c.m14185o();
            }
        }
        a2(this.f22522b);
    }
}

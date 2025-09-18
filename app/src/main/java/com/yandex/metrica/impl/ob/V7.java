package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

@Deprecated
/* loaded from: classes2.dex */
public class V7 implements M7<File> {
    private final Context a;
    private final File b;
    private final G9 c;
    private final L0 d;
    private final Q7 e;
    private final N7<String> f;
    private final InterfaceExecutorC3086sn g;

    public static class a implements Um<File> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            file.delete();
        }
    }

    public static class b implements Um<String> {
        private final N7<String> a;

        public b(N7<String> n7) {
            this.a = n7;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.a.b(str2);
        }
    }

    public static class c implements Um<String> {
        private final N7<String> a;

        public c(N7<String> n7) {
            this.a = n7;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.a.a(str2);
        }
    }

    public V7(Context context, L0 l0, Q7 q7, N7<String> n7, InterfaceExecutorC3086sn interfaceExecutorC3086sn, G9 g9) {
        this.a = context;
        this.d = l0;
        this.b = l0.b(context);
        this.e = q7;
        this.f = n7;
        this.g = interfaceExecutorC3086sn;
        this.c = g9;
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public void a(File file) {
        b bVar = new b(this.f);
        ((C3061rn) this.g).execute(new RunnableC2647b7(file, this.e, new a(), bVar));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(File file) {
        File[] fileArrListFiles;
        if (file != null && file.exists()) {
            fileArrListFiles = file.listFiles(new U7(this));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        } else {
            fileArrListFiles = new File[0];
        }
        for (File file2 : fileArrListFiles) {
            ((C3061rn) this.g).execute(new RunnableC2647b7(file2, this.e, new a(), new c(this.f)));
        }
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public synchronized void a() {
        File fileB;
        if (U2.a(21) && (fileB = this.d.b(this.a.getFilesDir(), "YandexMetricaNativeCrashes")) != null) {
            if (this.c.n()) {
                if (fileB.exists()) {
                    try {
                        fileB.delete();
                    } catch (Throwable unused) {
                    }
                }
            } else {
                a2(fileB);
                this.c.o();
            }
        }
        a2(this.b);
    }
}

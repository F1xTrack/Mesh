package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class X6 implements W6 {
    private final List<Um<String>> a;
    private final C2723e8 b;
    private final Um<String> c;

    public class a implements Um<String> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            X6.a(X6.this, str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public X6(Context context) {
        String str;
        String strA = C2814i.a(context);
        File noBackupFilesDir = U2.a(21) ? context.getNoBackupFilesDir() : context.getFilesDir();
        if (noBackupFilesDir == null) {
            str = null;
        } else {
            str = noBackupFilesDir.getAbsolutePath() + "/appmetrica_native_crashes";
        }
        this(new C2723e8(strA, str));
    }

    @Override // com.yandex.metrica.impl.ob.W6
    public synchronized void a(Um<String> um) {
        this.a.add(um);
    }

    @Override // com.yandex.metrica.impl.ob.W6
    public synchronized void b(Um<String> um) {
        this.a.remove(um);
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
        this.b.a(this.c);
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        this.b.b(this.c);
    }

    public static void a(X6 x6, String str) {
        ArrayList arrayList;
        synchronized (x6) {
            arrayList = new ArrayList(x6.a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Um) it.next()).b(str);
        }
    }

    public X6(C2723e8 c2723e8) {
        this.a = new ArrayList();
        this.c = new a();
        this.b = c2723e8;
    }
}

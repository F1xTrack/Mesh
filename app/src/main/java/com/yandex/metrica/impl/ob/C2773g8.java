package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.g8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2773g8 {
    private static final Set<String> m;
    private final Context a;
    private final InterfaceExecutorC3086sn b;
    private final File c;
    private final List<String> d;
    private final File e;
    private final File f;
    private final Vm<Void, String> g;
    private final C2986om h;
    private final C2748f8 i;
    private final Callable<String> j;
    private final Y7 k;
    private final L0 l;

    /* renamed from: com.yandex.metrica.impl.ob.g8$a */
    public class a implements Vm<Void, String> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public String a(Void r1) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$b */
    public class b implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public String call() throws Exception {
            return CrashpadHelper.getLibDirInsideApk();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$c */
    public static class c implements Vm<File, Boolean> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public /* bridge */ /* synthetic */ Boolean a(File file) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$d */
    public static class d implements Vm<File, Boolean> {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Boolean a(File file) {
            return Boolean.valueOf(!file.getName().endsWith(this.a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        m = hashSet;
        hashSet.add("armeabi-v7a");
        hashSet.add("arm64-v8a");
        hashSet.add("x86");
        hashSet.add("x86_64");
    }

    public C2773g8(Context context, L0 l0, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, l0, interfaceExecutorC3086sn, Arrays.asList("libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.ob.C2872k8 a() throws java.io.IOException {
        /*
            r9 = this;
            java.io.File r0 = r9.c
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L19
            boolean r0 = r0.exists()
            if (r0 != 0) goto Ld
            goto L19
        Ld:
            java.io.File r0 = r9.c
            java.lang.String r0 = r0.getAbsolutePath()
            com.yandex.metrica.impl.ob.k8 r3 = new com.yandex.metrica.impl.ob.k8
            r3.<init>(r0, r2, r1)
            return r3
        L19:
            android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "-"
            r0.<init>(r3)
            com.yandex.metrica.impl.ob.Vm<java.lang.Void, java.lang.String> r3 = r9.g
            java.lang.Object r3 = r3.a(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.impl.ob.om r3 = r9.h
            java.lang.String r3 = r3.a()
            if (r3 == 0) goto La4
            java.io.File r4 = r9.f
            if (r4 != 0) goto L3f
            goto L61
        L3f:
            boolean r4 = r4.exists()
            r5 = 1
            if (r4 != 0) goto L62
            java.io.File r4 = r9.f
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L4f
            goto L61
        L4f:
            java.io.File r4 = r9.e
            if (r4 == 0) goto L61
            boolean r4 = r4.setExecutable(r5, r2)
            if (r4 != 0) goto L5a
            goto L61
        L5a:
            java.io.File r4 = r9.f
            boolean r5 = r4.setExecutable(r5, r2)
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto La4
            com.yandex.metrica.impl.ob.g8$d r4 = new com.yandex.metrica.impl.ob.g8$d
            r4.<init>(r0)
            com.yandex.metrica.impl.ob.sn r5 = r9.b
            com.yandex.metrica.impl.ob.h8 r6 = new com.yandex.metrica.impl.ob.h8
            r6.<init>(r9, r4)
            com.yandex.metrica.impl.ob.rn r5 = (com.yandex.metrica.impl.ob.C3061rn) r5
            r5.execute(r6)
            java.util.List<java.lang.String> r4 = r9.d
            java.util.Iterator r4 = r4.iterator()
        L7b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.yandex.metrica.impl.ob.f8 r6 = r9.i
            java.lang.String r7 = "lib/"
            java.lang.String r8 = "/"
            java.lang.String r7 = defpackage.AbstractC1705Vq.i(r7, r3, r8, r5)
            java.lang.String r5 = defpackage.AbstractC8235ym.i(r5, r0)
            java.lang.String r5 = r6.a(r7, r5)
            android.os.SystemClock.elapsedRealtime()
            if (r5 == 0) goto L7b
            com.yandex.metrica.impl.ob.k8 r0 = new com.yandex.metrica.impl.ob.k8
            r0.<init>(r5, r2, r1)
            r1 = r0
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2773g8.a():com.yandex.metrica.impl.ob.k8");
    }

    private File c() {
        String strCall;
        try {
            strCall = this.j.call();
        } catch (Throwable unused) {
            strCall = null;
        }
        if (TextUtils.isEmpty(strCall)) {
            return null;
        }
        this.l.getClass();
        return new File(strCall);
    }

    public C2872k8 b() {
        X7 x7;
        C2872k8 c2872k8 = null;
        if (U2.a(29)) {
            File fileC = c();
            if (fileC == null) {
                return null;
            }
            for (String str : this.d) {
                this.l.getClass();
                File file = new File(fileC, str);
                if (file.exists()) {
                    return new C2872k8(file.getAbsolutePath(), true, null);
                }
            }
            return null;
        }
        if (!U2.a(23)) {
            return a();
        }
        Y7 y7 = this.k;
        Context context = this.a;
        String strA = this.h.a();
        y7.getClass();
        try {
            String[] strArrA = AbstractC2897l8.a(context, strA);
            x7 = new X7(strArrA[0], strArrA[1], Environment.getDataDirectory().getAbsolutePath());
        } catch (Throwable unused) {
            x7 = null;
        }
        if (x7 != null) {
            File fileC2 = c();
            if (fileC2 != null) {
                Iterator<String> it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    this.l.getClass();
                    File file2 = new File(fileC2, next);
                    if (file2.exists()) {
                        c2872k8 = new C2872k8(file2.getAbsolutePath(), false, x7);
                        break;
                    }
                }
            } else {
                c2872k8 = new C2872k8("stub", false, x7);
            }
        }
        if (c2872k8 == null || c2872k8.d == null) {
            return a();
        }
        ((C3061rn) this.b).execute(new RunnableC2798h8(this, new c()));
        return c2872k8;
    }

    private C2773g8(Context context, L0 l0, InterfaceExecutorC3086sn interfaceExecutorC3086sn, List<String> list) {
        this(context, interfaceExecutorC3086sn, list, l0, l0.a(l0.a(context), list.get(0)), l0.b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new a(), new b(), new C2986om(m));
    }

    private C2773g8(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, List<String> list, L0 l0, File file, File file2, Vm<Void, String> vm, Callable<String> callable, C2986om c2986om) {
        this(context, interfaceExecutorC3086sn, list, file, file2, vm, callable, c2986om, new C2748f8(context, file2), new Y7(), l0);
    }

    public C2773g8(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, List<String> list, File file, File file2, Vm<Void, String> vm, Callable<String> callable, C2986om c2986om, C2748f8 c2748f8, Y7 y7, L0 l0) {
        this.a = context;
        this.b = interfaceExecutorC3086sn;
        this.d = list;
        this.c = file;
        this.e = context.getCacheDir();
        this.f = file2;
        this.g = vm;
        this.j = callable;
        this.h = c2986om;
        this.i = c2748f8;
        this.k = y7;
        this.l = l0;
    }

    public void a(Vm<File, Boolean> vm) {
        File[] fileArrListFiles;
        File file = this.f;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (vm.a(file2).booleanValue()) {
                file2.delete();
            }
        }
    }
}

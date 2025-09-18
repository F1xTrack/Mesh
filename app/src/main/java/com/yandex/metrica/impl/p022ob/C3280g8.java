package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.yandex.metrica.impl.p021ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.g8 */
/* loaded from: classes2.dex */
public class C3280g8 {

    /* renamed from: m */
    private static final Set<String> f23489m;

    /* renamed from: a */
    private final Context f23490a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f23491b;

    /* renamed from: c */
    private final File f23492c;

    /* renamed from: d */
    private final List<String> f23493d;

    /* renamed from: e */
    private final File f23494e;

    /* renamed from: f */
    private final File f23495f;

    /* renamed from: g */
    private final InterfaceC3013Vm<Void, String> f23496g;

    /* renamed from: h */
    private final C3502om f23497h;

    /* renamed from: i */
    private final C3254f8 f23498i;

    /* renamed from: j */
    private final Callable<String> f23499j;

    /* renamed from: k */
    private final C3073Y7 f23500k;

    /* renamed from: l */
    private final C2742L0 f23501l;

    /* renamed from: com.yandex.metrica.impl.ob.g8$a */
    public class a implements InterfaceC3013Vm<Void, String> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public String mo13948a(Void r1) {
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
    public static class c implements InterfaceC3013Vm<File, Boolean> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Boolean mo13948a(File file) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$d */
    public static class d implements InterfaceC3013Vm<File, Boolean> {

        /* renamed from: a */
        private final String f23502a;

        public d(String str) {
            this.f23502a = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public Boolean mo13948a(File file) {
            return Boolean.valueOf(!file.getName().endsWith(this.f23502a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f23489m = hashSet;
        hashSet.add("armeabi-v7a");
        hashSet.add("arm64-v8a");
        hashSet.add("x86");
        hashSet.add("x86_64");
    }

    public C3280g8(Context context, C2742L0 c2742l0, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, c2742l0, interfaceExecutorC3607sn, Arrays.asList("libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p022ob.C3384k8 m15984a() throws java.io.IOException {
        /*
            r9 = this;
            java.io.File r0 = r9.f23492c
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L19
            boolean r0 = r0.exists()
            if (r0 != 0) goto Ld
            goto L19
        Ld:
            java.io.File r0 = r9.f23492c
            java.lang.String r0 = r0.getAbsolutePath()
            com.yandex.metrica.impl.ob.k8 r3 = new com.yandex.metrica.impl.ob.k8
            r3.<init>(r0, r2, r1)
            return r3
        L19:
            android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "-"
            r0.<init>(r3)
            com.yandex.metrica.impl.ob.Vm<java.lang.Void, java.lang.String> r3 = r9.f23496g
            java.lang.Object r3 = r3.mo13948a(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.impl.ob.om r3 = r9.f23497h
            java.lang.String r3 = r3.m16547a()
            if (r3 == 0) goto La4
            java.io.File r4 = r9.f23495f
            if (r4 != 0) goto L3f
            goto L61
        L3f:
            boolean r4 = r4.exists()
            r5 = 1
            if (r4 != 0) goto L62
            java.io.File r4 = r9.f23495f
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L4f
            goto L61
        L4f:
            java.io.File r4 = r9.f23494e
            if (r4 == 0) goto L61
            boolean r4 = r4.setExecutable(r5, r2)
            if (r4 != 0) goto L5a
            goto L61
        L5a:
            java.io.File r4 = r9.f23495f
            boolean r5 = r4.setExecutable(r5, r2)
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto La4
            com.yandex.metrica.impl.ob.g8$d r4 = new com.yandex.metrica.impl.ob.g8$d
            r4.<init>(r0)
            com.yandex.metrica.impl.ob.sn r5 = r9.f23491b
            com.yandex.metrica.impl.ob.h8 r6 = new com.yandex.metrica.impl.ob.h8
            r6.<init>(r9, r4)
            com.yandex.metrica.impl.ob.rn r5 = (com.yandex.metrica.impl.p022ob.C3581rn) r5
            r5.execute(r6)
            java.util.List<java.lang.String> r4 = r9.f23493d
            java.util.Iterator r4 = r4.iterator()
        L7b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.yandex.metrica.impl.ob.f8 r6 = r9.f23498i
            java.lang.String r7 = "lib/"
            java.lang.String r8 = "/"
            java.lang.String r7 = p000.AbstractC1374Vq.m8590i(r7, r3, r8, r5)
            java.lang.String r5 = p000.AbstractC7222ym.m26232i(r5, r0)
            java.lang.String r5 = r6.m15927a(r7, r5)
            android.os.SystemClock.elapsedRealtime()
            if (r5 == 0) goto L7b
            com.yandex.metrica.impl.ob.k8 r0 = new com.yandex.metrica.impl.ob.k8
            r0.<init>(r5, r2, r1)
            r1 = r0
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3280g8.m15984a():com.yandex.metrica.impl.ob.k8");
    }

    /* renamed from: c */
    private File m15985c() {
        String strCall;
        try {
            strCall = this.f23499j.call();
        } catch (Throwable unused) {
            strCall = null;
        }
        if (TextUtils.isEmpty(strCall)) {
            return null;
        }
        this.f23501l.getClass();
        return new File(strCall);
    }

    /* renamed from: b */
    public C3384k8 m15987b() {
        C3048X7 c3048x7;
        C3384k8 c3384k8 = null;
        if (C2968U2.m15243a(29)) {
            File fileM15985c = m15985c();
            if (fileM15985c == null) {
                return null;
            }
            for (String str : this.f23493d) {
                this.f23501l.getClass();
                File file = new File(fileM15985c, str);
                if (file.exists()) {
                    return new C3384k8(file.getAbsolutePath(), true, null);
                }
            }
            return null;
        }
        if (!C2968U2.m15243a(23)) {
            return m15984a();
        }
        C3073Y7 c3073y7 = this.f23500k;
        Context context = this.f23490a;
        String strM16547a = this.f23497h.m16547a();
        c3073y7.getClass();
        try {
            String[] strArrM16386a = AbstractC3410l8.m16386a(context, strM16547a);
            c3048x7 = new C3048X7(strArrM16386a[0], strArrM16386a[1], Environment.getDataDirectory().getAbsolutePath());
        } catch (Throwable unused) {
            c3048x7 = null;
        }
        if (c3048x7 != null) {
            File fileM15985c2 = m15985c();
            if (fileM15985c2 != null) {
                Iterator<String> it = this.f23493d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    this.f23501l.getClass();
                    File file2 = new File(fileM15985c2, next);
                    if (file2.exists()) {
                        c3384k8 = new C3384k8(file2.getAbsolutePath(), false, c3048x7);
                        break;
                    }
                }
            } else {
                c3384k8 = new C3384k8("stub", false, c3048x7);
            }
        }
        if (c3384k8 == null || c3384k8.f23915d == null) {
            return m15984a();
        }
        ((C3581rn) this.f23491b).execute(new RunnableC3306h8(this, new c()));
        return c3384k8;
    }

    private C3280g8(Context context, C2742L0 c2742l0, InterfaceExecutorC3607sn interfaceExecutorC3607sn, List<String> list) {
        this(context, interfaceExecutorC3607sn, list, c2742l0, c2742l0.m14501a(c2742l0.m14499a(context), list.get(0)), c2742l0.m14503b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new a(), new b(), new C3502om(f23489m));
    }

    private C3280g8(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, List<String> list, C2742L0 c2742l0, File file, File file2, InterfaceC3013Vm<Void, String> interfaceC3013Vm, Callable<String> callable, C3502om c3502om) {
        this(context, interfaceExecutorC3607sn, list, file, file2, interfaceC3013Vm, callable, c3502om, new C3254f8(context, file2), new C3073Y7(), c2742l0);
    }

    public C3280g8(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, List<String> list, File file, File file2, InterfaceC3013Vm<Void, String> interfaceC3013Vm, Callable<String> callable, C3502om c3502om, C3254f8 c3254f8, C3073Y7 c3073y7, C2742L0 c2742l0) {
        this.f23490a = context;
        this.f23491b = interfaceExecutorC3607sn;
        this.f23493d = list;
        this.f23492c = file;
        this.f23494e = context.getCacheDir();
        this.f23495f = file2;
        this.f23496g = interfaceC3013Vm;
        this.f23499j = callable;
        this.f23497h = c3502om;
        this.f23498i = c3254f8;
        this.f23500k = c3073y7;
        this.f23501l = c2742l0;
    }

    /* renamed from: a */
    public void m15986a(InterfaceC3013Vm<File, Boolean> interfaceC3013Vm) {
        File[] fileArrListFiles;
        File file = this.f23495f;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (interfaceC3013Vm.mo13948a(file2).booleanValue()) {
                file2.delete();
            }
        }
    }
}

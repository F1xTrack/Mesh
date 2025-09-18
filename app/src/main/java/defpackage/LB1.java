package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public abstract class LB1 {
    public static final NV1 a = new NV1(20);
    public static final C5806m12 b = new C5806m12(20);
    public static final OJ1 c = new OJ1(20);

    public static final C3975gV0 a(C0312Dt0 c0312Dt0) {
        NV1 nv1 = a;
        LinkedHashMap linkedHashMap = c0312Dt0.a;
        InterfaceC6088nV0 interfaceC6088nV0 = (InterfaceC6088nV0) linkedHashMap.get(nv1);
        if (interfaceC6088nV0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC2001Zk1 interfaceC2001Zk1 = (InterfaceC2001Zk1) linkedHashMap.get(b);
        if (interfaceC2001Zk1 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(S20.f);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC5515kV0 interfaceC5515kV0B = interfaceC6088nV0.getSavedStateRegistry().b();
        C4166hV0 c4166hV0 = interfaceC5515kV0B instanceof C4166hV0 ? (C4166hV0) interfaceC5515kV0B : null;
        if (c4166hV0 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = c(interfaceC2001Zk1).d;
        C3975gV0 c3975gV0 = (C3975gV0) linkedHashMap2.get(str);
        if (c3975gV0 != null) {
            return c3975gV0;
        }
        Class[] clsArr = C3975gV0.f;
        c4166hV0.b();
        Bundle bundle2 = c4166hV0.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c4166hV0.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c4166hV0.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            c4166hV0.c = null;
        }
        C3975gV0 c3975gV0A = AbstractC5504kR1.a(bundle3, bundle);
        linkedHashMap2.put(str, c3975gV0A);
        return c3975gV0A;
    }

    public static final void b(InterfaceC6088nV0 interfaceC6088nV0) {
        EnumC0201Ci0 enumC0201Ci0 = ((a) interfaceC6088nV0.getLifecycle()).c;
        if (enumC0201Ci0 != EnumC0201Ci0.b && enumC0201Ci0 != EnumC0201Ci0.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC6088nV0.getSavedStateRegistry().b() == null) {
            C4166hV0 c4166hV0 = new C4166hV0(interfaceC6088nV0.getSavedStateRegistry(), (InterfaceC2001Zk1) interfaceC6088nV0);
            interfaceC6088nV0.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", c4166hV0);
            interfaceC6088nV0.getLifecycle().a(new SavedStateHandleAttacher(c4166hV0));
        }
    }

    public static final C4357iV0 c(InterfaceC2001Zk1 interfaceC2001Zk1) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1689Vk1(P22.b(BP0.a.b(C4357iV0.class))));
        C1689Vk1[] c1689Vk1Arr = (C1689Vk1[]) arrayList.toArray(new C1689Vk1[0]);
        return (C4357iV0) new C5772lr0(interfaceC2001Zk1.getViewModelStore(), new C6973s80((C1689Vk1[]) Arrays.copyOf(c1689Vk1Arr, c1689Vk1Arr.length)), interfaceC2001Zk1 instanceof H20 ? ((H20) interfaceC2001Zk1).getDefaultViewModelCreationExtras() : C3723fB.b).M(C4357iV0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static void d(File file, InputStream inputStream) throws Throwable {
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC1717Vu.e(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC1717Vu.e(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

package p000;

import android.os.Bundle;
import androidx.lifecycle.C1742a;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public abstract class LB1 {

    /* renamed from: a */
    public static final NV1 f6544a = new NV1(20);

    /* renamed from: b */
    public static final C10212m12 f6545b = new C10212m12(20);

    /* renamed from: c */
    public static final OJ1 f6546c = new OJ1(20);

    /* renamed from: a */
    public static final C9505gV0 m4917a(C7508Dt0 c7508Dt0) {
        NV1 nv1 = f6544a;
        LinkedHashMap linkedHashMap = c7508Dt0.f27599a;
        InterfaceC10401nV0 interfaceC10401nV0 = (InterfaceC10401nV0) linkedHashMap.get(nv1);
        if (interfaceC10401nV0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC8635Zk1 interfaceC8635Zk1 = (InterfaceC8635Zk1) linkedHashMap.get(f6545b);
        if (interfaceC8635Zk1 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f6546c);
        String str = (String) linkedHashMap.get(S20.f10543f);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC10017kV0 interfaceC10017kV0M22442b = interfaceC10401nV0.getSavedStateRegistry().m22442b();
        C9633hV0 c9633hV0 = interfaceC10017kV0M22442b instanceof C9633hV0 ? (C9633hV0) interfaceC10017kV0M22442b : null;
        if (c9633hV0 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = m4919c(interfaceC8635Zk1).f29277d;
        C9505gV0 c9505gV0 = (C9505gV0) linkedHashMap2.get(str);
        if (c9505gV0 != null) {
            return c9505gV0;
        }
        Class[] clsArr = C9505gV0.f27813f;
        c9633hV0.m18820b();
        Bundle bundle2 = c9633hV0.f28435c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c9633hV0.f28435c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c9633hV0.f28435c;
        if (bundle5 != null && bundle5.isEmpty()) {
            c9633hV0.f28435c = null;
        }
        C9505gV0 c9505gV0M22211a = AbstractC10010kR1.m22211a(bundle3, bundle);
        linkedHashMap2.put(str, c9505gV0M22211a);
        return c9505gV0M22211a;
    }

    /* renamed from: b */
    public static final void m4918b(InterfaceC10401nV0 interfaceC10401nV0) {
        EnumC7434Ci0 enumC7434Ci0 = ((C1742a) interfaceC10401nV0.getLifecycle()).f16309c;
        if (enumC7434Ci0 != EnumC7434Ci0.f1587b && enumC7434Ci0 != EnumC7434Ci0.f1588c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC10401nV0.getSavedStateRegistry().m22442b() == null) {
            C9633hV0 c9633hV0 = new C9633hV0(interfaceC10401nV0.getSavedStateRegistry(), (InterfaceC8635Zk1) interfaceC10401nV0);
            interfaceC10401nV0.getSavedStateRegistry().m22443c("androidx.lifecycle.internal.SavedStateHandlesProvider", c9633hV0);
            interfaceC10401nV0.getLifecycle().mo2368a(new SavedStateHandleAttacher(c9633hV0));
        }
    }

    /* renamed from: c */
    public static final C9761iV0 m4919c(InterfaceC8635Zk1 interfaceC8635Zk1) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8427Vk1(P22.m6213b(BP0.f799a.mo3846b(C9761iV0.class))));
        C8427Vk1[] c8427Vk1Arr = (C8427Vk1[]) arrayList.toArray(new C8427Vk1[0]);
        return (C9761iV0) new C10189lr0(interfaceC8635Zk1.getViewModelStore(), new C10995s80((C8427Vk1[]) Arrays.copyOf(c8427Vk1Arr, c8427Vk1Arr.length)), interfaceC8635Zk1 instanceof H20 ? ((H20) interfaceC8635Zk1).getDefaultViewModelCreationExtras() : C4037fB.f27104b).m22555M(C9761iV0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* renamed from: d */
    public static void m4920d(File file, InputStream inputStream) throws Throwable {
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC1378Vu.m8620e(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC1378Vu.m8620e(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

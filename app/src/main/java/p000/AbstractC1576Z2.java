package p000;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1742a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: Z2 */
/* loaded from: classes.dex */
public abstract class AbstractC1576Z2 {

    /* renamed from: a */
    public final LinkedHashMap f14650a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f14651b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f14652c = new LinkedHashMap();

    /* renamed from: d */
    public final ArrayList f14653d = new ArrayList();

    /* renamed from: e */
    public final transient LinkedHashMap f14654e = new LinkedHashMap();

    /* renamed from: f */
    public final LinkedHashMap f14655f = new LinkedHashMap();

    /* renamed from: g */
    public final Bundle f14656g = new Bundle();

    /* renamed from: a */
    public final boolean m9455a(int i, int i2, Intent intent) {
        String str = (String) this.f14650a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C1324V2 c1324v2 = (C1324V2) this.f14654e.get(str);
        if ((c1324v2 != null ? c1324v2.f12311a : null) != null) {
            ArrayList arrayList = this.f14653d;
            if (arrayList.contains(str)) {
                c1324v2.f12311a.onActivityResult(c1324v2.f12312b.mo4868c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f14655f.remove(str);
        this.f14656g.putParcelable(str, new C0507I2(i2, intent));
        return true;
    }

    /* renamed from: b */
    public abstract void mo2446b(int i, AbstractC0696L2 abstractC0696L2, Object obj);

    /* renamed from: c */
    public final C1513Y2 m9456c(String str, AbstractC0696L2 abstractC0696L2, InterfaceC0570J2 interfaceC0570J2) {
        O90.m5968f(str, "key");
        m9458e(str);
        this.f14654e.put(str, new C1324V2(abstractC0696L2, interfaceC0570J2));
        LinkedHashMap linkedHashMap = this.f14655f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC0570J2.onActivityResult(obj);
        }
        Bundle bundle = this.f14656g;
        C0507I2 c0507i2 = (C0507I2) AbstractC10134lP1.m22424a(bundle, str);
        if (c0507i2 != null) {
            bundle.remove(str);
            interfaceC0570J2.onActivityResult(abstractC0696L2.mo4868c(c0507i2.f4659a, c0507i2.f4660b));
        }
        return new C1513Y2(this, str, abstractC0696L2, 1);
    }

    /* renamed from: d */
    public final C1513Y2 m9457d(final String str, InterfaceC7902Li0 interfaceC7902Li0, final AbstractC0696L2 abstractC0696L2, final InterfaceC0570J2 interfaceC0570J2) {
        O90.m5968f(str, "key");
        O90.m5968f(interfaceC7902Li0, "lifecycleOwner");
        O90.m5968f(abstractC0696L2, "contract");
        O90.m5968f(interfaceC0570J2, "callback");
        AbstractC7538Ei0 lifecycle = interfaceC7902Li0.getLifecycle();
        C1742a c1742a = (C1742a) lifecycle;
        if (c1742a.f16309c.compareTo(EnumC7434Ci0.f1589d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC7902Li0 + " is attempting to register while current state is " + c1742a.f16309c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m9458e(str);
        LinkedHashMap linkedHashMap = this.f14652c;
        C1387W2 c1387w2 = (C1387W2) linkedHashMap.get(str);
        if (c1387w2 == null) {
            c1387w2 = new C1387W2(lifecycle);
        }
        InterfaceC7746Ii0 interfaceC7746Ii0 = new InterfaceC7746Ii0() { // from class: U2
            @Override // p000.InterfaceC7746Ii0
            /* renamed from: f */
            public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li02, EnumC7382Bi0 enumC7382Bi0) {
                AbstractC1576Z2 abstractC1576Z2 = this.f11618a;
                O90.m5968f(abstractC1576Z2, "this$0");
                String str2 = str;
                O90.m5968f(str2, "$key");
                InterfaceC0570J2 interfaceC0570J22 = interfaceC0570J2;
                O90.m5968f(interfaceC0570J22, "$callback");
                AbstractC0696L2 abstractC0696L22 = abstractC0696L2;
                O90.m5968f(abstractC0696L22, "$contract");
                EnumC7382Bi0 enumC7382Bi02 = EnumC7382Bi0.ON_START;
                LinkedHashMap linkedHashMap2 = abstractC1576Z2.f14654e;
                if (enumC7382Bi02 != enumC7382Bi0) {
                    if (EnumC7382Bi0.ON_STOP == enumC7382Bi0) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC7382Bi0.ON_DESTROY == enumC7382Bi0) {
                            abstractC1576Z2.m9459f(str2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(str2, new C1324V2(abstractC0696L22, interfaceC0570J22));
                LinkedHashMap linkedHashMap3 = abstractC1576Z2.f14655f;
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC0570J22.onActivityResult(obj);
                }
                Bundle bundle = abstractC1576Z2.f14656g;
                C0507I2 c0507i2 = (C0507I2) AbstractC10134lP1.m22424a(bundle, str2);
                if (c0507i2 != null) {
                    bundle.remove(str2);
                    interfaceC0570J22.onActivityResult(abstractC0696L22.mo4868c(c0507i2.f4659a, c0507i2.f4660b));
                }
            }
        };
        c1387w2.f12938a.mo2368a(interfaceC7746Ii0);
        c1387w2.f12939b.add(interfaceC7746Ii0);
        linkedHashMap.put(str, c1387w2);
        return new C1513Y2(this, str, abstractC0696L2, 0);
    }

    /* renamed from: e */
    public final void m9458e(String str) {
        LinkedHashMap linkedHashMap = this.f14651b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = ((C0564Ix) AbstractC9639hY0.m18831j(C1450X2.f13502f)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f14650a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* renamed from: f */
    public final void m9459f(String str) {
        Integer num;
        O90.m5968f(str, "key");
        if (!this.f14653d.contains(str) && (num = (Integer) this.f14651b.remove(str)) != null) {
            this.f14650a.remove(num);
        }
        this.f14654e.remove(str);
        LinkedHashMap linkedHashMap = this.f14655f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f14656g;
        if (bundle.containsKey(str)) {
            Objects.toString((C0507I2) AbstractC10134lP1.m22424a(bundle, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f14652c;
        C1387W2 c1387w2 = (C1387W2) linkedHashMap2.get(str);
        if (c1387w2 != null) {
            ArrayList arrayList = c1387w2.f12939b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c1387w2.f12938a.mo2369b((InterfaceC7746Ii0) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}

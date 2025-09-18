package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class Z2 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        V2 v2 = (V2) this.e.get(str);
        if ((v2 != null ? v2.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                v2.a.onActivityResult(v2.b.c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new I2(i2, intent));
        return true;
    }

    public abstract void b(int i, L2 l2, Object obj);

    public final Y2 c(String str, L2 l2, J2 j2) {
        O90.f(str, "key");
        e(str);
        this.e.put(str, new V2(l2, j2));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            j2.onActivityResult(obj);
        }
        Bundle bundle = this.g;
        I2 i2 = (I2) AbstractC5689lP1.a(bundle, str);
        if (i2 != null) {
            bundle.remove(str);
            j2.onActivityResult(l2.c(i2.a, i2.b));
        }
        return new Y2(this, str, l2, 1);
    }

    public final Y2 d(final String str, InterfaceC0903Li0 interfaceC0903Li0, final L2 l2, final J2 j2) {
        O90.f(str, "key");
        O90.f(interfaceC0903Li0, "lifecycleOwner");
        O90.f(l2, "contract");
        O90.f(j2, "callback");
        AbstractC0357Ei0 lifecycle = interfaceC0903Li0.getLifecycle();
        a aVar = (a) lifecycle;
        if (aVar.c.compareTo(EnumC0201Ci0.d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC0903Li0 + " is attempting to register while current state is " + aVar.c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        W2 w2 = (W2) linkedHashMap.get(str);
        if (w2 == null) {
            w2 = new W2(lifecycle);
        }
        InterfaceC0669Ii0 interfaceC0669Ii0 = new InterfaceC0669Ii0() { // from class: U2
            @Override // defpackage.InterfaceC0669Ii0
            public final void f(InterfaceC0903Li0 interfaceC0903Li02, EnumC0123Bi0 enumC0123Bi0) {
                Z2 z2 = this.a;
                O90.f(z2, "this$0");
                String str2 = str;
                O90.f(str2, "$key");
                J2 j22 = j2;
                O90.f(j22, "$callback");
                L2 l22 = l2;
                O90.f(l22, "$contract");
                EnumC0123Bi0 enumC0123Bi02 = EnumC0123Bi0.ON_START;
                LinkedHashMap linkedHashMap2 = z2.e;
                if (enumC0123Bi02 != enumC0123Bi0) {
                    if (EnumC0123Bi0.ON_STOP == enumC0123Bi0) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0123Bi0.ON_DESTROY == enumC0123Bi0) {
                            z2.f(str2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(str2, new V2(l22, j22));
                LinkedHashMap linkedHashMap3 = z2.f;
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    j22.onActivityResult(obj);
                }
                Bundle bundle = z2.g;
                I2 i2 = (I2) AbstractC5689lP1.a(bundle, str2);
                if (i2 != null) {
                    bundle.remove(str2);
                    j22.onActivityResult(l22.c(i2.a, i2.b));
                }
            }
        };
        w2.a.a(interfaceC0669Ii0);
        w2.b.add(interfaceC0669Ii0);
        linkedHashMap.put(str, w2);
        return new Y2(this, str, l2, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = ((C0713Ix) AbstractC4175hY0.j(X2.f)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        O90.f(str, "key");
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString((I2) AbstractC5689lP1.a(bundle, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        W2 w2 = (W2) linkedHashMap2.get(str);
        if (w2 != null) {
            ArrayList arrayList = w2.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w2.a.b((InterfaceC0669Ii0) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}

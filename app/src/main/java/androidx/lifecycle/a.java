package androidx.lifecycle;

import android.os.Looper;
import defpackage.AbstractC0357Ei0;
import defpackage.AbstractC1214Pi0;
import defpackage.AbstractC8235ym;
import defpackage.C0980Mi0;
import defpackage.C4287i8;
import defpackage.C8414zi0;
import defpackage.CS;
import defpackage.EnumC0123Bi0;
import defpackage.EnumC0201Ci0;
import defpackage.InterfaceC0669Ii0;
import defpackage.InterfaceC0825Ki0;
import defpackage.InterfaceC0903Li0;
import defpackage.InterfaceC5991n00;
import defpackage.O90;
import defpackage.TU0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a extends AbstractC0357Ei0 {
    public final boolean a;
    public CS b;
    public EnumC0201Ci0 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;

    public a(InterfaceC0903Li0 interfaceC0903Li0) {
        new AtomicReference();
        this.a = true;
        this.b = new CS();
        this.c = EnumC0201Ci0.b;
        this.h = new ArrayList();
        this.d = new WeakReference(interfaceC0903Li0);
    }

    @Override // defpackage.AbstractC0357Ei0
    public final void a(InterfaceC0825Ki0 interfaceC0825Ki0) {
        InterfaceC0669Ii0 reflectiveGenericLifecycleObserver;
        InterfaceC0903Li0 interfaceC0903Li0;
        ArrayList arrayList = this.h;
        O90.f(interfaceC0825Ki0, "observer");
        d("addObserver");
        EnumC0201Ci0 enumC0201Ci0 = this.c;
        EnumC0201Ci0 enumC0201Ci02 = EnumC0201Ci0.a;
        if (enumC0201Ci0 != enumC0201Ci02) {
            enumC0201Ci02 = EnumC0201Ci0.b;
        }
        C0980Mi0 c0980Mi0 = new C0980Mi0();
        HashMap map = AbstractC1214Pi0.a;
        boolean z = interfaceC0825Ki0 instanceof InterfaceC0669Ii0;
        boolean z2 = interfaceC0825Ki0 instanceof DefaultLifecycleObserver;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) interfaceC0825Ki0, (InterfaceC0669Ii0) interfaceC0825Ki0);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) interfaceC0825Ki0, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC0669Ii0) interfaceC0825Ki0;
        } else {
            Class<?> cls = interfaceC0825Ki0.getClass();
            if (AbstractC1214Pi0.b(cls) == 2) {
                Object obj = AbstractC1214Pi0.b.get(cls);
                O90.c(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC1214Pi0.a((Constructor) list.get(0), interfaceC0825Ki0);
                    throw null;
                }
                int size = list.size();
                InterfaceC5991n00[] interfaceC5991n00Arr = new InterfaceC5991n00[size];
                if (size > 0) {
                    AbstractC1214Pi0.a((Constructor) list.get(0), interfaceC0825Ki0);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC5991n00Arr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0825Ki0);
            }
        }
        c0980Mi0.b = reflectiveGenericLifecycleObserver;
        c0980Mi0.a = enumC0201Ci02;
        if (((C0980Mi0) this.b.d(interfaceC0825Ki0, c0980Mi0)) == null && (interfaceC0903Li0 = (InterfaceC0903Li0) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            EnumC0201Ci0 enumC0201Ci0C = c(interfaceC0825Ki0);
            this.e++;
            while (c0980Mi0.a.compareTo(enumC0201Ci0C) < 0 && this.b.e.containsKey(interfaceC0825Ki0)) {
                arrayList.add(c0980Mi0.a);
                C8414zi0 c8414zi0 = EnumC0123Bi0.Companion;
                EnumC0201Ci0 enumC0201Ci03 = c0980Mi0.a;
                c8414zi0.getClass();
                EnumC0123Bi0 enumC0123Bi0B = C8414zi0.b(enumC0201Ci03);
                if (enumC0123Bi0B == null) {
                    throw new IllegalStateException("no event up from " + c0980Mi0.a);
                }
                c0980Mi0.a(interfaceC0903Li0, enumC0123Bi0B);
                arrayList.remove(arrayList.size() - 1);
                enumC0201Ci0C = c(interfaceC0825Ki0);
            }
            if (!z3) {
                h();
            }
            this.e--;
        }
    }

    @Override // defpackage.AbstractC0357Ei0
    public final void b(InterfaceC0825Ki0 interfaceC0825Ki0) {
        O90.f(interfaceC0825Ki0, "observer");
        d("removeObserver");
        this.b.h(interfaceC0825Ki0);
    }

    public final EnumC0201Ci0 c(InterfaceC0825Ki0 interfaceC0825Ki0) {
        C0980Mi0 c0980Mi0;
        HashMap map = this.b.e;
        TU0 tu0 = map.containsKey(interfaceC0825Ki0) ? ((TU0) map.get(interfaceC0825Ki0)).d : null;
        EnumC0201Ci0 enumC0201Ci0 = (tu0 == null || (c0980Mi0 = (C0980Mi0) tu0.b) == null) ? null : c0980Mi0.a;
        ArrayList arrayList = this.h;
        EnumC0201Ci0 enumC0201Ci02 = arrayList.isEmpty() ? null : (EnumC0201Ci0) AbstractC8235ym.e(1, arrayList);
        EnumC0201Ci0 enumC0201Ci03 = this.c;
        O90.f(enumC0201Ci03, "state1");
        if (enumC0201Ci0 == null || enumC0201Ci0.compareTo(enumC0201Ci03) >= 0) {
            enumC0201Ci0 = enumC0201Ci03;
        }
        return (enumC0201Ci02 == null || enumC0201Ci02.compareTo(enumC0201Ci0) >= 0) ? enumC0201Ci0 : enumC0201Ci02;
    }

    public final void d(String str) {
        if (this.a) {
            C4287i8.c().a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC8235ym.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0123Bi0 enumC0123Bi0) {
        O90.f(enumC0123Bi0, "event");
        d("handleLifecycleEvent");
        f(enumC0123Bi0.a());
    }

    public final void f(EnumC0201Ci0 enumC0201Ci0) {
        EnumC0201Ci0 enumC0201Ci02 = this.c;
        if (enumC0201Ci02 == enumC0201Ci0) {
            return;
        }
        EnumC0201Ci0 enumC0201Ci03 = EnumC0201Ci0.b;
        EnumC0201Ci0 enumC0201Ci04 = EnumC0201Ci0.a;
        if (enumC0201Ci02 == enumC0201Ci03 && enumC0201Ci0 == enumC0201Ci04) {
            throw new IllegalStateException(("no event down from " + this.c + " in component " + this.d.get()).toString());
        }
        this.c = enumC0201Ci0;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.c == enumC0201Ci04) {
            this.b = new CS();
        }
    }

    public final void g(EnumC0201Ci0 enumC0201Ci0) {
        d("setCurrentState");
        f(enumC0201Ci0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0030, code lost:
    
        r7.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.a.h():void");
    }
}

package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC7222ym;
import p000.AbstractC7538Ei0;
import p000.AbstractC8110Pi0;
import p000.C0155CS;
import p000.C11959zi0;
import p000.C4223i8;
import p000.C7954Mi0;
import p000.EnumC7382Bi0;
import p000.EnumC7434Ci0;
import p000.InterfaceC10335n00;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC7902Li0;
import p000.O90;
import p000.TU0;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C1742a extends AbstractC7538Ei0 {

    /* renamed from: a */
    public final boolean f16307a;

    /* renamed from: b */
    public C0155CS f16308b;

    /* renamed from: c */
    public EnumC7434Ci0 f16309c;

    /* renamed from: d */
    public final WeakReference f16310d;

    /* renamed from: e */
    public int f16311e;

    /* renamed from: f */
    public boolean f16312f;

    /* renamed from: g */
    public boolean f16313g;

    /* renamed from: h */
    public final ArrayList f16314h;

    public C1742a(InterfaceC7902Li0 interfaceC7902Li0) {
        new AtomicReference();
        this.f16307a = true;
        this.f16308b = new C0155CS();
        this.f16309c = EnumC7434Ci0.f1587b;
        this.f16314h = new ArrayList();
        this.f16310d = new WeakReference(interfaceC7902Li0);
    }

    @Override // p000.AbstractC7538Ei0
    /* renamed from: a */
    public final void mo2368a(InterfaceC7850Ki0 interfaceC7850Ki0) {
        InterfaceC7746Ii0 reflectiveGenericLifecycleObserver;
        InterfaceC7902Li0 interfaceC7902Li0;
        ArrayList arrayList = this.f16314h;
        O90.m5968f(interfaceC7850Ki0, "observer");
        m10125d("addObserver");
        EnumC7434Ci0 enumC7434Ci0 = this.f16309c;
        EnumC7434Ci0 enumC7434Ci02 = EnumC7434Ci0.f1586a;
        if (enumC7434Ci0 != enumC7434Ci02) {
            enumC7434Ci02 = EnumC7434Ci0.f1587b;
        }
        C7954Mi0 c7954Mi0 = new C7954Mi0();
        HashMap map = AbstractC8110Pi0.f9254a;
        boolean z = interfaceC7850Ki0 instanceof InterfaceC7746Ii0;
        boolean z2 = interfaceC7850Ki0 instanceof DefaultLifecycleObserver;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) interfaceC7850Ki0, (InterfaceC7746Ii0) interfaceC7850Ki0);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) interfaceC7850Ki0, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC7746Ii0) interfaceC7850Ki0;
        } else {
            Class<?> cls = interfaceC7850Ki0.getClass();
            if (AbstractC8110Pi0.m6419b(cls) == 2) {
                Object obj = AbstractC8110Pi0.f9255b.get(cls);
                O90.m5965c(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC8110Pi0.m6418a((Constructor) list.get(0), interfaceC7850Ki0);
                    throw null;
                }
                int size = list.size();
                InterfaceC10335n00[] interfaceC10335n00Arr = new InterfaceC10335n00[size];
                if (size > 0) {
                    AbstractC8110Pi0.m6418a((Constructor) list.get(0), interfaceC7850Ki0);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC10335n00Arr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC7850Ki0);
            }
        }
        c7954Mi0.f7310b = reflectiveGenericLifecycleObserver;
        c7954Mi0.f7309a = enumC7434Ci02;
        if (((C7954Mi0) this.f16308b.mo1188d(interfaceC7850Ki0, c7954Mi0)) == null && (interfaceC7902Li0 = (InterfaceC7902Li0) this.f16310d.get()) != null) {
            boolean z3 = this.f16311e != 0 || this.f16312f;
            EnumC7434Ci0 enumC7434Ci0M10124c = m10124c(interfaceC7850Ki0);
            this.f16311e++;
            while (c7954Mi0.f7309a.compareTo(enumC7434Ci0M10124c) < 0 && this.f16308b.f1375e.containsKey(interfaceC7850Ki0)) {
                arrayList.add(c7954Mi0.f7309a);
                C11959zi0 c11959zi0 = EnumC7382Bi0.Companion;
                EnumC7434Ci0 enumC7434Ci03 = c7954Mi0.f7309a;
                c11959zi0.getClass();
                EnumC7382Bi0 enumC7382Bi0M26517b = C11959zi0.m26517b(enumC7434Ci03);
                if (enumC7382Bi0M26517b == null) {
                    throw new IllegalStateException("no event up from " + c7954Mi0.f7309a);
                }
                c7954Mi0.m5428a(interfaceC7902Li0, enumC7382Bi0M26517b);
                arrayList.remove(arrayList.size() - 1);
                enumC7434Ci0M10124c = m10124c(interfaceC7850Ki0);
            }
            if (!z3) {
                m10129h();
            }
            this.f16311e--;
        }
    }

    @Override // p000.AbstractC7538Ei0
    /* renamed from: b */
    public final void mo2369b(InterfaceC7850Ki0 interfaceC7850Ki0) {
        O90.m5968f(interfaceC7850Ki0, "observer");
        m10125d("removeObserver");
        this.f16308b.mo1189h(interfaceC7850Ki0);
    }

    /* renamed from: c */
    public final EnumC7434Ci0 m10124c(InterfaceC7850Ki0 interfaceC7850Ki0) {
        C7954Mi0 c7954Mi0;
        HashMap map = this.f16308b.f1375e;
        TU0 tu0 = map.containsKey(interfaceC7850Ki0) ? ((TU0) map.get(interfaceC7850Ki0)).f11399d : null;
        EnumC7434Ci0 enumC7434Ci0 = (tu0 == null || (c7954Mi0 = (C7954Mi0) tu0.f11397b) == null) ? null : c7954Mi0.f7309a;
        ArrayList arrayList = this.f16314h;
        EnumC7434Ci0 enumC7434Ci02 = arrayList.isEmpty() ? null : (EnumC7434Ci0) AbstractC7222ym.m26228e(1, arrayList);
        EnumC7434Ci0 enumC7434Ci03 = this.f16309c;
        O90.m5968f(enumC7434Ci03, "state1");
        if (enumC7434Ci0 == null || enumC7434Ci0.compareTo(enumC7434Ci03) >= 0) {
            enumC7434Ci0 = enumC7434Ci03;
        }
        return (enumC7434Ci02 == null || enumC7434Ci02.compareTo(enumC7434Ci0) >= 0) ? enumC7434Ci0 : enumC7434Ci02;
    }

    /* renamed from: d */
    public final void m10125d(String str) {
        if (this.f16307a) {
            C4223i8.m18971c().f28832a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC7222ym.m26234k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: e */
    public final void m10126e(EnumC7382Bi0 enumC7382Bi0) {
        O90.m5968f(enumC7382Bi0, "event");
        m10125d("handleLifecycleEvent");
        m10127f(enumC7382Bi0.m812a());
    }

    /* renamed from: f */
    public final void m10127f(EnumC7434Ci0 enumC7434Ci0) {
        EnumC7434Ci0 enumC7434Ci02 = this.f16309c;
        if (enumC7434Ci02 == enumC7434Ci0) {
            return;
        }
        EnumC7434Ci0 enumC7434Ci03 = EnumC7434Ci0.f1587b;
        EnumC7434Ci0 enumC7434Ci04 = EnumC7434Ci0.f1586a;
        if (enumC7434Ci02 == enumC7434Ci03 && enumC7434Ci0 == enumC7434Ci04) {
            throw new IllegalStateException(("no event down from " + this.f16309c + " in component " + this.f16310d.get()).toString());
        }
        this.f16309c = enumC7434Ci0;
        if (this.f16312f || this.f16311e != 0) {
            this.f16313g = true;
            return;
        }
        this.f16312f = true;
        m10129h();
        this.f16312f = false;
        if (this.f16309c == enumC7434Ci04) {
            this.f16308b = new C0155CS();
        }
    }

    /* renamed from: g */
    public final void m10128g(EnumC7434Ci0 enumC7434Ci0) {
        m10125d("setCurrentState");
        m10127f(enumC7434Ci0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0030, code lost:
    
        r7.f16313g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0032, code lost:
    
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10129h() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1742a.m10129h():void");
    }
}

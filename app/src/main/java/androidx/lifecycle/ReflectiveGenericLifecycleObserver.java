package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import p000.C0559Is;
import p000.C0685Ks;
import p000.EnumC7382Bi0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC7902Li0;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final InterfaceC7850Ki0 f16301a;

    /* renamed from: b */
    public final C0559Is f16302b;

    public ReflectiveGenericLifecycleObserver(InterfaceC7850Ki0 interfaceC7850Ki0) {
        this.f16301a = interfaceC7850Ki0;
        C0685Ks c0685Ks = C0685Ks.f6364c;
        Class<?> cls = interfaceC7850Ki0.getClass();
        C0559Is c0559Is = (C0559Is) c0685Ks.f6365a.get(cls);
        this.f16302b = c0559Is == null ? c0685Ks.m4774a(cls, null) : c0559Is;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f16302b.f5187a;
        List list = (List) map.get(enumC7382Bi0);
        InterfaceC7850Ki0 interfaceC7850Ki0 = this.f16301a;
        C0559Is.m4057a(list, interfaceC7902Li0, enumC7382Bi0, interfaceC7850Ki0);
        C0559Is.m4057a((List) map.get(EnumC7382Bi0.ON_ANY), interfaceC7902Li0, enumC7382Bi0, interfaceC7850Ki0);
    }
}

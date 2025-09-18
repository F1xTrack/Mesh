package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.C3 */
/* loaded from: classes2.dex */
public class C2520C3 implements InterfaceC3013Vm<Thread, C3435m7> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3435m7 mo13948a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C3435m7(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}

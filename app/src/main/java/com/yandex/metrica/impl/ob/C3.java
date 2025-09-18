package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class C3 implements Vm<Thread, C2921m7> {
    @Override // com.yandex.metrica.impl.ob.Vm
    public C2921m7 a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C2921m7(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}

package com.yandex.metrica.impl.p022ob;

import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.D3 */
/* loaded from: classes2.dex */
public class C2545D3 implements InterfaceC2963Tm<Thread, StackTraceElement[], C3435m7> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2963Tm
    /* renamed from: a */
    public C3435m7 mo13979a(Thread thread, StackTraceElement[] stackTraceElementArr) {
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        String name = thread2.getName();
        int priority = thread2.getPriority();
        long id = thread2.getId();
        ThreadGroup threadGroup = thread2.getThreadGroup();
        return new C3435m7(name, priority, id, threadGroup != null ? threadGroup.getName() : "", Integer.valueOf(thread2.getState().ordinal()), stackTraceElementArr2 == null ? null : Arrays.asList(stackTraceElementArr2));
    }
}

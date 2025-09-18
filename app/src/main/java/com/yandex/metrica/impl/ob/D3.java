package com.yandex.metrica.impl.ob;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class D3 implements Tm<Thread, StackTraceElement[], C2921m7> {
    @Override // com.yandex.metrica.impl.ob.Tm
    public C2921m7 a(Thread thread, StackTraceElement[] stackTraceElementArr) {
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        String name = thread2.getName();
        int priority = thread2.getPriority();
        long id = thread2.getId();
        ThreadGroup threadGroup = thread2.getThreadGroup();
        return new C2921m7(name, priority, id, threadGroup != null ? threadGroup.getName() : "", Integer.valueOf(thread2.getState().ordinal()), stackTraceElementArr2 == null ? null : Arrays.asList(stackTraceElementArr2));
    }
}

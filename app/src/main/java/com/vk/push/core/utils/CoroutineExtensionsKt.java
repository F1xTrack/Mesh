package com.vk.push.core.utils;

import defpackage.AbstractC0485Fz;
import defpackage.C3959gQ;
import defpackage.GK;
import defpackage.InterfaceC0611Hp;
import defpackage.O90;
import defpackage.RQ1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"T", "LHp;", "value", "LTf1;", "safeResume", "(LHp;Ljava/lang/Object;)V", "", "throwable", "safeResumeWithException", "(LHp;Ljava/lang/Throwable;)V", "LGK;", "LFz;", "getSingleThread", "(LGK;)LFz;", "SingleThread", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CoroutineExtensionsKt {
    public static final AbstractC0485Fz getSingleThread(GK gk) {
        O90.f(gk, "<this>");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        O90.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        return new C3959gQ(executorServiceNewSingleThreadExecutor);
    }

    public static final synchronized <T> void safeResume(InterfaceC0611Hp interfaceC0611Hp, T t) {
        O90.f(interfaceC0611Hp, "<this>");
        if (interfaceC0611Hp.isActive()) {
            interfaceC0611Hp.resumeWith(t);
        }
    }

    public static final synchronized <T> void safeResumeWithException(InterfaceC0611Hp interfaceC0611Hp, Throwable th) {
        O90.f(interfaceC0611Hp, "<this>");
        O90.f(th, "throwable");
        if (interfaceC0611Hp.isActive()) {
            interfaceC0611Hp.resumeWith(RQ1.b(th));
        }
    }
}

package com.p019vk.push.core.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import p000.AbstractC0377Fz;
import p000.C0399GK;
import p000.C4115gQ;
import p000.InterfaceC0493Hp;
import p000.O90;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m22267d2 = {"T", "LHp;", "value", "LTf1;", "safeResume", "(LHp;Ljava/lang/Object;)V", "", "throwable", "safeResumeWithException", "(LHp;Ljava/lang/Throwable;)V", "LGK;", "LFz;", "getSingleThread", "(LGK;)LFz;", "SingleThread", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CoroutineExtensionsKt {
    public static final AbstractC0377Fz getSingleThread(C0399GK c0399gk) {
        O90.m5968f(c0399gk, "<this>");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        O90.m5967e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        return new C4115gQ(executorServiceNewSingleThreadExecutor);
    }

    public static final synchronized <T> void safeResume(InterfaceC0493Hp interfaceC0493Hp, T t) {
        O90.m5968f(interfaceC0493Hp, "<this>");
        if (interfaceC0493Hp.isActive()) {
            interfaceC0493Hp.resumeWith(t);
        }
    }

    public static final synchronized <T> void safeResumeWithException(InterfaceC0493Hp interfaceC0493Hp, Throwable th) {
        O90.m5968f(interfaceC0493Hp, "<this>");
        O90.m5968f(th, "throwable");
        if (interfaceC0493Hp.isActive()) {
            interfaceC0493Hp.resumeWith(RQ1.m7015b(th));
        }
    }
}

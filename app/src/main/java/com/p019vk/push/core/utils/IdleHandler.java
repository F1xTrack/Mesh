package com.p019vk.push.core.utils;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import p000.InterfaceC6434mZ;
import p000.O90;
import p000.RunnableC0204DE;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"Lcom/vk/push/core/utils/IdleHandler;", "", "Lkotlin/Function0;", "LTf1;", "task", "post", "(LmZ;)V", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class IdleHandler {
    public static final IdleHandler INSTANCE = new IdleHandler();

    public final void post(InterfaceC6434mZ task) {
        O90.m5968f(task, "task");
        new Handler(Looper.getMainLooper()).post(new RunnableC0204DE(18, task));
    }
}

package com.p019vk.push.core.utils;

import android.os.Binder;
import com.p019vk.push.core.domain.model.CallingAppIds;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m22267d2 = {"getCallingIds", "Lcom/vk/push/core/domain/model/CallingAppIds;", "Landroid/os/Binder;", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class BinderExtensionsKt {
    public static final CallingAppIds getCallingIds(Binder binder) {
        O90.m5968f(binder, "<this>");
        return new CallingAppIds(Binder.getCallingUid(), Binder.getCallingPid());
    }
}

package com.vk.push.core.utils;

import android.os.Binder;
import com.vk.push.core.domain.model.CallingAppIds;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getCallingIds", "Lcom/vk/push/core/domain/model/CallingAppIds;", "Landroid/os/Binder;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BinderExtensionsKt {
    public static final CallingAppIds getCallingIds(Binder binder) {
        O90.f(binder, "<this>");
        return new CallingAppIds(Binder.getCallingUid(), Binder.getCallingPid());
    }
}

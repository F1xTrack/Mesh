package com.p019vk.push.core.ipc;

import com.p019vk.push.common.AppInfo;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m22267d2 = {"Lcom/vk/push/core/ipc/RuStore;", "", "Lcom/vk/push/common/AppInfo;", "getAppInfo", "()Lcom/vk/push/common/AppInfo;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RuStore {
    public static final RuStore INSTANCE = new RuStore();

    public final AppInfo getAppInfo() {
        return new AppInfo("ru.vk.store", "661F20828EF780DE0B79BC59F26A30864316355F30E4F91CFA14A20791839914");
    }
}

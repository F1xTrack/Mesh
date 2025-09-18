package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.domain.repository.CallingAppRepository;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"CallingAppRepository", "Lcom/vk/push/core/domain/repository/CallingAppRepository;", "callingAppDataSource", "Lcom/vk/push/core/data/source/CallingAppDataSource;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CallingAppRepositoryImplKt {
    public static final CallingAppRepository CallingAppRepository(CallingAppDataSource callingAppDataSource) {
        O90.f(callingAppDataSource, "callingAppDataSource");
        return new CallingAppRepositoryImpl(callingAppDataSource);
    }
}

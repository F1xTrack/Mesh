package io.appmetrica.analytics.impl;

import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.qd */
/* loaded from: classes2.dex */
public final class C4814qd {
    public static final C4814qd a = new C4814qd();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.2.0", "50105519");

    public final synchronized ExponentialBackoffDataHolder a(EnumC4766od enumC4766od) {
        Object exponentialBackoffDataHolder;
        try {
            LinkedHashMap linkedHashMap = b;
            exponentialBackoffDataHolder = linkedHashMap.get(enumC4766od);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C4882ta(C4667ka.C.w(), enumC4766od));
                linkedHashMap.put(enumC4766od, exponentialBackoffDataHolder);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    public static final NetworkTask a(C4567g5 c4567g5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C4888tg c4888tg = new C4888tg(aESRSARequestBodyEncrypter);
        C4859sb c4859sb = new C4859sb(c4567g5);
        return new NetworkTask(new BlockingExecutor(), new C4905u9(c4567g5.a), new AllHostsExponentialBackoffPolicy(a.a(EnumC4766od.REPORT)), new Og(c4567g5, c4888tg, c4859sb, new FullUrlFormer(c4888tg, c4859sb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c4567g5.h(), c4567g5.o(), c4567g5.u(), aESRSARequestBodyEncrypter), AbstractC8259yu.e(new gn()), c);
    }
}

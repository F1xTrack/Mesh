package io.appmetrica.analytics.impl;

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
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.qd */
/* loaded from: classes2.dex */
public final class C5397qd {

    /* renamed from: a */
    public static final C5397qd f32445a = new C5397qd();

    /* renamed from: b */
    public static final LinkedHashMap f32446b = new LinkedHashMap();

    /* renamed from: c */
    public static final String f32447c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.2.0", "50105519");

    /* renamed from: a */
    public final synchronized ExponentialBackoffDataHolder m20957a(EnumC5347od enumC5347od) {
        Object exponentialBackoffDataHolder;
        try {
            LinkedHashMap linkedHashMap = f32446b;
            exponentialBackoffDataHolder = linkedHashMap.get(enumC5347od);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C5469ta(C5244ka.f32038C.m20638w(), enumC5347od));
                linkedHashMap.put(enumC5347od, exponentialBackoffDataHolder);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    /* renamed from: a */
    public static final NetworkTask m20956a(C5139g5 c5139g5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C5475tg c5475tg = new C5475tg(aESRSARequestBodyEncrypter);
        C5445sb c5445sb = new C5445sb(c5139g5);
        return new NetworkTask(new BlockingExecutor(), new C5493u9(c5139g5.f31722a), new AllHostsExponentialBackoffPolicy(f32445a.m20957a(EnumC5347od.REPORT)), new C4713Og(c5139g5, c5475tg, c5445sb, new FullUrlFormer(c5475tg, c5445sb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c5139g5.m20417h(), c5139g5.m20424o(), c5139g5.m20430u(), aESRSARequestBodyEncrypter), AbstractC7230yu.m26274e(new C5157gn()), f32447c);
    }
}

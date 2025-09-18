package com.p019vk.push.core.feature;

import android.content.Context;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.data.repository.IssueKey;
import com.p019vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.p019vk.push.core.filedatastore.FileDataSource;
import com.p019vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.p019vk.push.core.remote.config.omicron.DataId;
import com.p019vk.push.core.remote.config.omicron.ParseException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC11153tN0;
import p000.AbstractC11432vY1;
import p000.AbstractC7222ym;
import p000.AbstractC9366fP1;
import p000.C0399GK;
import p000.C10585ox0;
import p000.C1161SS;
import p000.C1224TS;
import p000.C9452g41;
import p000.ExecutorC1023QF;
import p000.InterfaceC0754Lz;
import p000.O90;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0019J\u001b\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m22267d2 = {"Lcom/vk/push/core/feature/FeatureManagerImpl;", "Lcom/vk/push/core/feature/FeatureManager;", "Landroid/content/Context;", "applicationContext", "Lox0;", "okHttpClient", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "LLz;", "scope", "<init>", "(Landroid/content/Context;Lox0;Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;Lcom/vk/push/common/Logger;Lcom/vk/push/core/filedatastore/FileDataSource;LLz;)V", "Lcom/vk/push/core/feature/Feature$BooleanFeature;", "feature", "", "getFeatureValue", "(Lcom/vk/push/core/feature/Feature$BooleanFeature;LVy;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$StringFeature;", "", "(Lcom/vk/push/core/feature/Feature$StringFeature;LVy;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$IntFeature;", "", "(Lcom/vk/push/core/feature/Feature$IntFeature;LVy;)Ljava/lang/Object;", "TS", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class FeatureManagerImpl implements FeatureManager {

    @Deprecated
    public static final String APP_ID_DEV = "rustore_push_service_test";

    @Deprecated
    public static final String APP_ID_RELEASE = "rustore_push_service";

    @Deprecated
    public static final String UPDATE_INTERVAL_FILE_NAME = "omicron_update_interval.txt";

    /* renamed from: i */
    public static final C1224TS f20398i = new C1224TS();

    /* renamed from: a */
    public final Context f20399a;

    /* renamed from: b */
    public final C10585ox0 f20400b;

    /* renamed from: c */
    public final CrashReporterRepository f20401c;

    /* renamed from: d */
    public final IssueKeyBlackListRepository f20402d;

    /* renamed from: e */
    public final Logger f20403e;

    /* renamed from: f */
    public final FileDataSource f20404f;

    /* renamed from: g */
    public final InterfaceC0754Lz f20405g;

    /* renamed from: h */
    public volatile C9452g41 f20406h;

    public FeatureManagerImpl(Context context, C10585ox0 c10585ox0, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger, FileDataSource fileDataSource, InterfaceC0754Lz interfaceC0754Lz) {
        O90.m5968f(context, "applicationContext");
        O90.m5968f(c10585ox0, "okHttpClient");
        O90.m5968f(crashReporterRepository, "crashSender");
        O90.m5968f(logger, "logger");
        O90.m5968f(fileDataSource, "fileDataSource");
        O90.m5968f(interfaceC0754Lz, "scope");
        this.f20399a = context;
        this.f20400b = c10585ox0;
        this.f20401c = crashReporterRepository;
        this.f20402d = issueKeyBlackListRepository;
        this.f20403e = logger;
        this.f20404f = fileDataSource;
        this.f20405g = interfaceC0754Lz;
        this.f20406h = AbstractC9366fP1.m18230b(interfaceC0754Lz, null, new C1161SS(this, null), 3);
    }

    /* renamed from: a */
    public static IllegalStateException m13739a(String str, Throwable th) {
        return new IllegalStateException(AbstractC7222ym.m26245v("Incorrect access to ", str), th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$getFileUpdateInterval(com.p019vk.push.core.feature.FeatureManagerImpl r4, p000.InterfaceC1382Vy r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof p000.C1476XS
            if (r0 == 0) goto L16
            r0 = r5
            XS r0 = (p000.C1476XS) r0
            int r1 = r0.f13760c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13760c = r1
            goto L1b
        L16:
            XS r0 = new XS
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f13758a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f13760c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            p000.RQ1.m7017d(r5)
            PS0 r5 = (p000.PS0) r5
            java.lang.Object r4 = r5.f9075a
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            p000.RQ1.m7017d(r5)
            r0.f13760c = r3
            com.vk.push.core.filedatastore.FileDataSource r4 = r4.f20404f
            java.lang.Object r4 = r4.m26671getDataIoAF18A(r0)
            if (r4 != r1) goto L44
            goto L65
        L44:
            boolean r5 = r4 instanceof p000.OS0
            if (r5 == 0) goto L49
            r4 = 0
        L49:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L58
            java.lang.Integer r4 = p000.C51.m979f(r4)
            if (r4 == 0) goto L58
            int r4 = r4.intValue()
            goto L60
        L58:
            com.vk.push.core.feature.Feature$IntFeature r4 = com.p019vk.push.core.feature.CommonFeaturesKt.getUpdateTimeInterval()
            int r4 = r4.getDefaultValue()
        L60:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r4)
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.feature.FeatureManagerImpl.access$getFileUpdateInterval(com.vk.push.core.feature.FeatureManagerImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1] */
    public static final FeatureManagerImpl$provideAnalyticsHandler$1 access$provideAnalyticsHandler(FeatureManagerImpl featureManagerImpl, final Logger logger, final CrashReporterRepository crashReporterRepository) {
        featureManagerImpl.getClass();
        return new AnalyticsHandler() { // from class: com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1
            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheHit(DataId dataId, boolean outdated) {
                Logger.DefaultImpls.info$default(logger, "onCacheHit: dataId: " + dataId + ", outdated: " + outdated, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheMiss(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onCacheMiss: " + dataId, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheUpdated(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onCacheUpdated: " + dataId, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigReceivedFromNetwork(String rawJson) {
                O90.m5968f(rawJson, "rawJson");
                Logger.DefaultImpls.info$default(logger, "onConfigReceivedFromNetwork: ".concat(rawJson), null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestEnded(int code) {
                Logger.DefaultImpls.info$default(logger, AbstractC11153tN0.m24909u(code, "onConfigRequestEnded: "), null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestFailedWithException(Throwable exception) {
                Logger.DefaultImpls.info$default(logger, "onConfigRequestFailedWithException: " + exception, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestStarted(String request) {
                O90.m5968f(request, "request");
                Logger.DefaultImpls.info$default(logger, "onConfigRequestStarted: ".concat(request), null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onGetDataError(Throwable throwable, String data) {
                Logger.DefaultImpls.info$default(logger, "onGetDataError: throwable: " + throwable + ", data: " + data, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onHandledException(Throwable throwable) {
                Logger.DefaultImpls.info$default(logger, "onHandledException: " + throwable, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseError(DataId dataId, int statusCode) {
                Logger.DefaultImpls.info$default(logger, "onResponseError: dataId: " + dataId + ", statusCode: " + statusCode, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseIOException(DataId dataId, IOException exception) {
                Logger.DefaultImpls.info$default(logger, "onResponseIOException: dataId: " + dataId + ", exception: " + exception, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseNotModified(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onResponseNotModified: " + dataId, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseParseException(DataId dataId, ParseException exception) {
                Logger.DefaultImpls.info$default(logger, "onResponseParseException: dataId: " + dataId + ", exception: " + exception, null, 2, null);
                if (exception != null) {
                    crashReporterRepository.nonFatalReport(exception, IssueKey.OMICRON_PARSE_ERROR);
                }
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseSuccess(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onResponseSuccess: " + dataId, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onWaitForActualOnTime(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onWaitForActualOnTime: " + dataId, null, 2, null);
            }

            @Override // com.p019vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onWaitForActualTimeout(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onWaitForActualTimeout: " + dataId, null, 2, null);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$saveIssueKeysBlacklist(com.p019vk.push.core.feature.FeatureManagerImpl r8, p000.InterfaceC1382Vy r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof p000.C1539YS
            if (r0 == 0) goto L16
            r0 = r9
            YS r0 = (p000.C1539YS) r0
            int r1 = r0.f14311d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f14311d = r1
            goto L1b
        L16:
            YS r0 = new YS
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f14309b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f14311d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            p000.RQ1.m7017d(r9)
            goto L6e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            com.vk.push.core.data.repository.IssueKeyBlackListRepository r8 = r0.f14308a
            p000.RQ1.m7017d(r9)
            goto L55
        L3c:
            p000.RQ1.m7017d(r9)
            com.vk.push.core.data.repository.IssueKeyBlackListRepository r9 = r8.f20402d
            if (r9 == 0) goto L72
            com.vk.push.core.feature.Feature$StringFeature r2 = com.p019vk.push.core.feature.CommonFeaturesKt.getNonFatalEventsBlackList()
            r0.f14308a = r9
            r0.f14311d = r5
            java.lang.Object r8 = r8.getFeatureValue(r2, r0)
            if (r8 != r1) goto L52
            goto L73
        L52:
            r7 = r9
            r9 = r8
            r8 = r7
        L55:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.lang.String r2 = ","
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r5 = 0
            r6 = 6
            java.util.List r9 = p000.AbstractC11374v51.m25340O(r9, r2, r5, r6)
            r0.f14308a = r3
            r0.f14311d = r4
            java.lang.Object r8 = r8.setBlackList(r9, r0)
            if (r8 != r1) goto L6e
            goto L73
        L6e:
            Tf1 r8 = p000.C8313Tf1.f11463a
            r1 = r8
            goto L73
        L72:
            r1 = r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.feature.FeatureManagerImpl.access$saveIssueKeysBlacklist(com.vk.push.core.feature.FeatureManagerImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: access$saveUpdateInterval-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m26670access$saveUpdateIntervalIoAF18A(com.p019vk.push.core.feature.FeatureManagerImpl r5, p000.InterfaceC1382Vy r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof p000.C1602ZS
            if (r0 == 0) goto L16
            r0 = r6
            ZS r0 = (p000.C1602ZS) r0
            int r1 = r0.f14899d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f14899d = r1
            goto L1b
        L16:
            ZS r0 = new ZS
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f14897b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f14899d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r5 = r6.f9075a
        L30:
            r1 = r5
            goto L6a
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            com.vk.push.core.filedatastore.FileDataSource r5 = r0.f14896a
            p000.RQ1.m7017d(r6)
            goto L55
        L40:
            p000.RQ1.m7017d(r6)
            com.vk.push.core.feature.Feature$IntFeature r6 = com.p019vk.push.core.feature.CommonFeaturesKt.getUpdateTimeInterval()
            com.vk.push.core.filedatastore.FileDataSource r2 = r5.f20404f
            r0.f14896a = r2
            r0.f14899d = r4
            java.lang.Object r6 = r5.getFeatureValue(r6, r0)
            if (r6 != r1) goto L54
            goto L6a
        L54:
            r5 = r2
        L55:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2 = 0
            r0.f14896a = r2
            r0.f14899d = r3
            java.lang.Object r5 = r5.m26672setDatagIAlus(r6, r0)
            if (r5 != r1) goto L30
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.feature.FeatureManagerImpl.m26670access$saveUpdateIntervalIoAF18A(com.vk.push.core.feature.FeatureManagerImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.p019vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFeatureValue(com.vk.push.core.feature.Feature.BooleanFeature r5, p000.InterfaceC1382Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C1287US
            if (r0 == 0) goto L13
            r0 = r6
            US r0 = (p000.C1287US) r0
            int r1 = r0.f11795e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11795e = r1
            goto L18
        L13:
            US r0 = new US
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11793c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f11795e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.core.feature.Feature$BooleanFeature r5 = r0.f11792b
            com.vk.push.core.feature.FeatureManagerImpl r0 = r0.f11791a
            p000.RQ1.m7017d(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            g41 r6 = r4.f20406h
            if (r6 == 0) goto L47
            r0.f11791a = r4
            r0.f11792b = r5
            r0.f11795e = r3
            java.lang.Object r6 = r6.m10799F(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.vk.push.core.remote.config.omicron.Omicron r6 = com.p019vk.push.core.remote.config.omicron.Omicron.getInstance()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r5.getKey()     // Catch: java.lang.Throwable -> L59
            boolean r2 = r5.getDefaultValue()     // Catch: java.lang.Throwable -> L59
            boolean r5 = r6.getLatestBoolean(r1, r2)     // Catch: java.lang.Throwable -> L59
            goto L6d
        L59:
            r6 = move-exception
            com.vk.push.core.data.repository.CrashReporterRepository r0 = r0.f20401c
            java.lang.String r1 = r5.getKey()
            java.lang.IllegalStateException r6 = m13739a(r1, r6)
            com.vk.push.core.data.repository.IssueKey r1 = com.p019vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS
            r0.nonFatalReport(r6, r1)
            boolean r5 = r5.getDefaultValue()
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.feature.FeatureManagerImpl.getFeatureValue(com.vk.push.core.feature.Feature$BooleanFeature, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.p019vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFeatureValue(com.vk.push.core.feature.Feature.StringFeature r5, p000.InterfaceC1382Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C1350VS
            if (r0 == 0) goto L13
            r0 = r6
            VS r0 = (p000.C1350VS) r0
            int r1 = r0.f12578e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12578e = r1
            goto L18
        L13:
            VS r0 = new VS
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12576c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f12578e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.core.feature.Feature$StringFeature r5 = r0.f12575b
            com.vk.push.core.feature.FeatureManagerImpl r0 = r0.f12574a
            p000.RQ1.m7017d(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            g41 r6 = r4.f20406h
            if (r6 == 0) goto L47
            r0.f12574a = r4
            r0.f12575b = r5
            r0.f12578e = r3
            java.lang.Object r6 = r6.m10799F(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.vk.push.core.remote.config.omicron.Omicron r6 = com.p019vk.push.core.remote.config.omicron.Omicron.getInstance()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r5.getKey()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r5.getDefaultValue()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r6.getLatestString(r1, r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "{\n            Omicron.ge…e.defaultValue)\n        }"
            p000.O90.m5967e(r6, r1)     // Catch: java.lang.Throwable -> L5e
            goto L72
        L5e:
            r6 = move-exception
            com.vk.push.core.data.repository.CrashReporterRepository r0 = r0.f20401c
            java.lang.String r1 = r5.getKey()
            java.lang.IllegalStateException r6 = m13739a(r1, r6)
            com.vk.push.core.data.repository.IssueKey r1 = com.p019vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS
            r0.nonFatalReport(r6, r1)
            java.lang.String r6 = r5.getDefaultValue()
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.feature.FeatureManagerImpl.getFeatureValue(com.vk.push.core.feature.Feature$StringFeature, Vy):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureManagerImpl(Context context, C10585ox0 c10585ox0, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger, FileDataSource fileDataSource, InterfaceC0754Lz interfaceC0754Lz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC0754Lz interfaceC0754LzM25444a;
        FileDataSource fileDataSource2 = (i & 32) != 0 ? new FileDataSource(context, UPDATE_INTERVAL_FILE_NAME, null, 4, null) : fileDataSource;
        if ((i & 64) != 0) {
            C0399GK c0399gk = C0399GK.f3694a;
            interfaceC0754LzM25444a = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        } else {
            interfaceC0754LzM25444a = interfaceC0754Lz;
        }
        this(context, c10585ox0, crashReporterRepository, issueKeyBlackListRepository, logger, fileDataSource2, interfaceC0754LzM25444a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.p019vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFeatureValue(com.vk.push.core.feature.Feature.IntFeature r5, p000.InterfaceC1382Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C1413WS
            if (r0 == 0) goto L13
            r0 = r6
            WS r0 = (p000.C1413WS) r0
            int r1 = r0.f13192e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13192e = r1
            goto L18
        L13:
            WS r0 = new WS
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13190c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f13192e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.core.feature.Feature$IntFeature r5 = r0.f13189b
            com.vk.push.core.feature.FeatureManagerImpl r0 = r0.f13188a
            p000.RQ1.m7017d(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            g41 r6 = r4.f20406h
            if (r6 == 0) goto L47
            r0.f13188a = r4
            r0.f13189b = r5
            r0.f13192e = r3
            java.lang.Object r6 = r6.m10799F(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.vk.push.core.remote.config.omicron.Omicron r6 = com.p019vk.push.core.remote.config.omicron.Omicron.getInstance()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r5.getKey()     // Catch: java.lang.Throwable -> L59
            int r2 = r5.getDefaultValue()     // Catch: java.lang.Throwable -> L59
            int r5 = r6.getLatestInt(r1, r2)     // Catch: java.lang.Throwable -> L59
            goto L6d
        L59:
            r6 = move-exception
            com.vk.push.core.data.repository.CrashReporterRepository r0 = r0.f20401c
            java.lang.String r1 = r5.getKey()
            java.lang.IllegalStateException r6 = m13739a(r1, r6)
            com.vk.push.core.data.repository.IssueKey r1 = com.p019vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS
            r0.nonFatalReport(r6, r1)
            int r5 = r5.getDefaultValue()
        L6d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.feature.FeatureManagerImpl.getFeatureValue(com.vk.push.core.feature.Feature$IntFeature, Vy):java.lang.Object");
    }
}

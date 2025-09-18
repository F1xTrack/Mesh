package com.vk.push.core.feature;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.ParseException;
import defpackage.AbstractC3767fP1;
import defpackage.AbstractC7209tN0;
import defpackage.AbstractC7625vY1;
import defpackage.AbstractC8235ym;
import defpackage.C3895g41;
import defpackage.C6363ox0;
import defpackage.GK;
import defpackage.InterfaceC0952Lz;
import defpackage.O90;
import defpackage.QF;
import defpackage.SS;
import defpackage.TS;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0019J\u001b\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/vk/push/core/feature/FeatureManagerImpl;", "Lcom/vk/push/core/feature/FeatureManager;", "Landroid/content/Context;", "applicationContext", "Lox0;", "okHttpClient", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "LLz;", "scope", "<init>", "(Landroid/content/Context;Lox0;Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;Lcom/vk/push/common/Logger;Lcom/vk/push/core/filedatastore/FileDataSource;LLz;)V", "Lcom/vk/push/core/feature/Feature$BooleanFeature;", "feature", "", "getFeatureValue", "(Lcom/vk/push/core/feature/Feature$BooleanFeature;LVy;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$StringFeature;", "", "(Lcom/vk/push/core/feature/Feature$StringFeature;LVy;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$IntFeature;", "", "(Lcom/vk/push/core/feature/Feature$IntFeature;LVy;)Ljava/lang/Object;", "TS", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FeatureManagerImpl implements FeatureManager {

    @Deprecated
    public static final String APP_ID_DEV = "rustore_push_service_test";

    @Deprecated
    public static final String APP_ID_RELEASE = "rustore_push_service";

    @Deprecated
    public static final String UPDATE_INTERVAL_FILE_NAME = "omicron_update_interval.txt";
    public static final TS i = new TS();
    public final Context a;
    public final C6363ox0 b;
    public final CrashReporterRepository c;
    public final IssueKeyBlackListRepository d;
    public final Logger e;
    public final FileDataSource f;
    public final InterfaceC0952Lz g;
    public volatile C3895g41 h;

    public FeatureManagerImpl(Context context, C6363ox0 c6363ox0, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger, FileDataSource fileDataSource, InterfaceC0952Lz interfaceC0952Lz) {
        O90.f(context, "applicationContext");
        O90.f(c6363ox0, "okHttpClient");
        O90.f(crashReporterRepository, "crashSender");
        O90.f(logger, "logger");
        O90.f(fileDataSource, "fileDataSource");
        O90.f(interfaceC0952Lz, "scope");
        this.a = context;
        this.b = c6363ox0;
        this.c = crashReporterRepository;
        this.d = issueKeyBlackListRepository;
        this.e = logger;
        this.f = fileDataSource;
        this.g = interfaceC0952Lz;
        this.h = AbstractC3767fP1.b(interfaceC0952Lz, null, new SS(this, null), 3);
    }

    public static IllegalStateException a(String str, Throwable th) {
        return new IllegalStateException(AbstractC8235ym.v("Incorrect access to ", str), th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$getFileUpdateInterval(com.vk.push.core.feature.FeatureManagerImpl r4, defpackage.InterfaceC1729Vy r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.XS
            if (r0 == 0) goto L16
            r0 = r5
            XS r0 = (defpackage.XS) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            XS r0 = new XS
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            defpackage.RQ1.d(r5)
            PS0 r5 = (defpackage.PS0) r5
            java.lang.Object r4 = r5.a
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            defpackage.RQ1.d(r5)
            r0.c = r3
            com.vk.push.core.filedatastore.FileDataSource r4 = r4.f
            java.lang.Object r4 = r4.m77getDataIoAF18A(r0)
            if (r4 != r1) goto L44
            goto L65
        L44:
            boolean r5 = r4 instanceof defpackage.OS0
            if (r5 == 0) goto L49
            r4 = 0
        L49:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L58
            java.lang.Integer r4 = defpackage.C51.f(r4)
            if (r4 == 0) goto L58
            int r4 = r4.intValue()
            goto L60
        L58:
            com.vk.push.core.feature.Feature$IntFeature r4 = com.vk.push.core.feature.CommonFeaturesKt.getUpdateTimeInterval()
            int r4 = r4.getDefaultValue()
        L60:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r4)
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.feature.FeatureManagerImpl.access$getFileUpdateInterval(com.vk.push.core.feature.FeatureManagerImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1] */
    public static final FeatureManagerImpl$provideAnalyticsHandler$1 access$provideAnalyticsHandler(FeatureManagerImpl featureManagerImpl, final Logger logger, final CrashReporterRepository crashReporterRepository) {
        featureManagerImpl.getClass();
        return new AnalyticsHandler() { // from class: com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1
            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheHit(DataId dataId, boolean outdated) {
                Logger.DefaultImpls.info$default(logger, "onCacheHit: dataId: " + dataId + ", outdated: " + outdated, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheMiss(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onCacheMiss: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheUpdated(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onCacheUpdated: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigReceivedFromNetwork(String rawJson) {
                O90.f(rawJson, "rawJson");
                Logger.DefaultImpls.info$default(logger, "onConfigReceivedFromNetwork: ".concat(rawJson), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestEnded(int code) {
                Logger.DefaultImpls.info$default(logger, AbstractC7209tN0.u(code, "onConfigRequestEnded: "), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestFailedWithException(Throwable exception) {
                Logger.DefaultImpls.info$default(logger, "onConfigRequestFailedWithException: " + exception, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestStarted(String request) {
                O90.f(request, "request");
                Logger.DefaultImpls.info$default(logger, "onConfigRequestStarted: ".concat(request), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onGetDataError(Throwable throwable, String data) {
                Logger.DefaultImpls.info$default(logger, "onGetDataError: throwable: " + throwable + ", data: " + data, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onHandledException(Throwable throwable) {
                Logger.DefaultImpls.info$default(logger, "onHandledException: " + throwable, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseError(DataId dataId, int statusCode) {
                Logger.DefaultImpls.info$default(logger, "onResponseError: dataId: " + dataId + ", statusCode: " + statusCode, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseIOException(DataId dataId, IOException exception) {
                Logger.DefaultImpls.info$default(logger, "onResponseIOException: dataId: " + dataId + ", exception: " + exception, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseNotModified(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onResponseNotModified: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseParseException(DataId dataId, ParseException exception) {
                Logger.DefaultImpls.info$default(logger, "onResponseParseException: dataId: " + dataId + ", exception: " + exception, null, 2, null);
                if (exception != null) {
                    crashReporterRepository.nonFatalReport(exception, IssueKey.OMICRON_PARSE_ERROR);
                }
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseSuccess(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onResponseSuccess: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onWaitForActualOnTime(DataId dataId) {
                Logger.DefaultImpls.info$default(logger, "onWaitForActualOnTime: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
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
    public static final java.lang.Object access$saveIssueKeysBlacklist(com.vk.push.core.feature.FeatureManagerImpl r8, defpackage.InterfaceC1729Vy r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof defpackage.YS
            if (r0 == 0) goto L16
            r0 = r9
            YS r0 = (defpackage.YS) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            YS r0 = new YS
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.RQ1.d(r9)
            goto L6e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            com.vk.push.core.data.repository.IssueKeyBlackListRepository r8 = r0.a
            defpackage.RQ1.d(r9)
            goto L55
        L3c:
            defpackage.RQ1.d(r9)
            com.vk.push.core.data.repository.IssueKeyBlackListRepository r9 = r8.d
            if (r9 == 0) goto L72
            com.vk.push.core.feature.Feature$StringFeature r2 = com.vk.push.core.feature.CommonFeaturesKt.getNonFatalEventsBlackList()
            r0.a = r9
            r0.d = r5
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
            java.util.List r9 = defpackage.AbstractC7538v51.O(r9, r2, r5, r6)
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.setBlackList(r9, r0)
            if (r8 != r1) goto L6e
            goto L73
        L6e:
            Tf1 r8 = defpackage.C1518Tf1.a
            r1 = r8
            goto L73
        L72:
            r1 = r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.feature.FeatureManagerImpl.access$saveIssueKeysBlacklist(com.vk.push.core.feature.FeatureManagerImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: access$saveUpdateInterval-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m76access$saveUpdateIntervalIoAF18A(com.vk.push.core.feature.FeatureManagerImpl r5, defpackage.InterfaceC1729Vy r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.ZS
            if (r0 == 0) goto L16
            r0 = r6
            ZS r0 = (defpackage.ZS) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ZS r0 = new ZS
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            defpackage.RQ1.d(r6)
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
        L30:
            r1 = r5
            goto L6a
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            com.vk.push.core.filedatastore.FileDataSource r5 = r0.a
            defpackage.RQ1.d(r6)
            goto L55
        L40:
            defpackage.RQ1.d(r6)
            com.vk.push.core.feature.Feature$IntFeature r6 = com.vk.push.core.feature.CommonFeaturesKt.getUpdateTimeInterval()
            com.vk.push.core.filedatastore.FileDataSource r2 = r5.f
            r0.a = r2
            r0.d = r4
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
            r0.a = r2
            r0.d = r3
            java.lang.Object r5 = r5.m78setDatagIAlus(r6, r0)
            if (r5 != r1) goto L30
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.feature.FeatureManagerImpl.m76access$saveUpdateIntervalIoAF18A(com.vk.push.core.feature.FeatureManagerImpl, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFeatureValue(com.vk.push.core.feature.Feature.BooleanFeature r5, defpackage.InterfaceC1729Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.US
            if (r0 == 0) goto L13
            r0 = r6
            US r0 = (defpackage.US) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            US r0 = new US
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.core.feature.Feature$BooleanFeature r5 = r0.b
            com.vk.push.core.feature.FeatureManagerImpl r0 = r0.a
            defpackage.RQ1.d(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.RQ1.d(r6)
            g41 r6 = r4.h
            if (r6 == 0) goto L47
            r0.a = r4
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r6.F(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.vk.push.core.remote.config.omicron.Omicron r6 = com.vk.push.core.remote.config.omicron.Omicron.getInstance()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r5.getKey()     // Catch: java.lang.Throwable -> L59
            boolean r2 = r5.getDefaultValue()     // Catch: java.lang.Throwable -> L59
            boolean r5 = r6.getLatestBoolean(r1, r2)     // Catch: java.lang.Throwable -> L59
            goto L6d
        L59:
            r6 = move-exception
            com.vk.push.core.data.repository.CrashReporterRepository r0 = r0.c
            java.lang.String r1 = r5.getKey()
            java.lang.IllegalStateException r6 = a(r1, r6)
            com.vk.push.core.data.repository.IssueKey r1 = com.vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS
            r0.nonFatalReport(r6, r1)
            boolean r5 = r5.getDefaultValue()
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.feature.FeatureManagerImpl.getFeatureValue(com.vk.push.core.feature.Feature$BooleanFeature, Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFeatureValue(com.vk.push.core.feature.Feature.StringFeature r5, defpackage.InterfaceC1729Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.VS
            if (r0 == 0) goto L13
            r0 = r6
            VS r0 = (defpackage.VS) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            VS r0 = new VS
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.core.feature.Feature$StringFeature r5 = r0.b
            com.vk.push.core.feature.FeatureManagerImpl r0 = r0.a
            defpackage.RQ1.d(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.RQ1.d(r6)
            g41 r6 = r4.h
            if (r6 == 0) goto L47
            r0.a = r4
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r6.F(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.vk.push.core.remote.config.omicron.Omicron r6 = com.vk.push.core.remote.config.omicron.Omicron.getInstance()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r5.getKey()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r5.getDefaultValue()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r6.getLatestString(r1, r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "{\n            Omicron.ge…e.defaultValue)\n        }"
            defpackage.O90.e(r6, r1)     // Catch: java.lang.Throwable -> L5e
            goto L72
        L5e:
            r6 = move-exception
            com.vk.push.core.data.repository.CrashReporterRepository r0 = r0.c
            java.lang.String r1 = r5.getKey()
            java.lang.IllegalStateException r6 = a(r1, r6)
            com.vk.push.core.data.repository.IssueKey r1 = com.vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS
            r0.nonFatalReport(r6, r1)
            java.lang.String r6 = r5.getDefaultValue()
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.feature.FeatureManagerImpl.getFeatureValue(com.vk.push.core.feature.Feature$StringFeature, Vy):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureManagerImpl(Context context, C6363ox0 c6363ox0, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger, FileDataSource fileDataSource, InterfaceC0952Lz interfaceC0952Lz, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC0952Lz interfaceC0952LzA;
        FileDataSource fileDataSource2 = (i2 & 32) != 0 ? new FileDataSource(context, UPDATE_INTERVAL_FILE_NAME, null, 4, null) : fileDataSource;
        if ((i2 & 64) != 0) {
            GK gk = GK.a;
            interfaceC0952LzA = AbstractC7625vY1.a(QF.c);
        } else {
            interfaceC0952LzA = interfaceC0952Lz;
        }
        this(context, c6363ox0, crashReporterRepository, issueKeyBlackListRepository, logger, fileDataSource2, interfaceC0952LzA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFeatureValue(com.vk.push.core.feature.Feature.IntFeature r5, defpackage.InterfaceC1729Vy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.WS
            if (r0 == 0) goto L13
            r0 = r6
            WS r0 = (defpackage.WS) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            WS r0 = new WS
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.vk.push.core.feature.Feature$IntFeature r5 = r0.b
            com.vk.push.core.feature.FeatureManagerImpl r0 = r0.a
            defpackage.RQ1.d(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.RQ1.d(r6)
            g41 r6 = r4.h
            if (r6 == 0) goto L47
            r0.a = r4
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r6.F(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.vk.push.core.remote.config.omicron.Omicron r6 = com.vk.push.core.remote.config.omicron.Omicron.getInstance()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r5.getKey()     // Catch: java.lang.Throwable -> L59
            int r2 = r5.getDefaultValue()     // Catch: java.lang.Throwable -> L59
            int r5 = r6.getLatestInt(r1, r2)     // Catch: java.lang.Throwable -> L59
            goto L6d
        L59:
            r6 = move-exception
            com.vk.push.core.data.repository.CrashReporterRepository r0 = r0.c
            java.lang.String r1 = r5.getKey()
            java.lang.IllegalStateException r6 = a(r1, r6)
            com.vk.push.core.data.repository.IssueKey r1 = com.vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS
            r0.nonFatalReport(r6, r1)
            int r5 = r5.getDefaultValue()
        L6d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.feature.FeatureManagerImpl.getFeatureValue(com.vk.push.core.feature.Feature$IntFeature, Vy):java.lang.Object");
    }
}

package com.p019vk.push.core.data.repository;

import android.content.Context;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.data.repository.IssueKey;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import p000.AbstractC0576J8;
import p000.C4162hA;
import p000.O90;
import ru.p031ok.tracer.lite.TracerLite;
import ru.p031ok.tracer.lite.crash.report.TracerCrashReportLite;

@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lcom/vk/push/core/data/repository/CrashSenderRepositoryFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "tracerLibraryPackageName", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "createCrashSenderRepository", "(Landroid/content/Context;Ljava/lang/String;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;Lcom/vk/push/common/Logger;)Lcom/vk/push/core/data/repository/CrashReporterRepository;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CrashSenderRepositoryFactory {

    @Deprecated
    public static final String TRACER_CRASH_REPORTER_CLASS_NAME = "ru.ok.tracer.lite.crash.report.TracerCrashReportLite";

    @Deprecated
    public static final String TRACER_LITE_CLASS_NAME = "ru.ok.tracer.lite.TracerLite";

    public final CrashReporterRepository createCrashSenderRepository(Context context, String tracerLibraryPackageName, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger) {
        O90.m5968f(context, "context");
        O90.m5968f(tracerLibraryPackageName, "tracerLibraryPackageName");
        O90.m5968f(issueKeyBlackListRepository, "issueKeyBlackListRepository");
        O90.m5968f(logger, "logger");
        try {
            Constructor<?>[] constructors = TracerLite.class.getConstructors();
            O90.m5967e(constructors, "tracerLiteClass.constructors");
            Object objNewInstance = ((Constructor) AbstractC0576J8.m4187n(constructors)).newInstance(context, tracerLibraryPackageName);
            int i = TracerCrashReportLite.f42126a;
            Constructor<?>[] constructors2 = TracerCrashReportLite.class.getConstructors();
            O90.m5967e(constructors2, "tracerCrashReporterClass.constructors");
            final Object objNewInstance2 = ((Constructor) AbstractC0576J8.m4187n(constructors2)).newInstance(objNewInstance);
            Method[] methods = TracerCrashReportLite.class.getMethods();
            O90.m5967e(methods, "tracerCrashReporterClass.methods");
            for (final Method method : methods) {
                if (O90.m5963a(method.getName(), "report") && method.getParameterTypes().length == 2) {
                    Logger.DefaultImpls.info$default(logger, "Using real crash reporter", null, 2, null);
                    return new CrashSenderImpl(new CrashReporterRepository() { // from class: gA
                        @Override // com.p019vk.push.core.data.repository.CrashReporterRepository
                        public final void nonFatalReport(Throwable th, IssueKey issueKey) {
                            Method method2 = method;
                            Object obj = objNewInstance2;
                            O90.m5968f(this.f27593a, "this$0");
                            O90.m5968f(th, "error");
                            O90.m5968f(issueKey, "issueKey");
                            try {
                                String lowerCase = issueKey.name().toLowerCase(Locale.ROOT);
                                O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                method2.invoke(obj, th, lowerCase);
                            } catch (Throwable th2) {
                                RQ1.m7015b(th2);
                            }
                        }
                    }, issueKeyBlackListRepository, null, logger, 4, null);
                }
                try {
                } catch (Throwable unused) {
                    Logger.DefaultImpls.info$default(logger, "Using stub crash reporter", null, 2, null);
                    return new C4162hA(0);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Throwable unused2) {
        }
    }
}

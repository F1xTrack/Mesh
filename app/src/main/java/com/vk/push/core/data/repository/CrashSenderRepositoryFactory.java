package com.vk.push.core.data.repository;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.IssueKey;
import defpackage.C4102hA;
import defpackage.J8;
import defpackage.O90;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/data/repository/CrashSenderRepositoryFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "tracerLibraryPackageName", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "Lcom/vk/push/common/Logger;", "logger", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "createCrashSenderRepository", "(Landroid/content/Context;Ljava/lang/String;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;Lcom/vk/push/common/Logger;)Lcom/vk/push/core/data/repository/CrashReporterRepository;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CrashSenderRepositoryFactory {

    @Deprecated
    public static final String TRACER_CRASH_REPORTER_CLASS_NAME = "ru.ok.tracer.lite.crash.report.TracerCrashReportLite";

    @Deprecated
    public static final String TRACER_LITE_CLASS_NAME = "ru.ok.tracer.lite.TracerLite";

    public final CrashReporterRepository createCrashSenderRepository(Context context, String tracerLibraryPackageName, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger) {
        O90.f(context, "context");
        O90.f(tracerLibraryPackageName, "tracerLibraryPackageName");
        O90.f(issueKeyBlackListRepository, "issueKeyBlackListRepository");
        O90.f(logger, "logger");
        try {
            Constructor<?>[] constructors = TracerLite.class.getConstructors();
            O90.e(constructors, "tracerLiteClass.constructors");
            Object objNewInstance = ((Constructor) J8.n(constructors)).newInstance(context, tracerLibraryPackageName);
            int i = TracerCrashReportLite.a;
            Constructor<?>[] constructors2 = TracerCrashReportLite.class.getConstructors();
            O90.e(constructors2, "tracerCrashReporterClass.constructors");
            final Object objNewInstance2 = ((Constructor) J8.n(constructors2)).newInstance(objNewInstance);
            Method[] methods = TracerCrashReportLite.class.getMethods();
            O90.e(methods, "tracerCrashReporterClass.methods");
            for (final Method method : methods) {
                if (O90.a(method.getName(), "report") && method.getParameterTypes().length == 2) {
                    Logger.DefaultImpls.info$default(logger, "Using real crash reporter", null, 2, null);
                    return new CrashSenderImpl(new CrashReporterRepository() { // from class: gA
                        @Override // com.vk.push.core.data.repository.CrashReporterRepository
                        public final void nonFatalReport(Throwable th, IssueKey issueKey) {
                            Method method2 = method;
                            Object obj = objNewInstance2;
                            O90.f(this.a, "this$0");
                            O90.f(th, "error");
                            O90.f(issueKey, "issueKey");
                            try {
                                String lowerCase = issueKey.name().toLowerCase(Locale.ROOT);
                                O90.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                method2.invoke(obj, th, lowerCase);
                            } catch (Throwable th2) {
                                RQ1.b(th2);
                            }
                        }
                    }, issueKeyBlackListRepository, null, logger, 4, null);
                }
                try {
                } catch (Throwable unused) {
                    Logger.DefaultImpls.info$default(logger, "Using stub crash reporter", null, 2, null);
                    return new C4102hA(0);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Throwable unused2) {
        }
    }
}

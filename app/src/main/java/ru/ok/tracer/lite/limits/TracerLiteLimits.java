package ru.ok.tracer.lite.limits;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.AbstractC8235ym;
import defpackage.O90;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.base.limits.TracerFeatureLimits;
import ru.ok.tracer.lite.TracerLite;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ok/tracer/lite/limits/TracerLiteLimits;", "Lru/ok/tracer/base/limits/TracerFeatureLimits;", "Landroid/content/Context;", "context", "", "libraryPackageName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "globalShutdownMs", "featureName", "featureShutdownMs", "tag", "tagShutdownMs", "LTf1;", "setShutdownMs", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "", "isLimited", "(Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/content/Context;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Companion", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLiteLimits implements TracerFeatureLimits {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private final String libraryPackageName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tracer/lite/limits/TracerLiteLimits$Companion;", "", "()V", "get", "Lru/ok/tracer/lite/limits/TracerLiteLimits;", "tracer", "Lru/ok/tracer/lite/TracerLite;", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TracerLiteLimits get(TracerLite tracer) {
            O90.f(tracer, "tracer");
            return tracer.getLimits();
        }

        private Companion() {
        }
    }

    public TracerLiteLimits(Context context, String str) {
        O90.f(context, "context");
        O90.f(str, "libraryPackageName");
        this.context = context;
        this.libraryPackageName = str;
    }

    private final SharedPreferences getPrefs() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("tracer-" + this.libraryPackageName, 0);
        O90.e(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    @Override // ru.ok.tracer.base.limits.TracerFeatureLimits
    public boolean isLimited(String featureName, String tag) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < getPrefs().getLong("system.shutdown.until.ts", Long.MIN_VALUE)) {
            return true;
        }
        return featureName != null && jCurrentTimeMillis < getPrefs().getLong(AbstractC8235ym.k("system.", featureName, ".shutdown.until.ts"), Long.MIN_VALUE);
    }

    @Override // ru.ok.tracer.base.limits.TracerFeatureLimits
    public void setShutdownMs(Long globalShutdownMs, String featureName, Long featureShutdownMs, String tag, Long tagShutdownMs) {
        boolean z;
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        boolean z2 = true;
        if (globalShutdownMs == null || globalShutdownMs.longValue() <= 0) {
            z = false;
        } else {
            editorEdit.putLong("system.shutdown.until.ts", globalShutdownMs.longValue() + System.currentTimeMillis());
            z = true;
        }
        if (featureName == null || featureShutdownMs == null || featureShutdownMs.longValue() <= 0) {
            z2 = z;
        } else {
            editorEdit.putLong(AbstractC8235ym.k("system.", featureName, ".shutdown.until.ts"), featureShutdownMs.longValue() + System.currentTimeMillis());
        }
        if (z2) {
            editorEdit.apply();
        }
    }
}

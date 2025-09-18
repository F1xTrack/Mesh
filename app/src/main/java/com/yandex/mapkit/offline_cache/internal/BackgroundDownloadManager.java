package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import android.os.Build;
import com.yandex.runtime.Runtime;
import java.util.Collections;
import java.util.LinkedHashSet;
import p000.AbstractC7167xu;
import p000.AbstractC7759Io1;
import p000.C0241Dp;
import p000.C10075ky0;
import p000.C10203ly0;
import p000.C1156SN;
import p000.C11845yo1;
import p000.C4149gy;
import p000.C7863Ko1;
import p000.C8383Uo1;

/* loaded from: classes2.dex */
public class BackgroundDownloadManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static BackgroundDownloadInitializer initializer;
    private static BackgroundDownloadManager instance;
    private int activeDownloads = 0;
    private boolean allowCellular = false;
    private AbstractC7759Io1 workManager;

    private BackgroundDownloadManager(BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        this.workManager = null;
        initializer = backgroundDownloadInitializer;
        this.workManager = C7863Ko1.m4736d(context);
    }

    private void disableBackgroundDownloading() {
        C7863Ko1 c7863Ko1 = (C7863Ko1) this.workManager;
        c7863Ko1.getClass();
        c7863Ko1.f6317d.m9154x(new C0241Dp(c7863Ko1, "mapkit_background_download", true));
    }

    private void enableBackgroundDownloading() {
        C4149gy c4149gy = new C4149gy(this.allowCellular ? 2 : 3, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC7167xu.m25987g0(new LinkedHashSet()) : C1156SN.f10705a);
        C10075ky0 c10075ky0 = new C10075ky0(BackgroundDownloadJob.class);
        ((C8383Uo1) c10075ky0.f28106c).f12143j = c4149gy;
        C10203ly0 c10203ly0 = (C10203ly0) c10075ky0.m18675b();
        AbstractC7759Io1 abstractC7759Io1 = this.workManager;
        abstractC7759Io1.getClass();
        new C11845yo1((C7863Ko1) abstractC7759Io1, "mapkit_background_download", 1, Collections.singletonList(c10203ly0)).m26263b();
    }

    public static synchronized BackgroundDownloadInitializer getInitializer() {
        return initializer;
    }

    public static BackgroundDownloadManager getInstance() {
        initialize(null, Runtime.getApplicationContext());
        return instance;
    }

    public static void initialize(BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        if (instance == null) {
            instance = new BackgroundDownloadManager(backgroundDownloadInitializer, context);
        } else if (backgroundDownloadInitializer != null) {
            throw new RuntimeException("BackgroundDownloadManager reinitialization");
        }
    }

    public void decrementActiveDownloads() {
        int i = this.activeDownloads - 1;
        this.activeDownloads = i;
        if (i == 0) {
            disableBackgroundDownloading();
        }
    }

    public void incrementActiveDownloads() {
        int i = this.activeDownloads + 1;
        this.activeDownloads = i;
        if (i == 1) {
            enableBackgroundDownloading();
        }
    }

    public void updateBackgroundDownloading(boolean z) {
        this.allowCellular = z;
        if (this.activeDownloads > 0) {
            enableBackgroundDownloading();
        }
    }
}

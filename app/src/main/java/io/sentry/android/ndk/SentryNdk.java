package io.sentry.android.ndk;

import io.sentry.C6059l1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.hints.C6034i;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SentryNdk {
    private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

    static {
        new Thread(new RunnableC5922e(), "SentryNdkLoadLibs").start();
    }

    private SentryNdk() {
    }

    public static void close() {
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            shutdown();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.getSdkVersion() != null) {
            C6059l1.m21830v().m21832o("maven:io.sentry:sentry-android-ndk", "7.20.1");
        }
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            initSentryNative(sentryAndroidOptions);
            if (sentryAndroidOptions.isEnableScopeSync()) {
                sentryAndroidOptions.addScopeObserver(new C5921d(sentryAndroidOptions));
            }
            sentryAndroidOptions.setDebugImagesLoader(new C6034i());
        } catch (InterruptedException e) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        try {
            System.loadLibrary("log");
            System.loadLibrary("sentry");
            System.loadLibrary("sentry-android");
        } catch (Throwable unused) {
        }
        loadLibraryLatch.countDown();
    }

    private static native void shutdown();
}
